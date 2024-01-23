/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO;
//M.Ardifa Rizqi Ramadhan_22533653_TI 3D
public class ArithmeticException {
        public static void main(String[] args) {
        int a = 9;
        int b = 0;

        try {
            int result = a / b;
            System.out.println("Hasil pembagian: " + result);
        } catch (java.lang.ArithmeticException e) {
            System.out.println("Kesalahan: Pembagian dengan nol tidak diizinkan.");
        }
    }
}
