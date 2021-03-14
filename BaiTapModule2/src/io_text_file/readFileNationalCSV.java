package io_text_file;

import java.io.*;


public class readFileNationalCSV {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader
                = new BufferedReader(new FileReader(new File(
                "src/io_text_file/national.csv")));
        String line = null;
        while ((line = bufferedReader.readLine()) != null) {

            String[] strData = line.substring(1, (line.length() - 1)).split("\",\"");
            System.out.println(strData[5]);
        }
    }
}
