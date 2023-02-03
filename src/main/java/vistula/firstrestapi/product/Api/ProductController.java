package vistula.firstrestapi.product.Api;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vistula.firstrestapi.product.Api.request.ProductRequest;
import vistula.firstrestapi.product.Api.respones.ProductResponse;
import vistula.firstrestapi.product.service.ProductService;

@RestController
@RequestMapping("api/v1/products")
public class ProductController {

    private final ProductService productService;
    public ProductController(ProductService productService)
    {
        this.productService=productService;
    }
    @PostMapping
    public ResponseEntity<ProductResponse> create(@RequestBody ProductRequest productRequest)
    {
        ProductResponse productResponse = productService.create(productRequest);
        return new ResponseEntity<>(productResponse,HttpStatus.CREATED);
    }

}
