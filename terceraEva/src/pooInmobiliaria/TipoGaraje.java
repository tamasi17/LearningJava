package pooInmobiliaria;

public enum TipoGaraje {

	PUBLICO(20), PRIVADO(90);

	private int costeMantenimiento; // los costes de mantenimiento cambian segun el TipoGaraje
	
	TipoGaraje(int coste) {
		this.costeMantenimiento=coste;
	}
	
	public int getCoste() {
		return costeMantenimiento;
	}
}
