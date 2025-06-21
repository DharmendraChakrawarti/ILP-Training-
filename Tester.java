
import java.util.*;

class Customer {
    int customerid;
    String customername;
    int noofcycle;
    List<Cycle> Cylist;

    public Customer(int a, String b, int c, List<Cycle> Cylist) {
        this.customerid = a;
        this.customername = b;
        this.noofcycle = c;
        this.Cylist = Cylist;

    }

    public int getcustid() {
        return customerid;
    }

    public String getcustname() {
        return customername;
    }

    public int getnoofcycle() {
        return noofcycle;
    }

    public List<Cycle> getCylist() {
        return Cylist;
    }

}

class Cycle {
    int cycid;
    String cyclename;
    int price;

    public Cycle(int a, String b, int c) {
        this.cycid = a;
        this.cyclename = b;
        this.price = c;

    }

    public int getcyclid() {
        return cycid;
    }

    public String getcycname() {
        return cyclename;
    }

    public int getprice() {
        return price;
    }

}
 class PriceIsnagativeex extends Exception{
          public PriceIsnagativeex(){
            super("Invalid price h : price nagative nahi ho sakti");
          }
}



 class services{
    
    public  void fun1(List<Customer> list , String name){
    int price = 0;
    for(Customer c: list){
             
                for(Cycle cy : c.getCylist()){
                  if(cy.getcycname().equalsIgnoreCase(name)){

                     try{
                        if(cy.getprice()<0){
                            throw new PriceIsnagativeex();
                        }
                        else{
                           price+=cy.getprice();
                        }
                     }
                     catch(PriceIsnagativeex e ){
                           System.out.println(e.getMessage());
                           return ;
                     }

                       
                  }
             }
        
    }
    if(price>0){
        System.out.println("sum- "+ price);
    } else System.out.println("cycle ni mili");

}

public  void fun2(List<Customer> list , int input){
    boolean f = true;
     for(Customer c: list){
             
                for(Cycle cy : c.getCylist()){
                    if(cy.getprice()>input){
                              System.out.println(cy.getcycname());
                              f= false;
                        break;
                    }

                }
            
            }
            if(f==true) System.out.println("nahi mila");
}
}
public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Customer> list = new ArrayList<>();
        int input = sc.nextInt();
        for (int i = 0; i < input; i++) {
            int customerid = sc.nextInt();
            String customername = sc.next();
            int noofcycle = sc.nextInt();
            int input2 = sc.nextInt();
            List<Cycle> Cyclelist = new ArrayList<>();
            for (int j = 0; j < input2; j++) {
                int cycid = sc.nextInt();
                String cyclename = sc.next();
                int price = sc.nextInt();
                Cyclelist.add(new Cycle(cycid, cyclename, price));

            }
            list.add(new Customer(customerid, customername, noofcycle, Cyclelist));

        }

            String input3 = sc.next();
            int input4 = sc.nextInt();
           services s = new services();
           s.fun1(list, input3);
           s.fun2( list , input4);



        sc.close();
    }





}
