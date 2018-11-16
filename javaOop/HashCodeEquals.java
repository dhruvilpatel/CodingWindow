package javaOop;

class HashCodeEquals
{
	private int id;
	private String name;
	private String org;
	HashCodeEquals(int id, String name,String org)
	{
		this.id=id;
		this.name=name;
		this.org=org;
	}
	public int getId()
	{
      return id;
	}
	public String getName()
	{
	return name;
	}
	public String getOrg()
	{
	return org;
	}
	public int hashCode()
	{
	  int str1=0;
	  int str2=0;
	  for(int i=0;i<name.length();i++)
		{
		  str1=str1+name.charAt(i);
	   }
	     for(int i=0;i<org.length();i++)
		{
		  str2=str2+org.charAt(i);
	   }
  return id+str1+str2;
	}
	public boolean equals(Object obj)
	{
		if(!(obj instanceof HashCodeEquals))
		return false;
		HashCodeEquals person=(HashCodeEquals)obj;
		 if(this.id!=person.getId())
			 return false;
		 if(!this.name.equals(person.getName()))
        return false;
		 if(!this.equals(person.getOrg()))
			 return false;
		 return true;
 
	}
	public String toString()
	{
	  return " Person id "+id+" name "+name+" Organization "+org;
	}
}  
class Test 
{
	public static void main(String[] args) throws Exception
	{
		HashCodeEquals p1=new HashCodeEquals(324,"Rajani","CGI");
		HashCodeEquals p2=new HashCodeEquals(324,"Rajani","CGI");
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p1.equals(p2));
		System.out.println(p1==p2); 
}

}
