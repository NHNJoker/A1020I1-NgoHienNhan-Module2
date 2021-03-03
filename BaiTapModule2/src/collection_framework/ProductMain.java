package collection_framework;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        boolean check = true;
        Scanner input = new Scanner(System.in);
        while (check) {
            System.out.println("1. add product\n2. edit product\n3. remove product\n4. display\n5. search\n" +
                    "6. sort\n7. exit");
            int choose = input.nextInt();
            switch (choose) {
                case 1:
                    ProductManager.addProduct();
                    break;
                case 2:
                    ProductManager.editProduct();
                    break;
                case 3:
                    ProductManager.removeProduct();
                    break;
                case 4:
                    ProductManager.displayProduct();
                    break;
                case 5:
                    ProductManager.searchProduct();
                    break;
                case 6:
                    ProductManager.sortProduct();
                    break;
                case 7:
                    check = false;
                    break;
            }
        }
    }
}
