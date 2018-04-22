public class Carro extends Veiculo {
    /// Construtor de Carro com os valore de cor = 4 e velocidade = 2 fixos
    public Carro()
    {
        super(4, 2);
        setTipo(super.geraNum.nextInt(4));
    }

    public void setTipo(int num) {
        if (num == 0)
        {
            this.tipo = "Esportivo";
        }
        else if (num == 1)
        {
            this.tipo = "Classico";
        }
        else if (num == 2)
        {
            this.tipo = "Picape";
        }
        else if (num == 3)
        {
            this.tipo = "Sedã";
        }
    }

    public String getTipo() {
        return tipo;
    }

    private String tipo;
}
