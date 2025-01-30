public class PrimeNum{
	public static void main(String[] args){
		int n,i,count =0;
		n=5;
		for(i=1;i<=n;i++){
			if(n%i==0)
				count++;
		}
		if(count==2)
			System.out.println("It's prime");
		else
			System.out.println("It's not a prime");
	}
}
