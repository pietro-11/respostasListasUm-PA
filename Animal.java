public class Animal {
	public String nome;
	public String tipo;
	
		public Animal(String nome, String tipo) {
			this.nome = nome;
			this.tipo = tipo;
		}
		
			public String getNome() {
				return nome;
			}
			public void setNome(String nome) {
				this.nome = nome;
			}
			
			public String getTipo() {
				return tipo;
			}
			public void setTipo(String tipo) {
				this.tipo = tipo;
			}
			
				public String emitirSom(String nome) {
					return "SOM DO "+ nome;
				}
}
