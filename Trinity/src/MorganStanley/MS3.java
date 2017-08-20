package MorganStanley;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Keyboard implements Serializable{
	
	MS2 abc = new MS2();
	
}


public class MS3 implements Serializable {
	private Keyboard keyboard = new Keyboard();
	
	public static void main(String[] args) {
		MS3 obj = new MS3();
		try {
			ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream("/tmp/vikram.tmp"));
			stream.writeObject(obj);
			stream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
