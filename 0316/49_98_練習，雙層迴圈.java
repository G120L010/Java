package helloworld;

public class Module49_98 {
	//"順序" array-->index.data
	//		for(int i = 0; i<alength; i++)
	//		(0~a.length-1)-->index的range，a[i]=值，[i]外層
	public static void main(String[] args) {
		int[] a= {1,2,3};
		int[] b= {4,5,6,7};
		
		System.out.print("a\\b\t");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"\t");
			}
		System.out.println();
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+"\t");
			for (int j = 0; j < a.length; j++) {
				System.out.print((a[j]*b[i])+"\t");
				}
			System.out.println();
			}
		}
	}
