public class ICalculator {

  public String Fibonacci () {
    String result = "0";
    for (int i=1; i<10; i++) {
      result = result + ", " + Integer.toString(CalculateFibonacci(i));
    }
    return result;
  }

  protected int CalculateFibonacci(int value) {
    if (value < 2)
      return value;
    else
        return CalculateFibonacci(value - 1) + CalculateFibonacci(value - 2);
  }

  public static void main(String[] args) {
    ICalculator calculator = new ICalculator();
    Calculator calculator2 = new Calculator(); 
    
    System.out.print(calculator.Fibonacci() + "\n");
    
    System.out.println(calculator2.Addition(11));
    System.out.println(calculator2.Substraction(11));
    
    System.out.print(calculator2.Fibonacci() + "\n");
    
  }
}

class Calculator extends ICalculator {
    
    public int Addition (int number) {
        return number + 1;
    }
    
    public int Substraction (int number) {
        return number - 1;
    }
    
    @Override
    public String Fibonacci () {
        String result = "0";
        for (int i=1; i<20; i++) {
          result = result + ", " + Integer.toString(CalculateFibonacci(i));
        }
        return result;
     }
    
}