package base;

public class Plan_Global extends Plan_Seguro_Exequial {

	public Plan_Global() {
		descripcion = "Plan Global";
	}

	@Override
	public int costo() {
		return 7000000;
	}

}
