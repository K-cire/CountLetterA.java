import java.util.Scanner;

public class CountLetterA {
    public static void main(String[] args) {
        // Scanner para entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário que insira uma string
        System.out.println("Digite uma string:");
        String inputString = scanner.nextLine();
        
        // Converte a string para minúsculas para facilitar a contagem
        String lowerCaseString = inputString.toLowerCase();
        
        // Inicializa o contador
        int count = 0;
        
        // Percorre cada caractere da string
        for (int i = 0; i < lowerCaseString.length(); i++) {
            // Verifica se o caractere atual é 'a'
            if (lowerCaseString.charAt(i) == 'a') {
                count++;
            }
        }
        
        // Fecha o Scanner
        scanner.close();
        
        // Verifica se a letra 'a' foi encontrada e imprime o resultado
        if (count > 0) {
            System.out.println("A letra 'a' foi encontrada " + count + " vezes na string.");
        } else {
            System.out.println("A letra 'a' não foi encontrada na string.");
        }
    }
}
