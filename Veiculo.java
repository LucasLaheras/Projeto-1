import java.util.Random;

public class Veiculo {

    public Random geraNum = new Random(); /// Função que gera um número

    public Veiculo(int cor, int velocidade) /// Construtor de veículo
    {
        setCor(cor);
        setVelocidade(velocidade);
        setX(geraNum.nextInt(37));
        setY(geraNum.nextInt(37));
        setFabrica(true);
    }


    public void setCor(int cor) { /// Método set para cor
        this.cor = cor;
    }

    public void setVelocidade(int velocidade) { /// Método set para velocidade
        this.velocidade = velocidade;
    }

    public void setFabrica(boolean fabrica) { /// Método set para fábrica
        this.fabrica = fabrica;
    }

    public void setX(int x) { /// Método set para X
        this.x = x;
    }

    public void setY(int y) { /// Método set para Y
        this.y = y;
    }

    public void move() /// Método qu irá mover o objeto
    {
        int movimento = geraNum.nextInt(4); /// Gera um número de 0 a 3

        if (movimento == 0)
        {
            y -= getVelocidade(); /// move pra cima
        }
        else if (movimento == 1)
        {
            y += getVelocidade(); /// move pra baixo
        }
        else if (movimento == 2)
        {
            x += getVelocidade(); /// move pra direita
        }
        else if (movimento == 3)
        {
            x -= getVelocidade(); /// move pra esquerda
        }

        /// Se o x ou y passar dos limites do mapa o veiculo aparece do outro lado
        if (x < 0)
        {
            x += 37;
        }
        else if (x > 36)
        {
            x -= 37;
        }
        else if (y < 0)
        {
            y += 37;
        }
        else if (y > 36)
        {
            y -= 37;
        }

    }


    public int getVelocidade() { /// Método que retorna o valor da velocidade
        return velocidade;
    }

    public int getX() { /// Método que retorna o valor do X
        return x;
    }

    public int getY() { /// Método que retorna o valor do Y
        return y;
    }

    public int getCor() { /// Método que retorna o valor da cor
        return cor;
    }

    protected int x;
    protected int y;
    protected int velocidade;
    protected int cor;
    protected boolean fabrica;
}
