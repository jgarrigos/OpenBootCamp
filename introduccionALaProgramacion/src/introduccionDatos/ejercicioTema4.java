package introduccionDatos;
public class ejercicioTema4 {
    public static void main(String[] args) {
        /*
        En este ejercicio practicarás las estructuras de control, para ello deberás crear:

        Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
        Pista: Los números inferiores a 0 son negativos y los superiores, positivos.

        Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:

        Incrementar el valor de la variable en uno cada vez que se ejecute.

        Mostrarlo por pantalla cada vez que se ejecute.

        Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.

        Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3,
        se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.

        Por último, para el Switch, deberás crear la variable estación, y distintos case para las cuatro estaciones del año.
        Dependiendo del valor de la variable estación se deberá mandar un mensaje por consola informando de la estación en la que está.
        También habrá que poner un default para cuando el valor de la variable no sea una estación.
         */
        var numero = 0;
        var numeroWhile = 0;
        //var numeroDoWhile = 0;
        var estacion = "VERANO";
        if (numero < 0 ){
            System.out.println("el numero " +numero +" es negativo");
        } else if (numero > 0){
            System.out.println("el numero " + numero + " es positivo");
        } else {
            System.out.println("el numero es " + numero);
        }

        while (numeroWhile < 3){
            numeroWhile ++;
            System.out.println(numeroWhile);
        }
        do {
            numeroWhile ++;
            System.out.println(numeroWhile);
        } while (numeroWhile < 3);

        for (var numeroFor = 0; numeroFor <= 3; numeroFor++)
            System.out.println(numeroFor);

        switch (estacion){
            case "PRIMAVERA":
                System.out.println("Es " + estacion);
            break;
            case "VERANO":
                 System.out.println("Es " + estacion);
            break;
            case "OTOÑO":
                  System.out.println("Es " + estacion);
            break;
            default:
                 System.out.println("Es " + estacion);
        }
        }

    }

