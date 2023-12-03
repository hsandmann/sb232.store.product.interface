package store.product;

public record ProductOut(
    String id,
    String name,
    Double preco
) {

    public ProductOut(String id) {
        this(id, null, null);
    }

}