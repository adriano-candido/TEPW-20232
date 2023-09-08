package br.edu.unichristus.main;

public class Main {
	public static void main(String[] args) {
		int idade1 = 25;
		int idade2 = 30;
		
		if(idade1 > idade2) {
			System.out.println("Idade 1 é maior");
		}else if(idade2 > idade1){
			System.out.println("Idade 2 é maior");
		}else {
			System.out.println("Idades iguais");
		}
		
		String uf = "CE";
		
		switch(uf) {
		
		case "SP":
			System.out.println("SUL");
		break;
		
		case "CE":
		case "PE":	
			System.out.println("NORDESTE");
		break;
		}
		
		
	}

}
