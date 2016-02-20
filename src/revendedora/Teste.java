package revendedora;

public class Teste implements EventsListener{

	
	
	@Override
	public void onMotoAdicionada(Moto a) {
		System.out.println("Moto foi adicionada" );
		
	}

	@Override
	public void onCarroAdicionado(Carro c) {
		System.out.println("Carro foi adicionado");
		
	}

	
}
