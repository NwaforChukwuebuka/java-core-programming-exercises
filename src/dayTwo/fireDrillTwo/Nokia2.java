import java.util.Scanner;

public class Nokia2{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		runMenu(sc);
    }

	private static void runMenu(Scanner sc) {
		while (true) {
			printMainMenu();
			int choice = readInt(sc, "Select (0 to exit): ");

			switch (choice) {
				case 0 -> {
					System.out.println("Goodbye.");
					return;
				}
				case 1 -> phoneBook(sc);
				case 2 -> messages(sc);
				case 3 -> leaf(sc, "Chat");
				case 4 -> callRegister(sc);
				case 5 -> tones(sc);
				case 6 -> settings(sc);
				case 7 -> leaf(sc, "Call divert");
				case 8 -> leaf(sc, "Games");
				case 9 -> leaf(sc, "Calculator");
				case 10 -> leaf(sc, "Reminders");
				case 11 -> clock(sc);
				case 12 -> leaf(sc, "Profiles");
				case 13 -> leaf(sc, "SIM services");
				default -> System.out.println("Invalid option. Try again.");
			}
		}
	}

	private static void phoneBook(Scanner sc) {
		while (true) {
			System.out.println();
			System.out.println("Phone book");
			System.out.println("1. Search");
			System.out.println("2. Service Nos.");
			System.out.println("3. Add name");
			System.out.println("4. Erase");
			System.out.println("5. Edit");
			System.out.println("6. Assign tone");
			System.out.println("7. Send b'card");
			System.out.println("8. Options");
			System.out.println("9. Speed dials");
			System.out.println("10. Voice tags");
			System.out.println("0. Back");

			int choice = readInt(sc, "Select: ");
			switch (choice) {
				case 0 -> { return; }
				case 1 -> leaf(sc, "Phone book > Search");
				case 2 -> leaf(sc, "Phone book > Service Nos.");
				case 3 -> leaf(sc, "Phone book > Add name");
				case 4 -> leaf(sc, "Phone book > Erase");
				case 5 -> leaf(sc, "Phone book > Edit");
				case 6 -> leaf(sc, "Phone book > Assign tone");
				case 7 -> leaf(sc, "Phone book > Send b'card");
				case 8 -> phoneBookOptions(sc);
				case 9 -> leaf(sc, "Phone book > Speed dials");
				case 10 -> leaf(sc, "Phone book > Voice tags");
				default -> System.out.println("Invalid option. Try again.");
			}
		}
	}

	private static void phoneBookOptions(Scanner sc) {
		while (true) {
			System.out.println();
			System.out.println("Phone book > Options");
			System.out.println("1. Type of view");
			System.out.println("2. Memory status");
			System.out.println("0. Back");

			int choice = readInt(sc, "Select: ");
			switch (choice) {
				case 0 -> { return; }
				case 1 -> leaf(sc, "Phone book > Options > Type of view");
				case 2 -> leaf(sc, "Phone book > Options > Memory status");
				default -> System.out.println("Invalid option. Try again.");
			}
		}
	}

	private static void messages(Scanner sc) {
		while (true) {
			System.out.println();
			System.out.println("Messages");
			System.out.println("1. Write messages");
			System.out.println("2. Inbox");
			System.out.println("3. Outbox");
			System.out.println("4. Picture messages");
			System.out.println("5. Templates");
			System.out.println("6. Smileys");
			System.out.println("7. Message settings");
			System.out.println("8. Info service");
			System.out.println("9. Voice mailbox number");
			System.out.println("10. Service command editor");
			System.out.println("0. Back");

			int choice = readInt(sc, "Select: ");
			switch (choice) {
				case 0 -> { return; }
				case 1 -> leaf(sc, "Messages > Write messages");
				case 2 -> leaf(sc, "Messages > Inbox");
				case 3 -> leaf(sc, "Messages > Outbox");
				case 4 -> leaf(sc, "Messages > Picture messages");
				case 5 -> leaf(sc, "Messages > Templates");
				case 6 -> leaf(sc, "Messages > Smileys");
				case 7 -> messageSettings(sc);
				case 8 -> leaf(sc, "Messages > Info service");
				case 9 -> leaf(sc, "Messages > Voice mailbox number");
				case 10 -> leaf(sc, "Messages > Service command editor");
				default -> System.out.println("Invalid option. Try again.");
			}
		}
	}

	private static void messageSettings(Scanner sc) {
		while (true) {
			System.out.println();
			System.out.println("Messages > Message settings");
			System.out.println("1. Set 1");
			System.out.println("2. Common");
			System.out.println("0. Back");

			int choice = readInt(sc, "Select: ");
			switch (choice) {
				case 0 -> { return; }
				case 1 -> messageSettingsSet1(sc);
				case 2 -> messageSettingsCommon(sc);
				default -> System.out.println("Invalid option. Try again.");
			}
		}
	}

	private static void messageSettingsSet1(Scanner sc) {
		while (true) {
			System.out.println();
			System.out.println("Messages > Message settings > Set 1");
			System.out.println("1. Message centre number");
			System.out.println("2. Messages sent as");
			System.out.println("3. Message validity");
			System.out.println("0. Back");

			int choice = readInt(sc, "Select: ");
			switch (choice) {
				case 0 -> { return; }
				case 1 -> leaf(sc, "Messages > Message settings > Set 1 > Message centre number");
				case 2 -> leaf(sc, "Messages > Message settings > Set 1 > Messages sent as");
				case 3 -> leaf(sc, "Messages > Message settings > Set 1 > Message validity");
				default -> System.out.println("Invalid option. Try again.");
			}
		}
	}

	private static void messageSettingsCommon(Scanner sc) {
		while (true) {
			System.out.println();
			System.out.println("Messages > Message settings > Common");
			System.out.println("1. Delivery reports");
			System.out.println("2. Reply via same centre");
			System.out.println("3. Character support");
			System.out.println("0. Back");

			int choice = readInt(sc, "Select: ");
			switch (choice) {
				case 0 -> { return; }
				case 1 -> leaf(sc, "Messages > Message settings > Common > Delivery reports");
				case 2 -> leaf(sc, "Messages > Message settings > Common > Reply via same centre");
				case 3 -> leaf(sc, "Messages > Message settings > Common > Character support");
				default -> System.out.println("Invalid option. Try again.");
			}
		}
	}

	private static void callRegister(Scanner sc) {
		while (true) {
			System.out.println();
			System.out.println("Call register");
			System.out.println("1. Missed calls");
			System.out.println("2. Received calls");
			System.out.println("3. Dialled numbers");
			System.out.println("4. Erase recent call lists");
			System.out.println("5. Show call duration");
			System.out.println("6. Show call costs");
			System.out.println("7. Call cost settings");
			System.out.println("8. Prepaid credit");
			System.out.println("0. Back");

			int choice = readInt(sc, "Select: ");
			switch (choice) {
				case 0 -> { return; }
				case 1 -> leaf(sc, "Call register > Missed calls");
				case 2 -> leaf(sc, "Call register > Received calls");
				case 3 -> leaf(sc, "Call register > Dialled numbers");
				case 4 -> leaf(sc, "Call register > Erase recent call lists");
				case 5 -> showCallDuration(sc);
				case 6 -> showCallCosts(sc);
				case 7 -> callCostSettings(sc);
				case 8 -> leaf(sc, "Call register > Prepaid credit");
				default -> System.out.println("Invalid option. Try again.");
			}
		}
	}

	private static void showCallDuration(Scanner sc) {
		while (true) {
			System.out.println();
			System.out.println("Call register > Show call duration");
			System.out.println("1. Last call duration");
			System.out.println("2. All calls' duration");
			System.out.println("3. Received calls' duration");
			System.out.println("4. Dialled calls' duration");
			System.out.println("5. Clear timers");
			System.out.println("0. Back");

			int choice = readInt(sc, "Select: ");
			switch (choice) {
				case 0 -> { return; }
				case 1 -> leaf(sc, "Call register > Show call duration > Last call duration");
				case 2 -> leaf(sc, "Call register > Show call duration > All calls' duration");
				case 3 -> leaf(sc, "Call register > Show call duration > Received calls' duration");
				case 4 -> leaf(sc, "Call register > Show call duration > Dialled calls' duration");
				case 5 -> leaf(sc, "Call register > Show call duration > Clear timers");
				default -> System.out.println("Invalid option. Try again.");
			}
		}
	}

	private static void showCallCosts(Scanner sc) {
		while (true) {
			System.out.println();
			System.out.println("Call register > Show call costs");
			System.out.println("1. Last call cost");
			System.out.println("2. All calls' cost");
			System.out.println("3. Clear counters");
			System.out.println("0. Back");

			int choice = readInt(sc, "Select: ");
			switch (choice) {
				case 0 -> { return; }
				case 1 -> leaf(sc, "Call register > Show call costs > Last call cost");
				case 2 -> leaf(sc, "Call register > Show call costs > All calls' cost");
				case 3 -> leaf(sc, "Call register > Show call costs > Clear counters");
				default -> System.out.println("Invalid option. Try again.");
			}
		}
	}

	private static void callCostSettings(Scanner sc) {
		while (true) {
			System.out.println();
			System.out.println("Call register > Call cost settings");
			System.out.println("1. Call cost limit");
			System.out.println("2. Show costs in");
			System.out.println("0. Back");

			int choice = readInt(sc, "Select: ");
			switch (choice) {
				case 0 -> { return; }
				case 1 -> leaf(sc, "Call register > Call cost settings > Call cost limit");
				case 2 -> leaf(sc, "Call register > Call cost settings > Show costs in");
				default -> System.out.println("Invalid option. Try again.");
			}
		}
	}

	private static void tones(Scanner sc) {
		while (true) {
			System.out.println();
			System.out.println("Tones");
			System.out.println("1. Ringing tone");
			System.out.println("2. Ringing volume");
			System.out.println("3. Incoming call alert");
			System.out.println("4. Composer");
			System.out.println("5. Message alert tone");
			System.out.println("6. Keypad tones");
			System.out.println("7. Warning and game tones");
			System.out.println("8. Vibrating alert");
			System.out.println("9. Screen saver");
			System.out.println("0. Back");

			int choice = readInt(sc, "Select: ");
			switch (choice) {
				case 0 -> { return; }
				case 1 -> leaf(sc, "Tones > Ringing tone");
				case 2 -> leaf(sc, "Tones > Ringing volume");
				case 3 -> leaf(sc, "Tones > Incoming call alert");
				case 4 -> leaf(sc, "Tones > Composer");
				case 5 -> leaf(sc, "Tones > Message alert tone");
				case 6 -> leaf(sc, "Tones > Keypad tones");
				case 7 -> leaf(sc, "Tones > Warning and game tones");
				case 8 -> leaf(sc, "Tones > Vibrating alert");
				case 9 -> leaf(sc, "Tones > Screen saver");
				default -> System.out.println("Invalid option. Try again.");
			}
		}
	}

	private static void settings(Scanner sc) {
		while (true) {
			System.out.println();
			System.out.println("Settings");
			System.out.println("1. Call settings");
			System.out.println("2. Phone settings");
			System.out.println("3. Security settings");
			System.out.println("4. Restore factory settings");
			System.out.println("0. Back");

			int choice = readInt(sc, "Select: ");
			switch (choice) {
				case 0 -> { return; }
				case 1 -> callSettings(sc);
				case 2 -> phoneSettings(sc);
				case 3 -> securitySettings(sc);
				case 4 -> leaf(sc, "Settings > Restore factory settings");
				default -> System.out.println("Invalid option. Try again.");
			}
		}
	}

	private static void callSettings(Scanner sc) {
		while (true) {
			System.out.println();
			System.out.println("Settings > Call settings");
			System.out.println("1. Automatic redial");
			System.out.println("2. Speed dialling");
			System.out.println("3. Call waiting options");
			System.out.println("4. Own number sending");
			System.out.println("5. Phone line in use");
			System.out.println("6. Automatic answer");
			System.out.println("0. Back");

			int choice = readInt(sc, "Select: ");
			switch (choice) {
				case 0 -> { return; }
				case 1 -> leaf(sc, "Settings > Call settings > Automatic redial");
				case 2 -> leaf(sc, "Settings > Call settings > Speed dialling");
				case 3 -> leaf(sc, "Settings > Call settings > Call waiting options");
				case 4 -> leaf(sc, "Settings > Call settings > Own number sending");
				case 5 -> leaf(sc, "Settings > Call settings > Phone line in use");
				case 6 -> leaf(sc, "Settings > Call settings > Automatic answer");
				default -> System.out.println("Invalid option. Try again.");
			}
		}
	}

	private static void phoneSettings(Scanner sc) {
		while (true) {
			System.out.println();
			System.out.println("Settings > Phone settings");
			System.out.println("1. Language");
			System.out.println("2. Cell info display");
			System.out.println("3. Welcome note");
			System.out.println("4. Network selection");
			System.out.println("5. Lights");
			System.out.println("6. Confirm SIM service actions");
			System.out.println("0. Back");

			int choice = readInt(sc, "Select: ");
			switch (choice) {
				case 0 -> { return; }
				case 1 -> leaf(sc, "Settings > Phone settings > Language");
				case 2 -> leaf(sc, "Settings > Phone settings > Cell info display");
				case 3 -> leaf(sc, "Settings > Phone settings > Welcome note");
				case 4 -> leaf(sc, "Settings > Phone settings > Network selection");
				case 5 -> leaf(sc, "Settings > Phone settings > Lights");
				case 6 -> leaf(sc, "Settings > Phone settings > Confirm SIM service actions");
				default -> System.out.println("Invalid option. Try again.");
			}
		}
	}

	private static void securitySettings(Scanner sc) {
		while (true) {
			System.out.println();
			System.out.println("Settings > Security settings");
			System.out.println("1. PIN code request");
			System.out.println("2. Call barring service");
			System.out.println("3. Fixed dialling");
			System.out.println("4. Closed user group");
			System.out.println("5. Phone security");
			System.out.println("6. Change access codes");
			System.out.println("0. Back");

			int choice = readInt(sc, "Select: ");
			switch (choice) {
				case 0 -> { return; }
				case 1 -> leaf(sc, "Settings > Security settings > PIN code request");
				case 2 -> leaf(sc, "Settings > Security settings > Call barring service");
				case 3 -> leaf(sc, "Settings > Security settings > Fixed dialling");
				case 4 -> leaf(sc, "Settings > Security settings > Closed user group");
				case 5 -> leaf(sc, "Settings > Security settings > Phone security");
				case 6 -> leaf(sc, "Settings > Security settings > Change access codes");
				default -> System.out.println("Invalid option. Try again.");
			}
		}
	}

	private static void clock(Scanner sc) {
		while (true) {
			System.out.println();
			System.out.println("Clock");
			System.out.println("1. Alarm clock");
			System.out.println("2. Clock settings");
			System.out.println("3. Date setting");
			System.out.println("4. Stopwatch");
			System.out.println("5. Countdown timer");
			System.out.println("6. Auto update of date and time");
			System.out.println("0. Back");

			int choice = readInt(sc, "Select: ");
			switch (choice) {
				case 0 -> { return; }
				case 1 -> leaf(sc, "Clock > Alarm clock");
				case 2 -> leaf(sc, "Clock > Clock settings");
				case 3 -> leaf(sc, "Clock > Date setting");
				case 4 -> leaf(sc, "Clock > Stopwatch");
				case 5 -> leaf(sc, "Clock > Countdown timer");
				case 6 -> leaf(sc, "Clock > Auto update of date and time");
				default -> System.out.println("Invalid option. Try again.");
			}
		}
	}

	private static void leaf(Scanner sc, String path) {
		System.out.println();
		System.out.println(path);
		System.out.println("Press Enter to continue...");
		sc.nextLine(); // consume any leftover newline
		sc.nextLine();
	}

	private static int readInt(Scanner sc, String prompt) {
		while (true) {
			System.out.print(prompt);
			String line = sc.nextLine().trim();
			try {
				return Integer.parseInt(line);
			} catch (NumberFormatException ignored) {
				System.out.println("Please enter a number.");
			}
		}
	}

	private static void printMainMenu() {
		System.out.println();
		System.out.println("List of menu functions");
		System.out.println("1. Phone book");
		System.out.println("2. Messages");
		System.out.println("3. Chat");
		System.out.println("4. Call register");
		System.out.println("5. Tones");
		System.out.println("6. Settings");
		System.out.println("7. Call divert");
		System.out.println("8. Games");
		System.out.println("9. Calculator");
		System.out.println("10. Reminders");
		System.out.println("11. Clock");
		System.out.println("12. Profiles");
		System.out.println("13. SIM services");
	}
  }