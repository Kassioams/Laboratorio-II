/** 
* Laboratório de Programação 2 - Lab2
*
	
* @author Kassio Silva - 119210551
*/

package lab2;

import java.util.Arrays;

	/**
	* Representação da criação do histórico do aluno.  
	* Lugar onde se verá as notas das disciplinas, a media delas e as horas estudadas.

	* @author Kassio Silva - 119210551
	*/
		
	public class Disciplina{
		
		/**
		* Representação do nome da disciplina.
		* 
		
		*/
		
		private String Disciplina;
		
		/**
		* Representação das notas do aluno.
		* 
		
		*/
		
		private double[] notas = {0.0,0.0,0.0,0.0};
		
		/**
		* Representação das horas de estudo do aluno.
		* 
		
		*/
		
		private int horasDeEstudo;

		/**
		* Constrói uma disciplina com o seu devido nome.
		*

		* @param nomeDisciplina o nome da disciplina.
		*/
		
		public Disciplina(String nomeDisciplina) {
			this.Disciplina = nomeDisciplina;
			this.horasDeEstudo = 0;

		}

		/**
		* Representa o acréscimo das horas já estudadas pelo aluno.
		* 
		
		* @param horas as horas que foram estudadas.
		*/
		
		public void cadastraHoras(int horas) {
			this.horasDeEstudo += horas;
		}
		
		/**
		* Mostra a alocação das notas para dentro do array.
		* Dependendo o valor indicado a nota será alocada para o espaço determinado. 
		* 
		
		* @param nota a numeração da nota.
		* @param valorNota o valor da nota refrente a sua numeração.
		*/
		
		public void cadastraNota(int nota, double valorNota) {
			if (nota == 1) {
				notas[0] = valorNota;
			}
			else if (nota == 2) {
				notas[1] = valorNota;
			}
			else if (nota == 3) {
				notas[2] = valorNota;
			}
			else {
				notas[3] = valorNota;
			}
		}
		
		/**
		* Retorna o valor da média das notas do aluno.
	
		* @return a média, a soma dividida pela quantidade de notas.
		*/
		
		public double media() {
			double soma = 0;
			for (double numero : notas){
		        soma += numero;
		    }
			return soma / notas.length;
		}
		
		/**
		* Retorna um valor de tipo booleano que representa se o aluno está aprovado ou não.
		* A representação segue o formato true ou false.

		*
		* @return a representação se o aluno reprovou ou não.
		*/
		
		public boolean aprovado() {
			if (media() >= 7.0) {
				return true;
			}
			else {
				return false;
			}
		}

		/**
		* Retorna a String que representa a disciplina, as horas estudadas, a media, e as notas do aluno. 
		* A representação segue o formato “disciplina horas media [notas]”.

		* @return a representação do histórico do aluno.
		*/
		
		public String toString() {
			return (Disciplina + " " + horasDeEstudo + " " + media() + " " + Arrays.toString(notas));
		}

	}