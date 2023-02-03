package vistula.firstrestapi.product.service;
import org.springframework.stereotype.Service;
import vistula.firstrestapi.product.Api.request.ProductRequest;
import vistula.firstrestapi.product.Api.respones.ProductResponse;
import vistula.firstrestapi.product.domain.Product;
import vistula.firstrestapi.product.repository.ProductRepository;
import vistula.firstrestapi.product.support.ProductMapper;
@Service
public class ProductService {
private final ProductRepository productRepository;
private final ProductMapper productMapper;

    public ProductService(ProductRepository productRepository, ProductMapper productMapper) {
        this.productRepository = productRepository;
        this.productMapper = productMapper;
    }
    public ProductResponse create(ProductRequest productRequest)
    {
        Product product= productRepository.save(productMapper.toProduct(productRequest));
        return productMapper.toProductResponse(product);
    }
}
