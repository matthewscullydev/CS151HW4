/**
 * 
 * @author Matthew Scully
 * @version 1.0
 * @since 3-9-22
 * 
 * Course class
 * <p>
 * 
 * This is the ListManipulator class which includes methods to swap largest and smallest, assign to sorted table, and to sort integer arraylists.
 * 
 * </p>
 * 
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;




public class ListManipulator {

	public ListManipulator() {
		// TODO Auto-generated constructor stub
	}
	
	
/** 
 * this sort method will sort the list in ascending or descending order according to the boolean param
 * @param myLst is an arraylist
 * @param ascending is a boolean value which determines which way the list is sorted
 * @return sorted list is returned
 */
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
	
	/**
	 * This method swaps the largest and smallest values of the arraylist
	 * @param myLst integer arraylist input
	 * @return swapped list is returned
	 */
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
	
	/**
	 * table method returns sorted hashmap based on frequency
	 * @param myLst input of arraylist
	 */
	
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
