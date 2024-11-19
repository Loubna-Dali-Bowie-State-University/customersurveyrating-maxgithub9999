import java.util.Scanner;

public class CustomerSurvey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TODO: Declare necessary variables (e.g., to hold rating counts, total number of ratings, sum, etc.)
        // TODO: Declare a flag for detecting if any 5-star rating was entered
        System.out.println("Welcome to Customer Survey! Enter ratings from 1 to 5 (enter -1 to stop): ");
        int rating = 0;
        int sum = 0;
        int oneStarRatings = 0;
        int twoStarRatings = 0;
        int threeStarRatings = 0;
        int fourStarRatings = 0;
        int fiveStarRatings = 0;
        int totalRatings = 0;
        int average = 0;
        // Sentinel-Controlled Loop to collect customer ratings
        while (rating != -1) {
            // TODO: Prompt user to enter a rating
            // TODO: Read the rating input
            System.out.println("Welcome to Customer Survey! Enter more ratings from 1 to 5 (enter -1 to stop): ");
            rating = scanner.NextInt();
            // TODO: Check if the sentinel value (-1) was entered, and break if true
            if(rating = -1) {
              break;
            }
            // TODO: Validate that the rating is between 1 and 5
            // If invalid, display an error message and continue to the next iteration
            if(!rating > 0 && rating < 6) {
                System.out.println("Error. Not within range.");
            } else {
             totalRatings ++;
             sum +=;
            }
            // TODO: Process valid rating: 
            // - Update counters for each rating
            // - Add rating to the total for average calculation
            // - If rating is 5, set the flag to indicate a 5-star rating was received
            if(rating = 1) {
             oneStarRatings ++;
            } else if(rating = 2) {
              twoStarRatings ++;
            } else if(rating = 3) {
              threeStarRatings ++;
            } else if(rating = 4) {
              fourStarRatings ++;
            } else if(rating = 5) {
              fiveStarRatings ++;
              System.out.println("Thank you for your five star rating.");
            }
        }

        // Summary Report
        System.out.println("\nSummary Report:");
        
        // TODO: Display the total number of ratings
        System.out.println("Total amount of ratings: " + totalRatings);
        // TODO: Calculate and display the average rating, if any ratings were entered
        average = sum / totalRatings;
        System.out.println("Average: " + average);
        // TODO: Display the count for each rating (1-star to 5-star) without using arrays
        System.out.println("One Star Ratings: " + oneStarRatings);
        System.out.println("Two Star Ratings: " + twoStarRatings);
        System.out.println("Three Star Ratings: " + threeStarRatings);
        System.out.println("Four Star Ratings: " + fourStarRatings);
        System.out.println("Five Star Ratings: " + fiveStarRatings);
        scanner.close(); // Close the scanner
    }
}
