public class DataHora {
	private Data data;
	private Hora hora;
	
	public DataHora(Data d, Hora h) {
		this.data = d;
		this.hora = h;
	}
	public void setData(Data data) {
		this.data = data;
	}
	public void setHora(Hora hora) {
		this.hora = hora;
	}
	public String toString() {
		return data.toString() + "\n" + hora.toString();
	}
}
