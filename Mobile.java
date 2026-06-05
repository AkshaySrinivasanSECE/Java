class Mobile{
    String brand;
        String Name;
        float Price;
        Mobile(String s,String n,float p){
            this.brand=s;
            this.Name=n;
            this.Price=p;
        }
            public void display(){
                System.out.println("Name: "+ Name + " Brand: "+brand + "Price : "+ Price);
            }
            
        
    public static void main(String[] args) {
        Mobile obj= new Mobile("Samsung"," S25 Ultra", 112000);
        obj.display();

        
    }

}
