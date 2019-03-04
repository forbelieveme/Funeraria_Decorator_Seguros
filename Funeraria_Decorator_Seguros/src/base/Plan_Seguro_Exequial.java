package base;

public abstract class Plan_Seguro_Exequial {

	String descripcion = "Plan Desconocido";

	public String getDescripcion() {
		return descripcion;
	}

	public abstract int costo();

}
