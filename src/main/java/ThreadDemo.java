/**
 * Created by hadoop on 2018/4/19 0019.
 */
public class ThreadDemo {

	public static void main(String[] args) {
//		Thread2 t1 = new Thread2("线程A");
//		Thread2 t2 = new Thread2("线程B");
//		new Thread(t1).start();
//		new Thread(t2).start();

		Thread1 t3 = new Thread1("线程C");
		Thread1 t4 = new Thread1("线程D");
		t3.start();
		t4.start();

	}
}

/**
 * 继承Thread类C
 */
class Thread1 extends Thread {
	//线程名称
	private String Message;

	public Thread1(String Message) {
		this.Message = Message;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Message + ":  " + i);
			try{
				Thread.sleep(100);
			}catch (InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}

/**
 * 实现Runable接口
 */
class Thread2 implements Runnable {
	//线程名称
	private String Message;

	public Thread2(String Message) {
		this.Message = Message;
	}

	@Override
	public void run() {

		for (int i = 0; i < 5; i++) {
			System.out.println(Message + ":  " + i);
		}

	}
}