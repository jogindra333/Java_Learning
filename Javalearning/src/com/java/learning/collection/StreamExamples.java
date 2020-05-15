package com.java.learning.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExamples {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("jogi");
		names.add("jogesh");
		names.add("Rama");
		names.add("Krishna");
		names.add("Govinda");
		names.add("Balaji");
		System.out.println(names);

		List sortedName = names.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedName);
	}

}
