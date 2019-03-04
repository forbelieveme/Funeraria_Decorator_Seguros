package decoradores;

import base.Plan_Seguro_Exequial;

public class Reembolso_Gastos_Funerarios extends Decorador_Seguros_Exequiales {

	Plan_Seguro_Exequial seguroExequial;

	public Reembolso_Gastos_Funerarios(Plan_Seguro_Exequial seguroExequial) {
		this.seguroExequial = seguroExequial;
	}

	@Override
	public String getDescripcion() {
		return seguroExequial.getDescripcion()
				+ " \n+ Entrega a los beneficiarios un respaldo económico en caso de que fallezcas.";
	}

	@Override
	public int costo() {
		return 500000 + seguroExequial.costo();
	}

}
