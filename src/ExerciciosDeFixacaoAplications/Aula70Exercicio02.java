package ExerciciosDeFixacaoAplications;

import entities.Aula70Exercicio02Employee;
import java.util.Locale;
import java.util.Scanner;

public class Aula70Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Insert the employee data");

        Aula70Exercicio02Employee employee = new Aula70Exercicio02Employee();
        System.out.println("Name:");
        employee.name = sc.nextLine();
        System.out.println("Gross salary:");
        employee.grossSalary = sc.nextDouble();
        System.out.println("Tax:");
        employee.tax = sc.nextDouble();

        System.out.printf("Employee: %s, $ %.2f" +
                " ",employee.name,employee.netSalary());
        System.out.println("\nwhich percentage to increase salary?: ");
        employee.increaseSalary(sc.nextDouble());
        System.out.printf("Updated data: %s, $ %.2f\n" +
                " ",employee.name,employee.netSalary());
    }

}

