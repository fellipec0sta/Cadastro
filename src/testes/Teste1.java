package testes;

import revendedora.Carro;
import revendedora.Combustivel;
import revendedora.Moto;
import revendedora.Proprietario;

public class Teste1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Proprietario p1 = new Proprietario("Pedro Álvares Cabral", "(84) 99887766");
		Proprietario p2 = new Proprietario("Cristóvão Colombo", "(84) 99775533");

		Carro c1 = null;
		try{
		c1 = new Carro(p1, 15000, 50000, 2012, "Civic", Combustivel.flex, 0);
		}catch(Exception e){
			e.printStackTrace();
		}
		Moto m1 = null;
		try{
		m1 = new Moto(p2, 8500, 5000, 2010, "Honda Biz", Combustivel.gasolina, -1);
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println(c1);
		System.out.println(m1);
	}

}
