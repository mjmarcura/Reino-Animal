
public class ReinoAnimal {

	public static void main(String[] args) {
		Marinho baleia = new Marinho();
		Aereo morcego = new Aereo();
		Terrestre cavalo = new Terrestre();
		
		
		baleia.setVertebras(30);
		baleia.setLitrosLeite(500);
		baleia.setNBarbatana(2);
		
		morcego.setVertebras(6);
		morcego.setLitrosLeite(1);
		morcego.setNAsas(2);
		
		cavalo.setVertebras(36);
		cavalo.setLitrosLeite(40);
		cavalo.setNPatas(4);
		
		
		System.out.println("Numero de barbatanas: "+baleia.getNBarbatana());
		
		System.out.println("Numero de asas: "+morcego.getNAsas());
		
		System.out.println("Numero de patas: "+cavalo.getNPatas());
	}

}
