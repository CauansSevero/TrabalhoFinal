import java.util.Scanner;

/**
 * Cauan Severo Monteiro - 22280093
 * Mateus Bittencourt - 22106688
 * 
 */
class Main {

    /**
     * 
     */
    private Main() {}

    /**
     * 
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Sudoku jogo = new Sudoku();

        char coluna;
        char linha;
        char valor;

        while ( !jogo.fimDeJogo() ) {
            System.out.println("\t         Sudoku!");
            System.out.println("\t        =========");

            System.out.println( jogo.toString() );

            System.out.print("Informe a coluna: ");
            coluna = in.next().charAt(0);
            System.out.print("Informe a linha: ");
            linha = in.next().charAt(0);        
            System.out.print("Informe o valor: ");
            valor = in.next().charAt(0);        

            System.out.println("COLUNA = " + coluna);
            System.out.println("LINHA = " + linha);
            System.out.println("VALOR = " + valor);
            
            try {
                jogo.jogar(coluna, linha, valor);
            } catch (Exception e) {
                System.out.println("Jogada invalida!");
                System.out.println(e);
                
            }

        }
        in.close();

        System.out.println("\f\t         Sudoku!");
        System.out.println("\t        =========");
        System.out.println( jogo.toString() );
        System.out.println("** FIM **");

    }
}