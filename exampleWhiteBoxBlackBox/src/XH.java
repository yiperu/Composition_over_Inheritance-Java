/**
 * Created by yiperu on 6/26/17.
 */
abstract public class XH {
    private int a;
    private boolean b;

    public void m1(){
        System.out.println("Metodo 1");
    }
    public void m2(){
        System.out.println("Metodo 2");
    }

    // un metodo llama a un metodo abstracto de la propia clase
    public void m4(){
        System.out.println("Algo en Metodo 4");
        this.m5();
    }

    public abstract void m5();

}


