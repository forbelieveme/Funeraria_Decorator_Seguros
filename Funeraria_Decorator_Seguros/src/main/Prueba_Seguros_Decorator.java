package main;

import base.Plan_Basico;
import base.Plan_Clasico;
import base.Plan_Global;
import base.Plan_Seguro_Exequial;
import decoradores.Adicion_Familiares;
import decoradores.Cobertura_Homicidio;
import decoradores.Pago_Hospitalizacion;
import decoradores.Pago_Invalidez;
import decoradores.Reembolso_Gastos_Funerarios;
import singleton.Impresora;

public class Prueba_Seguros_Decorator {

	public static void main(String[] args) {

		Plan_Seguro_Exequial seguro = new Plan_Basico();
		seguro = new Adicion_Familiares(seguro);
		seguro = new Cobertura_Homicidio(seguro);
		Impresora.getInstance().imprimir(seguro.getDescripcion());
		Impresora.getInstance().imprimir("Costo: " + seguro.costo());

		Plan_Seguro_Exequial seguro1 = new Plan_Clasico();
		seguro1 = new Reembolso_Gastos_Funerarios(seguro1);
		Impresora.getInstance().imprimir(seguro1.getDescripcion());
		Impresora.getInstance().imprimir("Costo: " + seguro1.costo());

		Plan_Seguro_Exequial seguro2 = new Plan_Global();
		seguro2 = new Pago_Hospitalizacion(seguro2);
		seguro2 = new Pago_Invalidez(seguro2);
		Impresora.getInstance().imprimir(seguro2.getDescripcion());
		Impresora.getInstance().imprimir("Costo: " + seguro2.costo());

	}

}
