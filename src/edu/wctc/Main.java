package edu.wctc;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter number");

        try {
            int num = Integer.parseInt(keyboard.nextLine());

        } catch (NumberFormatException e) {
            System.out.println("Number format");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }


    }

    static void readFileToList() throws IOException {
        List<String> colors = Files.readAllLines(Paths.get("colors.txt"));

        for (String color : colors) {
            System.out.println(color);
        }
    }

    static void IoDemo2() throws IOException {
        String fileName = "data.txt";
        File file = new File(fileName);

        if (file.exists()) {
            Scanner inputFile = new Scanner(file);

            while (inputFile.hasNext()) {
                System.out.println(inputFile.nextLine());
            }
        } else {
            System.out.println("not found");
        }
    }

    static void PrintFileWrite() throws IOException {
        String fileName = "data.txt";
        FileWriter fileWriter = new FileWriter(fileName, true);
        PrintWriter output = new PrintWriter(fileWriter);

        output.write("Yo yo yo ");
        output.flush();
        output.close();
    }
}
