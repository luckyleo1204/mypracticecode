package javaPra;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionApiEx {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		Test t=new Test();
		Class c=t.getClass();
		Constructor c1=c.getConstructor();
		System.out.println(c1.getName());
		
		Method[] m=c.getMethods();
		for(Method i:m)
			System.out.println(i.getName());
		
		Method m1=c.getMethod("method2", int.class);
		m1.invoke(t,19);
		

	}

}

class Test 
{ 
    // creating a private field 
    private String s; 
  
    // creating a public constructor 
    public Test()  {  s = "GeeksforGeeks"; } 
  
    // Creating a public method with no arguments 
    public void method1()  { 
        System.out.println("The string is " + s); 
    } 
  
    // Creating a public method with int as argument 
    public void method2(int n)  { 
        System.out.println("The number is " + n); 
    } 
  
    // creating a private method 
    private void method3() { 
        System.out.println("Private method invoked"); 
    } 
} 