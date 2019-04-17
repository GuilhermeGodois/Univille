/*Crie um programa capaz de resolver esses 3 problemas:
1)Jonny esta tendo dificuldade para resolver problemas com bhaskara,
para ajudar Jonny voce deve criar uma calculadora baskhara capaz de indicar o delta e os valores x1 e x2.
2)Pedro esta saindo de viagem e gostaria de saber quantos litros de gasolina ele gastou de um trecho ao outro
crie um programa que defina quantos litros Pedro gastou.
3) um predio possui um total de 10 andares e em cada andar existem 8 apartamentos. O dono do prédio 
resolveu recolher os seguintes dados:
numero de apartamentos sem moradores 
andar com a maior quantidade de moradores
Quantos moradores existem no total
preencha a matriz aelatoriamente com numeros no valor de 0 a 6..*/

package test;
import java.util.Scanner;//importar pacote scanner
public class Trabalho {
@SuppressWarnings("resource")
public static void main(String[] args) {
	
	Scanner input = new Scanner( System.in ); //chamar pacote scanner
	
	System.out.println("digite 1 calculadora de bhaskara, 2 para calcular o gasto de gasolina e 3 para calcular calcular as informacoes do predio");//selecionar opcao do switch
	int opcao = input.nextInt();
	
	//criar switch e colocar opcao como escolha de case
	switch(opcao){
	 	
		case 1:
		 		
		 		double x1, x2, a, b, c, delta;//Definir variaveis double
		 		
		 		//definir valores para as variaveis a,b e c
		 		System.out.println("digite os valores de a, b e c");
		 		a = input.nextDouble();
		 		b = input.nextDouble();
		 		c = input.nextDouble();
		 		System.out.println("a="+a+"b="+b+"c="+c);
		 		
		 		//calcula o delta
		 		delta = (Math.pow(b, 2)) - (4 * a * c);
		 		System.out.println("delta="+delta);
		  			
		  			
		 		//calculo do x1 e x2, so pode ocorrer caso delta seja maior ou igual a 0
		 		if ( delta < 0 ){
		 			System.out.println("Delta não possui raiz");
		 			System.exit(0);
		 		}
		 		else{
		 			
		 			x1 = ((-b + (Math.sqrt (delta))) / (2*a));//Math.sqrt e utilizado para retornar a raiz quadrado de um numero, no caso o delta.
		 			x2 = (( b + (Math.sqrt (delta))) / (2*a));
		 			System.out.println("x1="+x1+ "x2="+x2);
		 			break; 
		 		    }
		 		    
	       			
		 	  
	 	case 2:
	    // Bloco de codigo
		  double Consumogasolina; // media de combustível por km 
		  double distancia1; // distancia inicial
		  double distancia2; // distancia final 
		  double distanciatotal; // km percorridos
		  double consumo; // combustivel gasto
		  
		  System.out.print("Informe a quantidade de litros consumidos:" );//inserir litros consumidos
		  consumo = input.nextDouble();
		  
		  System.out.print("Informe a distancia inicial em kilometros: " );//Inserir a posicao inicial
		  distancia1 = input.nextDouble();
		  
		  System.out.print("Informe a distancia final em kilometros: " );//Inserir posicao final
		  distancia2 = input.nextDouble();
		  
		  distanciatotal = distancia2 - distancia1;// kilometro total e igual a distancia final - a inicial
		  Consumogasolina = distanciatotal / consumo;// a gasolina gasta e a divisao  
		  
		  System.out.println("voce percorreu um total de" +distanciatotal+ "Kilometros");
		  System.out.println("A media de gasolina consumida e de" +Consumogasolina+ "litros por kilometro percorrido");
		  break;
	 
	  case 3:
		int R[][] = new int [10][8];//define matriz
	        int somatoria = 0, naoocupado = 0, maiornumero = 0, somatoridom;
	        
	       
	        for (int i = 0; i < 10; i++){ //laco de repeticao que servira para gerar automaticamente os moradores de cada andar.
	            for (int j = 0; j < R[i].length; j++){
	                do {
	                    R[i][j] = (int) (100 * Math.random());// gera randomicamente um numero de habitantes
	                } while ((R[i][j] < 0) || (R[i][j] > 6));
	            }
	        }
		for (int i = 0; i < 10; i++){
	            System.out.println();
	            somatoridom = 0;
	            	for (int j = 0; j < R[i].length; j++){//define o total de quartos nao ocupados
	            		System.out.print(R[i][j] + " ");
	            				if (R[i][j] == 0){
	            				naoocupado ++;//conta quartos nao ocupados
	                    }
	               
	                    		somatoria += R[i][j];//soma total de moradores
	                    		somatoridom += R[i][j];
	            }
	           
	            				if (somatoridom > maiornumero){  //define andar com maior numero
	            				maiornumero = somatoridom; 
	            }
	        }
	        maiornumero += 1; 
	        System.out.println();
	        
	        System.out.println("O andar de numero " + maiornumero + "e o andar que possue a maior quantidade de individuos");
	        
	        System.out.println("Existem o total de" + somatoria + " moradores no domicilio");
	        
	        System.out.println("Existem o total de " + naoocupado + " apartamentos nao ocupados");
	        
	        
	        }
		 

}
}

