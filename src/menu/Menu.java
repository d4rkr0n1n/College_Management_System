package menu;

import java.util.*;
public class Menu {
	
	public static void MainMenu() {
		System.out.println("<-------------MainMenu------------->");
		System.out.println("#Press the serial number for access#");
		System.out.println("1. Admin Login");
		System.out.println("2. Student Login");
		System.out.println("3. Teacher Login");
		System.out.print("Enter choice :: ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		switch (n) {
		case 1:
			AdminMenu();
		case 2:
			StudentMenu();
		case 3:
			TeacherMenu();
		default:
			MainMenu();
		}
	}
	public static void AdminMenu() {
		System.out.println("<-------------AdminMenu------------>");
		System.out.println("#Press the serial number for access#");
		System.out.println("1. Add Student");
		System.out.println("2. Add Teacher");
		System.out.println("0. Logout(return to main menu)");
		System.out.print("Enter choice :: ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
	}
	public static void StudentMenu() {
		System.out.println("<-------------MainMenu------------->");
		System.out.println("#Press the serial number for access#");
		System.out.println("1. Admin Login");
		System.out.println("2. Student Login");
		System.out.println("3. Teacher Login");
		System.out.print("Enter choice :: ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
	}
	public static void TeacherMenu() {
		System.out.println("<-------------MainMenu------------->");
		System.out.println("#Press the serial number for access#");
		System.out.println("1. Admin Login");
		System.out.println("2. Student Login");
		System.out.println("3. Teacher Login");
		System.out.print("Enter choice :: ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
	}
	
}
