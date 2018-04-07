public class Veiculo {

    public Veiculo(){ }

    public Veiculo(String cor, int velocidade, int x, int y)
    {
        setCor(cor);
        setVelocidade(velocidade);
        setX(x);
        setY(y);
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setFabrica(boolean fabrica) {
        this.fabrica = fabrica;
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

    public int getVelocidade() {
        return velocidade;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getCor() {
        return cor;
    }

    protected int x;
    protected int y;
    protected int velocidade;
    protected String cor;
}
