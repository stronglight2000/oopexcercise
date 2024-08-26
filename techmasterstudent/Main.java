package techmasterstudent;

import techmasterstudent.entities.BizStudent;
import techmasterstudent.entities.TechMasterStudent;
import techmasterstudent.service.BizStudentService;
import techmasterstudent.service.ItStudentService;
import techmasterstudent.service.TechMasterStudentService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

           /* BizStudent bizStudent = bizStudentService.inputBizStudent(scanner);
            bizStudent.classify();
            bizStudent.getPoint();
            bizStudent.printInfo();*/
        TechMasterStudentService techMasterStudentService = new TechMasterStudentService();
        techMasterStudentService.inputTechMasterStudent(scanner);

    }
}
