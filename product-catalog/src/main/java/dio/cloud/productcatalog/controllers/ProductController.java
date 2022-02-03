package dio.cloud.productcatalog.controllers;

import dio.cloud.productcatalog.models.Product;
import dio.cloud.productcatalog.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping(method = RequestMethod.POST)
    Product create(@RequestBody Product product) {
        return productService.create(product);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    Product findById(@PathVariable Long id) {
        return productService.findById(id);
    }
}
