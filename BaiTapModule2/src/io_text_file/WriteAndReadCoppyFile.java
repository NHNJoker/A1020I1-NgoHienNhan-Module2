package io_text_file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WriteAndReadCoppyFile {
    private static final String NEW_LINE_SEPARATOR = "\n";
    public static void writeFile(String fileNameWrite,String fileValue){
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileNameWrite, true);
            fileWriter.append(fileValue);
        } catch (
                Exception exception) {
            System.out.println(exception.getMessage());
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
            }
        }
    }
    public static String readFile(String fileNameRead){
        BufferedReader br = null;
        String fileName = null;
        String stringValue ="";
        Path path = Paths.get(fileNameRead);
        if (!Files.exists(path)) {
            try {
                FileWriter fileWriter = new FileWriter(fileNameRead);
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
            }
        }
        try {
            String line;
            br = new BufferedReader(new FileReader(fileNameRead));
            while ((line = br.readLine()) != null) {
                stringValue+=line;
                stringValue+=NEW_LINE_SEPARATOR;
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
        return stringValue;
    }
}
