package ExerciciosDeFixacaoAplications;

import java.util.Locale;

public class Aula24 {

    public static void main(String[] args) {
        int age = 30, code = 5290;
        String product1 = "Computer", product2 = "Office desk";
        Double price1 = 2100.0, price2 = 650.50, measure = 53.234567;
        char gender = 'F';
        System.out.printf("product:\n%s, which price is %.2f \n%s, which price is %.2f\n\n" +
                        "Record: %d years old, code %d and gender: %c \n\nMeasue with eight decimal places: %.8f " +
                        "\nRouded (three decimal places): %.3f\n",
                product1, price1,product2, price2,age, code, gender, measure,measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %f3", measure);


    }

}


