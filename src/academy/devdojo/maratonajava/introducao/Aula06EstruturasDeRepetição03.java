package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepetição03 {
    public static void main(String[] args) {
        //imprima os primeiros 25 números de um dado valor. por exemplo, 50.

        //int valorMax = 50;

        for (int i = 1; i < 50; i++) {
            if (i > 25) {
                break;
            }
            System.out.println("i = " + i);
        }
    }
}
