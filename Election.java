import java.util.Scanner;

public class Election {
    private static final String CANDIDATE1 = "Ganesh";
    private static final String CANDIDATE2 = "Mahesh";
    private static final String CANDIDATE3 = "Rathan";
    private static final String CANDIDATE4 = "Abhishek";
    private static final String NOTA = "None";
    private static final String SPOILEDVOTES = "Error";

    private static int votesCount1 = 0, votesCount2 = 0, votesCount3 = 0, votesCount4 = 0, notavotes = 0, spoiledvotes = 0;
    private static boolean[] voted = new boolean[300];

    private static void castVote() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        System.out.println("Please choose your Candidate or select an option:");
        System.out.println("1. " + CANDIDATE1);
        System.out.println("2. " + CANDIDATE2);
        System.out.println("3. " + CANDIDATE3);
        System.out.println("4. " + CANDIDATE4);
        System.out.println("5. " + NOTA);
        System.out.println("6. Quit Voting and Check Results");
        System.out.print("Input your choice (1 - 6): ");
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                votesCount1++;
                break;
            case 2:
                votesCount2++;
                break;
            case 3:
                votesCount3++;
                break;
            case 4:
                votesCount4++;
                break;
            case 5:
                notavotes++;
                break;
            case 6:
                System.out.println("Exiting voting process. Checking results...");
                break;
            default:
                spoiledvotes++;
        }

        if (choice >= 1 && choice <= 5 && choice != 6) {
            System.out.println("Thanks for your valuable vote!!");
        }
    }

    private static void votesCount() {
        System.out.println("Voting Statistics !!");
        System.out.println(CANDIDATE1 + " - " + votesCount1);
        System.out.println(CANDIDATE2 + " - " + votesCount2);
        System.out.println(CANDIDATE3 + " - " + votesCount3);
        System.out.println(CANDIDATE4 + " - " + votesCount4);
        System.out.println(NOTA + " - " + notavotes);
        System.out.println(SPOILEDVOTES + " - " + spoiledvotes);
    }

    private static void getLeadingCandidate() {
        if (votesCount1 > votesCount2 && votesCount1 > votesCount3 && votesCount1 > votesCount4 && votesCount1 > notavotes && votesCount1 > spoiledvotes)
            System.out.println("[" + CANDIDATE1 + "] has won the election with " + votesCount1 + " votes !!");
        else if (votesCount2 > votesCount3 && votesCount2 > votesCount4 && votesCount2 > votesCount1 && votesCount2 > notavotes && votesCount2 > spoiledvotes)
            System.out.println("[" + CANDIDATE2 + "] has won the election with " + votesCount2 + " votes !!");
        else if (votesCount3 > votesCount4 && votesCount3 > votesCount2 && votesCount3 > votesCount1 && votesCount3 > notavotes && votesCount3 > spoiledvotes)
            System.out.println("[" + CANDIDATE3 + "] has won the election with " + votesCount3 + " votes !!");
        else if (votesCount4 > votesCount1 && votesCount4 > votesCount2 && votesCount4 > votesCount3 && votesCount4 > notavotes && votesCount4 > spoiledvotes)
            System.out.println("[" + CANDIDATE4 + "] has won the election with " + votesCount4 + " votes !!");
        else if (notavotes > votesCount1 && notavotes > votesCount2 && notavotes > votesCount3 && notavotes > votesCount4 && notavotes > spoiledvotes)
            System.out.println("None of the above option having higher votes !! Go for re-election !!");
        else if (spoiledvotes > votesCount1 && spoiledvotes > votesCount2 && spoiledvotes > votesCount3 && spoiledvotes > votesCount4 && spoiledvotes > notavotes)
            System.out.println("Election spoiled due to invalid choices !! Go for re-election !!");
        else
            System.out.println("There is a tie !! Go for re-election !!");
    }

    public static void main(String[] args) {
        int i = 1, usn;
        boolean votingComplete = false;

        while (i <= 200 && !votingComplete) {
            System.out.println("\n\nWELCOME TO CSE BRANCH PRESIDENT ELECTION 2024 !!");
            System.out.print("Enter last three digits of your USN: ");
            Scanner scanner = new Scanner(System.in);
            usn = scanner.nextInt();

            if (!voted[usn]) {
                castVote();
                i++;
                voted[usn] = true;
            } else {
                System.out.println("You have already voted!");
            }

            // Check if all voters have cast their votes
            if (i > 200) {
                System.out.println("All voters have cast their votes. Voting process complete.\n");
                votingComplete = true;
            }
        }

        if (votingComplete) {
            System.out.println("\n\nFOR CSE DEPARTMENT ACCESS ONLY !!\n");
            int s;
            int k = 0;

            while (k < 4) {
                System.out.print("Enter the password: ");
                Scanner scanner = new Scanner(System.in);
                s = scanner.nextInt();

                if (s == 456) {
                    votesCount();
                    getLeadingCandidate();
                    break;
                } else {
                    if (k < 3)
                        System.out.println("Wrong password!! Retry !!");
                    else
                        System.out.println("Wrong password !!");
                }
                k++;
            }

            if (k == 4)
                System.out.println("Limit reached, and you failed to access the result !!");
        }
    }
}
