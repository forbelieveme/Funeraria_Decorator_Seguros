package base;

public class Plan_Basico extends Plan_Seguro_Exequial {

	public Plan_Basico() {
		descripcion = "Plan Basico";
	}

	@Override
	public int costo() {
		return 3000000;
	}

}
