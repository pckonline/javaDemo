import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int count=0;
        int[] arr = new int[5];
        while (n!=0){
            arr[count++]=n%10;
            n=n/10;
        }
        for (int i = 0;i<count;i++){
            if (i==count-1){
                System.out.println(arr[count-i-1]);
            }else {
                System.out.print(arr[count-i-1]);
            }
        }
        for (int i = 0;i<count;i++){
            if (i==count-1){
                System.out.println(arr[i]);
            }else {
                System.out.print(arr[i]);
            }

        }

    }
}
