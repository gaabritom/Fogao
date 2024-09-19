
public class Fogao {

    private int quantidadeBocas;
    private String modelo;
    private String marca;

    // Construtor padrão
    Fogao() {
        quantidadeBocas = 4;
        modelo = "Fischer";
        marca = "Electrolux";
    }

    // Construtor com parâmetros
    Fogao(int bocas, String mod, String mar) {
        quantidadeBocas = bocas;
        modelo = mod;
        marca = mar;
    }

    // Métodos get
    int getQuantidadeBocas() {
        return quantidadeBocas;
    }

    String getModelo() {
        return modelo;
    }

    String getMarca() {
        return marca;
    }

    // Método para acender o fogão
    public String acender() {
        return "O fogão " + marca + " modelo " + modelo + " foi aceso.";
    }

    // Método para apagar o fogão
    public String apagar() {
        return "O fogão " + marca + " modelo " + modelo + " foi apagado.";
    }

    public static void main(String[] args) {
        Fogao fogao1 = new Fogao();
        Fogao fogao2 = new Fogao(5, "Dako", "Brastemp");

        System.out.println("Fogão 1: " + fogao1.getMarca() + ", " + fogao1.getModelo() + ", " + fogao1.getQuantidadeBocas() + " bocas.");
        System.out.println(fogao1.acender());
        System.out.println(fogao1.apagar());

        System.out.println("\nFogão 2: " + fogao2.getMarca() + ", " + fogao2.getModelo() + ", " + fogao2.getQuantidadeBocas() + " bocas.");
        System.out.println(fogao2.acender());
        System.out.println(fogao2.apagar());
    }
}
