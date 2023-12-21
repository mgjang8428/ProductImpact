package ptst.productimpact.product;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ptst.productimpact.carrier.CarrierRepository;
import ptst.productimpact.carrier.entity.Carrier;
import ptst.productimpact.product.dto.ProductInfoDto;
import ptst.productimpact.product.dto.ProductStateChangeDto;
import ptst.productimpact.product.dto.ProductStateChangeFinishDto;
import ptst.productimpact.product.entity.Product;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public int findDeviceNumber(int productNumber) {
        Optional<Product> product = productRepository.findById(productNumber);
        return product.get().getDeviceNumber();
    }

    public Optional<Product> getProductInfo(int productNumber) {
        return productRepository.findById(productNumber);
    }

    public List<ProductInfoDto> getProductInfoList(int carrierNum) {
        List<Product> productList = productRepository.findByCarrierNumberAndStatusTrue(carrierNum);
        List<ProductInfoDto> result = new ArrayList<>();
        for (Product product : productList) {
            ProductInfoDto productInfo = new ProductInfoDto(
                    product.getNumber(),
                    product.getInvoiceNumber(),
                    product.getRecipient(),
                    product.getReceiveAddress(),
                    product.getRequestContent(),
                    product.getStartDateTime(),
                    product.getCompleteDateTime(),
                    product.isStatus(),
                    product.isDeliveryStatus(),
                    product.isCompleteStatus()
            );
            result.add(productInfo);
        }
        return result;
    }

    public List<ProductInfoDto> getClientProductInfoList(int clientNum) {
        List<Product> productList = productRepository.findByClientNumberAndStatusTrue(clientNum);
        List<ProductInfoDto> result = new ArrayList<>();
        for (Product product : productList) {
            ProductInfoDto productInfo = new ProductInfoDto(
                    product.getNumber(),
                    product.getInvoiceNumber(),
                    product.getRecipient(),
                    product.getReceiveAddress(),
                    product.getRequestContent(),
                    product.getStartDateTime(),
                    product.getCompleteDateTime(),
                    product.isStatus(),
                    product.isDeliveryStatus(),
                    product.isCompleteStatus()
            );
            result.add(productInfo);
        }
        return result;
    }

    public ProductInfoDto findInvoiceNumGetProductInfo(int invoiceNumber) {
        Optional<Product> product = productRepository.findByInvoiceNumber(invoiceNumber);
        ProductInfoDto productInfo = new ProductInfoDto(
                product.get().getNumber(),
                product.get().getInvoiceNumber(),
                product.get().getRecipient(),
                product.get().getReceiveAddress(),
                product.get().getRequestContent(),
                product.get().getStartDateTime(),
                product.get().getCompleteDateTime(),
                product.get().isStatus(),
                product.get().isDeliveryStatus(),
                product.get().isCompleteStatus()
        );
        return productInfo;
    }

    public void updateProductState(ProductStateChangeDto productStateChangeValue) {
        int productNumber = productStateChangeValue.getProductNumber();
        boolean deliveryState = productStateChangeValue.isDeliveryState();
        boolean completeState = productStateChangeValue.isCompleteState();

        Optional<Product> product = productRepository.findById(productNumber);

        product.get().setDeliveryStatus(deliveryState);
        product.get().setCompleteStatus(completeState);

        productRepository.save(product.get());
    }

    public void updateProductFinishState(ProductStateChangeFinishDto productStateChangeValue) {
        int productNumber = productStateChangeValue.getProductNumber();
        boolean productState = productStateChangeValue.isProductState();

        Optional<Product> product = productRepository.findById(productNumber);

        product.get().setStatus(productState);

        productRepository.save(product.get());
    }


}
