package pl.globallogic.sessions.store_catalog;

import java.util.HashSet;
import java.util.Set;

public class StoreCatalog {
    Set<Product> products;

    StoreCatalog(){
        products = new HashSet<>();
    }

    public void addProduct(Product product){
        if( products.add(product) ){
            System.out.println("Added product: "+product);
        }else{
            System.out.printf("Product '%s' already in the catalog", product.getName() );
        }
    }
    public void listAllProducts(){
        System.out.println("Our catalog: ");
        for ( Product product:products){
            System.out.println(product);
        }
    }
    public boolean alreadyInStore(Product product){
        return products.contains(product);
    }
}
