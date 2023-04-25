package notThatImportant;

/**
 * @author mac
 * OK
 */
public class Code01_PrintBinary {







	public static void print(int num) {
		for (int i = 31; i >= 0; i--) {
			System.out.print((num & (1 << i)) == 0 ? "0" : "1");

		}
	}

	public static int binaryToDecimal(int n){
		       int t = 0;  //用来记录位数
		       int bin = 0; //用来记录最后的二进制数
		       int r = 0;  //用来存储余数
		       while(n != 0){
			           r = n % 2;
			           n = n / 2;
			           bin += r * Math.pow(10,t);
			           t++;
			      }
			   return bin;
		  }


	public static void main(String[] args) {
//		 32位

		//整数转换为二进制
		String s = Integer.toBinaryString(9999);
//		int inta= Integer.valueOf(s);//太长了他就挂了

		int parseInt = Integer.parseInt(s);
//		System.out.println(inta);
		System.out.println(parseInt);






//		
//		int a = Integer.MAX_VALUE;
//		System.out.println(a);

//		print(-1);
//		int a = Integer.MIN_VALUE;
//		print(a);

//		int b = 123823138;
//		int c = ~b;
//		print(b);
//		print(c);

//		print(-5);

//		System.out.println(Integer.MIN_VALUE);
//		System.out.println(Integer.MAX_VALUE);

//		int a = 12319283;
//		int b = 3819283;
//		print(a);
//		print(b);
//		System.out.println("=============");
//		print(a | b);
//		print(a & b);
//		print(a ^ b);

//		int a = Integer.MIN_VALUE;
//		print(a);
//		print(a >> 1);
//		print(a >>> 1);
//		
//		int c = Integer.MIN_VALUE;
//		int d = -c ;
//		
//		print(c);
//		print(d);

	}

}
