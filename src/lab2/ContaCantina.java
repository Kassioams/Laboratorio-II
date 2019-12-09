/** 
* Laboratório de Programação 2 - Lab2
*
	
* @author Kassio Silva - 119210551
*/

package lab2;

	/**
	* Representação da criação da conta dos gastos na cantina.  
	* Lugar onde se verá o nome da cantina, a quantidade total comprada e a o valor referente
	
	* @author Kassio Silva - 119210551
	*/

	public class ContaCantina {
		
		/**
		* Representação do nome da cantina onde o aluno fez a compra
		* 
		
		*/

		private String cantina;
		
		/**
		* Representação do valor dos gastos na cantina.
		* 
		
		*/
		
		private int valor;

		/**
		* Representação da quantidade comprada pelo aluno.
		* 
		
		*/
		
		private int quantidade;

		/**
		* Representação do valor já pago de suas dívidas.
		* 
		
		*/
		
		private int pago;

		/**
		* Constrói uma conta com o nome da cantina.
		*

		* @param nomeDaCantina o nome da cantina.
		*/

		public ContaCantina(String nomeDaCantina){
			this.cantina = nomeDaCantina;
			this.quantidade = 0;
			this.valor = 0;
		}

		/**
		* Representa a quantidade de itens comprados.
		* E o valor de cada item.
		
		* @param qtdItens a quantidade de itens.
		* @param valorCentavos o valor desses itens.
		*/
		
		public void cadastraLanche(int qtdItens, int valorCentavos) {
			this.quantidade += qtdItens;
			this.valor += valorCentavos;
		}
		
		/**
		* Calcula o valor já pago pelo aluno à cantina.
		* 
		
		* @param valorCentavos o valor pago.
		*/
		
		public void pagaConta(int valorCentavos) {
			this.pago = valorCentavos;
		}
		
		/**
		* Retorna o valor restante da dívida.
		* 
		
		* @return o valor da dívida.
		*/
		
		public int getFaltaPagar(){
			return (valor - pago);
		}
		
		/**
		* Retorna a String que representa o nome da cantina, a quantidade comprada e o valor da compra. 
		* A representação segue o formato “Nome quantidade valor”.

		*
		* @return a representação em String da conta da cantina.
		*/
		
		public String toString() {
			return (cantina + " " + quantidade + " " + valor);
			}

	}