import java.util.ArrayList;
import java.util.Date;

public class CursoJava {

    public static void main(String[] args) {
        System.out.println("Início da execução \n");

        Carro carro = new Carro();
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

//            if(true){
//                carro = new Carro("preto", new Date(),"Fusca");
//                System.out.println(carro.getModelo());
//            } else {
//                carro2 = new Carro("Amarelo", new Date(), "Opala");
//                System.out.println(carro2.getModelo());
//            }
        carro.setChassi(1020304050);
        carro.setCor("Preto");
        carro.setModelo("VolksWagen");

        carro1.setChassi(10203);
        carro1.setCor("Amarelo");
        carro1.setModelo("Fiat");

        carro2.setChassi(104050);
        carro2.setCor("Vermelho");
        carro2.setModelo("Chevrolet");

            ArrayList<Carro> car = new ArrayList<Carro>();
            car.add(carro);
            car.add(carro1);
            car.add(carro2);

       if (carro.getChassi(1)){
           System.out.println( "Chassi");
       }


        System.out.println(" Nova Data " + ConverteDates.convertDate(new Date()));

        System.out.println("Os carros são: " + car );
        System.out.println("Os carros são: " + car.get(0) + car.get(1));

        System.out.println("\nExecução Ok!");
    }
    
}