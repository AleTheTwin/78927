public class App {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int num1 = 5;
        int num2 = 3;

        String resultado = String.valueOf(calculadora.divide(num1, num2));

        System.out.println(resultado);
    }
}
