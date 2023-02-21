package test;

public class Auto {
	public String modelo;
	public int precio;
	public Asiento[] asientos;
	public String marca;
	public Motor motor;
	public int registro;
	public static int cantidadCreados;
	
	public int cantidadAsientos() {
		int cantidad =0;
		for (int i=0; i<asientos.length;i++) {
			if (asientos[i] instanceof Asiento) {
				cantidad ++;
			}
		}
		return cantidad;
	}
	
	public String verificarIntegridad() {
		if (registro == motor.registro) {
			for (int i =0; i<asientos.length;i++) {
				if (asientos[i] != null) {
					if (asientos[i].registro != registro) {
						return "Las piezas no son originales";
					}
				}
			}return "Auto original";
		}else {
			return "Las piezas no son originales";
		}
	}
}