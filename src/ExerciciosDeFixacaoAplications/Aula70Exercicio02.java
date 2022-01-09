package ExerciciosDeFixacaoAplications;

import entities.Aula70Exercicio02Employee;

import java.util.Scanner;

public class Aula70Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert the employee data");

        Aula70Exercicio02Employee employee = new Aula70Exercicio02Employee();
        System.out.println("Name:");
        employee.name = sc.nextLine();
        System.out.println("Gross salary:");
        employee.grossSalary = sc.nextDouble();
        System.out.println("Tax:");
        employee.grossSalary = sc.nextDouble();
    }

}

