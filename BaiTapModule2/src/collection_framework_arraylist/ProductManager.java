package collection_framework_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ProductManager {
    public static void addProduct() {
        Scanner input = new Scanner(System.in);
        ArrayList<Product> productArrayList = WriteAndReadFileProductCSV.readFile();
        Product product = new Product();
        System.out.println("Nhap ten san pham:");
        product.setNameOfProduct(input.nextLine());
        System.out.println("Nhap id san pham:");
        product.setIdProduct(input.nextLine());
        System.out.println("Nhap gia san pham:");
        product.setPriceProduct(input.nextInt());
        productArrayList.add(product);
        WriteAndReadFileProductCSV.writeFile(productArrayList);
    }

    public static void editProduct() {
        ArrayList<Product> productArrayList = WriteAndReadFileProductCSV.readFile();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ID san pham muon sua:");
        String IDProduct = input.nextLine();
        boolean check = false;
        for (Product product : productArrayList) {
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
        WriteAndReadFileProductCSV.writeFile(productArrayList);
    }

    public static void removeProduct(){
        ArrayList<Product> productArrList = WriteAndReadFileProductCSV.readFile();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap id san pham muon xoa:");
        String IDProduct = input.nextLine();
        for (int i =0;i<productArrList.size();i++){
            if (productArrList.get(i).getIdProduct().equals(IDProduct)) {
                productArrList.remove(i);
                System.out.println("Sua thanh cong.");
            } else {
                System.out.println("Khong tim thay san pham " + IDProduct);
            }
        }
        WriteAndReadFileProductCSV.writeFile(productArrList);
    }

    public static void displayProduct(){
        ArrayList<Product> productArrayList = WriteAndReadFileProductCSV.readFile();
        for (Product product:productArrayList) {
            System.out.println(product.toString());
        }
    }

    public static void sortUpProduct(){
        ArrayList<Product> productArrayList = WriteAndReadFileProductCSV.readFile();
        Collections.sort(productArrayList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getPriceProduct()-o2.getPriceProduct();
            }
        });
        WriteAndReadFileProductCSV.writeFile(productArrayList);
    }

    public static void sortDownProduct(){
        ArrayList<Product> productArrayList = WriteAndReadFileProductCSV.readFile();
        Collections.sort(productArrayList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o2.getPriceProduct()-o1.getPriceProduct();
            }
        });
        WriteAndReadFileProductCSV.writeFile(productArrayList);
    }

    public static void searchProduct() {
        ArrayList<Product> productArrayList = WriteAndReadFileProductCSV.readFile();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ten san pham muon tim kiem:");
        String nameProduct = input.nextLine();
        boolean check = false;
        for (int i = 0 ; i< productArrayList.size();i++){
            if (productArrayList.get(i).getNameOfProduct().equals(nameProduct)){
                System.out.println(productArrayList.get(i).toString());
                check = true;
            }
        }
        if (!check){
            System.out.println("Khong tim thay san pham " + nameProduct);
        }
    }
}
