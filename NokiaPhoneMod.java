import java.util.Scanner;

public class NokiaPhoneMod{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		int userInput;
		String menu;
		String phoneBook;
		String options;
		String messages;
		String messageSettings;
		String setOne;
		String common;
		String callDuration;
		String callRegister;
		boolean restart = true;
		boolean callrEgister = true;
		boolean calldUration = true;

		while(restart){
menu = """
1. Phonebook
2. Messages
3. Chat
4. Call register
5. Tones
6. Settings
7. Call Divert
8. Games
9. Calculator
10. Reminders
11. Clock
12. Profiles
13. SIM services
""";
System.out.println(menu);
userInput = input.nextInt();
			switch(userInput){
				case 0: restart = false; break;
				case 1: phoneBook = phoneBook = """
1. Search
2. Service Numbers
3. Add Name
4. Erase
5. Edit
6. Assign tone
7. Send b'card
8. Options
9. Speed dials
10. Voice tags
""";
System.out.println(phoneBook);
userInput = input.nextInt();
				switch(userInput){
					case 0: restart = false; break;
					case 1: System.out.println("Search");break;
					case 2: System.out.println("Service Numbers");break;
					case 3: System.out.println("Add Name");break;
					case 4: System.out.println("Erase");break;
					case 5: System.out.println("Edit");break;
					case 6: System.out.println("Assign tone");break;
					case 7: System.out.println("Send b'card");break;
					case 8: options = """
1. Type of view
2. Memory status
""";
System.out.println(options);
userInput = input.nextInt();
					switch(userInput){
						case 0: restart = false; break;
						case 1:  System.out.println("Type of view");break;
						case 2: System.out.println("Memory status");break;
}
break;
					case 9: System.out.println("Speed dials");break;
					case 10: System.out.println("Voice tags");break;
										
}
break;
				case 2: messages = """
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
""";
System.out.println(messages);
userInput = input.nextInt();
					switch(userInput){
						case 0: restart = false; break;
						case 1: System.out.println("Write messages");break;
						case 2: System.out.println("Inbox");break;
						case 3: System.out.println("Outbox");break;
						case 4: System.out.println("Picture messages");break;
						case 5: System.out.println("Templates");break;
						case 6: System.out.println("Smileys");break;
						case 7: messageSettings = """
1. Set 1
2. Common""";
System.out.println(messageSettings);
userInput = input.nextInt();
						switch(userInput){
							case 0: restart = false; break;
							case 1: setOne = """
1. Message centre number
2. Messages sent as
3. Message validity""";
System.out.println(setOne);
userInput = input.nextInt();
							switch(userInput){
								case 0: restart = false; break;
								case 1: System.out.println("Message centre number");break;
								case 2: System.out.println("Messages sent as");break;
								case 3: System.out.println("Message validity");break;
}
break;
							case 2: common = """
1. Delivery Reports
2. Reply via same centre
3. Character support""";
System.out.println(common);
userInput = input.nextInt();
								switch(userInput){
								case 0: restart = false; break;
								case 1: System.out.println("Delivery Reports");break;
								case 2: System.out.println("Reply via same centre");break;
								case 3: System.out.println("Character support");break;
}
break;
}
break;
						case 8: System.out.println("Info service");break;
						case 9: System.out.println("Voice mailbox number");break;
						case 10: System.out.println("Service command editor");break;
}
break;
				case 3: System.out.println("Chat");break;
				case 4: callRegister = """
1. Missed calls
2. Received calls
3. Dialled numbers
4. Erase recent call lists
5. Show call duration
6. Show call costs
7. Call cost settings
8. Prepaid credit""";
System.out.println(callRegister);
userInput = input.nextInt();
					
						switch(userInput){
							case 0: callrEgister = false;break;
							case 1: System.out.println("Missed calls");break;
							case 2: System.out.println("Received calls");break;
							case 3: System.out.println("Dialled numbers");break;
							case 4: System.out.println("");break;
							case 5: callDuration = """
1. Last call duration
2. All calls duration
3. Received calls duration
4. Dialled calls duration
5. Clear timers""";
System.out.println(callDuration);
userInput = input.nextInt();
						
							switch(userInput){
								case 0: calldUration = false; break;
								case 1: System.out.println("Last call duration");break;
								case 2: System.out.println("All calls duration");break;
								case 3: System.out.println("Received calls duration");break;
								case 4: System.out.println("Dialled calls duration");break;
								case 5: System.out.println("Clear timers");break;
								
								

}
break;
							case 6: break;
							case 7: break;
							case 8: System.out.println("Prepaid credit");break;		

}
break;
				case 5:break;
				case 6:break;
				case 7:break;
				case 8:break;
				case 9:break;
				case 10:break;
				case 11:break;
				case 12:break;
				case 13:break;
}
				
}


}
}
	

		