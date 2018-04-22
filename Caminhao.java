public class Caminhao extends Veiculo {
    /// Construtor de Caminhão com os valore de cor = 5 e velocidade = 1 fixos
    public Caminhao()
    {
        super(5, 1);
        setToneladas(super.geraNum.nextInt(14));
    }

    public void setToneladas(int toneladas) {
        this.toneladas = toneladas;
    }

    public int getToneladas() {
        return toneladas;
    }

    protected int toneladas;
}
