package lab1;
import java.util.Scanner;

public class Lab1Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Chiều dài cạnh: ");        
            double d = scanner.nextDouble();
            if (d < 0) {
                throw new ArithmeticException ("Kích thước nhập không hợp lệ!");
            } else {
                System.out.printf("Thể tích: %.2f", Math.pow(d, 3));
                System.out.println();
            }
        } catch (ArithmeticException ex) {
            System.out.println(ex);
        } catch (Exception ex) {
            System.out.println("Dữ liệu nhập không hợp lệ");
        }
        
    }
}
