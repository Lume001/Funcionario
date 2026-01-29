package POOudemy.ExercicioPoo1.Funcionarios;

import java.util.Scanner;

public class CodigoPrincipal {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario f1 = new Funcionario();

        System.out.println("Digite o nome do funcionario: ");
        String nome = sc.nextLine();
        f1.name = nome;

        System.out.println("Salario bruto: ");
        double salary = sc.nextDouble();
        f1.GrossSalary = salary;

        System.out.println("Taxa de imposto: ");
        double tax = sc.nextDouble();
        f1.tax = tax;

        System.out.println("Funcionario: "+f1.name+", Salário líquido: "+f1.netSalary());
        System.out.println("Qual a porcentagem de acrescimo de salario?: ");
        double perc = sc.nextDouble();
        f1.increaseSalary(perc);


        System.out.println("Atualização de dados: "+f1.GrossSalary);




    }
}
