import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;



public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner( System.in );
//        System.out.print("\033[40;7;31m \033[0m"); // Pinta de vermelho
//        System.out.print("\033[40;7;34m \033[0m"); // Pinta de azul
//        System.out.print("\033[40;7;32m \033[0m"); // Pinta de verde
//        System.out.print("\033[40;7;30m \033[0m"); // Pinta de branco
//        System.out.print("\033[40;7;36m \033[0m"); // Pinta de verde água
//        System.out.print(" "); // Pinta de preto
//        System.out.print("\033[40;7;35m \033[0m"); // Pinta de magenta

        ArrayList <Moto> arrayMoto = new ArrayList<>();
        ArrayList <Carro> arrayCarro = new ArrayList<>();
        ArrayList <Caminhao> arrayCaminhao = new ArrayList<>();
        Mundo m = new Mundo();

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
            System.out.print("\033[40;7;31m  \033[0m Moto:" + arrayMoto.size() + "    ");
            System.out.print("\033[40;7;32m  \033[0m Carro:" + arrayCarro.size() + "    ");
            System.out.print("\033[40;7;34m  \033[0m Caminhao:" + arrayCaminhao.size() + "    ");
            System.out.println("");

            m.imprimeMapa();


            try {
                Thread.sleep(333);
            } catch (Exception e) {
                e.printStackTrace();
            }

            try
            {
                final String os = System.getProperty("os.name");

                if (os.contains("Windows"))
                {
                    Runtime.getRuntime().exec("cls");
                }
                else
                {
                    Runtime.getRuntime().exec("clear");
                }
            }
            catch (final Exception e)
            {
                //  Handle any exceptions.
            }
        }

        System.out.println("Não tem mais nenhum veiculo");

    }
}
