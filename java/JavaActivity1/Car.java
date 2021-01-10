package JavaActivity1;

public class Car {
  String color;
  String transmission;
  int make;
  int tyres;
  int doors;
  public Car() {
	  tyres= 4;
	  doors= 4;
	  
  }
  public void displayCharacteristics()
  {
	  System.out.println("The color of car is :" +color);
	  System.out.println("The transmission of car is :" +transmission);
	  System.out.println("The make of car is :" +make);
	  System.out.println("Number of tyres in car is :" +tyres);
	  System.out.println("Number of doors in car is :" +doors);
  }
  public void accelarate()
  {
	  System.out.println("Car is moving forward.");  
  }
  public void brake()
  {
	  System.out.println("Car has stopped.");  
  }
}
