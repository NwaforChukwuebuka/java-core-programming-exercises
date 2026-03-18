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
            case 2 -> {
                prompt = """
                        Messages

                        1. Write messages
                        2. Inbox
                        3. Outbox
                        4. Picture messages
                        5. Templates
                        6. Smileys
                        7. Message settings
                        8. Info service
                        9. Voice mailbox number
                        10. Service command editor
                        0. Back
                        """;
                System.out.println(prompt);
                userInput = input.nextInt();

                switch (userInput) {
                    case 0 -> System.out.println("Back");
                    case 1 -> System.out.println("Messages > Write messages");
                    case 2 -> System.out.println("Messages > Inbox");
                    case 3 -> System.out.println("Messages > Outbox");
                    case 4 -> System.out.println("Messages > Picture messages");
                    case 5 -> System.out.println("Messages > Templates");
                    case 6 -> System.out.println("Messages > Smileys");
                    case 7 -> {
                        prompt = """
                                Messages > Message settings

                                1. Set 1
                                2. Common
                                0. Back
                                """;
                        System.out.println(prompt);
                        userInput = input.nextInt();
                        switch (userInput) {
                            case 0 -> System.out.println("Back");
                            case 1 -> {
                                System.out.println("Messages > Message settings > Set 1");
                                prompt = """
                                Messages > Message settings > Set 1
                                1. Message centre number
                                2. Messages sent as
                                3. Message validity
                                0. Back
                                """;
                                System.out.println(prompt);
                                userInput = input.nextInt();
                                switch (userInput) {
                                    case 0 -> System.out.println("Back");
                                    case 1 -> System.out.println("Messages > Message settings > Set 1 > Message centre number");
                                    case 2 -> System.out.println("Messages > Message settings > Set 1 > Messages sent as");
                                    case 3 -> System.out.println("Messages > Message settings > Set 1 > Message validity");
                                    default -> System.out.println("Invalid option.");
                                }
                            }
                            case 2 -> {
                                prompt = """
                                        Messages > Message settings > Common

                                        1. Delivery reports
                                        2. Reply via same centre
                                        3. Character support
                                        0. Back
                                        """;
                                System.out.println(prompt);
                                userInput = input.nextInt();
                                switch (userInput) {
                                    case 0 -> System.out.println("Back");
                                    case 1 -> System.out.println("Messages > Message settings > Common > Delivery reports");
                                    case 2 -> System.out.println("Messages > Message settings > Common > Reply via same centre");
                                    case 3 -> System.out.println("Messages > Message settings > Common > Character support");
                                    default -> System.out.println("Invalid option.");
                                }
                            }
                            default -> System.out.println("Invalid option.");
                        }
                    }
                    case 8 -> System.out.println("Messages > Info service");
                    case 9 -> System.out.println("Messages > Voice mailbox number");
                    case 10 -> System.out.println("Messages > Service command editor");
                    default -> System.out.println("Invalid option.");
                }
            }
            case 3 -> {
                prompt="""
                Chat

                1. Chat
                0. Back
                """;
                System.out.println(prompt);
                userInput = input.nextInt();
                switch (userInput) {
                    case 0 -> System.out.println("Back");
                    case 1 -> System.out.println("Chat");
                    default -> System.out.println("Invalid option.");
                };
            }
            case 4 -> {} //4
            case 5 -> {
                System.out.println("Tones");
                prompt = """
                Tones
                1. Ringing tone
                2. Ringing volume
                3. Incoming call alert
                4. Composer
                5. Message alert tone
                6. Keypad tones
                7. Warning and game tones
                8. Vibrating alert
                9. Screen saver
                0. Back
                """;
                System.out.println(prompt);
                userInput = input.nextInt();
                switch (userInput) {
                    case 0 -> System.out.println("Back");
                    case 1 -> System.out.println("Tones > Ringing tone");
                    case 2 -> System.out.println("Tones > Ringing volume");
                    case 3 -> System.out.println("Tones > Incoming call alert");
                    case 4 -> System.out.println("Tones > Composer");
                    case 5 -> System.out.println("Tones > Message alert tone");
                    case 6 -> System.out.println("Tones > Keypad tones");
                    case 7 -> System.out.println("Tones > Warning and game tones");
                    case 8 -> System.out.println("Tones > Vibrating alert");
                    case 9 -> System.out.println("Tones > Screen saver");
                    default -> System.out.println("Invalid option.");
                }
            } //5
            case 6 -> {
                System.out.println("Settings");
                prompt = """
                Settings
                1. Call settings
                2. Phone settings
                3. Security settings
                4. Restore factory settings
                0. Back
                """;    
                System.out.println(prompt);
                userInput = input.nextInt();
                switch (userInput) {
                    case 0 -> System.out.println("Back");
                    case 1 -> {
                        prompt = """
                        Settings > Call settings
                        1. Automatic redial
                        2. Speed dialling
                        3. Call waiting options
                        4. Own number sending
                        5. Phone line in use
                        6. Automatic answer
                        0. Back
                        """;
                        System.out.println(prompt);
                        userInput = input.nextInt();
                        switch (userInput) {
                            case 0 -> System.out.println("Back");
                            case 1 -> System.out.println("Settings > Call settings > Automatic redial");
                            case 2 -> System.out.println("Settings > Call settings > Speed dialling");
                            case 3 -> System.out.println("Settings > Call settings > Call waiting options");
                            case 4 -> System.out.println("Settings > Call settings > Own number sending");
                            case 5 -> System.out.println("Settings > Call settings > Phone line in use");
                            case 6 -> System.out.println("Settings > Call settings > Automatic answer");
                            default -> System.out.println("Invalid option.");
                        }
                    }
                    case 2 -> {
                        prompt = """
                        Settings > Phone settings
                        1. Language
                        2. Cell info display
                        3. Welcome note
                        4. Network selection
                        5. Lights
                        6. Confirm SIM service actions
                        0. Back
                        """;
                        System.out.println(prompt);
                        userInput = input.nextInt();
                        switch (userInput) {
                            case 0 -> System.out.println("Back");
                            case 1 -> System.out.println("Settings > Phone settings > Language");
                            case 2 -> System.out.println("Settings > Phone settings > Cell info display");
                            case 3 -> System.out.println("Settings > Phone settings > Welcome note");
                            case 4 -> System.out.println("Settings > Phone settings > Network selection");
                            case 5 -> System.out.println("Settings > Phone settings > Lights");
                            case 6 -> System.out.println("Settings > Phone settings > Confirm SIM service actions");
                            default -> System.out.println("Invalid option.");
                        }
                    }
                    case 3 -> {
                        prompt = """
                        Settings > Security settings
                        1. PIN code request
                        2. Call barring service
                        3. Fixed dialling
                        4. Closed user group
                        5. Phone security
                        6. Change access codes
                        0. Back
                        """;
                        System.out.println(prompt);
                        userInput = input.nextInt();
                        switch (userInput) {
                            case 0 -> System.out.println("Back");
                            case 1 -> System.out.println("Settings > Security settings > PIN code request");
                            case 2 -> System.out.println("Settings > Security settings > Call barring service");
                            case 3 -> System.out.println("Settings > Security settings > Fixed dialling");
                            case 4 -> System.out.println("Settings > Security settings > Closed user group");
                            case 5 -> System.out.println("Settings > Security settings > Phone security");
                            case 6 -> System.out.println("Settings > Security settings > Change access codes");
                            default -> System.out.println("Invalid option.");
                        }
                    }
                    case 4 -> {
                        prompt = """
                        Settings > Restore factory settings
                        1. Restore factory settings
                        0. Back
                        """;
                        System.out.println(prompt);
                        userInput = input.nextInt();
                        switch (userInput) {
                            case 0 -> System.out.println("Back");
                            case 1 -> System.out.println("Settings > Restore factory settings");
                            default -> System.out.println("Invalid option.");
                        }
                    }
                    default -> System.out.println("Invalid option.");
                }
            } //6
            case 7 -> {
                System.out.println("Call register");
                prompt = """
                Call divert
                1. Call divert
                0. Back
                """;
                System.out.println(prompt);
                userInput = input.nextInt();
                switch (userInput) {
                    case 0 -> System.out.println("Back");
                    case 1 -> System.out.println("Call divert");
                    default -> System.out.println("Invalid option.");
                }   
            } //7
            case 8 -> {
                System.out.println("Games");
                prompt = """
                Games
                1. Games
                0. Back
                """;
                System.out.println(prompt);
                userInput = input.nextInt();
                switch (userInput) {
                    case 0 -> System.out.println("Back");
                    case 1 -> System.out.println("Games");
                    default -> System.out.println("Invalid option.");
                }
            } //8
            case 9 -> {
                System.out.println("Calculator");
                prompt = """
                Calculator
                1. Calculator
                0. Back
                """;
                System.out.println(prompt);
                userInput = input.nextInt();
                switch (userInput) {
                    case 0 -> System.out.println("Back");
                    case 1 -> System.out.println("Calculator");
                    default -> System.out.println("Invalid option.");
                }
            } //9
            case 10 -> {
                System.out.println("Reminders");
                prompt = """
                Reminders
                1. Reminders
                0. Back
                """;
                System.out.println(prompt);
                userInput = input.nextInt();
                switch (userInput) {    
                    case 0 -> System.out.println("Back");
                    case 1 -> System.out.println("Reminders");
                    default -> System.out.println("Invalid option.");
                }
            } //10
            case 11 -> {
                System.out.println("Clock");
                prompt = """
                Clock
                1. Alarm clock
                2. Clock settings
                3. Date setting
                4. Stopwatch
                5. Countdown timer
                6. Auto update of date and time
                0. Back
                """;
                System.out.println(prompt);
                userInput = input.nextInt();
                switch (userInput) {
                    case 0 -> System.out.println("Back");
                    case 1 -> {
                        prompt = """
                        Clock
                        1. Alarm clock
                        2. Clock settings
                        3. Date setting
                        4. Stopwatch
                        5. Countdown timer
                        6. Auto update of date and time
                        0. Back
                        """;
                        System.out.println(prompt);
                        userInput = input.nextInt();
                        switch (userInput) {
                            case 0 -> System.out.println("Back");
                            case 1 -> System.out.println("Clock > Alarm clock");
                            case 2 -> System.out.println("Clock > Clock settings");
                            case 3 -> System.out.println("Clock > Date setting");
                            case 4 -> System.out.println("Clock > Stopwatch");
                            case 5 -> System.out.println("Clock > Countdown timer");
                            case 6 -> System.out.println("Clock > Auto update of date and time");
                            default -> System.out.println("Invalid option.");
                        }
                    }
                }
            } //11
            case 12 -> {
                System.out.println("Profiles");
                prompt = """
                Profiles
                1. Profiles
                0. Back
                """;
                System.out.println(prompt);
                userInput = input.nextInt();
                switch (userInput) {
                    case 0 -> System.out.println("Back");
                    case 1 -> System.out.println("Profiles");
                    default -> System.out.println("Invalid option.");
                }
            } //12
            case 13 -> {
                System.out.println("SIM services");
                prompt = """
                SIM services
                1. SIM services
                0. Back
                """;
                System.out.println(prompt);
                userInput = input.nextInt();
                switch (userInput) {
                    case 0 -> System.out.println("Back");
                    case 1 -> System.out.println("SIM services");
                    default -> System.out.println("Invalid option.");
                }
            } //13
            default -> System.out.println("case2 track it");
        }
    }
}
    
