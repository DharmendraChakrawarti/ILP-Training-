import java.util.Scanner;

public class _18_divisible_BY_3 {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //      int a= sc.nextInt();
    //      int b= sc.nextInt();
    //      int sum =0;
    //      int count=0;
    //      for(int i=a;i<b;i++){
    //         if(i%3==0&&i%2==0){
    //             sum+=i;
    //             count++;
                
    //         }
    //      }
    //      System.out.println(sum);
    //      System.out.println(count);
    
    // }


    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int count=0,sum=0;
		while(n<m)
		{
		   if(n%3==0 && n%2==0)
		   {
		       sum+=n;
		       count++;
		   }
		   n++;
		}
		System.out.println("sum: "+sum);
		System.out.println("count: "+count);
		
		
	}

    }

