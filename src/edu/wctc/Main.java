package edu.wctc;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main implements Serializable {

    public static void main(String[] args) throws IOException {

        Activity act = new Activity("Balls", "sucking them", 12, 13);
        //System.out.println(act);

        Hobby hobby = new Hobby(act, 2, Priority.HIGH);
        //System.out.println(hobby);
        //FileOutputStream fos = new FileOutputStream()
        readObjectFromFile();

    }

    static void writeToFile(Hobby hobby) {
        try (FileOutputStream os = new FileOutputStream("dataaf.obj");
             ObjectOutputStream oos = new ObjectOutputStream(os)
        ) {
            oos.writeObject(hobby);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println();
            e.printStackTrace();
        }
    }


    static Hobby readObjectFromFile() {
        try (
                FileInputStream fis = new FileInputStream("data.obj");
                ObjectInputStream ois = new ObjectInputStream(fis)
        ) {
            try {
                return (Hobby) ois.readObject();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    static void mod4Day1() {
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
