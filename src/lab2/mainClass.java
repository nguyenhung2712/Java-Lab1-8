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
public class mainClass {
    public static void main(String[] args) {
        // TODO code application logic here
        Bai4();
    }
    public static void Bai1(Scanner scanner) {
        System.out.print("Nhập các hệ số: ");
        float a = (float)scanner.nextDouble();
        float b = (float)scanner.nextDouble();
        if (a == 0) {
            if (b == 0) {
                System.out.print("Phương trình VSN");
            } else {
                System.out.print("Phương trình vô nghiệm");
            }
        } else {
            System.out.printf("Phương trình có nghiệm: %.2f", -b/2*a);
        }
        System.out.println();
    }
    public static void Bai2(Scanner scanner) {
        System.out.print("Nhập các hệ số: ");
        float a = (float)scanner.nextDouble();
        float b = (float)scanner.nextDouble();
        float c = (float)scanner.nextDouble();
        if (a == 0) {
            System.out.printf("Phương trình có nghiệm: %.2f", -c/2*b);
        } else {
            float delta = (float)Math.pow(b, 2) - 4*a*c;
            if (delta < 0) {
                System.out.print("Phương trình vô nghiệm");
            } else if (delta == 0) {
                System.out.printf("Phương trình có nghiệm kép: %.2f", -b/2*a);
            } else {
                float x1 = (float)(-b + Math.sqrt(delta)) / 2*a;                
                float x2 = (float)(-b - Math.sqrt(delta)) / 2*a;
                System.out.printf("Phương trình có 2 nghiệm pb:\nx1 = %.2f\nx2 = %.2f", x1, x2);
            }
        }
        System.out.println();
    }
    public static void Bai3(Scanner scanner) {
        System.out.print("Số điện: ");
        float elec = (float)scanner.nextDouble();
        if (elec >= 0 && elec <= 50) {
            System.out.printf("Số tiền cần trả: %.2f", elec*1000);
        } else if (elec > 50) {
            System.out.printf("Số tiền cần trả: %.2f", elec*1000);
        }
        System.out.println();
    }
    public static void Bai4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("+----------------------------------+");
        System.out.println("1. Giải phương trình bậc nhất");
        System.out.println("2. Giải phương trình bậc hai");
        System.out.println("3. Tính tiền điện");
        System.out.println("4. Kết thúc");
        System.out.println("+----------------------------------+");
        System.out.print("Chọn chức năng: ");
        try {
            int choose = scanner.nextInt();
            switch (choose) {
                case 1: Bai1(scanner); break;                
                case 2: Bai2(scanner); break;
                case 3: Bai3(scanner); break;
                case 4: System.exit(0); break;
                default: System.exit(0); break;
            }
        } catch (Exception ex){
            System.out.println("Vui lòng nhập lại");
        }
        
    }
}
