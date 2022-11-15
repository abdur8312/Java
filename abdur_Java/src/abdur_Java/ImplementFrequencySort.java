package abdur_Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java12.FrequencySort;

public class ImplementFrequencySort {
//	public static void main(String[] args) {
//		FrequencySort obj = new FrequencySort();
//		int[] input = {2, 2, 2, 33, 33, 4, 5, 5, 5, 5, 5, 5};
//		Map<Integer, Integer> mp = obj.createMap(input);
//		System.out.println("Map : " + mp);
//		Map<Integer, Integer> smp = obj.sortMap(mp);
//		System.out.println("Frequency sort : " + smp);
//	}
//	public static void main(String[] args) {
//		Map<Integer,Integer> mp = new HashMap<Integer,Integer>();
//		mp.put(33, 2);
//		mp.put(2, 3);
//		mp.put(4, 1);
//		mp.put(5, 6);
//		System.out.println(mp);
//		
//		List<Entry<Integer, Integer>> lis = new ArrayList<Entry<Integer, Integer>>(mp.entrySet());
//		System.out.println(lis);
//		Collections.sort(lis, new Comparator<Entry<Integer, Integer>>(){
//
//			@Override
//			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
//				return o2.getValue().compareTo(o1.getValue());
//			}
//			
//		});
//		System.out.println(lis);
//	}
	//30-12-2020
	//31-12-2021
	//01-01-2022
	
	
//	public static void main(String[] args) {
//		List<Integer> arr = new ArrayList<Integer>();
//		arr.add(4);arr.add(5);arr.add(3);arr.add(7);arr.add(2);
//		System.out.println(arr);
//		int pivot = arr.get(0);
//		int start = 0, end = arr.size()-1;
//		while(start < end) {
//			while(arr.get(start) <= pivot) {
//				start += 1;
//				if(start > end) {
//					break;
//				}
//			}
//			while(arr.get(end) > pivot) {
//				end -= 1;
//			}
//			if(start < end) {
//				int temp = arr.get(start);
//				arr.set(start, arr.get(end));
//				arr.set(end, temp);
//			}
//		}
//		int temp1 = arr.get(0);
//		arr.set(0, arr.get(end));
//		arr.set(end, temp1);
//		System.out.println(arr);
//	}
}
