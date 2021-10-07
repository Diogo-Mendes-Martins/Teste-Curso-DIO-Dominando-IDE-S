/*É necessário existir o public static void main, para poder rodar (fazer funcionar) a classe.
 * cntrl + n para criar classe..*/

package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {

		Gato gato = new Gato();
		Livro livro = new Livro();
		
		System.out.println(gato);
		System.out.println(livro);
		
		
		
		
		/*Livro livro = new Livro();*/

		/*
		 * int a = 2; int b = 2;
		 * 
		 * System.out.println("HELLO WORLD!!!");
		 * System.out.println("Oi, eu sou o Goku!!! " + (a + b));
		 */

	}

}

class Livro{
	
	private String nom;
	private String npag;
}
