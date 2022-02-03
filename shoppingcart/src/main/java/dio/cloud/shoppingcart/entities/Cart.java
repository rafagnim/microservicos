package dio.cloud.shoppingcart.entities;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private Long id;
    private List<Item> itens;


    public Cart(Long id, List<Item> itens) {
        this.id = id;
        this.itens = itens;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Item> getItens() {
        if (itens == null) {
            itens = new ArrayList<>();
        }
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }
}
