package Module_2_Data_Structures_and_Algorithms.Exe_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductRepo repo = new ProductRepo();
        int choice=1;
        int id;
        Product p = null;
        while (choice > 0 && choice < 6) {
            System.out.println("=====================");
            System.out.println("1. Add products");
            System.out.println("2. Delete products");
            System.out.println("3. View products");
            System.out.println("4. View All products");
            System.out.println("5. Change details");
            System.out.println("=====================");
            System.out.println("Enter your choice");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Provide product name");
                    String name = sc.next();
                    System.out.println("Provide product quantity");
                    int quan = sc.nextInt();
                    System.out.println("Provide product price");
                    double pri = sc.nextDouble();
                    p = new Product(name, quan, pri);
                    repo.addProduct(p);
                    System.out.println("Product Added successfully");
                    break;
                case 2:
                    System.out.println("Provide the id to delete");
                    id = sc.nextInt();
                    if (repo.deleteProduct(id)) {
                        System.out.println("Deleted the product with id "+id);
                    }
                    break;
                case 3:
                    System.out.println("Provide the id to view the products");
                    id = sc.nextInt();
                    p = repo.getProductWithId(id);
                    System.out.println(p.getProductId() + " " + p.getProductName() + " " + p.getProductQuantity() + " "
                            + p.getPrice());
                    break;
                case 4:
                    ArrayList<Product> res = new ArrayList<>();
                    res = repo.getAllProducts();
                    for (Product i : res) {
                        System.out.println(
                                i.getProductId() + " " + i.getProductName() + " " + i.getProductQuantity() + " "
                                        + i.getPrice());
                    }
                    break;
                case 5:
                    System.out.println("Enter the id to alter details");
                    id = sc.nextInt();
                    System.out.println("============");
                    System.out.println("1.Product Name");
                    System.out.println("2.Product Quantity");
                    System.out.println("3.Product Price");
                    System.out.println("============");
                    int field = sc.nextInt();
                    System.out.println("Enter the new data");
                    String data = sc.next();
                    if (repo.alterDetails(id, field, data)) {
                        System.out.println("Details changed successfully");
                    }
                    break;
                default:
                    break;

            }
        }
    }
}
