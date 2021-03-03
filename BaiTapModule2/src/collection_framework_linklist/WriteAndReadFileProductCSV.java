package collection_framework_linklist;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

public class WriteAndReadFileProductCSV {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String HEADER = "Name,ID,Price";

    public static void writeFile(List<Product> productLinkedList) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("src/collection_framework_linklist/Product.csv");
            fileWriter.append(HEADER);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (Product product : productLinkedList) {
                fileWriter.append(product.getNameOfProduct());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(product.getIdProduct());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(product.getPriceProduct()));
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
        } catch (Exception exception) {
            exception.getMessage();
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception exception) {
                exception.getMessage();
            }
        }
    }


    public static LinkedList<Product> readFile() {
        BufferedReader br = null;
        LinkedList<Product> productLinkedList = new LinkedList<>();
        Path path = Paths.get("src/collection_framework_linklist/Product.csv");
        if (!Files.exists(path)) {
            try {
                FileWriter fileWriter = new FileWriter("src/collection_framework_linklist/Product.csv");
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
            }
        }
        try {
            String line;
            br = new BufferedReader(new FileReader("src/collection_framework_linklist/Product.csv"));
            while ((line = br.readLine()) != null) {
                String[] splitData = line.split(",");
                if (splitData[0].equals("Name")) {
                    continue;
                }
                Product product = new Product();
                product.setNameOfProduct(splitData[0]);
                product.setIdProduct(splitData[1]);
                product.setPriceProduct(Integer.parseInt(splitData[2]));
                productLinkedList.add(product);
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        } finally {
            try {
                assert br != null;
                br.close();
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
            }
        }
        return productLinkedList;
    }
}