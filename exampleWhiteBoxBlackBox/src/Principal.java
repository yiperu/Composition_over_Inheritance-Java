import porComposite.YC;

/**
 * Created by yiperu on 6/26/17.
 */
public class Principal {

    public static void main(String[] args) {
        System.out.println("Hola Henry");

//        YH yHerencia = new YH();
//        System.out.println("- - - - - -  m1 - - - - - - - - -");
//        yHerencia.m1();
//        System.out.println("- - - - - -  m2 - - - - - - - - -");
//        yHerencia.m2();
//        System.out.println("- - - - - -  m3 - - - - - - - - -");
//        yHerencia.m3();
//        System.out.println("- - - - - -  m4 - - - - - - - - -");
//        yHerencia.m4();
//        System.out.println("- - - - - -  m5 - - - - - - - - -");
//        yHerencia.m5();

        // Esto debería mostrar lo mismo por composicion
		YC yComposicion = new YC();
        System.out.println("- - - - - -  m1 - - - - - - - - -");
        yComposicion.m1();
        System.out.println("- - - - - -  m2 - - - - - - - - -");
        yComposicion.m2();
        System.out.println("- - - - - -  m3 - - - - - - - - -");
        yComposicion.m3();
        System.out.println("- - - - - -  m4 - - - - - - - - -");
        yComposicion.m4();
        System.out.println("- - - - - -  m5 - - - - - - - - -");
        yComposicion.m5();


    }
}
