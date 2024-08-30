import java.util.Scanner;


public class ContadorLetra
{

    public static int contarLetra(String texto, char letra) {
        int cont = 0;
        for (int i = 0; i < texto.length(); i++) {
            char auxL = texto.charAt(i);
            if (auxL == letra || auxL == Character.toUpperCase(letra)) {
                cont++;
            }
        }
        return cont;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Modifiquei um pouco o programa e fiz com que a letra não precise ser somente a letra a
        System.out.println("Digite uma letra para verificar sua ocorrência no texto");
        String let = input.nextLine();

        //Como usei nextLine, pode ser que digitem mais que apenas 1 letra, então fiz este método para garantir que seja apenas a 1 letra digitada
        char letra = let.charAt(0);

        System.out.println("Digite uma string para verificar a ocorrência da letra digitada anteriormente: ");
        String texto = input.nextLine();

        int qtde = contarLetra(texto, letra);

        if (qtde > 0)
            System.out.println("A letra " + letra + " ocorre " + qtde + " vez(es) na string.");
        else
            System.out.println("A letra " + letra + " não ocorre na string.");


        input.close();
    }
}