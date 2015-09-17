package MainPackage;

public class MyInteger {

	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value)
	{
		this.value = value;
	}

	public MyInteger(int value)
	{
		setValue(value);
	}
	public boolean isEven()
	{
		if(this.getValue()%2==0)
		{
			return true;
		}
		else
		{
			return false; 
			}
	}
		
		public boolean isEven(int value)
		{
			if(this.getValue()%2==0)
			{
				return true;
			}
			else
			{
				return false;
				
			}
		}


		public static boolean isEven(MyInteger myInt)
		{
			if(myInt.getValue()%2==0)
			{
				return true;
			}
			else
			{
				return false;}
	}
			
	public boolean isOdd()
	{
		if(this.getValue()%2!=0)
		{
			return true;
		}
		else
		{
			return false; 
			}
	}
		
		public boolean isOdd(int value)
		{
			if(this.getValue()%2 !=0)
			{
				return true;
			}
			else
			{
				return false;
				
			}
		}


		public static boolean isOdd(MyInteger myInt)
		{
			if(myInt.getValue()%2!=0)
			{
				return true;
			}
			else
			{
				return false;}
	}
		
		public boolean isPrime()
		{
			if(Math.abs(value)==2){
				return true;
			}
			if(value %2 == 0 ){
				return false;
			}
			for(int i = 3; i * i <= value;i+= 2){
				if (value % i == 0){
					return false;
				}
			}
				return true; 
				}
			
			public boolean isPrime(int value)
			{
				if(Math.abs(value)==2){
					return true;
				}
				if(value %2 == 0 ){
					return false;
				}
				for(int i = 3; i * i <= value;i+= 2){
					if (value % i == 0){
						return false;
					}
				}
					return true; 
					}

			public boolean isPrime(MyInteger myInt)
			{
				if(Math.abs(value)==2){
					return true;
				}
				if(value %2 == 0 ){
					return false;
				}
				for(int i = 3; i * i <= value;i+= 2){
					if (value % i == 0){
						return false;
					}
				}
					return true; 
					}	
	}

