package porComposite;

/**
 * Created by yiperu on 6/26/17.
 */
public class XC {
    private int a;
    private boolean b;

    public void m1(){
        System.out.println("Metodo 1");
    }
    public void m2(){
        System.out.println("Metodo 2");
    }

    // Delegacion x Composicion
    public void m4(M5able m5able){
        System.out.println("Algo en Metodo 4");
        m5able.m5();
    }

}
