public class Caminhao extends Veiculo {
    /// Construtor de Caminhão com os valore de cor = 5 e velocidade = 1 fixos e a quantidade de toneladas variavel
    public Caminhao()
    {
        super(5, 1);
        setToneladas(super.geraNum.nextInt(14) + 1);
    }

    /// Método set para toneladas
    public void setToneladas(int toneladas) {
        this.toneladas = toneladas;
    }

    /// Método get para toneladas
    public int getToneladas() {
        return toneladas;
    }

    /// Variavel que determina quantas toneladas o caminhão pode levar
    protected int toneladas;
}
