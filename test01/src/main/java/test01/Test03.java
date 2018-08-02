package test01;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Test03 {

	@Test
	public void TestSum03(){
		
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i < 101; i++) {
			list.add(i);
		}
		System.out.println(list);
		list.remove(6);
		int i=1;
		for (Integer integer : list) {
			if(integer!=i){
				System.out.println(i);
				break;
			}
			i++;
		}
		
	}
}
