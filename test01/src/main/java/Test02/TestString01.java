package Test02;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

public class TestString01 {

	
	@Test
	public void Test01(){
		//看看这个字符串 e 出现的次数
        String str = "feitianbenyue";
        String t = "e";
        System.out.println(StringUtils.countMatches(str, t));
	}
	
	@Test
	public void Test02(){
		//看看这个字符串 e 出现的次数
        String str = "feitianbenyue";
        String t = "e";
        int c=str.length()-str.replaceAll(t, "").length();
        System.out.println(c);
	}
	
}
