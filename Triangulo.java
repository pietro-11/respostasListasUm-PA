public class Triangulo {
	private double ladoA;
	private double ladoB;
	private double ladoC;
	
	public Triangulo(double a, double b, double c) {
		this.ladoA = a;
		this.ladoB = b;
		this.ladoC = c;
	}
	
	public double getLadoA() {
		return ladoA;
	}
	public void setLadoA(double a) {
		this.ladoA = a;
	}
	
	public double getLadoB() {
		return ladoB;
	}
	public void setLadoB(double b) {
		this.ladoB = b;
	}
	
	public double getLadoC() {
		return ladoC;
	}
	public void setLadoC(double c) {
		this.ladoC = c;
	}
	
		public double calcularArea(double base, double altura) {
			double area = (base * altura)/2;
			return area;
		}
		
		public double calcularPerimetro() {
			double peri = (ladoA + ladoB + ladoC);
			return peri;
		}
}
