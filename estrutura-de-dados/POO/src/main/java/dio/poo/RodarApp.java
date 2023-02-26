package dio.poo;

public class RodarApp {
    public static void main(String[] args) {
        Carro carro1 = new Carro();

        carro1.setCor("Azul");
        carro1.setModelo("BMW");
        carro1.setCapacidadeTanque(56);

        System.out.println(carro1.modelo);
        System.out.println(carro1.cor);
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(6.39));


    Carro carro2 = new Carro("cinza", "Mercedes", 21);

      System.out.println(carro2.modelo);
        System.out.println(carro2.cor);
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(6.39));

    }


}
