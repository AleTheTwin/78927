public class App {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double num1 = 5.5;
        double num2 = 10.2;

        String resultado = String.valueOf(calculadora.suma(num1, num2));

        System.out.println(resultado);
    }
}
