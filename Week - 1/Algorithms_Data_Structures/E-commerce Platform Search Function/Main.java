public class Main {

    public static void main(String[] args) {

        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Mobile", "Electronics"),
            new Product(103, "Shoes", "Fashion"),
            new Product(104, "Watch", "Accessories"),
            new Product(105, "Book", "Education")
        };


        int searchId = 103;


        int result1 = SearchDemo.linearSearch(products, searchId);

        if (result1 != -1) {
            System.out.println("Linear Search Found: " + products[result1]);
        } else {
            System.out.println("Product Not Found");
        }


        int result2 = SearchDemo.binarySearch(products, searchId);

        if (result2 != -1) {
            System.out.println("Binary Search Found: " + products[result2]);
        } else {
            System.out.println("Product Not Found");
        }
    }
}