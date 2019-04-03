package javaPra;

public class singleTonEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		singleTon s1=singleTon.getinstance();
		s1.print();
		}

}

class singleTon{
	
	static singleTon obj=null;
	
	private singleTon(){}
	
	public static singleTon getinstance()
	{
		if(obj==null)
			return obj=new singleTon();
		return obj;
		
	}
	
	public void print(){
		System.out.println(singleTon.class.getName());
	}
}