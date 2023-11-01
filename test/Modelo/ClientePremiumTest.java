package Modelo;

import static org.junit.jupiter.api.Assertions.*;
import DataCrafters.Modelo.ClientePremium;
import org.junit.jupiter.api.Test;

public class ClientePremiumTest {
    @Test

    public void testCalculoDescuentoGastosEnvio(){

        ClientePremium cliente =new ClientePremium("Cristina", "Mallorca 21", "123456A", "sinsentido@gmail.com");

        double gastosEnvioSinDescuento = 50;
        double expected = 50.0 *(1-cliente.descuentoEnv());

        double resultado = cliente.calcularDtoGastosEnvio(gastosEnvioSinDescuento);
        assertEquals(expected, resultado);



    }


}
