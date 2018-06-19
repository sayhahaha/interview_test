package collection_test;
/** 
* @author xxh 	
* @date 创建时间：Sep 2, 2017 4:28:02 PM  
*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapSortValue {
    
    private static void sortByValueDesc(Map<String, Integer> tm){
//        Map<String, String> tm=new TreeMap<String, String>();
//        tm.put("a", 4);   tm.put("b", 2);
//        tm.put("c", 3);   tm.put("d", 1);
         //这里将map.entrySet()转换成list
        List<Map.Entry<String,Integer>> list = new ArrayList<Map.Entry<String,Integer>>(tm.entrySet());
        //然后通过比较器来实现排序
        
        Collections.sort(list,new Comparator<Map.Entry<String,Integer>>() {
            //升序排序
            @Override
            public int compare(Entry<String, Integer> o1,
                    Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        
        for(Map.Entry<String,Integer> mapping:list){ 
               System.out.println(mapping.getKey()+":"+mapping.getValue()); 
          }

    }
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n= Integer.valueOf(sc.nextLine());
    	Map<String, Integer>map=new HashMap<String, Integer>();
    	String str[]=null;
    	for(int i=0;i<n;i++)
    	{
    		str= sc.nextLine().split(" ");
    		map.put(str[0], Integer.valueOf(str[1]));
    	}
    	sortByValueDesc(map);

    }
}