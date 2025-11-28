
import java.io.*;
import java.nio.file.*;
import java.util.*;

public class UsingSwitchCases {

    Scanner sc = new Scanner(System.in);

    // Create File
    void createFile() {
        System.out.print("Enter file name to create: ");
        String fileName = sc.nextLine();
        File file = new File(fileName);

        try {
            if (file.createNewFile()) {
                System.out.println("File created successfully: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Write to File
    void writeFile() {
        System.out.print("Enter file name to write: ");
        String fileName = sc.nextLine();
        System.out.print("Enter text: ");
        String content = sc.nextLine();
        try (FileWriter fw = new FileWriter(fileName)) {
            fw.write(content);
            System.out.println("Written successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Append to File
    void appendFile() {
        System.out.print("Enter file name to append: ");
        String fileName = sc.nextLine();
        System.out.print("Enter text to append: ");
        String content = sc.nextLine();
        try (FileWriter fw = new FileWriter(fileName, true)) {
            fw.write("\n" + content);
            System.out.println("Appended successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Read File (Text)
    void readFile() {
        System.out.print("Enter file name to read: ");
        String fileName = sc.nextLine();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("File Content:");
            while ((line = br.readLine()) != null)
                System.out.println(line);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    // Delete File
    void deleteFile() {
        System.out.print("Enter file name to delete: ");
        String fileName = sc.nextLine();
        File file = new File(fileName);
        if (file.delete())
            System.out.println("File deleted successfully!");
        else
            System.out.println("File not found!");
    }

    // Copy File
    void copyFile() {
        System.out.print("Enter source file: ");
        Path src = Paths.get(sc.nextLine());
        System.out.print("Enter destination file: ");
        Path dest = Paths.get(sc.nextLine());
        try {
            Files.copy(src, dest, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Copied successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Move File
    void moveFile() {
        System.out.print("Enter file to move: ");
        Path src = Paths.get(sc.nextLine());
        System.out.print("Enter destination file: ");
        Path dest = Paths.get(sc.nextLine());
        try {
            Files.move(src, dest, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Moved successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Rename / Replace File
    void renameFile() {
        System.out.print("Enter existing file name: ");
        File oldFile = new File(sc.nextLine());
        System.out.print("Enter new file name: ");
        File newFile = new File(sc.nextLine());

        if (oldFile.renameTo(newFile))
            System.out.println("Renamed successfully!");
        else
            System.out.println("Rename failed!");
    }

    // Write using FileOutputStream (Binary)
    void writeBinary() {
        System.out.print("Enter file for binary write: ");
        String fileName = sc.nextLine();
        System.out.print("Enter text: ");
        String data = sc.nextLine();

        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            fos.write(data.getBytes());
            System.out.println("Binary Write Successful!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Read using FileInputStream (Binary)
    void readBinary() {
        System.out.print("Enter binary file to read: ");
        String fileName = sc.nextLine();
        try (FileInputStream fis = new FileInputStream(fileName)) {
            int b;
            System.out.println("Binary Data:");
            while ((b = fis.read()) != -1)
                System.out.print((char) b);
            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Read CSV File
    void readCSV() {
        System.out.print("Enter CSV file name: ");
        String fileName = sc.nextLine();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            System.out.println("CSV Data:");
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                System.out.println(Arrays.toString(values));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Menu
    void showMenu() {
        while (true) {
            System.out.println("\n===== FILE OPERATIONS MENU =====");
            System.out.println("1. Create File");
            System.out.println("2. Write File");
            System.out.println("3. Append to File");
            System.out.println("4. Read File");
            System.out.println("5. Delete File");
            System.out.println("6. Copy File");
            System.out.println("7. Move File");
            System.out.println("8. Rename/Replace File");
            System.out.println("9. Write Binary File");
            System.out.println("10. Read Binary File");
            System.out.println("11. Read CSV File");
            System.out.println("0. Exit");
            System.out.print("Choose option: ");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1 -> createFile();
                case 2 -> writeFile();
                case 3 -> appendFile();
                case 4 -> readFile();
                case 5 -> deleteFile();
                case 6 -> copyFile();
                case 7 -> moveFile();
                case 8 -> renameFile();
                case 9 -> writeBinary();
                case 10 -> readBinary();
                case 11 -> readCSV();
                case 0 -> System.exit(0);
                default -> System.out.println("Invalid choice!");
            }
        }
    }

    public static void main(String[] args) {
        UsingSwitchCases obj = new UsingSwitchCases();
        obj.showMenu();
    }
}
