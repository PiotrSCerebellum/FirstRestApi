package vistula.firstrestapi.product.support;
import org.springframework.stereotype.Component;
import vistula.firstrestapi.product.Api.request.ProductRequest;
import vistula.firstrestapi.product.Api.respones.ProductResponse;
import vistula.firstrestapi.product.domain.Product;

public class ProductMapper {
    public Product toProduct(ProductRequest productRequest)
    {
        return new Product(productRequest.getName());
    }
    public ProductResponse toProductResponse(Product product)
    {
        return new ProductResponse(product.getId(), product.getName());
    }
}
