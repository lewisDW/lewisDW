import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.*;
public class test1 {
	public static void main(String[] args) throws IOException
	{
		Scanner in=new Scanner(Paths.get("E:\\test1.txt"));//根据指定的路径名称构造一个path
		String raw="";
		while(in.hasNextLine())
		{
			raw+=in.nextLine();		
		}
	    in.close();
	    
	    Pattern p = Pattern.compile("(\\(([^)]+)\\))");//把“(”和“)”转义掉，就不会对groupCount产生影响
	    //写成"([^)]+)"时，优先把()考虑成group分组符号
	    //打几个括号，其实都不影响匹配结果，匹配的一直都是符合条件的整个子串
	    //但是在考虑group的时候，打多少个括号就会有影响了
		Matcher m = p.matcher(raw);
		System.out.println(m.groupCount());
		//System.out.println(m.matches());//matches()尝试匹配整个字符串
		//System.out.println(m.find());//find()尝试匹配匹配部分字符串
		while(m.find())
		{
			System.out.println(m.group(0));
		}
		//String result=m.replaceAll("替换结果");
		//System.out.println(result);
	}
}
