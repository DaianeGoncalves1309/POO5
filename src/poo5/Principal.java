package poo5;

public class Principal {

	public static void main(String[] args) {
		instanciaGeladeira();
		instanciaCaderno();
		instanciaTenis();
		

	}

	private static void instanciaGeladeira() {
		Geladeira ge = new Geladeira();
		ge.altura = 2.10;
		ge.capacidadeTotal = 400;
		ge.consumoDeEnergia = 75;
		ge.largura = 1;
		ge.filtroDeAgua = true;

		Geladeira ge2 = new Geladeira();
		ge2.altura = 1.90;
		ge2.capacidadeTotal = 315;
		ge2.consumoDeEnergia = 50;
		ge2.largura = 1;
		ge2.filtroDeAgua = false;

		System.out.println("geladeira 1:");
		ge.ligar();
		ge.abrePorta();
		ge.desligar();
		
		
	}

	private static void instanciaCaderno() {
		Caderno ca = new Caderno();
		ca.qtDeMaterias = 10;
		ca.qtDeFolhas = 200;
		ca.cor = "amarelo";
		ca.altura = 15;
		ca.largura = 10;

		Caderno ca2 = new Caderno();
		ca2.qtDeMaterias = 20;
		ca2.qtDeFolhas = 300;
		ca2.cor = "preto";
		ca2.altura = 15;
		ca2.largura = 10;

		System.out.println("caderno 1:");
		ca.abreCarderno();
		ca.cadernoNovo();
		ca.cadernoUsado();
		
		
	}

	private static void instanciaTenis() {
		Tenis te = new Tenis();
		te.tamanho = 36;
		te.marca = "adidas";
		te.cor = "verde";
		te.novo = true;
		te.confortavel = true;

		Tenis te2 = new Tenis();
		te2.tamanho = 42;
		te2.marca = "vans";
		te2.cor = "preto";
		te2.novo = false;
		te2.confortavel = false;

		System.out.println("tênis 1:");
		te.tenisNovo();
		te.tenisConfortavel();
		te.tenisTamanho();

	}

}