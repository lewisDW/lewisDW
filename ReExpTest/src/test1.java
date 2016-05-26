import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.*;
public class test1 {
	public static void main(String[] args) throws IOException
	{
		Scanner in=new Scanner(Paths.get("E:\\test1.txt"));//����ָ����·�����ƹ���һ��path
		String raw="";
		while(in.hasNextLine())
		{
			raw+=in.nextLine();		
		}
	    in.close();
	    
	    Pattern p = Pattern.compile("(\\(([^)]+)\\))");//�ѡ�(���͡�)��ת������Ͳ����groupCount����Ӱ��
	    //д��"([^)]+)"ʱ�����Ȱ�()���ǳ�group�������
	    //�򼸸����ţ���ʵ����Ӱ��ƥ������ƥ���һֱ���Ƿ��������������Ӵ�
	    //�����ڿ���group��ʱ�򣬴���ٸ����žͻ���Ӱ����
		Matcher m = p.matcher(raw);
		System.out.println(m.groupCount());
		//System.out.println(m.matches());//matches()����ƥ�������ַ���
		//System.out.println(m.find());//find()����ƥ��ƥ�䲿���ַ���
		while(m.find())
		{
			System.out.println(m.group(0));
		}
		//String result=m.replaceAll("�滻���");
		//System.out.println(result);
	}
}
