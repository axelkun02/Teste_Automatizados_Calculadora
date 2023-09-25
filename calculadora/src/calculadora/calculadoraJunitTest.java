package calculadora;

import junit.framework.Assert;

import org.junit.jupiter.api.Test;

public class calculadoraJunitTest {

	@Test
//	somando 2 numeros positivos, onde espera-se o resultado correto
	public void somarDoisNumeros() {
		calculadoraJunitTest calc = new calculadoraJunitTest();
		int soma = calc.somar(7, 8);

		Assert.assertEquals(15, soma);
	}
	
	@Test
//	subtraindo 2 numeros positivos, onde espera-se o resultado correto
	public void subtrairDoisNumeros() {
		calculadoraJunitTest calc = new calculadoraJunitTest();
		int sub = calc.subtrair(10, 5);

		Assert.assertEquals(5, sub);
	}
	
//	multplicando 2 numeros positivos, onde espera-se um resultado incorreto
	@Test
	public void multiplicarDoisNumeros() {
		calculadoraJunitTest calc = new calculadoraJunitTest();
		int mult = calc.multiplicar(10, 10);

		Assert.assertEquals(80, mult);
	}
	
//	dividindo 2 numeros positivos, onde espera-se um resultado incorreto
	@Test
	public void dividirDoisNumeros() {
		calculadoraJunitTest calc = new calculadoraJunitTest();
		int div = calc.dividir(15, 3);

		Assert.assertEquals(5, div);
	}

	public int somar(int n1, int n2) {
		int soma = n1 + n2;
		return soma;

	}

	public int subtrair(int a1, int a2) {
		int sub = a1 - a2;
		return sub;

	}

	public int multiplicar(int a1, int a2) {
		int mult = a1 * a2;
		return mult;

	}
	
		 public int dividir (int a1, int a2){
			    int div = a1 / a2;
			    return div;
			    
	}

	}

