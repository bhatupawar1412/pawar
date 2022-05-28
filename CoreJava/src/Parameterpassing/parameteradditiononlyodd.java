package Parameterpassing;

public class parameteradditiononlyodd {
void pawar (int i)
{
	int addi = 0;
	// for (i=1; i<=;i++)
while (i<=10)
{
	
if (i%2!=0)

addi=addi+i;
i=i+1;


}	

System.out.println("addition odd number is " + addi);
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parameteradditiononlyodd obj = new parameteradditiononlyodd ();
		obj.pawar(0);
		
	}

}
