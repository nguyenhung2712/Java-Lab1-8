package lab1;
import java.util.Scanner;

public class MainClass {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
