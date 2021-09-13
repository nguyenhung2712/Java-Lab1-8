/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Triangle(scanner);
    }
    public static void Triangle(Scanner scanner) {
        float a, b, c;
        System.out.print("Nhập độ dài 3 cạnh: ");
        try {
            a = scanner.nextFloat();        
            b = scanner.nextFloat();
            c = scanner.nextFloat();
            if ((a + b > c) && (a + c > b) && (b + c > a)) {
                System.out.printf("Chu vi của tam giác: %.2f\n", a + b + c);
            } else {
                throw new ArithmeticException ("Dữ liệu không đúng");
            }
        } catch (ArithmeticException ex) {
            System.out.println(ex);
        } catch (Exception ex) {
            System.out.println("Dữ liệu không đúng");
        }
    }
}
