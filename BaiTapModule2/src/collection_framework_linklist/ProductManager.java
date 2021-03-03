package collection_framework_linklist;

import java.util.*;

public class ProductManager {
    public static void addProduct() {
        Scanner input = new Scanner(System.in);
        List<Product> productLinkedList = WriteAndReadFileProductCSV.readFile();
        Product product = new Product();
        System.out.println("Nhap ten san pham:");
        product.setNameOfProduct(input.nextLine());
        System.out.println("Nhap id san pham:");
        product.setIdProduct(input.nextLine());
        System.out.println("Nhap gia san pham:");
        product.setPriceProduct(input.nextInt());
        productLinkedList.add(product);
        WriteAndReadFileProductCSV.writeFile(productLinkedList);
    }

    public static void editProduct() {
        List<Product> productLinkedList = WriteAndReadFileProductCSV.readFile();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ID san pham muon sua:");
        String IDProduct = input.nextLine();
        boolean check = false;
        for (Product product : productLinkedList) {
            if (product.getIdProduct().equals(IDProduct)) {
                System.out.println("Nhap ten san pham:");
                product.setNameOfProduct(input.nextLine());
                System.out.println("Nhap id san pham:");
                product.setIdProduct(input.nextLine());
                System.out.println("Nhap gia san pham:");
                product.setPriceProduct(input.nextInt());
                System.out.println("Sua thanh cong.");
                check = true;
            }
        }
        if (!check){
            System.out.println("Khong tim thay san pham "+IDProduct);
        }
        WriteAndReadFileProductCSV.writeFile(productLinkedList);
    }

    public static void removeProduct(){
        List<Product> productLinkedList = WriteAndReadFileProductCSV.readFile();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap id san pham muon xoa:");
        String IDProduct = input.nextLine();
        for (int i =0;i<productLinkedList.size();i++){
            if (productLinkedList.get(i).getIdProduct().equals(IDProduct)) {
                productLinkedList.remove(i);
                System.out.println("Sua thanh cong.");
            } else {
                System.out.println("Khong tim thay san pham " + IDProduct);
            }
        }
        WriteAndReadFileProductCSV.writeFile(productLinkedList);
    }

    public static void displayProduct(){
        List<Product> productLinkedList = WriteAndReadFileProductCSV.readFile();
        for (Product product:productLinkedList) {
            System.out.println(product.toString());
        }
    }

    public static void sortUpProduct(){
        List<Product> productLinkedList = WriteAndReadFileProductCSV.readFile();
        Collections.sort(productLinkedList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getPriceProduct()-o2.getPriceProduct();
            }
        });
        WriteAndReadFileProductCSV.writeFile(productLinkedList);
    }

    public static void sortDownProduct(){
        List<Product> productLinkedList = WriteAndReadFileProductCSV.readFile();
        Collections.sort(productLinkedList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o2.getPriceProduct()-o1.getPriceProduct();
            }
        });
        WriteAndReadFileProductCSV.writeFile(productLinkedList);
    }

    public static void searchProduct() {
        List<Product> productLinkedList = WriteAndReadFileProductCSV.readFile();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ten san pham muon tim kiem:");
        String nameProduct = input.nextLine();
        boolean check = false;
        for (int i = 0 ; i< productLinkedList.size();i++){
            if (productLinkedList.get(i).getNameOfProduct().equals(nameProduct)){
                System.out.println(productLinkedList.get(i).toString());
                check = true;
            }
        }
        if (!check){
            System.out.println("Khong tim thay san pham " + nameProduct);
        }
    }
}
