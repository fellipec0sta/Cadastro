package revendedora;

import java.util.ArrayList;

public class ColecaoVeiculos {

	private ArrayList<Veiculo> veiculos;
	private ArrayList<EventsListener> events;
	
	
	public ColecaoVeiculos() {
		events = new ArrayList<EventsListener>();
		veiculos = new ArrayList<Veiculo>();
	}
	
	//adiciona um novo veículo na ArrayList
	public void adicionar(Veiculo novoVeiculo) {
		veiculos.add(novoVeiculo);
		
		for(int i = 0; i < events.size(); i++){
			if(novoVeiculo instanceof Carro){
				events.get(i).onCarroAdicionado((Carro)novoVeiculo);
			}else{
				events.get(i).onMotoAdicionada((Moto)novoVeiculo);
			}
		}
	}
	
	public void addEventsListener(EventsListener el){
		events.add(el);
	}
	
	
	//retorna o número de motos
	public int getNumDeMotos() {		
		int cont = 0;
		for(int i=0 ; i<veiculos.size();i++){
			
			if(veiculos.get(i) instanceof Moto){
				cont++;
			}
		}
        return cont;
	}
	
	//retorna o número de carros
	public int getNumDeCarros() {
		int cont = 0;
		for(int i=0 ; i<veiculos.size();i++){
			
			if(veiculos.get(i) instanceof Carro){
				cont++;
			}
		}
        return cont;
	}
	
	//retorna o número de carros que possuem essa quantia de porta
	public int getNumDeCarros(int numPortas) {
		int cont = 0;
		for(int i=0 ; i<veiculos.size();i++){
			
			if(veiculos.get(i) instanceof Carro){
				Carro carro = (revendedora.Carro) veiculos.get(i);
				if (carro.getNumPortas() == numPortas) {
					cont++;
				}
			}
		}
			
		
		return cont;
	}
	
	//retorna a moto mais cara; se não houver motos, retorna null
	public Moto getMotoMaisCara() {
		int a = -1;
		for(int i = 0;i < veiculos.size();i++) {
			if (veiculos.get(i) instanceof Moto) {
				a = i;
				break;
			}
		}
		if (a == -1) {
			return null;
		}
		for (int i = 0;i < veiculos.size();i++) {
			if (veiculos.get(i) instanceof Moto) {
				if (veiculos.get(a).preco < veiculos.get(i).preco) {
					a = i;
				}
			}
		}
		return (Moto) veiculos.get(a);
	}
	

}
