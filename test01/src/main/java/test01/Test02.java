package test01;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Test02 {

	@Test
	public void TestSum(){
		int sum=0;
		for (int i = 1; i < 101; i++) {
			System.out.println(i);
			sum+=i;
		}
		System.out.println(sum);
	}
	
	
	@Test
	public void TestSum01(){
		int sum=0;
		List<Integer> list = new ArrayList<Integer>();
		for (int j = 1; j < 101; j++) {
			list.add(j);
		}
		System.out.println(list);
		list.remove(7);
		System.out.println(list);
		
		for (Integer integer : list) {
			sum+=integer;
		}
		System.out.println(sum);
		
	}
}
