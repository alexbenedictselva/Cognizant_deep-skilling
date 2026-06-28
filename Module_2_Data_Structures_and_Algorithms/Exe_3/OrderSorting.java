class Order {
    int orderId;
    String customerName;
    double totalPrice;

    Order(int orderId, String customerName, double totalPrice) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Order{id=" + orderId + ", customer='" + customerName + "', price=" + totalPrice + "}";
    }
}

public class OrderSorting {

    static void bubbleSort(Order[] orders) {
        int n = orders.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (orders[j].totalPrice > orders[j + 1].totalPrice) {
                    Order temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;
                }
    }

    static void quickSort(Order[] orders, int low, int high) {
        if (low < high) {
            int pi = partition(orders, low, high);
            quickSort(orders, low, pi - 1);
            quickSort(orders, pi + 1, high);
        }
    }

    static int partition(Order[] orders, int low, int high) {
        double pivot = orders[high].totalPrice;
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (orders[j].totalPrice <= pivot) {
                i++;
                Order temp = orders[i];
                orders[i] = orders[j];
                orders[j] = temp;
            }
        }
        Order temp = orders[i + 1];
        orders[i + 1] = orders[high];
        orders[high] = temp;
        return i + 1;
    }

    static void printOrders(Order[] orders) {
        for (Order o : orders) System.out.println(o);
    }

    public static void main(String[] args) {
        Order[] orders1 = {
            new Order(1, "Alice", 250.00),
            new Order(2, "Bob", 450.00),
            new Order(3, "Charlie", 150.00),
            new Order(4, "Diana", 350.00),
            new Order(5, "Eve", 550.00)
        };

        Order[] orders2 = orders1.clone();

        System.out.println("=== Bubble Sort ===");
        bubbleSort(orders1);
        printOrders(orders1);

        System.out.println("\n=== Quick Sort ===");
        quickSort(orders2, 0, orders2.length - 1);
        printOrders(orders2);
    }
}
