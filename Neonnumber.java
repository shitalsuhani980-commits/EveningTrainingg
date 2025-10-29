class Neonnumber 
{
    public static void main (string args[])
	{
	    int limit=1000;
		system.out.println("Neon number up to"+ " "+range+"are:");
		for(int i=1;num<=limit;num++){
		int square=num*num;
		int sum=0;
		while(square>0){
		    sum+=square%10;
			square/=10;
		}
		if(sum==num){
		    system.out.println(num);
		    }
		}
	}
}