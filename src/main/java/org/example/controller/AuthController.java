package org.example.controller;

import org.example.dto.Employee;
import org.example.dto.Guest;
import org.example.enums.TypeEmployee;
import org.example.repository.EmployeeRepository;
import org.example.repository.GuestRepository;
import org.example.util.ScannerUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AuthController {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private AdminController adminController;
    public void start(){
        boolean status = true;
        while (status){
            System.out.println("""
                    ** -> menu <- **
                    1. Login;
                    2. Complaint;
                    0. Exit;
                    """);
            switch (ScannerUtil.scannerInt.nextInt()){
                case 1 -> Login();
                case 2 -> Complaint();
                case 0 -> {
                    System.out.println("The program is over!");
                    status = false;
                }
                default -> System.out.println("Not found");
            }
        }
    }

    private void Login() {
        System.out.println("Enter 0 to exit.");
        System.out.print("or Enter Phone :");
        Employee employee = employeeRepository.getEmployeeByPhone(ScannerUtil.scannerStr.nextLine());
        if (employee == null || !employee.getType().equals(TypeEmployee.RECEPTION)){
            System.out.println("Sorry, Not found!");
            return;
        }
        adminController.menu(employee);
    }

    private void Complaint() {

    }
}
