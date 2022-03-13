package storage;

import model.TechnologyEquipment;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TechnologyEquipmentFile {
    public static void writeFile(List<TechnologyEquipment> technologyEquipmentList){
//        FileOutputStream fos = null;
//        ObjectOutputStream oos = null;
//        try {
//            fos = new FileOutputStream("List.txt");
//            oos = new ObjectOutputStream(fos);
//            oos.writeObject(technologyEquipmentList);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        finally {
//            oos.close();
//            fos.close();
//        }
        FileOutputStream fos =null;
        try {
            fos = new FileOutputStream("List1.txt");
        } catch (FileNotFoundException e) {
            System.err.println("Không tìm thấy file và khởi tạo file mới");
           writeFile(technologyEquipmentList);
           return;
        }
        try {
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(technologyEquipmentList);
            oos.close();
            fos.close();
        } catch (IOException e) {
            System.err.println("Có lỗi xảy ra và không ghi được file");
        }
    }

    public static List<TechnologyEquipment> readFile(){
        File file = new File("List1.txt");
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object result = ois.readObject();
            List<TechnologyEquipment> technologyEquipmentList = (List<TechnologyEquipment>) result;
            ois.close();
            fis.close();
            return technologyEquipmentList;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }
}
