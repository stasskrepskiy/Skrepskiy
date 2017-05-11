package Practicaltask1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.*;



public class Coll {
	
	public static void main(String[] args){
	List <Integer> myList = new ArrayList <>(10);
	//myList = Arrays.asList(2,4,10,21,1);
	for (int i=1; i<11; i++){
		myList.add(i+11);
		}
	System.out.println(myList);
	List <Integer> newList = new ArrayList <>();
	for (int i=0; i<myList.size(); i++){
		if(myList.get(i)>5){
			newList.add(i);
	}
		}
	Iterator<Integer> it = myList.iterator();
	while (it.hasNext()){
		if(it.next()>20){
			it.remove();
		}
	}
	
	System.out.println(myList);
	myList.add(2, 1);
	myList.add(8, -3);
	myList.add(5, -4);
	System.out.println(myList);
	Collections.sort(myList);
	System.out.println(myList);
	
	}

}


