package Controlador;
import static org.junit.jupiter.api.Assertions.*;

import DataCrafters.Controlador.Controlador;
import DataCrafters.Modelo.Articulo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class ControladorTest {

   Controlador controlador;
   @BeforeEach
   public void setUp(){controlador= new Controlador();}


   @Test
   public void testCrearArticulo(){

      Articulo articuloTest = new Articulo("1","Lampara", 35.0, 15, 6.0);

      controlador.crearArticulo("1","Lampara", 35.0, 15, 6.0);
         Articulo resultado = controlador.buscarPorCodigo("1");

         assertEquals(articuloTest, resultado);

      }


   }


