public class Moto implements Veiculo{
    @Override
    public void acelerar() {
        System.out.println("Moto acelerado");
    }

    @Override
    public void frear() {
        System.out.println("Moto freado");
    }

    public void buzina(){
        System.out.println("Moto buzina");
        System.out.println("BIBIBIBI");
    }
}
