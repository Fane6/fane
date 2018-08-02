package test01;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Test001 {

	@Test
	public void TestArrayList(){
		List<Integer> list1 = new ArrayList<Integer>();
		for (int i = 1; i < 101; i++) {
			list1.add(i);
		}
		System.out.println(list1);
		
		List<Integer> list2 = new ArrayList<Integer>();
		for (int i = 1; i < 101; i++) {
			list2.add(i);
		}
		// 删除7
		list2.remove(6);
		System.out.println(list2);
		
		List<Integer> list3 = new ArrayList<Integer>();
		for (Integer integer : list1) {
			if(!list2.contains(integer)){
				list3.add(integer);
			}
		}
		System.out.println(list3);
	}
}
