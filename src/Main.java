// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("llamando metodo numeroIf");
         numeroIf( 0);
        System.out.println("llamando metodo numeroWhile");
         numeroWhile(-5);
        System.out.println("llamando metodo numeroDoWhile");
         numeroDoWhile(1);
        System.out.println("llamando metodo numeroFor");
         numeroFor();
        System.out.println("llamando metodo swicht");
        metodoSwitch ("invierno");

    }

    public static void numeroIf(int numero1) {

        if (numero1 < 0) {
            System.out.println("el numero " + numero1 + " es negativo");
        } else if (numero1 > 0) {
            System.out.println("el numero " + numero1 + " es positivo");
        } else {
            System.out.println("el numero " + numero1 + " es 0");

        }

    }
    public static void numeroWhile( int x){
        while( x < 3){
            x ++;
           System.out.println(x);

        }
    }
    public static void numeroDoWhile( int x){
         do {
             x ++;
             System.out.println(x);

         }while (false);
    }
    public static void numeroFor(){
        for( int i = 0; i <= 3; i ++ ){
            System.out.println(i);
        }
    }
    public static void metodoSwitch(String estacion ){
       switch (estacion) {
           case "verano":
               System.out.println(" la estacion seleccionada  fue verano");
               break;
           case " primavera":
               System.out.println("la estacion seleccionada fue primavera");
               break;
           case "otoño":
               System.out.println(" la estacion seleccionada fue otoño");
               break;
           case "invierno":
               System.out.println("la estacion seleccionada fue invierno");
               break;
           default:
               System.out.println("la estacion seleccionada no es valida");
       }

    }
}
