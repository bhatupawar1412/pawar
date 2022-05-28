package ArrayTopics;

public class SortString {

	//Q1. string 5 names into array & sort them 
	
	void sort ()
	{
		
		String[] a = {"bhatu","vishal","mayur","pavan","suraj"};
		
		for (int i=0; i<=a.length-1; i++)
		{
			for(int j=i+1; j<=a.length-1; j++)
			{
				if(a[i].compareTo(a[j])>0)
				{
					String name =a[i];
					a[i]=a[j];
					a[j]=name;
					
				}
				
				
			}
			System.out.print(a[i] +" ");
			
		}
		System.out.println( );
	}
	
	void sort1 ()
	{
		String[] s = {"daksha", "kuldeep", "harshal","vaibhav","bhatu","luxshmikant"};
		
		for (int i=0; i<=s.length-1; i++)
		{
			for (int j=1+i; j<=s.length-1; j++)
			{
				if (s[i].compareTo(s[j])>0)
				{
					String brother = s[i];
					s[i]=s[j];
					s[j]=brother;
					
				}
				
			}
			System.out.print(s[i] + " ");
		}
		
		System.out.println( );
		
	
}
						
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortString obj = new SortString ();
		obj.sort();
		obj.sort1();

	}

}
