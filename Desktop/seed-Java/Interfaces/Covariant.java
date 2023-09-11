class Parent
{
	public Number getObject()
	{
		return new Double(23.5);
	}
}

class Child extends Parent
{
	public Integer getObject()
	{
		return new Integer(23);
	}
}

class Covariant {
  public static void main(String[] args)
  {
		Child obj = new Child();
		System.out.println(obj.getObject());    
  }
}