package enums.ex01;

public class Test {
    public static void main(String[] args) {

        double a = 5;
        double b = 2;

        for (Calculator calc : Calculator.values()) {
             System.out.print(a + " " + calc.toString() + " ");
             System.out.print(b + " = ");
             System.out.println(calc.calculate(a,b));
        }
    }
}    
