import java.util.Scanner;

public class PayMoney
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        int size;
        int transaction;
        int target; 

        System.out.println("Enter the size of transaction array: ");
        size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the values of array");

        for(transaction = 0; transaction < size; transaction++)
            arr[transaction] = sc.nextInt();

        System.out.println("Enter total number of targets to be achieved: ");
        int t = sc.nextInt();

        for(int i = 1; i <= t; i++)
        {
            System.out.println("Enter the number of target value: ");
            target = sc.nextInt();

            int sum = 0;
            
            for(transaction = 0; transaction < size; transaction++)
            {
                sum += arr[transaction];
                if(sum >= target)
                {
                    break;
                }
            }
            
            if(sum < target)
            {
                System.out.println("Target not Achieved");
            }
            else
            {
                System.out.println("Target achieved after " + (transaction + 1) + " transactions.");
            }
        }
        
    }

}