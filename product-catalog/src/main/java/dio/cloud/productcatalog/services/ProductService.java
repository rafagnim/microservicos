package dio.cloud.productcatalog.services;

import dio.cloud.productcatalog.models.Product;
import dio.cloud.productcatalog.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public Product create (Product p) {
        return productRepository.save(p);
    }

    public Product findById (Long id) {
        Optional<Product> o =  productRepository.findById(id);
        if (o.isPresent()) {
            return o.get();
        }
        throw new EntityNotFoundException ("Produto não localizado!");
    }
}
