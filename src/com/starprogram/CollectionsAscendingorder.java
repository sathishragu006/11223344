package com.starprogram;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsAscendingorder {
public static void main(String[] args) {
	
	List<String>m = new ArrayList<>();
	m.add("GG");
	m.add("HAH");
	m.add("GUG");
	Collections.sort(m,Collections.reverseOrder());
	System.out.println(m);
}
}
