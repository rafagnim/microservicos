package dio.cloud.shoppingcart.dtorepository;

import dio.cloud.shoppingcart.entities.Cart;
import dio.cloud.shoppingcart.entities.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapperCartRepository {

    public static CartDTORepository fromEntity (Cart c) {
        return new CartDTORepository(c.getId());
    }

    public static Cart fromDTORepository (CartDTORepository cDTO, List<ItemDTORepository> itens) {
        return new Cart (cDTO.getId(), itens.stream().map(MapperItemRepository::fromDTORepository).collect(Collectors.toList()));
    }
}
