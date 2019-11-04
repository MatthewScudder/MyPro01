package learn;

/**
 * 测试字符类型
 * 
 * @author Yerjan
 *
 */
public class TestPrimitiveDataType3 {

	public static void main(String[] args) {
		char a = 'T';
		char b = '好';
		char c = '\u0061';
		System.out.println(c);

		// 转义字符
		System.out.println("" + 'a' + '\n' + 'b');
		System.out.println("" + 'a' + '\t' + 'b');
		System.out.println("" + 'a' + '\'' + 'b');

		String d="abc";
		
		boolean man=true;
		if(man) {
			System.out.println("Gender is man");
		}
		
		
		
		
		
	}

}
