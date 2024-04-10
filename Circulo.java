public class Circulo {
	public double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
	}
	
		public double getRaio() {
			return raio;
		}
		public void setRaio(double raio) {
			this.raio = raio;
		}
	
			public double calcArea(double raio) {
				double area;
				area = (raio*raio) * 3.14;
				return area;
			}
	
			public double calcPerimetro(double raio) {
				double peri;
				peri = (2*3.14*raio);
				return peri;
			}
}
