package PBO;
//M.Ardifa Rizqi Ramadhan_22533653_TI 3D
    import java.util.Scanner;

public class InputMismatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka: ");

        try {
            int number = scanner.nextInt();
            System.out.println("Angka yang dimasukkan: " + number);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Kesalahan: Input yang dimasukkan tidak sesuai dengan tipe data int.");
        }
    }
}

