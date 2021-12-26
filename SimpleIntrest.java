class public SimpleInterest{
  public static void main (String args[]){
      Customers cu1=new Customers('adarsha dhakal',2342342,5);
      float interest=cu1.getInterest();
      System.out.print(interest);

  }
}


class Customers{
    private int customerId;
    private static int nextID;
    private static int numberOfCustomers;
    private float principal;
    private float interest;
    private static float rate=10;
    private float time;
    private String name;   
    
    static{
        nextID=1;
    }
     //default constructor
    public Customers(){
       customerId=nextID;
       nextID++;
        }
    //constructor with all the argument    
    public Customers(String name,float principal,float time){
         id=nextID;
         nextID++;
        this.name=name;
        this.principal=principal;
        this.time=time;
     }  
     //customer without name
   public Customers(float principal,float time){
        this("Costumer no"+id,principal,time);
       
     }  
    public float getInterest(){
        float interest;
        interest=(principal*time*rate)/100;
        return interest;
    }
}
