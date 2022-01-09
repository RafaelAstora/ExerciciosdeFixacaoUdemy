package ExerciciosDeFixacaoAplications;
import java.awt.*;
import  java.util.Scanner;
import entities.Aula70Exercicio01Rectangle;
public class Aula70Exercicio01 {

public static void main (String[] args){
Scanner sc = new Scanner(System.in);
    Aula70Exercicio01Rectangle rectangle;
    rectangle = new Aula70Exercicio01Rectangle();
    System.out.println("Enter rectangle width and height:");
    rectangle.width = sc.nextDouble();
    rectangle.height = sc.nextDouble();
    double area = rectangle.area();
    double perimeter = rectangle.perimeter();
    double diagonal = rectangle.diagonal();
    System.out.printf("AREA = %.2f\n",area);
    System.out.printf("PERIMETER = %.2f\n",perimeter);
    System.out.printf("DIAGONAL = %.2f\n",diagonal);
            sc.close();
}

}


