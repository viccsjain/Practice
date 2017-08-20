package JPMorgan;

public class MessageUtil {

	String msg;

	public MessageUtil(String msg) {
		this.msg = msg;
	}

	public String printMe() {
		System.out.println(msg);
		return msg;
	}

}
