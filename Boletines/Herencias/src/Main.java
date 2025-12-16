public class Main {
    static void main(String[] args) {
        Figura f =  new Circulo(3);

        if (f instanceof Circulo d){
            System.out.println(d.getRadio());
        }

        System.out.println(f.area());



    }



}
