package java12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class FrequencySort {
	public Map<Integer,Integer> createMap(int[] input){
		Map<Integer,Integer> mp = new HashMap<Integer,Integer>();
		int count = 1;
		for(int j : input) {
			if(mp.get(j) == null) {
				mp.put(j, count);
			}else if(mp.get(j) != null) {
				int temp = mp.get(j);
				mp.put(j, temp += 1);
			}
		}
		return mp;
	}
	
	public Map<Integer,Integer> sortMap(Map<Integer,Integer> mp){
		List<Entry<Integer,Integer>> lis = new ArrayList<Entry<Integer, Integer>>(mp.entrySet());
		Collections.sort(lis, new Comparator<Entry<Integer,Integer>>(){
			public int compare(Entry<Integer, Integer> o1,Entry<Integer, Integer> o2) {
				return o2.getValue().compareTo(o1.getValue());
			}
		});
		Map<Integer,Integer> sortMap = new LinkedHashMap<Integer,Integer>();
		for(Entry<Integer, Integer> entry : lis) {
			sortMap.put(entry.getKey(), entry.getValue());
		}
		return sortMap;
	}
}
