package dio.cloud.shoppingcart.repositories;

import dio.cloud.shoppingcart.dtorepository.ItemDTORepository;
import dio.cloud.shoppingcart.entities.Item;
import org.hibernate.annotations.SQLDelete;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<ItemDTORepository, Long> {
    @Query(value = "select * from tb_item where cart_id = ?1", nativeQuery = true)
    List<ItemDTORepository> findByCart_id(Long cart_id);
}
