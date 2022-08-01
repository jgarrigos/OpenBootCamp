package introduccionDatos;

public class condicionales {
    /*
    LÓGICAS
        "Y" &&
        "O" ||
    COMPARATIVAS
        "MAYOR QUE" >
        "MENOR QUE" <
        "MAYOR O IGUAL QUE" >=
        "MENOR O IGUAL QUE"<=
        "IGUAL A" ==
        "DISTINTO A " !=

     */
    public static void main(String[] args) {
        String estacion = "verano";

        if (estacion == "primavera") {
            System.out.println("Es primavera");
        } else if (estacion == "verano") {
            System.out.println("Es verano");
        }   else {
            System.out.println("Es otra estación");
        }
        }
    }
