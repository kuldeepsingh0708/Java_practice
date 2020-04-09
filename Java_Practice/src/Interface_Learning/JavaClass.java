package Interface_Learning;

public class JavaClass implements Interface1, Interface2

{

	public void height() 
	
	{
	
		System.out.println("Java Class Function");
		
		System.out.println("Height Like Father and Mother Family\n");
		
	}
	
	public static void main(String[] args)
	
	{
		// TODO Auto-generated method stub
		JavaClass JC = new JavaClass();
		JC.height();
		
		Interface1 In1 = new JavaClass();
		In1.eyes();
		In1.hair();
		In1.nose();
		
		Interface2 In2 = new JavaClass();
		In2.fisheating();
		In2.roundface();
		In2.smartness();
				

	}

	@Override
	public void eyes() 
	{
		// TODO Auto-generated method stub
		
		System.out.println("Interface1 Functions");
		System.out.println("Eyes Like Father Family");
		
		
	}

	@Override
	public void nose() 
	{
		// TODO Auto-generated method stub
		System.out.println("Nose Like Father Family\n");
		
	}

	@Override
	public void hair() 
	{
		// TODO Auto-generated method stub
		System.out.println("Hair Like Father Family");
		
	}

	@Override
	public void smartness() 
	{
		// TODO Auto-generated method stub
		System.out.println("SmartNess Like Mother Family\n");
		
	}

	@Override
	public void roundface() 
	{
		// TODO Auto-generated method stub
		System.out.println("Roundface Like Mother Family");
		
	}

	@Override
	public void fisheating() 
	{
		// TODO Auto-generated method stub
		
		System.out.println("Interface2 Function");
		System.out.println("Fisheating Like Mother Family");
		
	}

}
