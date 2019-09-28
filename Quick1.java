
import java.util.Scanner;
import java.util.Random;
class Quick1
{
    int[]array=new int[20];
    int n,pivot,i,j;
    void read()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the no. of elements");
        n=scan.nextInt();
        System.out.println(" ");
        Random r=new Random();
        for(int i=0;i<=n-1;i++)
        array[i]=r.nextInt(100);
        System.out.println("the unsorted elements are: ");
        display();
        System.out.println(" ");
    }
    void quicksort(int low,int high)
    {
        i=low;
        j=high;
        pivot=array[i];
        while(i<=j)
        {
            while(array[i]<pivot)
            {
                i++;
            }
            while(array[j]>pivot)
            {
                j--;
            }
            if(i<=j){
            int temp=array[i];
            array[i]=array[j];
            array[j]=temp;
            i++;
            j--;}
        }
    
    if(low<j)
    quicksort(low,j);
    if(i<high)    
    quicksort(i,high);
    }
    
void display()        
{
    
    for( i=0;i<=n-1;i++)
    System.out.println(array[i]);

}
public static void main(String args[])
{
    long start,end;
    Quick1 ob=new Quick1();
    start=System.nanoTime();
    ob.read();
    ob.quicksort(0,ob.n-1);
    end=System.nanoTime();
    
    ob.display();
    long tm=end-start;
    System.out.println("the time taken to sort is:"+tm);
}
}