package introduccionDatos;

import java.sql.SQLOutput;

public class switchCase {
    public static void main(String[] args) {
        /*
        Interruptor o Discierne

        debemos de poner break en cada caso, si no se ejecutará todo lo que haya debajo del case.


        var estacion = "VERANO";
        switch(estacion){
            case "VERANO":
                System.out.println("es verano");
                break;
            case "INVIERNO":
                System.out.println("es invierno");
                break;
            default:
                System.out.println(VERANO);
          */
        var hoy_es = "MARTES";
        switch (hoy_es){
            case "LUNES":
            case "MARTES":
            case "MIERCOES":
            case "JUEVES":
            case "VIERNES":
                System.out.println("hoy es laborable");
                break;
            default:
                System.out.println("hoy NO es laborable");
        }
    }
}
