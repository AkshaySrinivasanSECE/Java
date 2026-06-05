public class Employee {
    int id;
    String Name;
    double salary=0;

    Employee(int id,String n){
        this.id=id;
        this.Name=n;

    }
    Employee(int id,String n,double s){
        this.id=id;
        this.Name=n;
        this.salary=s;
    }

    public void display(){
        System.out.println("ID: "+id +"Name: "+ Name + " salary: "+ salary);

    }
    public static void main(String[] args) {
        Employee e=new Employee(007,"Akshay",100000 );
        e.display();
        
    }

    
}
