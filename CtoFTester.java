public class CtoFTester{
  public static void main(String[] args) {
    System.out.println(celsiusToFahrenheit(100));
    System.out.println(fahrenheitToCelsius(212));
  }
  //Function to change C to F
  public static int celsiusToFahrenheit(int C) {
    return (C * 9 / 5) + 32;
  }
  //Function to turn F to C
  public static int fahrenheitToCelsius(int F) {
    return (F - 32) * 5 / 9;
  }
}
