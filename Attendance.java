public class Attendance {
    String Name;
    int Number;
    float percentage=0;

    Attendance(String N,int n) {
        this.Name=N;
        this.Number=n;
    }

     Attendance(String N,int n, float p) {
        this.Name=N;
        this.Number=n;
        this.percentage=p;

    }
    public void display(){
        System.err.println("Name: "+ Name + "  regs Num: "+ Number + "  Percentage: " + percentage);
    }
 public static void main(String[] args) {
     Attendance obj1 = new Attendance("Akshay",007,100);
     obj1.display();
 }
    

}
