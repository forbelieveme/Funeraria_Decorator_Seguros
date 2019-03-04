package base;

public class Plan_Clasico extends Plan_Seguro_Exequial {

	public Plan_Clasico() {
		descripcion = "Plan Clasico";
	}

	@Override
	public int costo() {
		return 5000000;
	}

}
