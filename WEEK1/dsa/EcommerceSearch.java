package dsa;

class Product {
    int productId;
    String productName;
    String category;

    Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    void display() {
        System.out.println("ID: " + productId +
                ", Name: " + productName +
                ", Category: " + category);
    }
}

public class EcommerceSearch {

    public static Product linearSearch(Product[] products, int targetId) {
        for (Product product : products) {
            if (product.productId == targetId) {
                return product;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, int targetId) {
        int low = 0;
        int high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (products[mid].productId == targetId) {
                return products[mid];
            } else if (products[mid].productId < targetId) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {

        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Phone", "Electronics"),
            new Product(103, "Shoes", "Fashion"),
            new Product(104, "Watch", "Accessories"),
            new Product(105, "Bag", "Fashion")
        };

        System.out.println("Linear Search:");
        Product result1 = linearSearch(products, 103);
        if (result1 != null)
            result1.display();
        else
            System.out.println("Product not found");

        System.out.println("\nBinary Search:");
        Product result2 = binarySearch(products, 104);
        if (result2 != null)
            result2.display();
        else
            System.out.println("Product not found");
    }
}
/*Algorithm	  Best Case	Average Case	Worst Case
Linear Search	O(1)	O(n)	O(n)
Binary Search	O(1)	O(log n)	O(log n)
Which is better for E-commerce?
Linear Search

Advantages:

Simple
Works on unsorted data

Disadvantages:

Slow for large product lists
Binary Search

Advantages:

Very fast
Good for large datasets

Disadvantages:

Needs sorted data
Suitable Algorithm

For an e-commerce platform like Amazon or Flipkart:

Binary Search is better because products are huge in number.
Faster search improves user experience.*/