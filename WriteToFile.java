import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("contoh.txt")) {
            writer.write("Halo, ini contoh teks!");
            System.out.println("Teks berhasil ditulis ke file.");
        } catch (IOException e) {
            System.out.println("Terjadi error saat menulis file.");
            e.printStackTrace();
        }
    }
}
