/**
 * Created by hadoop on 2018/4/18 0018.
 */
public class ExceptionDemo {

	public static void main(String[] args) {
		Throwable t = new Throwable("异常信息");
		System.out.println(t.toString());
		//t.printStackTrace();
		System.out.println(t.getMessage());

		//test();

		byte[] buf = new byte[1024*1024*1024*1024*1024*1024*1024*1024*1024];
		System.out.println("ssss");
	}

	public  static void test(){
		Throwable t = new Throwable();
		t.printStackTrace();
	}
}
