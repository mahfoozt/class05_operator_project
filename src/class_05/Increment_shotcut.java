package class_05;

public class Increment_shotcut {

	public static void main(String[] args) {
		
			System.out.println("a--");
			int a;
			a = 5;
					
			System.out.println( a );
			//a++; is same as   a=a+1;
			a--;
			System.out.println( a );
			
			a--;
			System.out.println( a );	
			
			a--;
			System.out.println( a );		
		
//			int b=127;
//			b++;
//			b++;
			int b=10;
			b*=2;
			b/=2;

			System.out.println("-----" + b);
			
			int n=8;
			int m=4;
			n +=4;
			m --;
			//m-=1;
			n=n+m;
			m++;
			System.out.println( "m= " +m );
			System.out.println("n= " +n );
			
			

	}

}
