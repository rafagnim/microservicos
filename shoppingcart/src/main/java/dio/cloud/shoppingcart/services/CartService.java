package dio.cloud.shoppingcart.services;

import dio.cloud.shoppingcart.dtorepository.CartDTORepository;
import dio.cloud.shoppingcart.dtorepository.ItemDTORepository;
import dio.cloud.shoppingcart.dtorepository.MapperCartRepository;
import dio.cloud.shoppingcart.entities.Cart;
import dio.cloud.shoppingcart.entities.Item;
import dio.cloud.shoppingcart.repositories.CartRepository;
import dio.cloud.shoppingcart.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class CartService {

    @Autowired
    private CartRepository cartRepository;
    @Autowired
    private ItemRepository itemRepository;

    public Cart addItem(Long idCart, ItemDTORepository i) {
        System.out.println(idCart);
        Optional<CartDTORepository> savedCart = cartRepository.findById(idCart);
        CartDTORepository cartDTO;
        if (!savedCart.isPresent()) {
            cartDTO = cartRepository.save(new CartDTORepository());
            System.out.println("Novo cart: " + cartDTO.getId());
        } else {
            cartDTO = savedCart.get();
        }
        i.setCart_id(cartDTO.getId());
        ItemDTORepository item = itemRepository.save(i);
        return MapperCartRepository.fromDTORepository(cartDTO, itensCart(cartDTO.getId()));
    }

    public Cart findById(Long idCart) {
        Optional<CartDTORepository> optional = cartRepository.findById(idCart);
        if (optional.isPresent()) {
            return MapperCartRepository.fromDTORepository(optional.get(), itensCart(idCart));
        } else throw new EntityNotFoundException("Cart não localizado!");
    }

    public void clear(Long idCart) {
        try {
            cartRepository.deleteById(idCart);
            itensCart(idCart).forEach((i) -> itemRepository.deleteById(i.getId()));
        } catch(EntityNotFoundException e) {
            throw new EntityNotFoundException("Não foi possível deletar. Card não localizado");
        }
    }

    private List<ItemDTORepository> itensCart(Long idCart) {
        return itemRepository.findByCart_id(idCart);
    }
}
