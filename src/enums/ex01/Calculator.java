package enums.ex01;

public enum Calculator {

    ADD("+") {
        @Override
        public double calculate(double a, double b) {
            return a + b;
        }
    },
    SUBTRACT("-") { 
        @Override
        public double calculate(double a, double b) {
            return a - b;
        }
    },
    MULTIPLY("*") {
        @Override
        public double calculate(double a, double b) {
            return a * b;
        }
    },
    DIVIDE("/") {
        @Override
        public double calculate(double a, double b) {
            return a / b;
        }
    };    

    private String simbol;    
    Calculator(String simbol) {
        this.simbol = simbol;
    }

    public abstract double calculate(double a, double b);    
    
    @Override
    public String toString() {
        return simbol;
    }    
}    
