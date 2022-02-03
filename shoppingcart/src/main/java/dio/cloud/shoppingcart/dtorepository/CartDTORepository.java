package dio.cloud.shoppingcart.dtorepository;

import javax.persistence.*;

@Entity
@Table(name = "cart")
public class CartDTORepository {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public CartDTORepository() {
    }

    public CartDTORepository(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}