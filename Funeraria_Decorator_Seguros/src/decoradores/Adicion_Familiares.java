package decoradores;

import base.Plan_Seguro_Exequial;

public class Adicion_Familiares extends Decorador_Seguros_Exequiales {

	Plan_Seguro_Exequial seguroExequial;

	public Adicion_Familiares(Plan_Seguro_Exequial seguroExequial) {
		this.seguroExequial = seguroExequial;
	}

	@Override
	public String getDescripcion() {
		return seguroExequial.getDescripcion()
				+ " \n+ Posibilidad de incluir personas adicionales dentro del grupo familiar.";
	}

	@Override
	public int costo() {
		return 650000 + seguroExequial.costo();
	}

}
