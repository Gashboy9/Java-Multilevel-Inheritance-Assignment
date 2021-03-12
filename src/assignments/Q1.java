package assignments;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	}

}


class Electronics{
	
	public void device_type() {
		//System.out.println("All Electronics");
	}
}


class Television extends Electronics{
	
	public void category() {
		System.out.println("Television");
	}
}


class LED extends Television{
	public void display_tech() {
		System.out.println("The technology is LED");
	}
}
