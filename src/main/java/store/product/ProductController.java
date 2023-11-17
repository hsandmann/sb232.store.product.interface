package store.product;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("store-product")
public interface ProductController {

    @GetMapping("/product/")
    public List<ProductOut> list();

    @GetMapping("/product/{id}")
    public ProductOut get(@PathVariable(required = true) String id);

    @DeleteMapping("/product/{id}")
    public void delete(@PathVariable(required = true) String id);

    @PostMapping("/product/")
    public ResponseEntity<Object> create(@RequestBody ProductIn in);
    
}