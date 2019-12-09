/** 
* Laboratório de Programação 2 - Lab2
*
	
* @author Kassio Silva - 119210551
*/

package lab2;

	/** 
	* Representação da criação do estado de saúde do aluno 
	* Lugar onde se verá como está a saúde do aluno
	
	* @author Kassio Silva - 119210551
	*/

	public class Saude {
		
		/**
		 * Representação do estado de saúde mental.
		 *
	
		 */
	
		private String saudeMental;
	
		/**
		* Representação do estado de saúde física.
		*
	
		*/
	
		private String saudeFisica;
	
		/**
		* Constrói a representação inicial da saúde do aluno
		* 
	
		*/

		public Saude() {
			this.saudeFisica = "boa";
			this.saudeMental = "boa";
		}
	
		/**
		* Representação da atual da saúde mental do aluno.
		* 
	
		* @param valor o estado da saúde mental.
		*/
	
		public void defineSaudeMental(String valor) {
			this.saudeMental = valor;
		}

		/**
		* Representação da atual da saúde física do aluno.
		*

		*@param valor o estado da saúde física.
		*/
	
		public void defineSaudeFisica(String valor) {
			this.saudeFisica = valor;
		}
	
		/**
		* Representação da avaliação geral, analizando os dois tipos de saúde.
		* Se ambas estiverem boas, a saúde geral é boa.
		* Se ambas estiverem fraca a saúde geral é fraca.
		* Se uma das duas estiver fraca, a saúde geral é ok.
	
		 *@return a avaliação da saúde do aluno.
		 */
	
		public String getStatusGeral() {
			String saudeGeral = "";
			if (saudeMental.equals("boa") && (saudeFisica.equals("boa"))) {
				saudeGeral = "boa";
			} 
			else if (saudeMental.equals("fraca") && (saudeFisica.equals("fraca"))) {
				saudeGeral = "fraca";
			}
			else {
				saudeGeral = "ok";
			}
			return saudeGeral;
		}
	}
