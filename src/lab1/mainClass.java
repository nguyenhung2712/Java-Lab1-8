/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class mainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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
        } catch (Exception ex) {
            System.out.println("Dữ liệu không đúng");
        }
        

    }
    public static void Bai1(Scanner scanner) {
        System.out.print("Họ và Tên: ");
        String name = scanner.nextLine();       
        System.out.print("Điểm TB: ");
        double grade = scanner.nextDouble();
        System.out.printf("%s %.2f điểm", name, grade);        
        System.out.println();
    }
    public static void Bai2(Scanner scanner) {
        System.out.print("Chiều dài: ");        
        double d = scanner.nextDouble();
        System.out.print("Chiều rộng: ");
        double r = scanner.nextDouble();
        System.out.printf("Chu vi: %.2f\nDiện tích: %.2f\nCạnh nhỏ nhất: %.2f", (d+r)*2, d*r, Math.min(d, r));
        System.out.println();
    }
    public static void Bai3(Scanner scanner) {
        System.out.print("Chiều dài cạnh: ");        
        double d = scanner.nextDouble();
        System.out.printf("Thể tích: %.2f", Math.pow(d, 3));
        System.out.println();
    }
    public static void Bai4(Scanner scanner) {
        System.out.print("Nhập các hệ số: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double delta = Math.pow(b, 2) - 4*a*c;
        System.out.printf("Delta: %.2f\nsqrt(Delta): %.2f", delta, Math.sqrt(delta));
        System.out.println();
    }
}   
