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

    public boolean alterDetails(int id,int field,String data) {
        if (!mpp.containsKey(id)) {
            System.out.println("There is no product with id " + id);
            return false;
        }
        switch (field) {
            case 1:
                mpp.get(id).setProductName(data);
                break;
            case 2:
                mpp.get(id).setProductQuantity(Integer.parseInt(data));
                break;
            case 3:
                mpp.get(id).setPrice(Double.parseDouble(data));
                break;
            default:
                System.out.println("Invalid choice");
                return false;
        }
        return true;
    }
}
