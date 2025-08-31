
public class Main
{
	public static void main(String[] args) {
		String a="srav";
		String b="srav";
		System.out.println(a);
		System.out.println(b);
		System.out.println(a==b);
		String aa=new String("sravanthi");
		String bb=new String("sravanthi"); 
		System.out.println(aa);
		System.out.println(bb);
		//why false evn though aa and bb have same values bcoz they dont share same memory 
		System.out.println(aa==bb);
		//when u want to comapre two string values use euals method not ==
		System.out.println(aa.equals(bb));


			System.out.println(new int[]{9,7,5,3,2});
		
		System.out.println(Arrays.toString(new int[]{9,7,5,3,2}));
		
		float num=43.78976f;
	//	System.out.printf("Formatted number si %.4f",num);
		System.out.println(Math.PI);
	//	System.out.printf("Pie %.3f",Math.PI);
		String name="sravanthi";
		String goal="Director";
	//	System.out.printf("My name is %s and i want to become %s",name,goal);
		
		
		
		System.out.println('a'+'b');
		
			System.out.println("a"+"b");
				System.out.println('a'+3);
				System.out.println((char)100);
					System.out.println("a"+89);
	}
}
