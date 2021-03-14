package io_text_file;

import java.util.Scanner;

public class MainCopyFile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap link file name read:");
        String fileNameRead = input.nextLine();
        System.out.println("Nhap link file name write:");
        String fileNameWrite = input.nextLine();
        WriteAndReadCoppyFile.writeFile(fileNameWrite, WriteAndReadCoppyFile.readFile(fileNameRead));
    }
}
