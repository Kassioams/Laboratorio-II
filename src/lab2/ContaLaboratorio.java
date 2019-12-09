/** 
* Laboratório de Programação 2 - Lab2
*
	
* @author Kassio Silva - 119210551
*/

package lab2;

		/**
		* Representação da criação das contas dos laboratórios de um aluno matriculado na * UFCG. 
		* Todo aluno tem um conta para poder acessar os laboratórios da faculdade.

		* @author Kassio Silva - 119210551
		*/

	public class ContaLaboratorio{
		
		/**
		* Representação do nome da conta do aluno.
		*
		
		*/
		
		private String contaLaboratorio;

		/**
		* Representação do limite de espaço disponível no sistema de armazenamento dos laboratórios para o uso do estudante.
		*
		
		*/

		private int cota;
		
		/**
		* Representação do acréscimo ou diminuição no espaço de armazenamento da conta.
		*
		
		*/
		
		private int espacoDaConta;

		/**
		* Constrói uma conta de laboratório com o nome desejado e de espaço padrão.
		*
	
		*@param contaLab o nome do conta do laboratório.
		*/
		
		public ContaLaboratorio(String contaLab) {
			this.contaLaboratorio = contaLab;
			this.cota = 2000;
			this.espacoDaConta = 0;
		}

		/**
		* Constrói uma conta de laboratório com o nome desejado e de espaço personalizado pelo aluno.
		* Toda conta começa com o espaco da conta zerado.
		*

		*@param contaLab contaLab o nome do conta do laboratório.
		*@param cota o valor escolhido para o espaço da conta.
		*/

		public ContaLaboratorio(String contaLab, int cota) {
			this.contaLaboratorio = contaLab;
			this.cota = cota;
			this.espacoDaConta = 0;
		}
		
		/**
		* Representa a quantidade para se liberar espaço para a conta do usuário.
		*
	 
		* @param mbytes o valor a se adicionar espaço de memória.
		*/
		
		public void consomeEspaco(int mbytes) {
			this.espacoDaConta += mbytes;
		}

		/**
		* Representa a quantidade para diminuir espaço para a conta do usuário.
		*

		* @param mbytes o valor a se diminuir no espaço de memória.
		*/
		
		public void liberaEspaco(int mbytes) {
			this.espacoDaConta -= mbytes;
		}
		
		/**	
		* Retorna um valor de tipo booleano que representa se o espaço da conta excedeu o tamanho padrão.
		* A representação segue o formato true ou false.
		*
		
		* @return a representação, se o tamanho se execeu ou não.
		*/
		
		public boolean atingiuCota() {
			boolean atingiuCota = false ;
			if (this.espacoDaConta >= 2000) {
				atingiuCota = true;
			} 
			return atingiuCota;
		}
								

		/**
		* Retorna a String que representa o conta do aluno, o espaço da conta e a cota. 
		* A representação segue o formato “Nome espaço / cota”.

		*
		* @return a representação em String da conta.
		*/
		
		public String toString() {
			return (contaLaboratorio + " " + espacoDaConta + "/" + cota);
		}

	}