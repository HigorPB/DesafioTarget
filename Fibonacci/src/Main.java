import java.util.Scanner;

public class Main {

    private static boolean pertenceFibonacci(int num)
    {
        int x = 0;
        int y = 1;

        if(num < 0)
            return false;

        while(x < num)
        {
            int aux = x;
            x = y;
            y = y + aux;
        }

        return x == num;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);;

        System.out.println("Digite um número e o programa verificará se ele pertence à sequência de Fibonacci");
        int num = input.nextInt();

        if(pertenceFibonacci(num))
            System.out.println("" + num + " pertence a sequência de Fibonacci");
        else
            System.out.println("" + num + " não pertence a sequência de Fibonacci");

        input.close();
    }
}