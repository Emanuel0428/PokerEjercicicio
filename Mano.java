public class Mano {
    /*
    Definir el ADT Mano, que representa la mano de un jugador. Las manos se
    inicializan tomando 5 cartas del Naipe. La mano ofrece la operación reemplazar
    que elimina una carta de la Mano y toma una nueva carta del Naipe. La Mano
    también tiene la operación comparar, la cual compara con otra y retorna true si es
    mayor (Straight flush > four of a kind > full house > flush > escalera > terna >
    dos pares > carta mayor). Implementar al menos dos tipos de comparaciones de
    Mano 
     */

     // Implementación del ADT Mano
        private Carta[] cartas;
        public Mano() {
            cartas = new Carta[5];
        }

        public void reemplazarCarta(Carta carta) {
            for (int i = 0; i < cartas.length; i++) {
                if (cartas[i] == null) {
                    cartas[i] = carta;
                    return;
                }
            }
        }

        public Carta tomarCarta() {
            Carta carta = new Carta(); // Obtener una carta del Naipe
            reemplazarCarta(carta);
            return carta;
        }

        public boolean esMayor(Mano otraMano) {
            // Implementar comparación entre Manos
            return false;
        }
        

}
