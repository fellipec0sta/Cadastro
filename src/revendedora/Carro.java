package revendedora;

public class Carro extends Veiculo {

	private int numPortas;

	public int getNumPortas() {
		return numPortas;
	}

	public void setNumPortas(int numPortas) throws Exception{
		this.numPortas = numPortas;
		if(numPortas <= 0)
			throw new Exception("Valor Inválido");
	}
	
	public Carro(Proprietario proprietario, int quilometragem, float preco, int ano, String modelo, Combustivel combustivel, int numPortas) throws Exception {
		super(quilometragem, preco, ano, modelo, combustivel, proprietario);
		setNumPortas(numPortas);
	}
	
	public String toString() {
		return "Carro: " + modelo + ", " + quilometragem + "km, R$" + preco + ", ano " + ano + ", " + combustivel + ". " + numPortas + " portas.\n" + proprietario;
	}
}

