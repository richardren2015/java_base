import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by hadoop on 2018/4/17 0017.
 * 常见的java排序算法
 * 插入排序、冒泡排序、选择排序、希尔排序 、快速排序、归并排序、堆排序和LST基数排序
 */
public class CommenAlgorithm {

	public static void main(String[] args) {
		CommenAlgorithm ca = new CommenAlgorithm();
		//当前数组
		int[] arr = {40, 20, 30, 5, 50};
		System.out.println(Arrays.toString(arr));
		//插入排序完成以后数组
		int[] arr2 = ca.insertSort(arr);
		System.out.println(Arrays.toString(arr2));

	}

	/**
	 * 插入排序算法
	 * 特点：效率低，容易实现。
	 * 思想：将数组分为两部分，将后部分元素逐一与前部分元素比较，如果当前元素array[i]小，就替换。找到合理位置插入array[i]
	 *
	 * @param arr
	 */
	public int[] insertSort(int[] arr) {
		int[] array = null;
		for (int i=0;i<arr.length,i++){

		}
		return array;
	}
}
