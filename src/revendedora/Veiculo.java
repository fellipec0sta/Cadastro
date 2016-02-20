package revendedora;

public abstract class Veiculo {

	protected int quilometragem;
	protected float preco;
	protected int ano;
	protected String modelo;
	protected Combustivel combustivel;
	protected Proprietario proprietario;
	
	public Veiculo(int quilometragem, float preco, int ano, String modelo,
			Combustivel combustivel, Proprietario proprietario) {
		super();
		this.quilometragem = quilometragem;
		this.preco = preco;
		this.ano = ano;
		this.modelo = modelo;
		this.combustivel = combustivel;
		this.proprietario = proprietario;
	}
}
