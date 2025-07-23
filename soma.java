public class soma {
	public static void main(String[] args){
		
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