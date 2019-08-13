package be.intecbrussel.opdracht2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Demo {

	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		IntStream intstream =integers.stream().mapToInt(Integer::intValue);
		List<String> wordsList = Arrays.asList("This", "is", "an", "example");
		
		//Count
		Long count = integers.stream()
				     .count();
		System.out.println(count);
		
		//Max
		Optional<Integer> max = integers.stream()
						.max((i, j) -> i.compareTo(j));
		max.ifPresent(System.out::println);
		
		//Min
		Optional<Integer> min = integers.stream()
						.min((i, j) -> i.compareTo(j));
		min.ifPresent(System.out::println);
		
		//Average
		OptionalDouble average = intstream.average(); 
		
		average.ifPresent(System.out::println);
		
		//Sum
		Integer sum = integers.stream()
				      .reduce(0, (a, b) -> a + b);
			System.out.println(sum);
		
		//Reduce
		int result = integers.stream().mapToInt(e -> e)
				.reduce(0, (x,y) -> (int) Math.pow(x, 1) + (int) Math.pow(y, 2));
		System.out.println(result);
			
		//Reduce
		Optional<String> reduced = wordsList.stream()
                				    .reduce((s1,s2) -> s1 + ";" + s2);
		reduced.ifPresent(System.out::println);

	}

}
