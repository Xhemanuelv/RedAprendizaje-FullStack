package javapooguia;

import javapooguia.entities.CuentaBancaria;
import javapooguia.services.CuentaBancariaServices;

/**
 * @author xhemanuelv
 */
public class JavaPoo05 {

    public static void main(String[] args) {
        // Cuenta bancaria

        CuentaBancariaServices cbs = new CuentaBancariaServices();
        CuentaBancaria Emanuel = cbs.crearCuenta();
        cbs.depositoCuenta(Emanuel);
        cbs.retiroCuenta(Emanuel);
        cbs.extraccionRapidaCuenta(Emanuel);
        cbs.consultaSaldo(Emanuel);
        cbs.consultarDatos(Emanuel);
    }

}
