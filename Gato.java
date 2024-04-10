public class Gato {
	private String nome;
	private String raca;
	private int idade;
	
		public Gato(String n, String r, int i) {
			this.nome = n;
			this.raca = r;
			this.idade = i;
		}
		
		public String getNome() {
			return nome;
		}
		public void setNome(String n) {
			this.nome = n;
		}
		
		public String getRaca() {
			return raca;
		}
		public void setRaca(String r) {
			this.raca = r;
		}
		public int getIdade() {
			return idade;
		}
		public void setIdade(int i) {
			this.idade = i;
		}
		
			public String miar() {
				return "Miau!";
			}
}
