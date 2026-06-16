package Module_2_Data_Structures_and_Algorithms.Exe_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProductRepo {
    private HashMap<Integer, Product> mpp;

    public ProductRepo() {
        this.mpp = new HashMap<>();
    }

    public Product getProductWithId(int id) {
        if (!mpp.containsKey(id)) {
            System.out.println("Product with id " + id + " does not exist.");
            return null;
        }

        return mpp.get(id);
    }

    public void addProduct(Product p) {
        mpp.put(p.getProductId(), p);
    }

    public boolean deleteProduct(int id) {
        if (!mpp.containsKey(id)) {
            System.out.println("product with id not found");
            return false;
        }

        mpp.remove(id);
        return false;
    }

    public ArrayList<Product> getAllProducts() {
        ArrayList<Product> p = new ArrayList<>();
        for (Product i : mpp.values()) {
            p.add(i);
        }
        return p;
    }

}
