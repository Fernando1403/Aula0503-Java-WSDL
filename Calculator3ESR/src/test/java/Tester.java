import br.com.fiap3esr.service.Sum;

public class Tester {
    public static void main(String[] args) {
        Sum sum = new Sum();
        double num1 = 10;
        double num2 = 23;

        double result = sum.calculate(num1 , num2);

        System.out.println(sum.showResult(num1,num2,result));
    }
}
