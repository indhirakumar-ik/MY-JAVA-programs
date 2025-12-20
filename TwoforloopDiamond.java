public class TwoforloopDiamond {
	public static void main(String []args){
		int n=6;
		for(int i=1;i<=n;i++) {
			for(int k=1;k<=n;k++) {
				if(i==1&&k==3 
						||i==2&&k==2 
						||i==2&&k==4
						||i==3&&k==1
						||i==3&&k==5
						||i==4&&k==2 
						||i==4&&k==4 
						||i==5&&k==3) {
					System.out.print("*");
				}	else {
					System.out.print(" ");
				}
		}System.out.println();
		
	}
} 
	}
