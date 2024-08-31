class Calculator {
    private double num1;
    private double num2;

    
    public Calculator() {
        this.num1 = 0;
        this.num2 = 0;
    }

   
    public Calculator(double num1) {
        this.num1 = num1;
        this.num2 = 0;
    }

    
    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    
    public double add() {
        return num1 + num2;
    }

    
    public double add(double num3) {
        return num1 + num2 + num3;
    }

    
    public double multiply() {
        return num1 * num2;
    }

    
    public double multiply(double num3) {
        return num1 * num2 * num3;
    }

    
    public void displayNumbers() {
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
    }

    public static void main(String[] args) {
        
        Calculator calc1 = new Calculator();
        calc1.displayNumbers();  
        System.out.println("Addition: " + calc1.add());  

       
        Calculator calc2 = new Calculator(10);
        calc2.displayNumbers();  
        System.out.println("Addition: " + calc2.add());  

        
        Calculator calc3 = new Calculator(10, 20);
        calc3.displayNumbers(); 
        System.out.println("Addition: " + calc3.add()); 
        System.out.println("Addition with third number (5): " + calc3.add(5)); 
        System.out.println("Multiplication: " + calc3.multiply());  
        System.out.println("Multiplication with third number (2): " + calc3.multiply(2));  
    }
}
