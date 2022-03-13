package viewer;

import controller.Method;
import model.TechnologyEquipment;
import storage.TechnologyEquipmentFile;

import java.awt.*;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Client {
    private static List<TechnologyEquipment> technologyEquipmentList = TechnologyEquipmentFile.readFile();

    public static void main(String[] args) throws IOException {
        int choice = -1;
        Scanner inputChoice = new Scanner(System.in);
        while (choice != 0){
            System.out.println("Menu");
            System.out.println("1. Thêm sản phẩm Screen mới");
            System.out.println("2. Thêm sản phẩm ComputerCase mới");
            System.out.println("3. Thêm sản phẩm Mouse mới");
            System.out.println("4. Thêm sản phẩm KeyBoard mới");
            System.out.println("5. Thêm sản phẩm Card mới");
            System.out.println("6. Sửa thông tin sản phẩm");
            System.out.println("7. Xóa sản phẩm");
            System.out.println("8. Hiển thị danh sách TeachnologyEquipment");
            System.out.println("9. Hiển thị số tiền của thiết bị sau khi giảm giá");
            System.out.println("0. Thoát");
            System.out.println("Mời bạn nhập lựa chọn");
            choice  = inputChoice.nextInt();
            switch (choice){
                case 1:
                    Method.addNewTechnologyEquipmentScreen();
                    break;
                case 2:
                    Method.addNewTechnologyEquipmentComputerCase();
                    break;
                case 3:
                    Method.addNewTechnologyEquipmentMouse();
                    break;
                case 4:
                    Method.addNewTechnologyEquipmentKeyBoard();
                    break;
                case 5:
                    Method.addNewTechnologyEquipmentCard();
                    break;
                case 6:
                    inputChoice.nextLine();
                    System.out.println("Nhập ID sản phẩm bạn muốn sửa");
                    String inputID = inputChoice.nextLine();
                    Method.editTechnologyEquipmentById(inputID);
                    break;
                case 7:
                    inputChoice.nextLine();
                    System.out.println("Nhập ID của sản phẩm bạn muốn xóa");
                    String inputId = inputChoice.nextLine();
                    Method.deleteTechnologyById(inputId);
                    break;
                case 8:
                    Method.showAllTechnologyEquipment();
                    break;
                case 9:
                    inputChoice.nextLine();
                    System.out.println("Nhập ID bạn muốn hiển thị số tiền");
                    String input = inputChoice.nextLine();
                    Method.getRealMoneyById(input);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Không có lựa chọn. Mời nhập lại");
            }
        }
    }
}
