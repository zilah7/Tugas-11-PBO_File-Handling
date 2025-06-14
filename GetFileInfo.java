import java.io.File;

public class GetFileInfo {
    public static void main(String[] args) {
        File file = new File("contoh.txt");
        if (file.exists()) {
            System.out.println("Informasi File:");
            System.out.println("Nama File: " + file.getName());
            System.out.println("Path: " + file.getAbsolutePath());
            System.out.println("Ukuran: " + file.length() + " bytes");
            System.out.println("Bisa dibaca? " + file.canRead());
            System.out.println("Bisa ditulis? " + file.canWrite());
        } else {
            System.out.println("File tidak ditemukan.");
        }
    }
}