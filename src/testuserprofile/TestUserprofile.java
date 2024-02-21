/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testuserprofile;

import java.util.Scanner;

/** Added Comment to see the changes in local repository in NEWLY CREATED BRANCH
/**
 *
 * @author Jay Mistry
 */
public class TestUserprofile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Display a list of possible genres
        System.out.println("Choose your favorite genre:");
        System.out.println("1. Action");
        System.out.println("2. Comedy");
        System.out.println("3. Drama");
        System.out.println("4. Romance");
        System.out.println("5. Sci-Fi");

        // Prompt the user to choose their favorite genre
        System.out.print("Enter the number corresponding to your favorite genre: ");
        int genreChoice = scanner.nextInt();

        String genre;
        genre = switch (genreChoice) {
            case 1 -> "Action";
            case 2 -> "Comedy";
            case 3 -> "Drama";
            case 4 -> "Romance";
            case 5 -> "Sci-Fi";
            default -> "Unknown";
        };

        // Display a message confirming the creation of the user profile
        System.out.println("User profile created successfully!");
        System.out.println("Name: " + name);
        System.out.println("Favorite Genre: " + genre);
    }
}
