 public class SimpleIntrest{
  public static void main (String args[]){
      Customers cu1=new Customers("adarsha dhakal",2342342,5);
      float interest=cu1.getInterest();
      String name=cu1.getname();
      int customerId=cu1.getid();
      float principal=cu1.getprincipal();
      System.out.print(customerId+"                 "  +  name +"             "   +   principal+"         "  + interest + "     Niumber"+Customers.getNumberOfCustomers() );
      Customers cu2=new Customers(600000, 10);
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
    {}
     //default constructor
    public Customers(){
       customerId=nextID;
       nextID++;
       numberOfCustomers++; 
        }
    //constructor with all the argument    
    public Customers(String name,float principal,float time){
         customerId=nextID;
         nextID++;
        this.name=name;
        this.principal=principal;
        this.time=time;
        numberOfCustomers++;
     }  
     //customer without name
   public Customers(float principal,float time){
        this("Costumer no"+nextID,principal,time);
       
     }
    public String getname(){
        return name;
        }  
    public int getid(){
        return customerId;
    }
    public float gettime(){
        return time;
    }
    public float getprincipal(){
        return principal;
    }
    public static int getNumberOfCustomers(){
        return numberOfCustomers;
    }

    
    public float getInterest(){
        float interest;
        interest=(principal*time*rate)/100;
        return interest;
    }
}
