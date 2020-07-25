package PRP;
import java.util.*;
public class UserRegistration {
		
		public void registerUser(String username, String userCountry) throws InvalidCountryException {
			if (!userCountry.equals("India"))
				throw new InvalidCountryException();
			else
				System.out.println("User registration done successfully");
			
			
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			UserRegistration registration = new UserRegistration();
			
			try {
				Scanner sc=new Scanner(System.in);
				String username=sc.next();
				String userCountry=sc.next();
				registration.registerUser(username,userCountry);
			} catch (InvalidCountryException e) {
				
			}
		}

	}


