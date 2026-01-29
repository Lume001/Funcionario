package POOudemy.ExercicioPoo1.Funcionarios;

public class Funcionario {
    String name;
    double GrossSalary;
    double tax;

    public double netSalary(){
        return GrossSalary - tax;

    }
    public void increaseSalary(double percentage){
        GrossSalary+=GrossSalary * percentage / 100;

    }
}
