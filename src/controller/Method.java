package controller;

import com.sun.source.tree.CaseTree;
import model.*;
import storage.TechnologyEquipmentFile;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Method {
    private static List<TechnologyEquipment> technologyEquipmentList = TechnologyEquipmentManager.technologyEquipmentList;

    public static void addNewTechnologyEquipmentScreen(){
        Screen screen = creatNewScreen();
        TechnologyEquipmentManager.addNewTechnologyEquipmentScreen(screen);

            TechnologyEquipmentFile.writeFile(technologyEquipmentList);

    }

    public static void showAllTechnologyEquipment(){
        for (TechnologyEquipment t: technologyEquipmentList) {
            System.out.println(t);
        }

    }

    public static Screen creatNewScreen(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập ID");
        String id = scanner.nextLine();

        for(int i=0; i<technologyEquipmentList.size();i++){
            if (technologyEquipmentList.get(i).getId().equals(id)){
                System.out.println("ID bị trùng. Mời nhập lại ID");
                Screen newScreen = creatNewScreen();
                return newScreen;
            }
        }

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Mời bạn nhập tên");
        String name = scanner1.nextLine();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Mời bạn nhập màu");
        String color = scanner2.nextLine();

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Mời bạn nhập thương hiệu");
        String brand = scanner3.nextLine();

        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Mời bạn nhập năm");
        int year = scanner4.nextInt();

        Scanner scanner5 = new Scanner(System.in);
        System.out.println("Mời bạn nhập tháng");
        int month = scanner5.nextInt();

        Scanner scanner6 = new Scanner(System.in);
        System.out.println("Mời bạn nhập ngày");
        int day = scanner6.nextInt();
        LocalDate importDate = LocalDate.of(year, month, day);

        Scanner scanner7 = new Scanner(System.in);
        System.out.println("Mời bạn nhập số lượng");
        int amount = scanner7.nextInt();

        Scanner scanner8 = new Scanner(System.in);
        System.out.println("Mời bạn nhập giá");
        double cost = scanner8.nextDouble();

        Scanner scanner9 = new Scanner(System.in);
        System.out.println("Mời bạn nhập kích thước");
        int size = scanner9.nextInt();

        Scanner scanner10 = new Scanner(System.in);
        System.out.println("Mời bạn nhập độ phân giải");
        int resolution = scanner10.nextInt();

        Screen screen = new Screen(id, name, color, brand, importDate, amount, cost, size, resolution);
        return screen;
    }

    public static void addNewTechnologyEquipmentComputerCase(){
        ComputerCase computerCase = creatNewComputerCase();
        TechnologyEquipmentManager.addNewTechnologyEquipmentComputerCase(computerCase);

            TechnologyEquipmentFile.writeFile(technologyEquipmentList);


    }

    public static ComputerCase creatNewComputerCase(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập ID");
        String id = scanner.nextLine();

        for (int i = 0; i < technologyEquipmentList.size(); i++) {
            if (technologyEquipmentList.get(i).getId().equals(id)){
                System.out.println("ID bị trùng. Mời nhập lại ID");
                ComputerCase newComputerCase = creatNewComputerCase();
                return newComputerCase;
            }
        }

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Mời bạn nhập tên");
        String name = scanner1.nextLine();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Mời bạn nhập màu");
        String color = scanner2.nextLine();

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Mời bạn nhập thương hiệu");
        String brand = scanner3.nextLine();

        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Mời bạn nhập năm");
        int year = scanner4.nextInt();

        Scanner scanner5 = new Scanner(System.in);
        System.out.println("Mời bạn nhập tháng");
        int month = scanner5.nextInt();

        Scanner scanner6 = new Scanner(System.in);
        System.out.println("Mời bạn nhập ngày");
        int day = scanner6.nextInt();
        LocalDate importDate = LocalDate.of(year, month, day);

        Scanner scanner7 = new Scanner(System.in);
        System.out.println("Mời bạn nhập số lượng");
        int amount = scanner7.nextInt();

        Scanner scanner8 = new Scanner(System.in);
        System.out.println("Mời bạn nhập giá");
        double cost = scanner8.nextDouble();

        Scanner scanner9 = new Scanner(System.in);
        System.out.println("Mời bạn nhập thiết kế");
        String design = scanner9.nextLine();


        ComputerCase computerCase = new ComputerCase(id, name, color, brand, importDate, amount, cost, design);
        return computerCase;
    }

    public static void addNewTechnologyEquipmentMouse() {
        Mouse mouse = creatNewMouse();
        TechnologyEquipmentManager.addNewTechnologyEquipmentMouse(mouse);

            TechnologyEquipmentFile.writeFile(technologyEquipmentList);

    }

    public static Mouse creatNewMouse() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập ID");
        String id = scanner.nextLine();

        for (int i = 0; i < technologyEquipmentList.size(); i++) {
            if (technologyEquipmentList.get(i).getId().equals(id)){
                System.out.println("ID bị trùng. Mời nhập lại ID");
                Mouse newMouse = creatNewMouse();
                return newMouse;
            }
        }

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Mời bạn nhập tên");
        String name = scanner1.nextLine();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Mời bạn nhập màu");
        String color = scanner2.nextLine();

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Mời bạn nhập thương hiệu");
        String brand = scanner3.nextLine();

        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Mời bạn nhập năm");
        int year = scanner4.nextInt();

        Scanner scanner5 = new Scanner(System.in);
        System.out.println("Mời bạn nhập tháng");
        int month = scanner5.nextInt();

        Scanner scanner6 = new Scanner(System.in);
        System.out.println("Mời bạn nhập ngày");
        int day = scanner6.nextInt();
        LocalDate importDate = LocalDate.of(year, month, day);

        Scanner scanner7 = new Scanner(System.in);
        System.out.println("Mời bạn nhập số lượng");
        int amount = scanner7.nextInt();

        Scanner scanner8 = new Scanner(System.in);
        System.out.println("Mời bạn nhập giá");
        double cost = scanner8.nextDouble();

        Scanner scanner9 = new Scanner(System.in);
        System.out.println("Mời bạn nhập kết nối");
        String connect = scanner9.nextLine();

        Scanner scanner10 = new Scanner(System.in);
        System.out.println("Mời bạn nhập khối lượng");
        double weight = scanner10.nextDouble();

        Mouse mouse = new Mouse(id, name, color, brand, importDate, amount, cost, connect, weight);
        return mouse;
    }

    public static void addNewTechnologyEquipmentKeyBoard(){
        KeyBoard keyBoard = creatNewKeyBoard();
        TechnologyEquipmentManager.addNewTechnologyEquipmentKeyBoard(keyBoard);

            TechnologyEquipmentFile.writeFile(technologyEquipmentList);

    }

    public static KeyBoard creatNewKeyBoard() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập ID");
        String id = scanner.nextLine();

        for (int i = 0; i < technologyEquipmentList.size(); i++) {
            if (technologyEquipmentList.get(i).getId().equals(id)){
                System.out.println("ID bị trùng. Mời nhập lại ID");
                KeyBoard newKeyBoard = creatNewKeyBoard();
                return newKeyBoard;
            }
        }

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Mời bạn nhập tên");
        String name = scanner1.nextLine();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Mời bạn nhập màu");
        String color = scanner2.nextLine();

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Mời bạn nhập thương hiệu");
        String brand = scanner3.nextLine();

        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Mời bạn nhập năm");
        int year = scanner4.nextInt();

        Scanner scanner5 = new Scanner(System.in);
        System.out.println("Mời bạn nhập tháng");
        int month = scanner5.nextInt();

        Scanner scanner6 = new Scanner(System.in);
        System.out.println("Mời bạn nhập ngày");
        int day = scanner6.nextInt();
        LocalDate importDate = LocalDate.of(year, month, day);

        Scanner scanner7 = new Scanner(System.in);
        System.out.println("Mời bạn nhập số lượng");
        int amount = scanner7.nextInt();

        Scanner scanner8 = new Scanner(System.in);
        System.out.println("Mời bạn nhập giá");
        double cost = scanner8.nextDouble();

        Scanner scanner9 = new Scanner(System.in);
        System.out.println("Mời bạn nhập kiểu nút");
        String button = scanner9.nextLine();

        KeyBoard keyBoard = new KeyBoard(id, name, color, brand, importDate, amount, cost, button);
        return keyBoard;
    }

    public static void addNewTechnologyEquipmentCard(){
        Card card = creatNewCard();
        TechnologyEquipmentManager.addNewTechnologyEquipmentCard(card);

            TechnologyEquipmentFile.writeFile(technologyEquipmentList);

    }

    public static Card creatNewCard() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập ID");
        String id = scanner.nextLine();

        for (int i = 0; i < technologyEquipmentList.size(); i++) {
            if (technologyEquipmentList.get(i).getId().equals(id)){
                System.out.println("ID bị trùng. Mời nhập lại ID");
                Card newCard = creatNewCard();
                return newCard;
            }
        }

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Mời bạn nhập tên");
        String name = scanner1.nextLine();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Mời bạn nhập màu");
        String color = scanner2.nextLine();

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Mời bạn nhập thương hiệu");
        String brand = scanner3.nextLine();

        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Mời bạn nhập năm");
        int year = scanner4.nextInt();

        Scanner scanner5 = new Scanner(System.in);
        System.out.println("Mời bạn nhập tháng");
        int month = scanner5.nextInt();

        Scanner scanner6 = new Scanner(System.in);
        System.out.println("Mời bạn nhập ngày");
        int day = scanner6.nextInt();
        LocalDate importDate = LocalDate.of(year, month, day);

        Scanner scanner7 = new Scanner(System.in);
        System.out.println("Mời bạn nhập số lượng");
        int amount = scanner7.nextInt();

        Scanner scanner8 = new Scanner(System.in);
        System.out.println("Mời bạn nhập giá");
        double cost = scanner8.nextDouble();

        Scanner scanner9 = new Scanner(System.in);
        System.out.println("Mời bạn nhập tên card");
        String nameOfCard = scanner9.nextLine();

        Card card = new Card(id, name, color, brand,importDate, amount, cost, nameOfCard);
        return card;
    }

    public static void deleteTechnologyById(String id){
//        if (checkIndexById(id) != -1){
//            Method.technologyEquipmentList.remove(checkIndexById(id));
//            System.out.println("Xóa thành công ID: "+id);
//        }
//        else {
//            System.out.println("ID không tìm thấy!");
//        }
////        TechnologyEquipmentManager.deleteTechnologyById();
//        try {
//            TechnologyEquipmentFile.writeFile(Method.technologyEquipmentList);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        TechnologyEquipment technologyEquipment = getById(id);
        if (technologyEquipment == null){
            System.out.println("Không tìm thấy ID");
        }
        else {
            TechnologyEquipmentManager.deleteTechnology(technologyEquipment);
            System.out.println("Xóa thành công ID:" + id);
        }
        TechnologyEquipmentFile.writeFile(technologyEquipmentList);
    }


    public static void editTechnologyEquipmentById(String id){
        if (checkIndexById(id) != -1) {
            int index = checkIndexById(id);
            Scanner input = new Scanner(System.in);
            if (Method.technologyEquipmentList.get(index) instanceof Screen) {
//                System.out.println("Nhập ID mới");
//                String newID = input.nextLine();
//                Method.technologyEquipmentList.get(index).setId(newID);
                System.out.println("Nhập tên mới");
                String newName = input.nextLine();
                Method.technologyEquipmentList.get(index).setName(newName);
                System.out.println("Nhập màu mới");
                String newColor = input.nextLine();
                Method.technologyEquipmentList.get(index).setColor(newColor);
                System.out.println("Nhập nhãn hiệu mới");
                String newBrand = input.nextLine();
                Method.technologyEquipmentList.get(index).setBrand(newBrand);
                System.out.println("Nhập ngày tháng năm mới");
                System.out.println("Nhập năm mới");
                int year = input.nextInt();
                System.out.println("Nhập tháng mới");
                int month = input.nextInt();
                System.out.println("Nhập ngày mới");
                int day = input.nextInt();
                Method.technologyEquipmentList.get(index).setImportDate(year, month, day);
                System.out.println("Nhập số lượng mới");
                int newAmount = input.nextInt();
                Method.technologyEquipmentList.get(index).setAmount(newAmount);
                System.out.println("Nhập giá mới");
                double newCost = input.nextDouble();
                Method.technologyEquipmentList.get(index).setCost(newCost);
                System.out.println("Nhập kích thước mới");
                int newSize = input.nextInt();
                ((Screen) Method.technologyEquipmentList.get(index)).setSize(newSize);
                System.out.println("Nhập độ phân giải mới");
                int newResolution = input.nextInt();
                ((Screen) Method.technologyEquipmentList.get(index)).setResolution(newResolution);
            }

            if (Method.technologyEquipmentList.get(index) instanceof ComputerCase) {
//                System.out.println("Nhập ID mới");
//                String newID = input.nextLine();
//                Method.technologyEquipmentList.get(index).setId(newID);
                System.out.println("Nhập tên mới");
                String newName = input.nextLine();
                Method.technologyEquipmentList.get(index).setName(newName);
                System.out.println("Nhập màu mới");
                String newColor = input.nextLine();
                Method.technologyEquipmentList.get(index).setColor(newColor);
                System.out.println("Nhập nhãn hiệu mới");
                String newBrand = input.nextLine();
                Method.technologyEquipmentList.get(index).setBrand(newBrand);
                System.out.println("Nhập ngày tháng năm mới");
                System.out.println("Nhập năm mới");
                int year = input.nextInt();
                System.out.println("Nhập tháng mới");
                int month = input.nextInt();
                System.out.println("Nhập ngày mới");
                int day = input.nextInt();
                Method.technologyEquipmentList.get(index).setImportDate(year, month, day);
                System.out.println("Nhập số lượng mới");
                int newAmount = input.nextInt();
                Method.technologyEquipmentList.get(index).setAmount(newAmount);
                System.out.println("Nhập giá mới");
                double newCost = input.nextDouble();
                Method.technologyEquipmentList.get(index).setCost(newCost);
                System.out.println("Nhập thiết kế mới");
                String newDesign = input.nextLine();
                ((ComputerCase) Method.technologyEquipmentList.get(index)).setDesign(newDesign);
            }

            if (Method.technologyEquipmentList.get(index) instanceof Mouse) {
//                System.out.println("Nhập ID mới");
//                String newID = input.nextLine();
//                Method.technologyEquipmentList.get(index).setId(newID);
                System.out.println("Nhập tên mới");
                String newName = input.nextLine();
                Method.technologyEquipmentList.get(index).setName(newName);
                System.out.println("Nhập màu mới");
                String newColor = input.nextLine();
                Method.technologyEquipmentList.get(index).setColor(newColor);
                System.out.println("Nhập nhãn hiệu mới");
                String newBrand = input.nextLine();
                Method.technologyEquipmentList.get(index).setBrand(newBrand);
                System.out.println("Nhập ngày tháng năm mới");
                System.out.println("Nhập năm mới");
                int year = input.nextInt();
                System.out.println("Nhập tháng mới");
                int month = input.nextInt();
                System.out.println("Nhập ngày mới");
                int day = input.nextInt();
                Method.technologyEquipmentList.get(index).setImportDate(year, month, day);
                System.out.println("Nhập số lượng mới");
                int newAmount = input.nextInt();
                Method.technologyEquipmentList.get(index).setAmount(newAmount);
                System.out.println("Nhập giá mới");
                double newCost = input.nextDouble();
                Method.technologyEquipmentList.get(index).setCost(newCost);
                System.out.println("Nhập kết nối mới");
                String newConnect = input.nextLine();
                ((Mouse) Method.technologyEquipmentList.get(index)).setConnect(newConnect);
                System.out.println("Nhập khối lượng mới");
                double newWeight = input.nextDouble();
                ((Mouse) Method.technologyEquipmentList.get(index)).setWeight(newWeight);
            }

            if (Method.technologyEquipmentList.get(index) instanceof KeyBoard) {
//                System.out.println("Nhập ID mới");
//                String newID = input.nextLine();
//                Method.technologyEquipmentList.get(index).setId(newID);
                System.out.println("Nhập tên mới");
                String newName = input.nextLine();
                Method.technologyEquipmentList.get(index).setName(newName);
                System.out.println("Nhập màu mới");
                String newColor = input.nextLine();
                Method.technologyEquipmentList.get(index).setColor(newColor);
                System.out.println("Nhập nhãn hiệu mới");
                String newBrand = input.nextLine();
                Method.technologyEquipmentList.get(index).setBrand(newBrand);
                System.out.println("Nhập ngày tháng năm mới");
                System.out.println("Nhập năm mới");
                int year = input.nextInt();
                System.out.println("Nhập tháng mới");
                int month = input.nextInt();
                System.out.println("Nhập ngày mới");
                int day = input.nextInt();
                Method.technologyEquipmentList.get(index).setImportDate(year, month, day);
                System.out.println("Nhập số lượng mới");
                int newAmount = input.nextInt();
                Method.technologyEquipmentList.get(index).setAmount(newAmount);
                System.out.println("Nhập giá mới");
                double newCost = input.nextDouble();
                Method.technologyEquipmentList.get(index).setCost(newCost);
                System.out.println("Nhập nút mới");
                String newButton = input.nextLine();
                ((KeyBoard) Method.technologyEquipmentList.get(index)).setButton(newButton);
            }

            if (Method.technologyEquipmentList.get(index) instanceof Card) {
//                System.out.println("Nhập ID mới");
//                String newID = input.nextLine();
//                Method.technologyEquipmentList.get(index).setId(newID);
                System.out.println("Nhập tên mới");
                String newName = input.nextLine();
                Method.technologyEquipmentList.get(index).setName(newName);
                System.out.println("Nhập màu mới");
                String newColor = input.nextLine();
                Method.technologyEquipmentList.get(index).setColor(newColor);
                System.out.println("Nhập nhãn hiệu mới");
                String newBrand = input.nextLine();
                Method.technologyEquipmentList.get(index).setBrand(newBrand);
                System.out.println("Nhập ngày tháng năm mới");
                System.out.println("Nhập năm mới");
                int year = input.nextInt();
                System.out.println("Nhập tháng mới");
                int month = input.nextInt();
                System.out.println("Nhập ngày mới");
                int day = input.nextInt();
                Method.technologyEquipmentList.get(index).setImportDate(year, month, day);
                System.out.println("Nhập số lượng mới");
                int newAmount = input.nextInt();
                Method.technologyEquipmentList.get(index).setAmount(newAmount);
                System.out.println("Nhập giá mới");
                double newCost = input.nextDouble();
                Method.technologyEquipmentList.get(index).setCost(newCost);
                System.out.println("Nhập tên card mới");
                String newNameofCard = input.nextLine();
                ((Card) Method.technologyEquipmentList.get(index)).setNameOfCard(newNameofCard);
            }
        }
        TechnologyEquipmentFile.writeFile(technologyEquipmentList);
    }

    public static void getRealMoneyById(String id){
        int index = checkIndexById(id);
        if (checkTechnologyEquipment(id, Method.technologyEquipmentList)){
            if (Method.technologyEquipmentList.get(index) instanceof Screen){
                System.out.println("Giá tiền hiện tại của thiết bị " + Method.technologyEquipmentList.get(index).getId()+ ": "+ ((Screen) Method.technologyEquipmentList.get(index)).getRealMoney());
            }
            else if (Method.technologyEquipmentList.get(index) instanceof ComputerCase){
                System.out.println("Giá tiền hiện tại của thiết bị " +Method.technologyEquipmentList.get(index).getId()+ ": "+ ((ComputerCase) Method.technologyEquipmentList.get(index)).getRealMoney());
            }
            else if (Method.technologyEquipmentList.get(index) instanceof KeyBoard){
                System.out.println("Giá tiền hiện tại của thiết bị " +Method.technologyEquipmentList.get(index).getId()+ ": "+ ((KeyBoard) Method.technologyEquipmentList.get(index)).getRealMoney());
            }
            else if (Method.technologyEquipmentList.get(index) instanceof Mouse){
                System.out.println("Giá tiền hiện tại của thiết bị " +Method.technologyEquipmentList.get(index).getId()+ ": "+ ((Mouse) Method.technologyEquipmentList.get(index)).getRealMoney());
            }
            else if (Method.technologyEquipmentList.get(index) instanceof Card){
                System.out.println("Giá tiền hiện tại của thiết bị " +Method.technologyEquipmentList.get(index).getId()+ ": "+ ((Card) Method.technologyEquipmentList.get(index)).getRealMoney());
            }
            else {
                System.out.println("Không tìm thấy ID");
            }
        }
    }

    private static boolean checkTechnologyEquipment(String id, List<TechnologyEquipment> technologyEquipmentList) {
        boolean check = false;
        for (int i = 0; i < technologyEquipmentList.size() ; i++) {
            if (id.equals(technologyEquipmentList.get(i).getId())){
                check = true;
                return check;
            }
        }
        return check;
    }

    public static int checkIndexById(String id) {
        int index = -1;
        for (int i = 0; i< technologyEquipmentList.size(); i++){
            TechnologyEquipment TechnologyEquipment=null;
            try{
                TechnologyEquipment = technologyEquipmentList.get(i);
                if (id.equals(TechnologyEquipment.getId())){
                    index = i;
                    break;
                }
            }
            catch (NullPointerException e){

            }

        }
        return index;
    }
    public static TechnologyEquipment getById(String id){
        int index = checkIndexById(id);
        if (index == -1){
            return null;
        }
        TechnologyEquipment technologyEquipment = null;
        try{
            technologyEquipment = technologyEquipmentList.get(index);
        }catch (NullPointerException e){

        }
        return technologyEquipment;
    }
}
