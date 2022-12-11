import Area.*;

class Main{
    public static void main(String args[]){
        Rectangle r = new Rectangle();
        r.input();
        r.calculate();
        r.output();
        Triangle t = new Triangle();
        t.input();
        t.calculate();
        t.output();
        Circle c = new Circle();
        c.input();
        c.calculate();
        c.output();
    }
}