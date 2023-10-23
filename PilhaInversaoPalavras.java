import java.util.Stack;

public class PilhaInversaoPalavras {
    public static String inverterPalavras(String input) {
        Stack<Character> pilha = new Stack<>();
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char caractere = input.charAt(i);
            if (caractere == ' ' || i == input.length() - 1) {
                while (!pilha.isEmpty()) {
                    resultado.append(pilha.pop());
                }
                if (caractere == ' ') {
                    resultado.append(' ');
                }
            } else {
                pilha.push(caractere);
            }
        }
        return resultado.toString();
    }
    public static void main(String[] args) {
        String exemplo1 = "UM CIENTISTA DA COMPUTACAO DEVE RESOLVER OS PROBLEMAS LOGICAMENTE";
        String resultado1 = inverterPalavras(exemplo1);
        System.out.println("Exemplo 1:");
        System.out.println("Entrada: " + exemplo1);
        System.out.println("Saída: " + resultado1);
        
        String exemplo2 = "ESARF ATERCES ODALERAHCAB ME AICNEIC AD OACATUPMOC FI ONAIOG SUPMAC SOHNIRROM HE MU SOD SEROHLEM SOSRUC ED OACATUPMOC OD ODATSE ED SAIOG";
        String resultado2 = inverterPalavras(exemplo2);
        System.out.println("\nExemplo 2:");
        System.out.println("Entrada: " + exemplo2);
        System.out.println("Saída: " + resultado2);
    }
}
