public class Hora {
	private int hora;
	private int minuto;
	
	public Hora(int h, int m) {
		this.hora = h;
		this.minuto = m;
	}
	
	public int getHora() {
		return hora;
	}
	public void setHora(int h) {
		this.hora = h;
	}
	
	public int getMinuto() {
		return minuto;
	}
	public void setMinuto(int m) {
		this.minuto = m;
	}
	
	public String toString() {
		return hora + ":" + minuto;
	}
	 
}
