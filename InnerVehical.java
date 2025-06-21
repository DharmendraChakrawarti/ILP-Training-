import java.util.*;

class Vehical{
int  number ;
String name ;
double price;

public Vehical(int a,String b ,double c){
    this.number = a;
    this.name = b;
    this.price = c;
}

public  int getnumber(){
    return number;
}
public  String getname(){
    return name;
}
public  double getprice(){
    return price;
}


}

 class InnerVehical {

    public static void main ( String[] args){
    Scanner sc = new Scanner(System.in);
    Vehical [] veh = new Vehical[4];
    
    for(int i =0;i< veh.length;i++ ){
        int a = sc.nextInt(); sc.nextLine();
        String b = sc.nextLine();
        double c = sc.nextDouble();sc.nextLine();
        
        veh[i]= new Vehical(a,b,c);
        
        
    }
    String str = sc.nextLine();
    
    
    Vehical dc1 = searchVehicleByName(veh ,str);
    
    if(dc1!=null){
        System.out.println(dc1.getnumber());
        System.out.println(dc1.getname());
        System.out.println(dc1.getprice());
        
    } else{
         System.out.println("not found with name");
    }
    
    
    
      Vehical dc2 = findVehicleByMinimumPrice(veh );
    
      if(dc2!=null){
        System.out.println(dc2.getnumber());
        System.out.println(dc2.getname());
        System.out.println(dc2.getprice());
        
    } else{
         System.out.println("not found with name");
    }
    
    
    
    
    

sc.close();
}

public static  Vehical searchVehicleByName (Vehical [] veh ,String str){

Vehical dc = null;

for(Vehical it : veh){
    if(it.getname().equalsIgnoreCase(str)){
        dc= it;
    }
}

return dc;
}

public static  Vehical findVehicleByMinimumPrice (Vehical [] veh){

Vehical dc = null;
double mn= 99999;
for(Vehical it : veh){
    if(it.getprice()< mn){
        mn = it.getprice();
    }
}



for(Vehical it : veh){
    if(it.getprice()== mn){
        dc= it;
    }
}

return dc;
}

}




