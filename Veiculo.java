import java.util.Random;

public class Veiculo {

    public Random geraNum = new Random();

    public Veiculo(int cor, int velocidade)
    {
        setCor(cor);
        setVelocidade(velocidade);
        setX(geraNum.nextInt(37));
        setY(geraNum.nextInt(37));
    }

    public void setCor(int cor) {
        this.cor = cor;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void move(int qtd)
    {
        int movimento = geraNum.nextInt(4);

        if (movimento == 0)
        {
            y -= qtd;
            // move pra cima
        }
        else if (movimento == 1)
        {
            y += qtd;
            // move pra baixo
        }
        else if (movimento == 2)
        {
            x += qtd;
            // move pra direita
        }
        else if (movimento == 3)
        {
            x -= qtd;
            // move pra esquerda
        }

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
            x -= 37;
        }
    }


    public int getVelocidade() {
        return velocidade;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getCor() {
        return cor;
    }

    protected int x;
    protected int y;
    protected int velocidade;
    protected int cor;
    protected boolean fabrica = false;
}
