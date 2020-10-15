package Case;



import  java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("--- CHƯƠNG TRÌNH QUẢN LÝ DANH BA CỦA HND ---");
            System.out.println("Chọn chức năng theo số để tiếp tục: ");
            System.out.println("1. Xem danh sách");
            System.out.println("2. Thêm mới");
            System.out.println("3. Cập nhật");
            System.out.println("4. Xóa");
            System.out.println("5. Tìm kiếm");
            System.out.println("6. Đọc từ file");
            System.out.println("7. Ghi vào file");
            System.out.println("8. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Method.show();
                    break;
                case 2:
                    Method.add();
                    break;
                case 3:
                    System.out.print("Enter id want update: ");
                    int updateId = Integer.parseInt(sc.nextLine());
                    Method.update(updateId);
                    System.out.println("Update complete!!!");
                    break;
                case 4:
                    System.out.print("Enter id want delete: ");
                    int deleteId = Integer.parseInt(sc.nextLine());
                    Method.delete(deleteId);
                    System.out.println("Delete complete!!");
                    break;
                case 5:
                    System.out.print("Enter id want search: ");
                    int searchId = Integer.parseInt(sc.nextLine());
                    Method.search(searchId);
                    break;
                case 6:
                    Method.readFile();
                    System.out.println("Thêm thành công");
                    break;
                case 7:
                    Method.writeFile();
                    break;
                default :
                    System.out.println("lỗi mời nhập lại");
            }
        } while (choice != 8);
    }
}