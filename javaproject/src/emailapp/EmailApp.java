package emailapp;

public class EmailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Email em1 = new Email("Ronald", "Cho");
		
		em1.setAlternateEmail("ronald.cho@hotmail.com");
		System.out.println(em1.getAlternateEmail());
		
		System.out.println(em1.showInfo());
		
	}

}
