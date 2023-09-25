package calculadora;

public class main {

	public static void main(String[] args) {
		
		soma soma = new soma(); 
	       subtracao sub = new subtracao();
	       divisao div = new divisao();
	       multiplicacao mult = new multiplicacao();
	       
	       
	       
	       // ---- TESTES DE SOMA ----
	       
	        System.out.println("TESTES DE SOMA:");
	        //     cenário 1: soma de dois valores maiores que 0
	        System.out.println(soma.somar(5, 10));

	        //       cenário 2: soma de dois valores sendo um 0
	         System.out.println(soma.somar(90, 0));

	        //       cenário 3: soma de dois valores sendo um negativo
	         System.out.println(soma.somar(10, -3) + "\n");
	        
	       
	        
	        
	        // ---- TESTES DE SUBTRAÇÃO ----
	        System.out.println("TESTES DE SUBTRAÇÃO:");
	        
	         //     cenário 1: subtração de dois valores inteiros maiores do que 0
	        System.out.println(sub.subtrair(10, 5));

	        //       cenário 2: subtração de dois valores inteiros onde o resultado deve ser negativo
	        System.out.println(sub.subtrair(1, 5));

	        //       cenário 3: subtração de dois valores inteiros iguais
	        System.out.println(sub.subtrair(10, 10) + "\n");
	        
	        
	        
	        // ---- TESTES DE DIVISÃO ----
	        System.out.println("TESTES DE DIVISÃO:");
	       
	         //     cenário 1: divisão de 2 valores inteiros maiores do 0
	        System.out.println(div.dividir(10, 2));

	        //       cenário 2: divisão de dois valores inteiros onde o resultado será em decimal
	        System.out.println(div.dividir(1, 2));

	        //       cenário 3: divisão de dois valores inteiros onde um deles é negativo
	        System.out.println(div.dividir(20, -10) + "\n");
	        
	     
	        
	        // ---- TESTES DE MULTIPLICAÇÃO ----
	        System.out.println("TESTES DE MULTIPLICAÇÃO:");
	        
	          //     cenário 1: multiplicação de dois valores inteiros maiores do que 0
	        System.out.println(mult.multiplicar(4, 4));

	        //       cenário 2: multiplicação de dois valores inteiros onde um deles é 0
	        System.out.println(mult.multiplicar(10, 0));

	        //       cenário 3: multiplicação de dois valores inteiros onde um deles é negativo
	        System.out.println(mult.multiplicar(3, -2) + "\n");
	        

	}

}
