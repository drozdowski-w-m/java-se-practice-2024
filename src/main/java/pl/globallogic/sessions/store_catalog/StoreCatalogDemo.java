package pl.globallogic.sessions.store_catalog;

public class StoreCatalogDemo {
    public static void main(String[] args) {
        StoreCatalog store = new StoreCatalog();

        store.addProduct(new Product("Apple"));
        store.addProduct(new Product("Banana"));
        store.addProduct(new Product("Apple"));
        store.addProduct(new Product("Lemon"));
        store.addProduct(new Product("Lemon"));
        store.addProduct(new Product("Orange"));

        System.out.println("---------------");
        store.listAllProducts();
    }
}
