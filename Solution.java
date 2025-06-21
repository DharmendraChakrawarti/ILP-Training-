
// import java.util.*;
import java.util.Scanner;
 class Book  {
int id;
int pages;
String title ;
String author;
double price;


 public Book(int a ,int b,String  c ,String  d ,double e){
    this.id = a;
    this.pages =b;
    this.title = c;
    this.author =d;
    this.price = e;
 }
 public int  getid(){
    return id;
 }
   
 public int  getpages(){
    return pages;
 }
 public String  gettitle(){
    return title;
 }
 public String  getauthor(){
    return author;
 }
 public double  getprice(){
    return price;
 }

}

public class Solution {

    public static void main(String arg[]){
       
          Scanner sc =new Scanner(System.in);
        Book[] book = new Book[4];

        for(int i =0 ;i<book.length ;i++){
             System.out.println("enter for " + i
            );
         int a  = sc.nextInt();sc.nextLine();
         int b = sc.nextInt();sc.nextLine();
         String c = sc.nextLine();
         String d = sc.nextLine();
         double e = sc.nextDouble();sc.nextLine();
         book[i]=new Book (a,b,c,d,e);
        }
 System.out.println("enter input title");
 String t = sc.next();
sc.close();
Book [] ans1 =  findBookWithMaximumPrice(book );

if(ans1!= null){
  for(int i =0 ;i< ans1.length ; i++){
      System.out.println(ans1[i].getid() +" "+ ans1[i].gettitle());
  }
}
else{
    System.out.println(" kuchh in mila bhai log");
}

Book ans2 = searchBookByTitle(book ,t);

if(ans2!= null){
    System.out.println(ans2.getid() );
     System.out.println(ans2.getpages() );
}
else{
    System.out.println(" kuchh in mila bhai log");
}
    }

 public static Book[] findBookWithMaximumPrice(Book [] book){
Book[] ans = new Book[book.length];
double Mx_prize= Integer.MIN_VALUE;
int ii=0;
for (Book it : book){
    if(it.getprice()>Mx_prize) {
        Mx_prize = it.getprice();}

}
for (Book it : book) {
     if(it.getprice()==Mx_prize){
              ans[ii++] = new Book(it.getid(), it.getpages(), it.gettitle(), it.getauthor(), it.getprice());
    }
}
return ans ;
 }


  public static Book searchBookByTitle (Book [] book , String title){
Book[] ans = new Book[1];
 
for (Book it : book) {
    if(it.gettitle().equals(title)){
         ans[0] = new Book(it.getid(), it.getpages(), it.gettitle(), it.getauthor(), it.getprice());
    }
}
return book[1];
   }
}