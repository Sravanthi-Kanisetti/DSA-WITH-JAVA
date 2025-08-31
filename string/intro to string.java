
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
	}
}
