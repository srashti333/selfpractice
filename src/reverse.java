import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class reverse
{
    public void reverse(int arr1[],int k,int n)
    {

        for(int i=k-1;i>=0;i--)
        {
            System.out.print(arr1[i]+" ");
        }
        for(int i=k;i<n;i++)
        {
            System.out.print(arr1[i]+" ");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Queue<Integer> q=new LinkedList<>();
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr1[]=new int[n];
        for(int i=0;i<n;i++)
        {
            q.add(sc.nextInt());

            arr1[i] = q.poll();
        }
        reverse obj=new reverse();
        obj.reverse(arr1,k,n);
    }
}


