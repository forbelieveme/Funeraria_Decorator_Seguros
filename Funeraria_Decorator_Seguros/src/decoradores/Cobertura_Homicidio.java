package decoradores;

import base.Plan_Seguro_Exequial;

public class Cobertura_Homicidio extends Decorador_Seguros_Exequiales {
	Plan_Seguro_Exequial seguroExequial;

	public Cobertura_Homicidio(Plan_Seguro_Exequial seguroExequial) {
		this.seguroExequial = seguroExequial;
	}

	@Override
	public String getDescripcion() {
		return seguroExequial.getDescripcion()
				+ " \n+ Cobertura ante homicidio, accidente y suicidio desde el día en que compras el seguro.";
	}

	@Override
	public int costo() {
		return 450000 + seguroExequial.costo();
	}

}
