package Abstrata;

public class PrincipalAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lobo Lobo = new Lobo ("wolf", "masculino", "Canis simensis");
		Lobo.dormir();
		Lobo.caminhar();
		Lobo.correr();
		Lobo.emitirSom();
		
		System.out.println("--------------------------------");
		
		Leao leao = new Leao ("lion", "masculino", "leão asiático");
		leao.dormir();
		leao.caminhar();
		leao.correr();
		leao.emitirSom();
		

		System.out.println("--------------------------------");
		
		Tigre Tigre = new Tigre ("tiger", "masculino", " Tigre-do-sul-da-china.");
		Tigre.dormir();
		Tigre.caminhar();
		Tigre.correr();
		Tigre.emitirSom();
		
		System.out.println("--------------------------------");
		
		Cachorro cachorro = new Cachorro ("skank", "masculino", "não possui");
		cachorro.dormir();
		cachorro.caminhar();
		cachorro.correr();
		cachorro.emitirSom();
		
		System.out.println("--------------------------------");
		
		Gato gato = new Gato ("Luna", "feminino", "não possui");
		gato.dormir();
		gato.caminhar();
		gato.correr();
		gato.emitirSom();
		
	
		 
	}

}
