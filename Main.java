/**
 *
 * CC3642 - Orientação a Objetos
 *
 * Nome: Lucas Pampolin Laheras
 * RA: 22.117.055-8
 *
 */

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {

        ArrayList <Moto> arrayMoto = new ArrayList<>(); ///< Instancia o vetor arrayMoto
        ArrayList <Carro> arrayCarro = new ArrayList<>(); ///< Instancia o vetor arrayCarro
        ArrayList <Caminhao> arrayCaminhao = new ArrayList<>(); ///< Instancia o vetor arrayCaminhao
        Mundo m = new Mundo(); ///< Instancia o m (mapa)

        /// Adiciona ao vetor 10 carros, motos e caminhões
        for (int i = 0; i < 10; i++)
        {
            arrayMoto.add(new Moto());
            arrayCarro.add(new Carro());
            arrayCaminhao.add(new Caminhao());
        }

        while (!arrayCaminhao.isEmpty() || !arrayMoto.isEmpty() || !arrayCarro.isEmpty()) /// Laco de repetição que irá rodar até não sobrar nenhum veiculo
        {
            m.reiniciaMapa(); ///< A matriz mapaAtual recebe os valores padrões do mapa sem os veiculos

            /// Move todos as motos
            for (int i = 0; i < arrayMoto.size(); i ++)
            {
                arrayMoto.get(i).move();
            }

            /// Move todos os carros
            for (int i = 0; i < arrayCarro.size(); i ++)
            {
                arrayCarro.get(i).move();
            }

            /// Move todos os caminhões
            for (int i = 0; i < arrayCaminhao.size(); i ++)
            {
                arrayCaminhao.get(i).move();
            }

            m.verificaColisaoEInsereNoMapa(arrayMoto, arrayCarro, arrayCaminhao); ///< Insere no mapa todos as motos, carros e caminhões

            /// Imprime a legenda com a quantidade de veículos
            System.out.println( "--------------------------------------------------------------------------");
            System.out.printf("|                          \033[7;31m  \033[0m Moto: %2d                                   |\n", arrayMoto.size());
            System.out.printf("|                          \033[7;32m  \033[0m Carro: %2d                                  |\n", arrayCarro.size());
            System.out.printf("|                          \033[7;34m  \033[0m Caminhao: %2d                               |\n", arrayCaminhao.size());
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("");

            m.imprimeMapa(); ///< Imprime o mapa colorido

            /// Pausa o programa durante 333 milisegundos
            try {
                Thread.sleep(333);
            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.print("\033[43A"); ///< Move o cursor trita e oito linhas acima
        }

        System.out.println("Não tem mais nenhum veiculo");

    }
}
