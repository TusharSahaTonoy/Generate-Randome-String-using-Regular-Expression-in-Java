package main;

public class Main {

	public static void main(String[] args) {
		String regex = "[a-zA-Z]{10}[1-9]";
        
        for(int i=0;i<10;i++)
        {
        	Xeger generator = new Xeger(regex); 
            String result = generator.generate();
            System.out.println(result);
        }

	}

}
