package dio.cloud.shoppingcart.dtorepository;

import dio.cloud.shoppingcart.entities.Item;

public class MapperItemRepository {

    public static Item fromDTORepository (ItemDTORepository iDTO) {
        return new Item(iDTO.getId(), iDTO.getProductId(), iDTO.getAmount(), iDTO.getCart_id());
    }
}
