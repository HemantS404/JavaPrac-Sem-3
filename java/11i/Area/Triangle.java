package Area;
import java.util.Scanner;

final public class Triangle{
    float h,b,area;
    Scanner s = new Scanner(System.in);
    public void input(){
        System.out.print("Enter Height : ");
        h = s.nextFloat();
        System.out.print("Enter Breath : ");
        b = s.nextFloat();
    }
    public void calculate(){
        area = 0.5f*h*b;
    }
    public void output(){
        System.out.println("Triangle area : "+area);
    }
} 