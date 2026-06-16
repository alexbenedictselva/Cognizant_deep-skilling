package Module_2_Data_Structures_and_Algorithms.Exe_1;

public class Product {
    private static int counter=1;
    private int productId;
    private String productName;
    private int productQuantity;
    private double price;
    
    public Product(String productName, int productQuantity, double price) {
        this.productId = counter;
        this.productName = productName;
        this.productQuantity = productQuantity;
        this.price = price;
        counter++;
    }
    public Product() {
    }
    public int getProductId() {
        return productId;
    }
    public void setProductId(int productId) {
        this.productId = productId;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public int getProductQuantity() {
        return productQuantity;
    }
    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    

}
