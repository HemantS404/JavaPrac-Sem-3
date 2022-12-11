package Area;
import java.util.Scanner;

final public class Circle{
    Scanner s = new Scanner(System.in);
    float r,area;
    public void input(){
        System.out.print("Enter Radius : ");
        r = s.nextFloat();
    }
    public void calculate(){
        area = 3.14f*r*r;
    }
    public void output(){
        System.out.println("Circle area : "+area);
    }
} 