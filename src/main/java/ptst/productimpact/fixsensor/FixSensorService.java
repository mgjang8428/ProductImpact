package ptst.productimpact.fixsensor;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ptst.productimpact.fixsensor.dto.GpsData;
import ptst.productimpact.fixsensor.entity.FixSensorData;
import ptst.productimpact.sensor.entity.Sensor;

@Service
public class FixSensorService {
    @Autowired
    FixSensorRepository fixSensorRepository;

    public void saveFixSensorData(Sensor rawSensorData) {
        FixSensorData fsd = new FixSensorData();
        fsd.setDeviceNumber(rawSensorData.getDeviceNumber());
        fsd.setRecordNumber(rawSensorData.getNumber());
        fsd.setRecordDateTime(LocalDateTime.now());
        fsd.setShockDetect(rawSensorData.isVibeValue());

        //넘어짐 여부 판단
        if (!(rawSensorData.getGyroValueX() < 1000 && rawSensorData.getGyroValueX() > -1000)) {
            fsd.setOverturnDetect(true);
        } else {
            fsd.setOverturnDetect(false);
        }
        if (!(rawSensorData.getGyroValueY() < 1000 && rawSensorData.getGyroValueY() > -1000)) {
            fsd.setOverturnDetect(true);
        } else {
            fsd.setOverturnDetect(false);
        }

        fsd.setGpsStats(rawSensorData.isGpsStatus());
        fsd.setGpsLat(rawSensorData.getGpsValueLat());
        fsd.setGpsLng(rawSensorData.getGpsValueLng());

        fixSensorRepository.save(fsd);
    }

    public int countVibeSensor(int deviceNumber) {
        List<FixSensorData> data = fixSensorRepository.findByDeviceNumberAndShockDetectIsTrue(deviceNumber);
        return data.size();
    }

    public int countOventurn(int deviceNumber) {
        List<FixSensorData> data = fixSensorRepository.findByDeviceNumberAndOverturnDetectIsTrue(deviceNumber);
        return data.size();
    }

    public List<GpsData> getGpsList(int deviceNumber) {
        List<FixSensorData> data = fixSensorRepository.findByDeviceNumberAndGpsStatsTrueOrderByRecordDateTime(deviceNumber);
        List<GpsData> gpsList = new ArrayList<>();
        for (FixSensorData fixSensorData : data) {
            GpsData gps = new GpsData();
            gps.setLat(fixSensorData.getGpsLat());
            gps.setLng(fixSensorData.getGpsLng());
            gps.setTime(fixSensorData.getRecordDateTime());
            gpsList.add(gps);
        }
        return gpsList;
    }

    public GpsData getGpsLatestOne(int deviceNumber) {
        FixSensorData data = fixSensorRepository.findFirstByDeviceNumberAndGpsStatsTrueOrderByRecordDateTimeDesc(deviceNumber);
        GpsData gps = new GpsData();

        gps.setLat(data.getGpsLat());
        gps.setLng(data.getGpsLng());
        gps.setTime(data.getRecordDateTime());

        return gps;
    }

    public List<String> makeLogs(int deviceNumber) {
        List<FixSensorData> dataList = fixSensorRepository.findByDeviceNumberOrderByRecordDateTimeDesc(deviceNumber);
        List<String> resultList = new ArrayList<>();
        for (FixSensorData sensorData : dataList) {
            if(sensorData.isShockDetect()) {
                StringBuilder str = new StringBuilder();
                str.append(sensorData.getRecordDateTime().format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));
                str.append(" :: ");
                str.append("충격 감지");

                resultList.add(str.toString());
            }
            if(sensorData.isOverturnDetect()) {
                StringBuilder str = new StringBuilder();
                str.append(sensorData.getRecordDateTime().format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));
                str.append(" :: ");
                str.append("넘어짐 상태");

                resultList.add(str.toString());
            }
        }
        return resultList;
    }
}
