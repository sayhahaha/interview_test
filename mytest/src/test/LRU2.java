package test;
/** 
* @author xxh 	
* @date ����ʱ�䣺Sep 15, 2017 8:11:49 PM  
*/
import java.util.ArrayList;
import java.util.List;


public class LRU2 {
	/**
	 * �ڴ��ĸ���
	 */
	public static final int N = 5;
	/**
	 * �ڴ������
	 */
	Object[] array = new Object[N];
	private int size;
	
	public LRU2() {
	}
	/**
	 * �ж��ڴ����Ƿ�Ϊ��
	 * @return
	 */
	public boolean isEmpty() {
		if(size == 0) {
			return true;
		} else {
			return false;
		}
	}
	/**
	 * �ж��ڴ����Ƿ�ﵽ���ֵ
	 * @return
	 */
	public boolean isOutOfBoundary() {
		if(size >=N) {
			return true;
		} else {
			return false;
		}
	}
	/**
	 * ����Ԫ��o�������е�λ��
	 * @param o
	 * @return
	 */
	public int indexOfElement(Object o) {
		for(int i=0; i<N; i++) { 
			if(o == array[i]) {
				return i;
			}
		}
		return -1;
	}	
	/**
	 * ���µ�����o��Ҫ�����ڴ�
	 * @param o
	 * @return �Ƴ��ڴ���������
	 */
	public Object push(Object o) {
		int t = -1;
		if(!isOutOfBoundary() && indexOfElement(o) == -1){
			array[size] = o;
			size ++;
		} else if(isOutOfBoundary() && indexOfElement(o) == -1){
			for(int i=0; i<size-1; i++) {
				array[i] = array[i+1];				
			}
			array[size-1] = o;
		} else {
			t = indexOfElement(o);
			for(int i=t; i<size-1; i++) {
				array[i] = array[i+1];
			}
			array[size-1] = o;
		}
		if( -1 == t) {
			return null;
		} else {
			return array[t];
		}
	}
	/**
	 * ����ڴ����еĸ�����
	 */
	public void showMemoryBlock() {
		for(int i=0; i<size; i++) {
			System.out.print(array[i]);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer iter[] = {4,7,0,7,1,0,1,2,1,2,6};
		LRU2 lru = new LRU2();
		for(int i=0; i<iter.length; i++) {
			lru.push(iter[i]);
			lru.showMemoryBlock();
			System.out.println();
		}
	}

}
