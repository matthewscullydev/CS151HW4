import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;



public class ListManipulator {

	public ListManipulator() {
		// TODO Auto-generated constructor stub
	}
	
	public static ArrayList<Integer> sort(ArrayList<Integer> myLst, Boolean ascending){

		if (ascending)
		{		
			Collections.sort(myLst, new Comparator<Integer>() {
				@Override
				public int compare(Integer s1, Integer s2)
				{
					return s1-s2;
				}			
				
			});
			return myLst;
		}
		

		
		else if(!ascending)
		{
			Collections.sort(myLst, new Comparator<Integer>() {
				@Override
				public int compare(Integer s1, Integer s2)
				{
					return s2-s1;
				}			
				
			});
		}
		return myLst;
	}
	
	
	public static ArrayList<Integer> swapLargestSmallest(ArrayList<Integer> myLst){
		
		int i = 0;
		int maxValue = 0;
		int maxIndex = -1;
		int smallestValue = Integer.MAX_VALUE;
		int smallestIndex = -1;
		
		
				for ( i = 0; i < myLst.size(); i++)
				{
					if(myLst.get(i) > maxValue) {
						maxValue = myLst.get(i);
						maxIndex = i;
					}
					
					if(myLst.get(i) < smallestValue) {
						smallestValue = myLst.get(i);
						smallestIndex = i;
					}
				}
				
		int temp = myLst.get(smallestIndex);
		myLst.set(smallestIndex,myLst.get(maxIndex));
		myLst.set(maxIndex, temp);
		return myLst;

		
		//collections way of doing this is under
		
		/*
		int maxNumber = Collections.max(myLst);
		int smallestNumber = Collections.min(myLst);
		
		int maxIndex = myLst.indexOf(maxNumber);
		int smallestIndex = myLst.indexOf(smallestNumber);

		Collections.swap(myLst, maxIndex, smallestIndex);
		
		return myLst;
		*/
		
		
	}
	
	
	public static void table(ArrayList<Integer> myLst) {
		
		LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<Integer, Integer>();
		ArrayList<Integer> freqOrder = new ArrayList<Integer>();
		LinkedHashMap<Integer, Integer> linkedHashMap2 = new LinkedHashMap<Integer, Integer>();
		   	for (int i = 0; i < myLst.size(); i++) {
		   		
		   		if(linkedHashMap.containsKey(myLst.get(i))) {
		   			linkedHashMap.put(myLst.get(i), linkedHashMap.get(myLst.get(i))+1);		   		 	
		   		}
		   		
		   		else
		   			linkedHashMap.put(myLst.get(i), 1);
		       
		    }
		System.out.println(linkedHashMap);
		
		for(Map.Entry<Integer, Integer> integers : linkedHashMap.entrySet()) {
			freqOrder.add(integers.getValue());
		}
		
		Comparator<Integer> myComparator = new Comparator<Integer>() {
			@Override
			public int compare(Integer p1, Integer p2) {
				return p2-p1;
			}
		};
		
		Collections.sort(freqOrder,myComparator);
		for(int i : freqOrder) {
			for(Map.Entry<Integer, Integer> mapEntry : linkedHashMap.entrySet()) {
				if(mapEntry.getValue().equals(i)) {
					linkedHashMap2.put(mapEntry.getKey(), i);
				}
			}
		}
		
		System.out.println(linkedHashMap2);

	}
	
	
}
