package collection_test;
/** 
* @author xxh 	
* @date 创建时间：Sep 2, 2017 4:21:48 PM  
*/
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeMap;

public class TestCd { 
    
    private static void sortByKeyDesc(){
        TreeMap<String, String> tm=new TreeMap<String, String>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        tm.put("a", "ddd");   tm.put("b", "ccc");
        tm.put("c", "bbb");   tm.put("d", "aaa");
        for (String  key : tm.keySet()) {
            System.out.println("key :"+key+",value："+tm.get(key));
        }
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n= sc.nextInt();
        sortByKeyDesc();
    }
}