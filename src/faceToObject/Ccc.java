package faceToObject;

public class Ccc
{
    public static void  main(String[] args)
    {
       cha(5);
        System.out.println();
    }
    public static void cha(int n)
    {
        for (int x = 0;x<n;x++)
        {
            for (int y = 0; y < n; y++)
            {
                if (y < n -1 - x)
                {
                    System.out.print(" ");
                } else if(y<n-1) System.out.print(" *");
            }
            System.out.println(" *");
        }
        for(int x= 0 ;x<n-1;x++)
        {
            for (int y = 0;y<n;y++)
            {
                if (y<x+1)
                {
                    System.out.print(" ");
                }
                else if (y<n-1)
                    System.out.print(" *");
            }
            System.out.println(" *");
        }
    }
}

