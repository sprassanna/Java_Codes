package com.prassannas.java8.lambda.exception;

import java.util.function.BiConsumer;

public class ExceptionHandlingInLambda {
	
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4};
		
		int key =-1;
		
		process(numbers,key,wrapperLambda((v,k) -> System.out.println(v/k)));
	}

	private static void process(int[] numbers, int key, BiConsumer<Integer, Integer> biconsumer) {
		for(int i : numbers){
			biconsumer.accept(i,key);
		}
	}
	
	private static BiConsumer<Integer, Integer> wrapperLambda( BiConsumer<Integer, Integer> biconsumer){
		return (v,k) -> {
			try{
			biconsumer.accept(v, k);
			}
			catch(Exception e ){
				System.out.println("An Exception is THROWN");
			}
		};
	}

}
