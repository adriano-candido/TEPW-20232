package main;

import java.util.List;
import java.util.ArrayList;

import aluno.Aluno;
import funcionario.Funcionario;
import pessoa.Pessoa;

public class Main {
	
	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno();
		
		a1.setNome("Joao");
		a1.setCpf("123");
		
		a2.setNome("Maria");
		a2.setCpf("123");
		
		a3.setNome("José");
		a3.setCpf("231");
		
		List<Pessoa> list = new ArrayList<>();
		list.add(a1);
		list.add(a2);
		list.add(a3);
		
		Pessoa f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		Funcionario f3 = new Funcionario();
		
		f1.setNome("Maria Jose");
		f1.setCpf("333");
		
		f2.setNome("Jose Maria");
		f2.setCpf("222");
		
		f3.setNome("Joao Maria");
		f3.setCpf("111");
		
		list.add(f1);
		list.add(f2);
		list.add(f3);
		
		System.out.println(list.size());
		
		
		for(Pessoa p : list) {
			System.out.println(p);
		}
		
		
		System.out.println(list.contains(a2));
		
		list.remove(a1);
		
		list.remove(0);
		
		try {
			System.out.println(10/2);
		}catch(ArithmeticException exc) {
			System.out.println("Nao é possivel dividir por 0");
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("Boa noite");
		}
		System.out.println("Hello World");
		
	}

}
