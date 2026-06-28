import java.util.Arrays;
import java.util.Comparator;

class Product {
    int productId;
    String productName;
    String category;

    Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{id=" + productId + ", name='" + productName + "', category='" + category + "'}";
    }
}

public class EcommerceSearch {

    static Product linearSearch(Product[] products, int targetId) {
        for (Product p : products) {
            if (p.productId == targetId) return p;
        }
        return null;
    }

    static Product binarySearch(Product[] products, int targetId) {
        int low = 0, high = products.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (products[mid].productId == targetId) return products[mid];
            else if (products[mid].productId < targetId) low = mid + 1;
            else high = mid - 1;
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product(103, "Laptop", "Electronics"),
            new Product(101, "Shoes", "Footwear"),
            new Product(105, "Shirt", "Clothing"),
            new Product(102, "Phone", "Electronics"),
            new Product(104, "Watch", "Accessories")
        };

        System.out.println("=== Linear Search ===");
        Product result = linearSearch(products, 104);
        System.out.println(result != null ? "Found: " + result : "Not Found");

        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));

        System.out.println("\n=== Binary Search ===");
        result = binarySearch(products, 104);
        System.out.println(result != null ? "Found: " + result : "Not Found");

        System.out.println("\n=== Search for non-existent ID (999) ===");
        System.out.println("Linear: " + linearSearch(products, 999));
        System.out.println("Binary: " + binarySearch(products, 999));
    }
}
