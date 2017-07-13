package javaPractice;

public class example {

	public static void main(String[] args) {
		int var;
		for (var=0;var<5;var++){
			for(int k=5;k>var;k=k-1)
				System.out.print(" ");
			System.out.print("*");
			for(int i=0;i<2*var;i++)
			System.out.print(" ");
			System.out.println("*");
		}
	}

}
