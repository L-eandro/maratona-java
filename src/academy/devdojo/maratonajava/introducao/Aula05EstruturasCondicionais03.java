package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Doar se salário > 5000
        double salario = 3000;
        String mensagemDoar = "Doar 500" ;
        String mensagemNãoDoar = "Não doar" ;
        String resultado = salario < 5000 ? mensagemDoar : mensagemNãoDoar;

        System.out.println(resultado);

    }
}
