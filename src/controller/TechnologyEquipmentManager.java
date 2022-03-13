package controller;

import model.*;
import storage.TechnologyEquipmentFile;

import java.util.ArrayList;
import java.util.List;

public class TechnologyEquipmentManager {
    public static List<TechnologyEquipment> technologyEquipmentList = TechnologyEquipmentFile.readFile();

    public static void addNewTechnologyEquipmentScreen(TechnologyEquipment newTechnologyEquipment){
        technologyEquipmentList.add(newTechnologyEquipment);
    }

    public static void addNewTechnologyEquipmentComputerCase(TechnologyEquipment newTechnologyEquipment) {
        technologyEquipmentList.add(newTechnologyEquipment);
    }

    public static void addNewTechnologyEquipmentMouse(TechnologyEquipment newTechnologyEquipment) {
        technologyEquipmentList.add(newTechnologyEquipment);
    }

    public static void addNewTechnologyEquipmentKeyBoard(TechnologyEquipment newTechnologyEquipment) {
        technologyEquipmentList.add(newTechnologyEquipment);
    }

    public static void addNewTechnologyEquipmentCard(TechnologyEquipment newTechnologyEquipment) {
        technologyEquipmentList.add(newTechnologyEquipment);
    }

    public static void deleteTechnology(TechnologyEquipment technologyEquipment) {
        technologyEquipmentList.remove(technologyEquipment);
    }

//    public int getTechnologyEquipmentByID(String technologyEquipmentCode){
//        for (int i = 0; i < technologyEquipmentList.size() ; i++) {
//            TechnologyEquipment technologyEquipment = technologyEquipmentList.get(i);
//            if (technologyEquipment.getId().equals(technologyEquipmentCode))
//                return i;
//        }
//        return -1;
//    }
//    public int getTechnologyEquipmentByName(String technologyEquipmentName){
//        for (int i = 0; i < technologyEquipmentList.size() ; i++) {
//            TechnologyEquipment technologyEquipment = technologyEquipmentList.get(i);
//            if (technologyEquipment.getId().equals(technologyEquipmentName))
//                return i;
//        }
//        return -1;
//    }
//
//    public static void editTechnologyEquipmentByIndex(int index,TechnologyEquipment newTechnologyEquipment){
//        technologyEquipmentList.set(index, newTechnologyEquipment);
//    }

    public static void editTechnologyEquipmentById(int index, TechnologyEquipment newTechnologyEquipment){
        technologyEquipmentList.set(index, newTechnologyEquipment );
    }


}
