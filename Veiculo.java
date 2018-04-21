import java.util.Random;

public class Veiculo {
    /// Método que gera um número aleatório
    public Random geraNum = new Random();

    /// Construtor de veículo
    public Veiculo(int cor, int velocidade)
    {
        setCor(cor);
        setVelocidade(velocidade);
        setX(geraNum.nextInt(37));
        setY(geraNum.nextInt(37));
        setFabrica(true);
    }

    /// Métodos set
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

    /// Método que irá mover o objeto
    public void move()
    {
        int movimento = geraNum.nextInt(4); /// Gera um número de 0 a 3

        /// move pra cima
        if (movimento == 0)
        {
            y -= getVelocidade();
        }

        /// move pra baixo
        else if (movimento == 1)
        {
            y += getVelocidade();
        }

        /// move pra direita
        else if (movimento == 2)
        {
            x += getVelocidade();
        }

        /// move pra esquerda
        else if (movimento == 3)
        {
            x -= getVelocidade();
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

    /// Método que retorna o valor da velocidade
    public int getVelocidade() {
        return velocidade;
    }

    /// Método que retorna o valor do X
    public int getX() {
        return x;
    }

    /// Método que retorna o valor do Y
    public int getY() {
        return y;
    }

    /// Método que retorna o valor da cor
    public int getCor() {
        return cor;
    }

    protected int x; /// Guarda a posição horizontal do veiculo
    protected int y; /// Guarda a posição vertical do veiculo
    protected int velocidade; /// Guarda a velocidadedo veiculo
    protected int cor; /// Guarda a cor horizontal do veiculo
    protected boolean fabrica;/// Guarda se o veiculo já estava na fabrica
}
