package lockedme.com;
import java.util.*;
import java.io.*;

public class repository {
	public void myfiles(){
		File dr=new File("E:\\oops\\project phase 1\\documents");
		File[] list1=dr.listFiles();
		Arrays.sort(list1);
		for (int i=0;i<list1.length; i++ ) {
			System.out.println(list1[i].getName());
		}
		System.out.println();	
		mainmethod();
	}
	
	public void addfile() {
		Scanner a=new Scanner(System.in);
		try {

			System.out.println("Enter file name you want to create for example abc.txt");
			String filename=a.next();
			File  add=new File("E:\\oops\\project phase 1\\documents\\"+filename);
			if(!add.exists()) {
				add.createNewFile();
				System.out.println("File has been created.");
			}
			else {
				System.out.println("File already exists.");

			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("File already exists.");
			e.printStackTrace();
		}
		System.out.println();
		
	}
	
	public void deletefile() {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter file name you want to delete for example abc.txt");
		String filename=sc.next();
		File delete=new File("E:\\oops\\project phase 1\\documents\\"+filename);
		if(delete.delete()) {
			System.out.println(" file has been deleted");
		}
		else {
			System.out.println("File not found");
		}
		System.out.println();
	}
	
	public void searchfile() {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter file name you want to search for example (abc.txt).");
		String filename=sc.next();
		File  search=new File("E:\\oops\\project phase 1\\documents\\"+filename);
		if(search.isFile()) {
			search.getAbsolutePath();
			System.out.println("File found the path of file is given below.");
			System.out.println(search.getAbsolutePath());
		}
		else {
			System.out.println("File not found.");
		}
		System.out.println();
	}
	
	public void adminop() {
		System.out.println("1.  Add file.");
		System.out.println("2.  Delete a file.");
		System.out.println("3.  Search for a file.");
		System.out.println("4.  Go Back.");
		Scanner sc=new Scanner(System.in);
		int ex1=sc.nextInt();

		if (ex1==1) {

			addfile();
			adminop();
		}
		else if (ex1==2) {
			deletefile();
			adminop();
		}
		else if (ex1==3) {
			searchfile();
			adminop();
		}
		else if (ex1==4) {
			System.out.println();
			mainmethod();
		}
	}
	
	public void mainmethod() {
		System.out.println("Developer :- Shalinder Pathak");
		System.out.println("Welcome to DATA REPOSITORY");
		System.out.println("Choose from the following options:");
		System.out.println("1.  View my Files");
		System.out.println("2.  Add , Delete or Search a file.");
		System.out.println("3.  Exit .");
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();

		if (input==1) {
			myfiles();
		}

		else if(input==2) {	
			adminop();
		}
		else if (input==3) {
			System.out.println("Thanks, application exits here.");
			System.exit(0);
		}
		else {System.out.println("Invalid input enter the no. from 1 to 3");

		}
	}

	public static void main(String[] args) {		
		// TODO Auto-generated method stub
		repository obj=new repository();
		obj.mainmethod();	
	}
}


