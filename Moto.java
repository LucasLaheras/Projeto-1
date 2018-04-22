public class Moto extends Veiculo {
    /// Construtor de Caminhão com os valore de cor = 3 e velocidade = 3 fixos
    public Moto()
    {
        super(3, 3);
        setCilindradas(super.geraNum.nextInt(1500));
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public int cilindradas;
}
