package Area;
import java.util.Scanner;

final public class Rectangle{
    Scanner s = new Scanner(System.in);
    float l,b,area;
    public void input(){
        System.out.print("Enter Length : ");
        l = s.nextFloat();
        System.out.print("Enter Breath : ");
        b = s.nextFloat();
    }
    public void calculate(){
        area = l*b;
    }
    public void output(){
        System.out.println("Rectangle area : "+area);
    }
} 