import java.util.*;

class Book {
    private int id;
    private String title;
    private int pages;
    private String author;

    public Book(int a, String b, int c,String d) {
        this.id = a;
        this.title = b;
        this.pages = c;
        this.author = d;
    }

    public int getId() {
        return id;
    }



}

public class BookDemo {

    static Map<Integer, Book> bookMap = new HashMap<>();



    public static void main(String[] args) {
    
        addBook(bookMap);
        

        Dikhao_map_ko();

       
    }

    // Map me data add karne ke liye 
     public static void addBook(Map<Integer, Book> bookMap) {
Scanner sc= new Scanner(System.in);
           for(int i =0;i<3;i++){
           int a = sc.nextInt();
           String b = sc.next();
           int c = sc.nextInt();
           String d = sc.next();
           bookMap.put(a, new Book( a,b,c,d));
           }
         sc.close();
    }
    public static void Dikhao_map_ko() {
        for (Map.Entry<Integer, Book> entry : bookMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
    
}
