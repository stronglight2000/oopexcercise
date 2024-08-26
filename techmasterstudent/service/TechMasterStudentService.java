package techmasterstudent.service;

import techmasterstudent.entities.BizStudent;
import techmasterstudent.entities.ItStudent;
import techmasterstudent.entities.TechMasterStudent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TechMasterStudentService {
    public void inputTechMasterStudent(Scanner scanner){
        System.out.println("Mời bạn nhập vào số sinh viên Biz:");
        int n = Integer.parseInt(scanner.nextLine());
        TechMasterStudent techMasterStudent[] = new TechMasterStudent[n];
        System.out.println("Mời bạn nhập vào số sinh viên IT:");
        int m = Integer.parseInt(scanner.nextLine());
        TechMasterStudent techMasterStd[] = new TechMasterStudent[m];
        for (int i =0;i<n;i++){
            System.out.println("Mời bạn nhập vào tên sinh viên Biz thứ:" + (i+1) );
            String name = scanner.nextLine();
            System.out.println("Mời bạn nhập vào chuyên ngành:");
            String major = scanner.nextLine();
            System.out.println("Mời bạn nhập vào điểm marketting");
            double marketingScore = Double.parseDouble(scanner.nextLine());
            System.out.println("Mời bạn nhập vào điểm sales");
            double salesScore = Double.parseDouble(scanner.nextLine());
            techMasterStudent[i] = new BizStudent(name,major,marketingScore,salesScore);
        }
        for (int i =0;i<m;i++) {
            System.out.println("Mời bạn nhập vào tên sinh viên IT thứ:"+ (i+1));
            String name = scanner.nextLine();
            System.out.println("Mời bạn nhập vào chuyên ngành:");
            String major = scanner.nextLine();
            System.out.println("Mời bạn nhập vào điểm Java");
            double javaScore = Double.parseDouble(scanner.nextLine());
            System.out.println("Mời bạn nhập vào điểm html");
            double htmlScore = Double.parseDouble(scanner.nextLine());
            System.out.println("Mời bạn nhập vào điểm css");
            double cssScore = Double.parseDouble(scanner.nextLine());
            techMasterStd[i] = new ItStudent(name,major,javaScore,htmlScore,cssScore);
        }
        /*for(TechMasterStudent bizstudents:techMasterStudent){
            System.out.println(bizstudents);

        }*/
        List<Object> combinedList = new ArrayList<>();

        Collections.addAll(combinedList, techMasterStudent);
        Collections.addAll(combinedList, techMasterStd);
        for (Object obj : combinedList) {
            System.out.println(obj);
        }


    }
}
