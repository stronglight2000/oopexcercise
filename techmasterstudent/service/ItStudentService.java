package techmasterstudent.service;

import techmasterstudent.entities.BizStudent;
import techmasterstudent.entities.ItStudent;
import techmasterstudent.entities.TechMasterStudent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ItStudentService {
    public ItStudent inputItStudent(Scanner scanner){



            System.out.println("Mời bạn nhập vào tên sinh viên thứ:");
            String name = scanner.nextLine();
            System.out.println("Mời bạn nhập vào chuyên ngành:");
            String major = scanner.nextLine();
            System.out.println("Mời bạn nhập vào điểm Java");
            double javaScore = Double.parseDouble(scanner.nextLine());
            System.out.println("Mời bạn nhập vào điểm html");
            double htmlScore = Double.parseDouble(scanner.nextLine());
            System.out.println("Mời bạn nhập vào điểm css");
            double cssScore = Double.parseDouble(scanner.nextLine());
            ItStudent itstudent = new ItStudent(name,major,javaScore,htmlScore,cssScore);
            return itstudent;


    }
}
