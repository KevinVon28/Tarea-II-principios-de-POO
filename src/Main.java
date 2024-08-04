public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro("Rex", 5);
        Gato gato = new Gato("LUlu ", 3);

        perro.hacerSonido();
        perro.comer();
        perro.beber();
        perro.dormir();
        perro.hacerTruco();
        perro.hacerTruco("Dar la pata");

        gato.hacerSonido();
        gato.comer();
        gato.beber();
        gato.dormir();
    }
}