package first_ideaprogram.src.OOPS.Abstraction;

public  class BankClass {
    public static void main(String[] args) {
        Admin AD = new Admin();
        AD.readData();
        AD.writedata();
    }
}



     abstract class Bank {
         String name;

         void print() {
             System.out.println("print ka function");
         }

         abstract void readData();
         // the inhereited class must have readData method becouse it is abstract


          void writedata(){

          }


     }
   class Admin extends Bank {
       public void readData()
       {
           System.out.println("hello");
       }
       void writedata(){
           System.out.println("hello i write here");
       }


   }





