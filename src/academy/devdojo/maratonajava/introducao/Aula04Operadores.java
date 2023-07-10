package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {

        // + - / *
        int numero1 = 10;
        int numero2 = 10;
        int resultado = numero2+numero1;
        System.out.println(resultado);

        // % resto
        int resto = 21 % 7;
        System.out.println(resto);

        // < > <= >= == !=

        boolean isDezMaiorQueVinte = 10 > 20;
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);

        // && (e) || (ou)

        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        double contaCorrente = 200;
        double contaPoupança = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationcincocompravel = contaCorrente > valorPlaystation || contaPoupança > valorPlaystation;

        System.out.println("isPlaystationcincocompravel " + isPlaystationcincocompravel);

        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        System.out.println("bonus " + bonus);

        // unário ++ --

        int contador = 0;
        contador++;
        contador--;
        System.out.println("contador " + contador);

        int contador2 = 0;
        ++contador2;
        --contador2;
        System.out.println("contador2 " + contador2);


    }
}
