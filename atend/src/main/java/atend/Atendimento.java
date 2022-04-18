package atend;

public class Atendimento {
	
		private String nome;
	    private String cidade;
	    private int telefone;
		
	    // imaginei uma atendente pegando informaçoes de um cliente,
	    // nao sei se conseguir certo.
	    
		public String getnome() {			
		  return nome;
		}

		public void setnome(String nome) {
			this.nome = nome;
		}
		
		public String getcidade() {			
			  return cidade;
			}

		public void setcidade(String cidade) {
				this.cidade = cidade;
			}
			
		public int gettelefone() {			
				  return telefone;
				}

		public void settelefone(int telefone) {
					this.telefone = telefone;
				}

	

}
