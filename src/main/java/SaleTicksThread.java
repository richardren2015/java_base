/**
 * 卖票业务，多线程练习
 */
public class SaleTicksThread {

    public static void main(String[] args) {
        Ticks1 t1 = new Ticks1();
        new Thread(t1,"线程1").start();
        new Thread(t1,"窗口2").start();
    }
}


class Ticks1 implements Runnable{
    public void run() {
        System.out.println("卖票了");
    }
}

