package dio.cloud.shoppingcart.controllers;

import dio.cloud.shoppingcart.dtorepository.ItemDTORepository;
import dio.cloud.shoppingcart.entities.Cart;
import dio.cloud.shoppingcart.entities.Item;
import dio.cloud.shoppingcart.services.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/cart")
public class CartController {

    @Autowired
    private CartService cartSService;

    @RequestMapping(value = "{idCart}", method = RequestMethod.POST)
    public Cart addItem(@PathVariable Long idCart, @RequestBody ItemDTORepository i) {
        return cartSService.addItem(idCart, i);
    }

    @RequestMapping(value = "{idCart}", method = RequestMethod.GET)
    public Cart findById(@PathVariable Long idCart) {
        return cartSService.findById(idCart);
    }

    @RequestMapping(value = "{idCart}", method = RequestMethod.DELETE)
    public void clear(@PathVariable Long idCart) {
        cartSService.clear(idCart);
    }
}
