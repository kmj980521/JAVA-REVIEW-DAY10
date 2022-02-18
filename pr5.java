package trycatchresources;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class Throw {
	
	public Class loadClass(String fileName,String className)throws FileNotFoundException, ClassNotFoundException{ //두 예외를 메서드가 호출될 때 처리하도록 미룸.
		FileInputStream fis=new FileInputStream(fileName);
		Class c=Class.forName(className);
		return c;
	}
	public static void main(String[] args) {
		Throw test = new Throw();
		try {
			test.loadClass("a.txt", "java.lang.String"); //메서드가 호출될 때 예외를 처리
		} catch (FileNotFoundException | ClassNotFoundException e) {
		
			e.printStackTrace();
		}

	}

}

