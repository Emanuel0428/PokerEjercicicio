/*
// ADT Carta que describe una carta con base en su
// valor y su pinta. Los valores son (As,2,…,10,J,Q,K) y las pintas son (clubs=♣,
// diamonds=♦, hearts=♥ and spades=♠). Implementar el método toString que
// visualize el valor y la pinta.
 */

public class Carta {
    private String valor;
    private String pinta;

    // Constructor con parámetros para inicializar los atributos de la carta
    // Valores válidos: As, 2,..., 10, J, Q, K
    // Pintas válidas: clubs, diamonds, hearts, spades
    public Carta(String valor, String pinta) {
        this.valor = valor;
        this.pinta = pinta;
    }
    
    // Constructor que inicializa la carta con valores y pintas aleatorias
    public Carta() {
        String[] valores = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] pintas = {"clubs", "diamonds", "hearts", "spades"};
        this.valor = valores[(int) (Math.random() * valores.length)];
        this.pinta = pintas[(int) (Math.random() * pintas.length)];
    }


    public String getValor() {
        return valor;
    }

    public String getPinta() {
        return pinta;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public void setPinta(String pinta) {
        this.pinta = pinta;
    }

    @Override
    public String toString() {
        return valor + " de " + pinta;
    }

    public static void main(String[] args) {
        Carta carta = new Carta("As", "Corazones");
        System.out.println(carta);
    }
}

