package dio.cloud.shoppingcart.repositories;

import dio.cloud.shoppingcart.dtorepository.CartDTORepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends JpaRepository<CartDTORepository, Long> {
}
