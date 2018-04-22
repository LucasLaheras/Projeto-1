public class Moto extends Veiculo {
    /// Construtor de Caminhão com os valore de cor = 3 e velocidade = 3 fixos e a quantidade de cilindradas que é variavel
    public Moto()
    {
        super(3, 3);
        setCilindradas(super.geraNum.nextInt(1500));
    }

    /// Método set para cilindradas
    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    /// Método get para cilindradas
    public int getCilindradas() {
        return cilindradas;
    }

    /// Variavel que determina quantas cilindradas a moto pode ter
    public int cilindradas;
}
