import java.util.Scanner;
public class Money {

    private static int[] notes;

    public static void sort(int denominations[])
    {
        int n = denominations.length;
        for(int i = 0; i < n-1; i++)
        {
            for(int j = 0; j < n-i-1; j++)
            {
                if(denominations[j] < denominations[j+1])
                {
                    int temp = denominations[j];
                    denominations[j] = denominations[j+1];
                    denominations[j+1] = temp;
                }
            }
        }
    }

    public static void notesCountImplementation(int notes[], int amount)
    {
        int[] notesCounter = new int[notes.length];
        
        try{
            for (int i = 0; i < notes.length; i++)
            {
                if (amount >= notes[i])
                {
                    notesCounter[i] = amount / notes[i];
                    amount = amount - notesCounter[i] * notes[i];
                }
            }
            if (amount > 0)
            {
                System.out.println("Exact amount cannot be given with the highest denomination");
            }
            else
            {
                System.out.println("Your payment approach in order to give min no of notes will be");
                for(int i = 0; i < notes.length; i++)
                {
                    if(notesCounter[i] != 0)
                    {
                        System.out.println(notes[i] + ": " + notesCounter[i]);
                    }
                }
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println(e + " notes of denomination 0 is invalid");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;

        System.out.print("Enter the size of currency denominations: ");
        size = sc.nextInt(); 
        int denominations[] = new int[size];

        System.out.println("Enter the currency denomination value sorting: ");
        for (int i = 0; i < size; i++)
        {
            denominations[i] = sc.nextInt();
        }

        System.out.print("Enter the amount you want to pay: ");
        int amount = sc.nextInt();

        sort(denominations);
        notesCountImplementation(notes, amount);


    }
}
