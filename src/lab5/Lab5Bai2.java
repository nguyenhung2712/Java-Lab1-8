package lab5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lab5Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        menu(scanner);
    }
    public static void menu(Scanner scanner) {
        ArrayList<String> nameArr = new ArrayList<>();
        System.out.println("Nhập mảng họ tên");
        nhap(nameArr, scanner);
        System.out.println("\nMảng sau khi đã nhập");
        xuat(nameArr);
        System.out.println("+----------------------------------+");
        System.out.println("1. Xuất danh sách ngẫu nhiên");
        System.out.println("2. Xuất danh sách sau khi sắp xếp giảm dần");
        System.out.println("3. Tìm và xóa phần tử nhập từ bàn phím");
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
                case 1 -> ngaunhien(nameArr);
                case 2 -> sapxep(nameArr);
                case 3 -> {
                    System.out.print("Nhập phần tử muốn xóa: ");
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    xoa(nameArr, name);
                }
                case 4 -> System.exit(0);
                default -> System.exit(0);
            }
        } catch (Exception ex) {
            System.out.print("Dữ liệu không hợp lệ.");
        }
    }
    private static void nhap(ArrayList<String> nameArr, Scanner scanner) {
        while (true) {
            try {
                String name = scanner.nextLine();
                nameArr.add(name);
            } catch (Exception ex) {
                System.out.print("Dữ liệu không hợp lệ.");
            }
            System.out.println("Nhập thêm (Y/N)?");
            if (scanner.nextLine().toLowerCase().equals("n")) {
                break;
            }
        }
    }
    private static void xuat(ArrayList<String> nameArr) {
        nameArr.forEach(name -> {
            System.out.println(name);
        });
    }
    private static void ngaunhien(ArrayList<String> nameArr) {
        Collections.shuffle(nameArr);
        System.out.println("\nMảng sau khi sắp xếp ngẫu nhiên");
        xuat(nameArr);
    }
    private static void sapxep(ArrayList<String> nameArr) {
        Collections.sort(nameArr);
        Collections.reverse(nameArr);
        System.out.println("\nMảng sau khi sắp xếp giảm dần");
        xuat(nameArr);
    }
    private static void xoa(ArrayList<String> nameArr, String nameFind) {
        boolean checkFound = false;
        for (String name: nameArr) {
            if (name.equals(nameFind)) {
                nameArr.remove(name);
                checkFound = true;
                break;
            }
        }
        if (!checkFound) {
            System.out.println("\nKhông tìm thấy phần tử cần xóa\n");
        } else {
            System.out.printf("\nMảng sau khi xóa phần tử %s\n", nameFind);
            xuat(nameArr);
        }
    }
}
