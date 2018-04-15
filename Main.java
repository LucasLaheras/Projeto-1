import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList <Moto> arrayMoto = new ArrayList<>();
        ArrayList <Carro> arrayCarro = new ArrayList<>();
        ArrayList <Caminhao> arrayCaminhao = new ArrayList<>();
        Mundo m = new Mundo();

        /// Coloca 10 carros, motos e caminhoes em cada vetor
        for (int i = 0; i < 10; i++)
        {
            arrayMoto.add(new Moto());
            arrayCarro.add(new Carro());
            arrayCaminhao.add(new Caminhao());
        }


        while (!arrayCaminhao.isEmpty() || !arrayMoto.isEmpty() || !arrayCarro.isEmpty())
        {
            m.reiniciaMapa();

            for (int i = 0; i < arrayMoto.size(); i ++)
            {
                arrayMoto.get(i).move();
            }
            for (int i = 0; i < arrayCarro.size(); i ++)
            {
                arrayCarro.get(i).move();
            }
            for (int i = 0; i < arrayCaminhao.size(); i ++)
            {
                arrayCaminhao.get(i).move();
            }

            m.insereNoMapa(arrayMoto, arrayCarro, arrayCaminhao);

            System.out.printf("\033[7;31m  \033[0m Moto: %2d", arrayMoto.size());
            System.out.printf("    \033[7;32m  \033[0m Carro: %2d", arrayCarro.size());
            System.out.printf("    \033[7;34m  \033[0m Caminhao: %2d", arrayCaminhao.size());
            System.out.println("");

            m.imprimeMapa();


            try {
                Thread.sleep(333);
            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.print("\033[38A");
        }

        System.out.println("Não tem mais nenhum veiculo");

    }
}
