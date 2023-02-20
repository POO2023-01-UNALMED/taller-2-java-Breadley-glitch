package test;

public class Asiento {
	public String color;
	public int precio;
	public int regirstro;
	
	public void cambiarColor(String color) {
		if (color == "rojo"){
			this.color = "rojo";
		}if (color == "verde"){
			this.color = "verde";
		}if (color == "amarillo"){
			this.color = "amarillo";
		}if (color == "negro") {
			this.color = "negro";
		}if (color == "blanco") {
			this.color = "blanco";
		}
	}
}
