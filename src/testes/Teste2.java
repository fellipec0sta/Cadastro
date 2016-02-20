package testes;

import revendedora.Carro;
import revendedora.ColecaoVeiculos;
import revendedora.Combustivel;
import revendedora.Moto;
import revendedora.Proprietario;
import revendedora.Teste;

public class Teste2 {

	public static void main(String[] args) {
		
		ColecaoVeiculos colecao = new ColecaoVeiculos();
		
		//instancie mais alguns carros e motos
		
		Carro c1 = null;
		Carro c2 = null;
		Carro c3 = null;
		Carro c4 = null;
		try{
			c1= new Carro(new Proprietario("Pedro Álvares Cabral", "(84) 99887766"), 15000, 50000, 2012, "Civic", Combustivel.flex, 4);
			c2 = new Carro(new Proprietario("Fernão de Magalhães", "(84) 88776655"), 24000, 60000, 2013, "Jetta", Combustivel.flex, 4);
			c3 = new Carro(new Proprietario("Bartolomeu Dias", "(84) 88665544"), 12000, 55000, 2014, "HB20X", Combustivel.flex, 4 );
			c4 = new Carro(new Proprietario("Vasco da Gama", "(84)94998877"), 18000, 40000, 2013, "Punto", Combustivel.flex, 2 );
		}catch(Exception e){
			e.printStackTrace();
		}
		
		Moto m1 = null;
		Moto m2 = null;
		Moto m3 = null;
		try{
			m1 = new Moto(new Proprietario("Cristóvão Colombo", "(84) 99775533"), 8500, 5000, 2010, "Honda Biz", Combustivel.gasolina, 100);
			m2 = new Moto(new Proprietario("Marco Pólo", "(84) 94887766"), 280 , 47000, 2014, "harley davidson v rod night special", Combustivel.gasolina, 1249);
			m3 = new Moto(new Proprietario("Américo Vespúcio", "(84) 96998877"), 12000, 35000, 2012, "Honda CB 1000R", Combustivel.gasolina, 1000);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		colecao.addEventsListener(new Teste());
		
		//e adicione-as na coleção
		
		colecao.adicionar(c1);
		colecao.adicionar(c2);
		colecao.adicionar(c3);
		colecao.adicionar(c4);
		
		colecao.adicionar(m1);
		colecao.adicionar(m2);
		colecao.adicionar(m3);
		
		
		
		//por fim, escreva as seguintes informações da coleção:
		System.out.println(" ");
		System.out.println("Número de carros: " + colecao.getNumDeCarros());
		System.out.println("Número de carros com 2 portas: " + colecao.getNumDeCarros(2));
		System.out.println("Número de carros com 4 portas: " + colecao.getNumDeCarros(4));
		System.out.println("Número de motos: " + colecao.getNumDeMotos());
		System.out.println("Moto mais cara da coleção: " + colecao.getMotoMaisCara());
	}


}
