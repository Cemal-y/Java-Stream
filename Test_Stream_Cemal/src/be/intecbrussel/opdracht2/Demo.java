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
		Integer[] numbers = {1,2,3,4,5,6,7,8,9};
		List<Integer> integers = Arrays.asList(numbers);
		IntStream intstream = IntStream.of(1,2,3,4,5,6,7,8,9);
		String [] words = {"This" ,"is" ,"an", "example"};
		List<String> wordsList = Arrays.asList(words);
		
		//Count
		Long count = integers.stream().count();
		System.out.println(count);
		
		//Max
		Optional<Integer> max = integers.stream().max((i, j) -> i.compareTo(j));
		max.ifPresent(System.out::println);
		
		//Min
		Optional<Integer> min = integers.stream().min((i, j) -> i.compareTo(j));
		min.ifPresent(System.out::println);
		
		//Average
		OptionalDouble average = intstream.average(); 
		average.ifPresent(System.out::println);
		
		//Sum
		Integer sum = integers.stream()
				  .reduce(0, (a, b) -> a + b);
		
		//Reduce
		Optional<String> reduced = wordsList.stream()
                .reduce((s1,s2) -> s1 + ";" + s2);
		reduced.ifPresent(System.out::println);

	}

}
