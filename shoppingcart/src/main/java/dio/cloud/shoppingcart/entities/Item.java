package dio.cloud.shoppingcart.entities;

public class Item {

    private Long id;
    private Long productId;
    private Integer amount;
    private Long cart_id;

    public Item() {
    }

    public Item(Long id, Long productId, Integer amount, Long cart_id) {
        this.id = id;
        this.productId = productId;
        this.amount = amount;
        this.cart_id = cart_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Long getCart_id() {
        return cart_id;
    }

    public void setCart_id(Long cart_id) {
        this.cart_id = cart_id;
    }
}
