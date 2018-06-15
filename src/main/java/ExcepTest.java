public class ExcepTest {

    public static void main(String[] args) {

        System.out.println("1、除法计算开始");
        try{
            int x = Integer.parseInt(args[0]); // 接收参数
            int y = Integer.parseInt(args[1]); // 接收参数
            int result = x / y;
            System.out.println("2、除法计算结果:" + result);
        }catch(ArithmeticException e){
           // System.out.println(e);  //异常处理，输出错误信息
            e.printStackTrace();//异常详细信息
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }catch (NumberFormatException e){
            e.printStackTrace();
        }
        finally {
            System.out.println("异常处理结束！！！");//处理完异常以后，输出信息
        }

        System.out.println("3、除法计算结束");
    }
}
