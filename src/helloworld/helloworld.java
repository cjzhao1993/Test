package helloworld;


public interface helloworld {
		public static void main(String args[]) {
			int[] a = new int[10000];
			
			for (int i = 0; i<a.length; i++) {
				a[i] = i+2;
			}
			for (int i = 2; i<10000;i++) {
				for (int j =0; j<9999; j++) {
					if (a[j] != 0) {
						if (a[j]%i ==0 && a[j]/i !=1) {
							a[j] = 0;
						}
					}
				}
			}
			System.out.println("输出2——100之间的所有素数");
			int count =0;
			for(int i =0; i<9999; i++) {
				if (a[i] != 0) {
					System.out.print(a[i]+" ");
					count = count +1;
					if (count%10==0) {
						System.out.println( );
					}
			
				}
			}
			System.out.println();
			System.out.println("输出的素数总共有 "+count+" 个");
			
			
		}


}
