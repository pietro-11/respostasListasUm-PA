public class Produto {
	private String nome;
	private double preco;
	private int quantidade;
	
		public Produto(String n, double p, int q) {
			this.nome = n;
			this.preco = p;
			this.quantidade = q;
		}
		
		public String getNome() {
			return nome;
		}
		public void setNome(String n) {
			this.nome = n;
		}
		
		public double getPreco() {
			return preco;
		}
		public void setPrevo(double p) {
			this.preco = p;
		}
		
		public int getQuantidade() {
			return quantidade;
		}
		public void setQuantidade(int q) {
			this.quantidade = q;
		}
		
		 public double calcTotal() {
			 double total;
			 total = (preco * quantidade);
			 
			 return total;
		 }
}
