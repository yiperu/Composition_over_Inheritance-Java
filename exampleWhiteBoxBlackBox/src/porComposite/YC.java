package porComposite;

/**
 * Created by yiperu on 6/26/17.
 */
public class YC implements M5able {

    private float c;
    private XC xc = new XC();

    public void m1(){
        xc.m1();
    }

    public void m2() {
        xc.m2();
        System.out.println("Metodo 2 desde YC");
    }

    public void m3(){
        System.out.println("Metodo 3");
    }

    public void m4(){
        xc.m4(this);
    }

    @Override
    public void m5() {
        System.out.println("Implementacion M5");
    }

}
