package decoradores;

import base.Plan_Seguro_Exequial;

public class Pago_Hospitalizacion extends Decorador_Seguros_Exequiales {

	Plan_Seguro_Exequial seguroExequial;

	public Pago_Hospitalizacion(Plan_Seguro_Exequial seguroExequial) {
		this.seguroExequial = seguroExequial;
	}

	@Override
	public String getDescripcion() {
		return seguroExequial.getDescripcion()
				+ " \n+ Pago por cada día que estés hospitalizado como producto de un accidente. ";
	}

	@Override
	public int costo() {
		return 700000 + seguroExequial.costo();
	}
}
