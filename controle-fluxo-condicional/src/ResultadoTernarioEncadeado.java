public class ResultadoTernarioEncadeado {
    
    public static void main(String[] args) {
        
        int nota = 8;

        String resultado = nota >= 7 ? "Aprovado!" : nota >= 5 && nota < 7 ? "Recuperação!" : "Reporvado!";

        System.out.println(resultado);
        
    }
}
