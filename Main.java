import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class Main {
	
	private static ArrayList<User> userArrayList = new ArrayList<User>();
	private static ArrayList<Post> postArrayList = new ArrayList<Post>();
	private static Scanner keyboard = new Scanner(System.in);
	private static String currentUser = "0";
	public static void autoUsers()
	{
		User user = new User("sclmdd" ,  "Stephanie" , "Lawrence"  , "sclmdd@gmail.com" , "picture.com");
		userArrayList.add(user);
		User user1 = new User("bobface" ,  "Bob" , "Whatever",  "Bob@gmail.com" ,"bobface.com");
		userArrayList.add(user1);
		User user2 = new User("almanal", "Allye" , "Sister" , "Allye@gmail.com", "face.com");
		userArrayList.add(user2);
	}
	public static void autoPosts()
	{
		Post post = new Post(   "Workin from seven to eleven every night, It really makes life a drag, I dont think thats right Ive really been the best of fools"
							+"I did what I could, yeah Cause I love you, baby How I love you, darling How I love you, baby My beloved little girl, little girl"
							+ "But baby, since Ive been loving you, yeah Im about to lose my worried mind, oh yeah");
		postArrayList.add(post);
		Post post2 = new Post("Everybody trying to tell me, That you didnt mean me no good Ive been trying, Lord, let me tell you ,Let me tell you I really"
							+" did the best I could Ive been working from seven to eleven every night, I said it kinda makes my life a drag Lord, "
							+"that aint right, no no, Since I've been loving you, I'm about to lose my worried mind,Watch out");
		postArrayList.add(post2);
		Post post3 = new Post("When you start to get the hang of something, not only do you feel accomplished, but you feel that the vacations is justified");
		postArrayList.add(post3);
	}
	public static void createUser()
	{	
		System.out.println("Please enter in your username");
		String newUserName = keyboard.next();		
		System.out.println("Please enter in your First name");
		String newFirstName = keyboard.next();
		System.out.println("Please enter in your Last name");
		String newLastName = keyboard.next();
		System.out.println("Please enter in your email");
		String newEmailAddress = keyboard.next();
		System.out.println("Please enter in an Avatar picture");
	    String newAvatarPic = keyboard.next();
	    User myNewUser = new User (newUserName, newFirstName, newLastName, newEmailAddress, newAvatarPic );
	    userArrayList.add(myNewUser);
	    
	 }
	public static void createPost()
	{
		System.out.println("Tell us what is on your mind..." + currentUser);
		String newPost = keyboard.nextLine();
		Post myNewPost = new Post(newPost);
		postArrayList.add(myNewPost);
		
	}
	public static void printUsers()
	{
		Iterator<User> iter = userArrayList.iterator();
		int counter = 0;
		while(iter.hasNext())
		{
			counter ++;
			User user = (User) iter.next();
			System.out.println(counter + ". " + " Username: " + user.getUserName() + " First and Last Name: " + user.getFirstName() + user.getLastName()
								+ " Email Address:" + user.getEmailAddress() + " Avatar: " + user.getAvatarPic());
		}
	}
		
	public static void printPosts()
	{
		Iterator<Post> iter = postArrayList.iterator();
		int counter = 0;
		while(iter.hasNext())
		{
			counter ++;
			Post post = (Post) iter.next();
			System.out.println(counter + ". " + post.getPostContents());
		}
	}
	public static void chooseUser(int choice)
	{
		System.out.println("Please choose one of our users to become");
		printUsers();
		int userChoice = keyboard.nextInt();
		keyboard.nextLine();
		userChoice = userChoice-1;
		System.out.println("You have chosen to become ");
		System.out.println(userArrayList.get(userChoice).getUser());
		//currentUser = userChoice;
		//User.chooseUser(userChoice);
		currentUser = userArrayList.get(userChoice).getUser();
		
	}
	public static void mainMenu()
	{
		System.out.println("Main Menu");
	    System.out.println("Please choose what you would like to do");
	    System.out.println(" 1) Create a new user");
	    System.out.println(" 2) Become an existing user");
	    System.out.println(" 3) Create a post as the current user");
	    System.out.println(" 4) Print all posts");
	    System.out.println(" 5) Print all users");
	    System.out.println("");
	    System.out.println(" 9) Exit");
	    System.out.println("");
	}
	public static void main(String[] args)
	{	        
		boolean keepGoing = true;
		System.out.println("Welcome to the MicroBlog.");
		System.out.println("");
		autoUsers();
		autoPosts();
		//userArrayList.currentUserSelection(0);
		while (keepGoing = true)
		    {
		       mainMenu();
		           
		       int userChoice = keyboard.nextInt();
		       keyboard.nextLine();

		       if (userChoice == 1)
		       { 
		    	   createUser();
		       }
		       else if (userChoice == 2)
		       {
		    	   chooseUser(userChoice);
		       }
		       else if(userChoice == 3)
		       {
		    	   //userArrayList.currentUserSelection(currentUser);
		    	   createPost();
		       }
		       else if(userChoice == 4)
		       {
		    	  printPosts();
		       }
		       else if (userChoice == 5)
		       {	               
		           printUsers();
		       }   
		       else if(userChoice == 9)
		       {
		           System.out.println("Thank you for using our blog!");
		           break;	            	
		       }
		    }
	  }
}
