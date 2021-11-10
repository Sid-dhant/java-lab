import java.util.Scanner;

class Main
{
public static void main(String args[])
{
    class Main
{
public static void main(String args[])
{
    
    int large,small,i;
    int a[] = new int[]{1, 2, 3, 4, 5};
    int n = a.length;
    large=small=a[0];
    for(i=1;i<n;++i)
    {
        if(a[i]>large)
            large=a[i];
        if(a[i]<small)
            small=a[i];
}

    System.out.print(“\nThe smallest element is ” + small );
    System.out.print(“\nThe largest element is ” + large );
}
}
  
  
  
  
  
  
  
  import java.util.Scanner;

class Main {
    public static void main(String args[]) {

        int i, s, j, p;
        int arr[] = new int[100];
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of an array:");
        s = sc.nextInt();

        System.out.print("Enter array elements:");
        for (i = 0; i < s; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("All prime numbers are:");

        for (i = 0; i < s; i++) {
            j = 2;
            p = 1;
            while (j < arr[i]) {
                if (arr[i] % j == 0) {
                    p = 0;
                    break;
                }
                j++;
            }
            if (p == 1) {
                System.out.print(" " + arr[i]);
            }
        }

    }
}
  
  
  
  
  
  
  
  
  
import java.util.Scanner;

/*Java Program to find the occurence of each element in an array*/
import java.util.*;  
import java.util.Arrays; 

//Driver Code
public class Main  
{  
   public static void main(String args[])   
   {  
       Scanner sc=new Scanner(System.in);

      int n;    //Declare array size
      System.out.println("Enter the total number of elements ");
      n=sc.nextInt();     //Initialize array size

      int arr[]=new int[n];   //Declare array
      System.out.println("Enter the elements of the array ");
      for(int i=0; i<n ;i++)     //Initialize array
      {
          arr[i]=sc.nextInt();
      }
      
        //Enter the element whose frequency you want to know
        System.out.println("Enter the element whose frequency you want to know");
        int ele=sc.nextInt();
        int occ=0;
        
        // Traverse through map and check frequencies 
        for(int i=0;i<n;i++)
        {
            if(ele==arr[i])
            {
                occ++; //Increment the occurrence once the element is found
            }
        }
        //Print the element and its frequency
        System.out.println(ele+" occurred "+occ+" times ");
        
       
   }
}
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
