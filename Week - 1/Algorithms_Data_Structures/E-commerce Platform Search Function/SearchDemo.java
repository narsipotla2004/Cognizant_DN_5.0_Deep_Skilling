public class SearchDemo {

    public static int linearSearch(Product[] products, int id) {

        for (int i = 0; i < products.length; i++) {
            if (products[i].productId == id) {
                return i;
            }
        }

        return -1;
    }


    public static int binarySearch(Product[] products, int id) {

        int low = 0;
        int high = products.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (products[mid].productId == id) {
                return mid;
            }
            else if (products[mid].productId < id) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return -1;
    }
}