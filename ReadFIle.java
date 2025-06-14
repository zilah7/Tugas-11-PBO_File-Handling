import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("contoh.txt"))) {
            System.out.println("Isi File:");
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Terjadi error saat membaca file.");
            e.printStackTrace();
        }
    }
}