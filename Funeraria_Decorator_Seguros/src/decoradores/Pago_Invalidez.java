package decoradores;

import base.Plan_Seguro_Exequial;

public class Pago_Invalidez extends Decorador_Seguros_Exequiales {

	Plan_Seguro_Exequial seguroExequial;

	public Pago_Invalidez(Plan_Seguro_Exequial seguroExequial) {
		this.seguroExequial = seguroExequial;
	}

	@Override
	public String getDescripcion() {
		return seguroExequial.getDescripcion()
				+ " \n+ Darte un dinero adicional en caso de invalidez y desmembración por accidente. ";
	}

	@Override
	public int costo() {
		return 800000 + seguroExequial.costo();
	}
}
