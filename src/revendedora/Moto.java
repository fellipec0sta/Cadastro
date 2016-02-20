package revendedora;

public class Moto extends Veiculo {

	private int cilindradas;
	
	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) throws Exception {
		this.cilindradas = cilindradas;
		if(cilindradas <= 0){
			throw new Exception("Valor Inválido");
		}
	}

	public Moto(Proprietario proprietario, int quilometragem, float preco, int ano, String modelo,
			Combustivel combustivel, int cilindradas) throws Exception {
		super(quilometragem, preco, ano, modelo, combustivel, proprietario);
		this.setCilindradas(cilindradas);
	}
	
	public String toString() {
		return "Moto: " + modelo + ", " + quilometragem + "km, R$" + preco + ", ano " + ano + ", " + combustivel + ". " + cilindradas + " cilindradas.\n" + proprietario;
	}

}
