package entities;

public class Aula70Exercicio02Employee {
    public String name;
    public double grossSalary;
    public double tax;

public double netSalary(){
    return grossSalary-tax;
}
public void increaseSalary(double percentage){
    percentage /= 100;
    grossSalary = grossSalary * percentage + grossSalary;
}
}