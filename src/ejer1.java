public class ejer1 {
   public static void main(String[] args) {
       for (int i = 1; i < 100 ; i++) {
           if (i % 7 == 0){
                System.out.println("El numero " +i+ " es múltiplo de 7");

           } if ( i % 13 == 0 ){
               System.out.println("El numero " +i+ " es múltiplo de 13");

           } if ( i % 7 == 0 && i % 13 == 0) {
               System.out.println("El  numero " +i+ " es múltiplo de 7 y de 13");
           }
       }
    }
}
