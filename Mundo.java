import java.util.ArrayList;

public class Mundo {

    public void imprimeMapa() {
        for (int i = 0; i < 37; i++) {
            for (int j = 0; j < 37; j++) {
                if (mapaAtual[i][j] == 0) {
                    System.out.print("  "); // Pinta de preto
                } else if (mapaAtual[i][j] == 1) {
                    System.out.print("\033[40;7;30m  \033[0m"); // Pinta de branco
                } else if (mapaAtual[i][j] == 2) {
                    System.out.print("\033[40;7;35m  \033[0m"); // Pinta de magenta
                } else if (mapaAtual[i][j] == 3) {
                    System.out.print("\033[40;7;31m  \033[0m"); // Pinta de vermelho
                } else if (mapaAtual[i][j] == 4) {
                    System.out.print("\033[40;7;32m  \033[0m"); // Pinta de verde
                } else if (mapaAtual[i][j] == 5) {
                    System.out.print("\033[40;7;34m  \033[0m"); // Pinta de azul
                }
            }
            System.out.println();
        }
    }


    public void insereNoMapa(ArrayList<Moto> arrayMoto, ArrayList<Carro> arrayCarro, ArrayList<Caminhao> arrayCaminhao)
    {
        for (int i = 0; i < arrayMoto.size(); i ++)
        {
            if (mapaAtual[arrayMoto.get(i).getX()][arrayMoto.get(i).getY()] == 3) {
                mapaAtual[arrayMoto.get(i).getX()][arrayMoto.get(i).getY()] = mapaPadrao[arrayMoto.get(i).getX()][arrayMoto.get(i).getY()];

                for (int j = 0; j < i; j++)
                {
                    if (arrayMoto.get(j).getX() == arrayMoto.get(i).getX() && arrayMoto.get(j).getY() == arrayMoto.get(i).getY())
                    {
                        arrayMoto.remove(j);
                        break;
                    }
                }

                arrayMoto.remove(i);
                i -= 2;
            }
            else if (mapaAtual[arrayMoto.get(i).getX()][arrayMoto.get(i).getY()] == 2) {
                arrayMoto.get(i).fabrica = true;

                arrayMoto.add(new Moto());

                mapaAtual[arrayMoto.get(i).getX()][arrayMoto.get(i).getY()] = arrayMoto.get(i).cor;
            }
            else
            {
                arrayMoto.get(i).fabrica = false;

                mapaAtual[arrayMoto.get(i).getX()][arrayMoto.get(i).getY()] = arrayMoto.get(i).cor;
            }
        }

        for (int i = 0; i < arrayCarro.size(); i ++)
        {

            if (mapaAtual[arrayCarro.get(i).getX()][arrayCarro.get(i).getY()] == 4)
            {
                mapaAtual[arrayCarro.get(i).getX()][arrayCarro.get(i).getY()] = mapaPadrao[arrayCarro.get(i).getX()][arrayCarro.get(i).getY()];

                for (int j = 0; j < i; j++)
                {
                    if (arrayCarro.get(j).getX() == arrayCarro.get(i).getX() && arrayCarro.get(j).getY() == arrayCarro.get(i).getY())
                    {
                        arrayCarro.remove(j);
                        break;
                    }
                }

                arrayCarro.remove(i);
                i -= 2;
            }
            else if (mapaAtual[arrayCarro.get(i).getX()][arrayCarro.get(i).getY()] == 3)
            {
                arrayCarro.get(i).fabrica = false;

                for (int j = 0; j < arrayMoto.size(); j++)
                {
                    if (arrayCarro.get(i).getX() == arrayMoto.get(j).getX() && arrayCarro.get(i).getY() == arrayMoto.get(j).getY())
                    {
                        arrayMoto.remove(i);
                    }
                }
            }
            else if (mapaAtual[arrayCarro.get(i).getX()][arrayCarro.get(i).getY()] == 2) {
                arrayCarro.get(i).fabrica = true;

                arrayCarro.add(new Carro());

                mapaAtual[arrayCarro.get(i).getX()][arrayCarro.get(i).getY()] = arrayCarro.get(i).cor;
            }
            else
            {
                arrayCarro.get(i).fabrica = false;

                mapaAtual[arrayCarro.get(i).getX()][arrayCarro.get(i).getY()] = arrayCarro.get(i).cor;
            }
        }

        for (int i = 0; i < arrayCaminhao.size(); i ++)
        {
            arrayCaminhao.get(i).fabrica = false;

            if (mapaAtual[arrayCaminhao.get(i).getX()][arrayCaminhao.get(i).getY()] == 5) {
                mapaAtual[arrayCaminhao.get(i).getX()][arrayCaminhao.get(i).getY()] = mapaPadrao[arrayCaminhao.get(i).getX()][arrayCaminhao.get(i).getY()];

                for (int j = 0; j < i; j++)
                {
                    if (arrayCarro.get(j).getX() == arrayCarro.get(i).getX() && arrayCarro.get(j).y == arrayCarro.get(i).y)
                    {
                        arrayCaminhao.remove(j);
                        break;
                    }
                }

                arrayCaminhao.remove(i);
                i -= 2;
            }
            else if (mapaAtual[arrayCaminhao.get(i).getX()][arrayCaminhao.get(i).getY()] == 4)
            {
                arrayCaminhao.get(i).fabrica = false;

                for (int j = 0; j < arrayCarro.size(); j++)
                {
                    if (arrayCaminhao.get(i).getX() == arrayCarro.get(j).getX() && arrayCaminhao.get(i).getY() == arrayCarro.get(j).getY())
                    {
                        arrayCarro.remove(i);
                    }
                }
            }
            else if (mapaAtual[arrayCaminhao.get(i).getX()][arrayCaminhao.get(i).getY()] == 3)
            {
                arrayCaminhao.get(i).fabrica = false;

                for (int j = 0; j < arrayMoto.size(); j++)
                {
                    if (arrayCaminhao.get(i).getX() == arrayMoto.get(j).getX() && arrayCaminhao.get(i).getY() == arrayMoto.get(j).getY())
                    {
                        arrayMoto.remove(i);
                    }
                }
            }
            else if (mapaAtual[arrayCaminhao.get(i).getX()][arrayCaminhao.get(i).getY()] == 2)
            {
                arrayCaminhao.get(i).fabrica = true;

                arrayCaminhao.add(new Caminhao());

                mapaAtual[arrayCaminhao.get(i).getX()][arrayCaminhao.get(i).getY()] = arrayCaminhao.get(i).cor;
            }
            else
            {
                arrayCaminhao.get(i).fabrica = false;

                mapaAtual[arrayCaminhao.get(i).getX()][arrayCaminhao.get(i).getY()] = arrayCaminhao.get(i).cor;
            }
        }
    }

    public void setMapaAtual ()
    {
        mapaAtual = mapaPadrao;
    }

    private int mapaPadrao[][] = //Mapa(37 x 37) = 0, limite = 1, fabrica = 2, moto = 3, carro = 4, caminhão = 5
            {
                    {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                    {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                    {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                    {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                    {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                    {1, 0, 0, 0, 0, 2, 2, 2, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 2, 2, 2, 2, 0, 0, 0, 0, 1},
                    {1, 0, 0, 0, 0, 2, 2, 2, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 2, 2, 2, 2, 0, 0, 0, 0, 1},
                    {1, 0, 0, 0, 0, 2, 2, 2, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 2, 2, 2, 2, 0, 0, 0, 0, 1},
                    {1, 0, 0, 0, 0, 2, 2, 2, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 2, 2, 2, 2, 0, 0, 0, 0, 1},
                    {1, 0, 0, 0, 0, 2, 2, 2, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 2, 2, 2, 2, 0, 0, 0, 0, 1},
                    {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                    {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                    {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                    {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                    {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                    {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                    {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 2, 2, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                    {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 2, 2, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                    {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 2, 2, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                    {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 2, 2, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                    {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 2, 2, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                    {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 2, 2, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                    {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                    {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                    {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                    {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                    {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                    {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                    {1, 0, 0, 0, 0, 2, 2, 2, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 2, 2, 2, 2, 0, 0, 0, 0, 1},
                    {1, 0, 0, 0, 0, 2, 2, 2, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 2, 2, 2, 2, 0, 0, 0, 0, 1},
                    {1, 0, 0, 0, 0, 2, 2, 2, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 2, 2, 2, 2, 0, 0, 0, 0, 1},
                    {1, 0, 0, 0, 0, 2, 2, 2, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 2, 2, 2, 2, 0, 0, 0, 0, 1},
                    {1, 0, 0, 0, 0, 2, 2, 2, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 2, 2, 2, 2, 0, 0, 0, 0, 1},
                    {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                    {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                    {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                    {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            };

    private int mapaAtual[][];
}

