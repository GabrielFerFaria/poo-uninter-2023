package empresa;

public class Horario {
	int hora,minuto,segundo;
	
	public int getHora() {
		return hora;
	}
	
	public void setHora(int hora) {
		if(hora>=0 && hora<=23) {
		this.hora=hora;
	}
		else {
			System.out.println("Hora invalida");
		}
	}
	
	public int getMinuto() {
		return minuto;
	}
	
	public void setMinuto(int minuto) {
		if(minuto>=0 && minuto<=59) {
		this.minuto=minuto;
	}
		else {
			System.out.println("Minutos invalido invalidos");
		}
	}public int getSegundo() {
		return segundo;
	}
	
	public void setSegundo(int segundo) {
		if(segundo>=0 && segundo<=59) {
		this.segundo=segundo;
	}
		else {
			System.out.println("Segundos invalidos");
		}
	}
}
