public class1{
		public static void main(String[] args){
		int sum,num=0;
		 sum= 0;
		while(num>0) 
		{
		int r = num%10;
		if(r%2!=0)
		sum = sum + r;
		num = num /10;
		}
		System.out.println(sum);
		}
		}

