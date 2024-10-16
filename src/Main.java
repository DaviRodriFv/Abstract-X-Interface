public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.frear();

        carro.acelerar();

        System.out.println("-----------------------");

        Moto moto = new Moto();

        moto.acelerar();

        moto.frear();

        moto.buzina();
    }

}