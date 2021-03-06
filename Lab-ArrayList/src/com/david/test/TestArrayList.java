package com.david.test;

import java.util.ArrayList;
import java.util.Iterator;

import com.david.model.Item;

public class TestArrayList {

	public static void main(String[] args) {
		ArrayList<Item> items = new ArrayList<Item>();
		
		items.add(new Item(1, "This is item 1"));
		items.add(new Item(1, "This is item 2"));
		items.add(new Item(1, "This is item 3"));
		items.add(new Item(1, "This is item 4"));
		items.add(new Item(1, "This is item 5"));
		
		//print the third item
		System.out.println(items.get(2));

		//remove the last item
		Item removed = items.remove(items.size()-1);
		System.out.println(removed);
		
		//iterating over a list
		Iterator<Item> iter = items.iterator();
		
		while(iter.hasNext()) {
			Item item = iter.next();
			System.out.println("removing item: " + item);
			iter.remove();
		}
		
		//confirm the size is 0
		System.out.println(items.size());
	}

}
