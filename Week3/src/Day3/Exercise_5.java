// Write a program to calculate the circumference of a circle, its area and the volume of a sphere.

// Display the radius and the results in a clear format.

package Day3;

public class Exercise_5 {

  public static final double PI = 3.142857;

  public static void main(String[] args) {
    Double radius = 7.5;
    //display the values of the radius
    System.out.println("Radius: " + radius);
    //Calculate the circumference
    double circumference = 2 * PI * radius;
    System.out.println("Circumference: " + circumference);
    //Calculate the area
    double area = PI * radius * radius;
    System.out.println("Area: " + area);
    //Calculate the volume
    double volume = 4 * PI * Math.pow(radius, 3) / 3;
    System.out.println("Volume: " + volume);
  }
}
