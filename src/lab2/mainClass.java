
package lab2;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        menu();
    }
    public static void giaiPTB1(Scanner scanner) {
        try {
            System.out.print("Nhập các hệ số: ");
            float a = scanner.nextFloat();
            float b = scanner.nextFloat();
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
        } catch (Exception ex) {
            System.out.println("Dữ liệu không hợp lệ!");
        }
    }
    public static void giaiPTB2(Scanner scanner) {
        try {
            System.out.print("Nhập các hệ số: ");
            float a = scanner.nextFloat();
            float b = scanner.nextFloat();
            float c = scanner.nextFloat();
            if (a == 0) {
                if (b == 0) {
                    if (c == 0) {
                        System.out.print("Phương trình VSN");
                    } else {
                        System.out.print("Phương trình vô nghiệm");
                    }
                } else {
                    System.out.printf("Phương trình có nghiệm: %.2f", -c/2*b);
                }
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
        } catch (Exception ex) {
            System.out.println("Dữ liệu không hợp lệ!");
        }
    }
    public static void tinhTienDien(Scanner scanner) {
        try {
            System.out.print("Nhập số điện: ");
            float elec = scanner.nextFloat();
            if (elec >= 0 && elec <= 50) {
                System.out.printf("Số tiền cần trả: %.2f", elec*1000);
            } else if (elec > 50) {
                System.out.printf("Số tiền cần trả: %.2f", 50*1000 + (elec - 50)*1200);
            }
            System.out.println();
        } catch (Exception ex) {
            System.out.println("Dữ liệu không hợp lệ!");
        }
    }
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("+----------------------------------+");
        System.out.println("1. Giải phương trình bậc nhất");
        System.out.println("2. Giải phương trình bậc hai");
        System.out.println("3. Tính tiền điện");
        System.out.println("4. Kết thúc");
        System.out.println("+----------------------------------+");
        System.out.print("Chọn chức năng: ");
        try {
            int choose;
            do {
                choose = scanner.nextInt();
                if (choose < 1 || choose > 4) {
                    System.out.println("Vui lòng nhập lại.");
                }
            } while(choose < 1 || choose > 4);
            switch (choose) {
                case 1: giaiPTB1(scanner); break;                
                case 2: giaiPTB2(scanner); break;
                case 3: tinhTienDien(scanner); break;
                case 4: System.exit(0); break;
                default: System.exit(0); break;
            }
        } catch (Exception ex){
            System.out.println("Dữ liệu không hợp lệ.");
        }
    }
}
