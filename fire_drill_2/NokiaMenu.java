import java.util.Scanner;

public class NokiaMenu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String prompt = """
                List of menu functions

                1. Phone book
                2. Messages
                3. Chat
                4. Call register
                5. Tones
                6. Settings
                7. Call divert
                8. Games
                9. Calculator
                10. Reminders
                11. Clock
                12. Profiles
                13. SIM services
                0. Exit
                """;

        System.out.println(prompt);
        int userInput = input.nextInt();

        switch (userInput) {
            case 0 -> System.out.println("Goodbye.");

            case 1 -> {
                prompt = """
                        Phone book

                        1. Search
                        2. Service Nos.
                        3. Add name
                        4. Erase
                        5. Edit
                        6. Assign tone
                        7. Send b'card
                        8. Options
                        9. Speed dials
                        10. Voice tags
                        0. Back
                        """;

                System.out.println(prompt);
                userInput = input.nextInt();

                switch (userInput) {
                    case 0 -> System.out.println("Back");
                    case 1 -> System.out.println("Phone book > Search");
                    case 2 -> System.out.println("Phone book > Service Nos.");
                    case 3 -> System.out.println("Phone book > Add name");
                    case 4 -> System.out.println("Phone book > Erase");
                    case 5 -> System.out.println("Phone book > Edit");
                    case 6 -> System.out.println("Phone book > Assign tone");
                    case 7 -> System.out.println("Phone book > Send b'card");

                    case 8 -> {
                        prompt = """
                                Phone book > Options

                                1. Type of view
                                2. Memory status
                                0. Back
                                """;

                        System.out.println(prompt);
                        userInput = input.nextInt();

                        switch (userInput) {
                            case 0 -> System.out.println("Back");
                            case 1 -> System.out.println("Phone book > Options > Type of view");
                            case 2 -> System.out.println("Phone book > Options > Memory status");
                            default -> System.out.println("Invalid option.");
                        }
                    }

                    case 9 -> System.out.println("Phone book > Speed dials");
                    case 10 -> System.out.println("Phone book > Voice tags");
                    default -> System.out.println("Invalid option.");
                }
            }

            default -> System.out.println("case2 track it");
        }
    }
}
