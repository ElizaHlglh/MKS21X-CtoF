public class CtoFTester{
  public static void main(String[] args) {
    System.out.println(celsiusToFahrenheit(100));
    System.out.println(fahrenheitToCelsius(212));
    System.out.println(IsCelsius(true,100));
    System.out.println(IsCelsius(false, 212));
  }
  //Function to change C to F
  public static int celsiusToFahrenheit(int C) {
    return (C * 9 / 5) + 32;
  }
  //Function to turn F to C
  public static int fahrenheitToCelsius(int F) {
    return (F - 32) * 5 / 9;
  }
  //Main Function: take the number and type, return the opposite.
  public static int IsCelsius(boolean type, int degree) {
    if (type) {return celsiusToFahrenheit(degree);}
    else {return fahrenheitToCelsius(degree);}
  }
}
