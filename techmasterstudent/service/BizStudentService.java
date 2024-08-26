package techmasterstudent.service;

import techmasterstudent.entities.BizStudent;

import java.util.Scanner;

public class BizStudentService {


     public BizStudent inputBizStudent(Scanner scanner){

            System.out.println("Mời bạn nhập vào tên sinh viên:" );
            String name = scanner.nextLine();
            System.out.println("Mời bạn nhập vào chuyên ngành:");
            String major = scanner.nextLine();
            System.out.println("Mời bạn nhập vào điểm marketting");
            double marketingScore = Double.parseDouble(scanner.nextLine());
            System.out.println("Mời bạn nhập vào điểm sales");
            double salesScore = Double.parseDouble(scanner.nextLine());
            BizStudent bizstudent = new BizStudent(name,major,marketingScore,salesScore);
            return bizstudent;


     }

}
