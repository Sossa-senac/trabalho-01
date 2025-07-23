
public class codigo {
	public static void main(String[] args) {
		java.util.Scanner nota = new java.util.Scanner(System.in);

		System.out.println("Qual foi a sua nota final:? ");
		float num = nota.nextFloat();
		
		if (num >= 7) {
			System.out.println("Parabéns! você está aprovado ");

		//Colocando mais uma opção que possibilite a realização de uma recuperação ao aluno com nota maior que 4

		}elif (num > 4) {
			System.out.println("Você está em recuperação.")
		
		//Se a nota for menor que 4 aí ele estará em recuperação

		}else {
			System.out.println("BUÁ BUÁ, ");
			
			nota.close();
		}
	
	java.util.Scanner soma = new java.util.Scanner(System.in); //cria um objeto pra ser usado com o construtor da biblioteca
		
		/* é usado o 'System.out.println' pra dar uma imagem do que eu quero que apareça e uso 'int n1 = soma.nextInt' 
		pra que seja possivel o usuario digitar e oq digitar vai ser armazenado na variavel n1*/
		System.out.println("digite o primeiro número ");
		int n1 = soma.nextInt();
		
		/* é usado o 'System.out.println' pra dar uma imagem do que eu quero que apareça e uso 'int n2 = soma.nextInt();' 
		pra que seja possivel o usuario digitar e oq digitar vai ser armazenado na variavel n2*/
		System.out.println("digite o segundo número ");
		int n2 = soma.nextInt();
		
		//é usado denovo o 'System.out.println' mas dessa vez so pra projetar a soma das duas variaveis
		System.out.println(n1 + n2);
		
		// é usado o '.close' pra poder fechar o objeto criado pelo Scanner
		soma.close();
		}
}
