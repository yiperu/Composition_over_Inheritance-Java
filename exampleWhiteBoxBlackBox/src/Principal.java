/**
 * Created by yiperu on 6/26/17.
 */
public class Principal {

    public static void main(String[] args) {
        System.out.println("Hola Henry");

        YH yHerencia = new YH();
        System.out.println("- - - - - -  m1 - - - - - - - - -");
        yHerencia.m1();
        System.out.println("- - - - - -  m2 - - - - - - - - -");
        yHerencia.m2();
        System.out.println("- - - - - -  m3 - - - - - - - - -");
        yHerencia.m3();
        System.out.println("- - - - - -  m4 - - - - - - - - -");
        yHerencia.m4();
        System.out.println("- - - - - -  m5 - - - - - - - - -");
        yHerencia.m5();

//		YC yComposicion = new YC();
//		yComposicion.m4();



    }
}
