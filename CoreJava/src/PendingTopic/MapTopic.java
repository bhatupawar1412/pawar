package PendingTopic;

import java.util.HashMap;
import java.util.Map;

public class MapTopic {

	//Keay-value pairing
	void map()
	{
		//List<Data_Type> vn= new ArrayList<Data_Type>();
		
		Map<Integer,String> m=new HashMap<Integer,String>();
		m.put(1, "Bhatu");
		//m.put(1, "Kiran"); // Same int not get only uniqe values take here
		m.put(2, "Kiran");
		m.put(3, "Pawar");
		m.put(4,"Dakshu");
		
		//System.out.println(m);
		
		for(Map.Entry i : m.entrySet())
		{
			System.out.println(i.getKey()+" "+i.getValue());
		}
		
		}
	public static void main (String[] args)
	{
		MapTopic o= new MapTopic();
		o.map();
	}
}
