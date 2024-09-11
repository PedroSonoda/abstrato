package Abstrata;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro ferrari = new Carro ("000000", "F1", "Vermelho", 2023);
		ferrari.ligar();
		ferrari.acelerar();
		ferrari.virar();
		ferrari.frear();
		System.out.println("--------------------------------");
		
		Onibus marcopolo = new Onibus ("1111111", "XB1", "Prata", 2020);
		marcopolo.ligar();
		marcopolo.acelerar();
		marcopolo.virar();
		marcopolo.frear();
		
		System.out.println("--------------------------------");
		Carro volvo = new Carro ("222222", "XC60", "Branco", 2023);
		volvo.ligar();
		volvo.acelerar();
		volvo.virar();
		volvo.frear();

		
		System.out.println("--------------------------------");
		Moto titan = new Moto ("3333333", "CG160", "Preta", 2024);
		titan.ligar();
		titan.acelerar();
		titan.virar();
		titan.frear();

	}

}
