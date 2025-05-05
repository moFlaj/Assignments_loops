import java.util.Scanner;

public class NokiaPhoneMod{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		int userInput;
		String menu;
		String phoneBook;
		Boolean restart = true;
		Boolean phoneB = true;
		Boolean opTions = true;
		String options;
		Boolean meSsages = true;
		String messages;
		Boolean messageseTtings = true;
		String messageSettings;
		Boolean seTone = true;
		String setOne;
		Boolean comMon = true;
		String common;
		String callRegister;
		Boolean callReg = true;
		Boolean callDura = true;
		String callDuration;
		String callCosts;
		Boolean callCost = true;
		Boolean costSettings = true;
		String callCostSettings;
		Boolean toNes = true;
		String tones;
		Boolean setTings = true;
		String settings;
		Boolean callSettings = true;
		String callseTtings;
		Boolean phoneSet = true;
		String phoneSettings;
		Boolean securitySet = true;
		String securitySettings;
		Boolean clock = true;
		String clockSet;
		Boolean search = true;
		Boolean serviceNum = true;
		Boolean addName = true;
		Boolean erase = true;
		Boolean edit = true;
		Boolean assignTone = true;
		Boolean card = true;
		Boolean typeView = true;
		Boolean memory = true;
		Boolean speedDials = true;
		Boolean voiceTags = true;
		Boolean smileys = true;
		Boolean templates = true;
		Boolean picText = true;
		Boolean outbox = true;
		Boolean inbox = true;
		Boolean writeText = true;
		Boolean messValid = true;
		Boolean mesCentNum = true;
		Boolean messSentAs = true;
		Boolean infoService = true;
		Boolean voiceMail = true;
		Boolean servCommand = true;
		Boolean characterSupport = true;
		Boolean replySameCentre = true;
		Boolean deliveryRep = true;
		Boolean chat = true;
		Boolean missedCalls = true;
		Boolean receivedCalls = true;
		Boolean dialledNum = true;
		Boolean eraseRecent = true;
			
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
phoneB = true;
meSsages = true;
callReg = true;
toNes = true;
setTings = true;
clock = true;
chat = true;
Boolean callDivert = true;
Boolean games = true;
Boolean calculator = true;
Boolean reminder = true;
Boolean profile = true;
Boolean simServices = true;
			switch(userInput){
				case 0: restart = false; break;
				case 1: 
 
while(phoneB){
phoneBook = """
  Phonebook
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
opTions = true;
phoneB = true;
search = true;
serviceNum = true;
addName = true;
erase = true;
edit = true;
assignTone = true;
card = true;
speedDials = true;
voiceTags = true;

				switch(userInput){
					case 0: phoneB = false;break;
					case 1: while(search){System.out.println("Search");userInput = input.nextInt();switch(userInput){case 0: search = false;continue; default: System.out.println("Invalid directory");}}break;
					case 2: while(serviceNum){System.out.println("Service Numbers");userInput = input.nextInt();switch(userInput){case 0: serviceNum = false; continue;default: System.out.println("Invalid directory");break;}}break;
					case 3: while(addName){System.out.println("Add Name");userInput = input.nextInt();switch(userInput){case 0: addName = false; continue; default: System.out.println("Invalid directory");break;}}break;
					case 4: while(erase){System.out.println("Erase");userInput = input.nextInt();switch(userInput){case 0:  erase = false; continue;default: System.out.println("Invalid directory");break;}}break;
					case 5: while(edit){System.out.println("Edit");userInput = input.nextInt();switch(userInput){case 0: edit = false; continue;default: System.out.println("Invalid directory");break;}}break;
					case 6: while(assignTone){System.out.println("Assign tone");userInput = input.nextInt();switch(userInput){case 0: assignTone = false; continue;default: System.out.println("Invalid directory");break;}}break;
					case 7: while(card){System.out.println("Send b'card");userInput = input.nextInt();switch(userInput){case 0: card = false; continue;default: System.out.println("Invalid directory");break;}}break;
					case 8: 
while(opTions){
options = """
1. Type of view
2. Memory status
""";
System.out.println(options);
userInput = input.nextInt();
					switch(userInput){
						case 0: opTions = false;break;
						case 1: while(typeView){System.out.println("Type of view");userInput = input.nextInt();switch(userInput){case 0: typeView = false; continue;default: System.out.println("Invalid directory");break;}}break;
						case 2: while(memory){System.out.println("Memory status");userInput = input.nextInt();switch(userInput){case 0: memory = false; continue;default: System.out.println("Invalid directory");break;}}break;
						default: System.out.println("Invalid directory");break;
						
}
}
continue;
					case 9: while(speedDials){System.out.println("Speed dials");userInput = input.nextInt();switch(userInput){case 0: speedDials = false; continue;default: System.out.println("Invalid directory");break;}}break;
					case 10: while(voiceTags){System.out.println("Voice tags");userInput = input.nextInt();switch(userInput){case 0: voiceTags = false; continue;default: System.out.println("Invalid directory");break;}}break;
					default: System.out.println("Invalid directory");break;

}
}
continue;
				case 2: 
while(meSsages){
messages = """
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
messageseTtings = true;
writeText = true;
inbox = true;
outbox = true;
picText = true;
templates = true;
smileys = true;
infoService = true;
voiceMail = true;
servCommand = true;


				switch(userInput){
					case 0: meSsages = false;break;
					case 1: while(writeText){System.out.println("Write messages");userInput = input.nextInt();switch(userInput){case 0: writeText = false; continue;default: System.out.println("Invalid directory");break;}}break;
					case 2: while(inbox){System.out.println("Inbox");userInput = input.nextInt();switch(userInput){case 0: inbox = false; continue;default: System.out.println("Invalid directory");break;}}break;
					case 3: while(outbox){System.out.println("Outbox");userInput = input.nextInt();switch(userInput){case 0: outbox = false; continue;default: System.out.println("Invalid directory");break;}}break;
					case 4: while(picText){System.out.println("Picture messages");userInput = input.nextInt();switch(userInput){case 0: picText = false; continue;default: System.out.println("Invalid directory");break;}}break;
					case 5: while(templates){System.out.println("Templates");userInput = input.nextInt();switch(userInput){case 0: templates = false; continue;default: System.out.println("Invalid directory");break;}}break;
					case 6: while(smileys){System.out.println("Smileys");userInput = input.nextInt();switch(userInput){case 0: smileys = false; continue;default: System.out.println("Invalid directory");break;}}break;
					case 7: 
while(messageseTtings){
messageSettings = """
1. Set 1
2. Common""";
System.out.println(messageSettings);
userInput = input.nextInt();
seTone = true;
comMon = true;
					switch(userInput){
						case 0: messageseTtings = false;break;
						case 1: 
while(seTone){
setOne = """
1. Message centre number
2. Messages sent as
3. Message validity""";
System.out.println(setOne);
userInput = input.nextInt();
mesCentNum = true;
messValid = true;
messValid = true;
						switch(userInput){

							case 0: seTone = false;break;
							case 1: while(mesCentNum){System.out.println("Message centre number");userInput = input.nextInt();switch(userInput){case 0: mesCentNum = false; continue;default: System.out.println("Invalid directory");break;}}break;
							case 2: while(messSentAs){System.out.println("Messages sent as");userInput = input.nextInt();switch(userInput){case 0: messSentAs = false; continue;default: System.out.println("Invalid directory");break;}}break;
							case 3: while(messValid){System.out.println("Message validity");userInput = input.nextInt();switch(userInput){case 0: messValid = false; continue;default: System.out.println("Invalid directory");break;}}break;
							default: System.out.println("Invalid directory");break;						
}
}
continue;
						case 2: 
while(comMon){
common = """
1. Delivery Reports
2. Reply via same centre
3. Character support""";
System.out.println(common);
userInput = input.nextInt();
deliveryRep = true;
replySameCentre = true;
characterSupport = true;

							switch(userInput){
								case 0: comMon = false;break;
								case 1: while(deliveryRep){System.out.println("Delivery Reports");userInput = input.nextInt();switch(userInput){case 0: deliveryRep = false; continue;default: System.out.println("Invalid directory");break;}}break;
								case 2: while(replySameCentre){System.out.println("Reply via same centre");userInput = input.nextInt();switch(userInput){case 0: replySameCentre = false; continue;default: System.out.println("Invalid directory");break;}}break;
								case 3: while(characterSupport){System.out.println("Character support");userInput = input.nextInt();switch(userInput){case 0: characterSupport = false; continue;default: System.out.println("Invalid directory");break;}}break;
								default: System.out.println("Invalid directory");break;

}
}
continue;
						default: System.out.println("Invalid directory");break;
}

}

continue;
					case 8: while(infoService){System.out.println("Info service");userInput = input.nextInt();switch(userInput){case 0: infoService = false; continue;default: System.out.println("Invalid directory");break;}}break;
					case 9: while(voiceMail){System.out.println("Voice mailbox number");userInput = input.nextInt();switch(userInput){case 0: voiceMail = false; continue;default: System.out.println("Invalid directory");break;}}break;
					case 10: while(servCommand){System.out.println("Service command editor");userInput = input.nextInt();switch(userInput){case 0: servCommand = false; continue;default: System.out.println("Invalid directory");break;}}break;
					default: System.out.println("Invalid directory");break;
					

}
}
continue;
				case 3: while(chat){System.out.println("Chat");userInput = input.nextInt();switch(userInput){case 0: chat = false; continue;default: System.out.println("Invalid directory");break;}}break;
				case 4: 
while(callReg){
callRegister = """
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
callDura = true;
callCost = true;
costSettings = true;
missedCalls = true;
receivedCalls = true;
dialledNum = true;
eraseRecent = true;
Boolean prepCredit = true;
					switch(userInput){
						case 0: callReg = false;break;
						case 1: while(missedCalls){System.out.println("Missed calls");userInput = input.nextInt();switch(userInput){case 0: missedCalls = false; continue;default: System.out.println("Invalid directory");break;}}break;
						case 2: while(receivedCalls){System.out.println("Received calls");userInput = input.nextInt();switch(userInput){case 0: receivedCalls = false; continue;default: System.out.println("Invalid directory");break;}}break;
						case 3: while(dialledNum){System.out.println("Dialled numbers");userInput = input.nextInt();switch(userInput){case 0: dialledNum = false; continue;default: System.out.println("Invalid directory");break;}}break;
						case 4: while(eraseRecent){System.out.println("Erase recent call lists");userInput = input.nextInt();switch(userInput){case 0: eraseRecent = false; continue;default: System.out.println("Invalid directory");break;}}break;
						case 5: 
while(callDura){
callDuration = """
1. Last call duration
2. All calls duration
3. Received calls duration
4. Dialled calls duration
5. Clear timers""";
System.out.println(callDuration);
userInput = input.nextInt();
Boolean lastCall = true;
Boolean allCallsDura = true;
Boolean receivedCall = true;
Boolean dialledCall = true;
Boolean clearTimers = true;


						switch(userInput){
							case 0: callDura = false;break;
							case 1: while(lastCall){System.out.println("Last call duration");userInput = input.nextInt();switch(userInput){case 0: lastCall = false; continue;default: System.out.println("Invalid directory");break;}}break;
							case 2: while(allCallsDura){System.out.println("All calls duration");userInput = input.nextInt();switch(userInput){case 0: allCallsDura = false; continue;default: System.out.println("Invalid directory");break;}}break;
							case 3: while(receivedCall){System.out.println("Received calls duration");userInput = input.nextInt();switch(userInput){case 0: receivedCall = false; continue;default: System.out.println("Invalid directory");break;}}break;
							case 4: while(dialledCall){System.out.println("Dialled calls duration");userInput = input.nextInt();switch(userInput){case 0: dialledCall = false; continue;default: System.out.println("Invalid directory");break;}}break;
							case 5: while(clearTimers){System.out.println("Clear timers");userInput = input.nextInt();switch(userInput){case 0: clearTimers = false; continue;default: System.out.println("Invalid directory");break;}}break;
							default: System.out.println("Invalid directory");break;
}					
}
continue;
						case 6: 
while(callCost){
callCosts = """
1. Last call cost
2. All calls costs
3. Clear counters""";
System.out.println(callCosts);
userInput = input.nextInt();
Boolean lastCallCosts = true;
Boolean allCallsCosts = true;
Boolean clearCounters = true;

						switch(userInput){
							case 0: callCost = false;break;
							case 1: while(lastCallCosts){System.out.println("Last call cost");userInput = input.nextInt();switch(userInput){case 0: lastCallCosts = false; continue;default: System.out.println("Invalid directory");break;}}break;
							case 2: while(allCallsCosts){System.out.println("All calls costs");userInput = input.nextInt();switch(userInput){case 0: allCallsCosts = false; continue;default: System.out.println("Invalid directory");break;}}break;
							case 3: while(clearCounters){System.out.println("Clear counters");userInput = input.nextInt();switch(userInput){case 0: clearCounters = false; continue;default: System.out.println("Invalid directory");break;}}break;
							default: System.out.println("Invalid directory");break;
}
}
continue;
						case 7: 
while(costSettings){
callCostSettings = """
1. Call cost limit
2. Show costs in""";
System.out.println(callCostSettings);
userInput = input.nextInt();
Boolean costLimit = true;
Boolean showCosts = true;
						switch(userInput){
							case 0: costSettings = false;break;
							case 1: while(costLimit){System.out.println("Call cost limit");userInput = input.nextInt();switch(userInput){case 0: costLimit = false; continue;default: System.out.println("Invalid directory");break;}}break;
							case 2: while(showCosts){System.out.println("Show costs in");userInput = input.nextInt();switch(userInput){case 0: showCosts = false; continue;default: System.out.println("Invalid directory");break;}}break;
							default: System.out.println("Invalid directory");break;
}
}
continue;
						case 8: while(prepCredit){System.out.println("Prepaid credit");userInput = input.nextInt();switch(userInput){case 0: prepCredit = false; continue;default: System.out.println("Invalid directory");break;}}break;
						default: System.out.println("Invalid directory");break;
}
}
continue;
				case 5: 
while(toNes){
tones = """
1. Ringing tone
2. Ringing volume
3. Incoming call alert
4. Composer
5. Message alert tone
6. Keypad tones
7. Warning and game tones
8. Vibrating alert
9. Screen saver""";
System.out.println(tones);
userInput = input.nextInt();
Boolean screenSaver = true;
Boolean vibratingAlert = true;
Boolean gameTones = true;
Boolean keypadTones = true;
Boolean messageAlertTone = true;
Boolean composer = true;
Boolean incomingAlert = true;
Boolean ringingVol = true;
Boolean ringingTone = true;

					switch(userInput){
						case 0: toNes = false;break;
						case 1: while(ringingTone){System.out.println("Ringing tone");userInput = input.nextInt();switch(userInput){case 0: ringingTone = false; continue;default: System.out.println("Invalid directory");break;}}break;
						case 2: while(ringingVol){System.out.println("Ringing volume");userInput = input.nextInt();switch(userInput){case 0: ringingVol = false; continue;default: System.out.println("Invalid directory");break;}}break;
						case 3: while(incomingAlert){System.out.println("Incoming call alert");userInput = input.nextInt();switch(userInput){case 0: incomingAlert = false; continue;default: System.out.println("Invalid directory");break;}}break;
						case 4: while(composer){System.out.println("Composer");userInput = input.nextInt();switch(userInput){case 0: composer = false; continue;default: System.out.println("Invalid directory");break;}}break;
						case 5: while(messageAlertTone){System.out.println("Message alert tone");userInput = input.nextInt();switch(userInput){case 0: messageAlertTone = false; continue;default: System.out.println("Invalid directory");break;}}break;
						case 6: while(keypadTones){System.out.println("Keypad tones");userInput = input.nextInt();switch(userInput){case 0: keypadTones = false; continue;default: System.out.println("Invalid directory");break;}}break;
						case 7: while(gameTones){System.out.println("Warning and game tones");userInput = input.nextInt();switch(userInput){case 0: gameTones = false; continue;default: System.out.println("Invalid directory");break;}}break;
						case 8: while(vibratingAlert){System.out.println("Vibrating alert");userInput = input.nextInt();switch(userInput){case 0: vibratingAlert = false; continue;default: System.out.println("Invalid directory");break;}}break;
						case 9: while(screenSaver){System.out.println("Screen saver");userInput = input.nextInt();switch(userInput){case 0: screenSaver = false; continue;default: System.out.println("Invalid directory");break;}}break;
						default: System.out.println("Invalid directory");break;
						
}
}
continue;
				case 6: 
while(setTings){
settings = """
1. Call settings
2. Phone settings
3. Security settings
4. Restore factory settings""";
System.out.println(settings);
userInput = input.nextInt();
callSettings = true;
phoneSet = true;
securitySet = true;
Boolean restoreFactory = true;
					switch(userInput){
						case 0: setTings = false;break;
						case 1: 
while(callSettings){
callseTtings = """
1. Automatic redial
2. Speed dialing
3. Call waiting options
4. Own number sending
5. Phone line in use
6. Automatic answer""";
System.out.println(callseTtings);
userInput = input.nextInt();
Boolean autoRedial = true;
Boolean autoAnswer = true;
Boolean phoneLine = true;
Boolean ownNumberSend = true;
Boolean speedDial = true;
Boolean callWaiting = true;
							switch(userInput){
								case 0: callSettings = false;break;
								case 1: while(autoRedial){System.out.println("Automatic redial");userInput = input.nextInt();switch(userInput){case 0: autoRedial = false; continue;default: System.out.println("Invalid directory");break;}}break;
								case 2: while(speedDial){System.out.println("Speed dialing");userInput = input.nextInt();switch(userInput){case 0: speedDial = false; continue;default: System.out.println("Invalid directory");break;}}break;
								case 3: while(callWaiting){System.out.println("Call waiting options");userInput = input.nextInt();switch(userInput){case 0: callWaiting = false; continue;default: System.out.println("Invalid directory");break;}}break;
								case 4: while(ownNumberSend){System.out.println("Own number sending");userInput = input.nextInt();switch(userInput){case 0: ownNumberSend = false; continue;default: System.out.println("Invalid directory");break;}}break;
								case 5: while(phoneLine){System.out.println("Phone line in use");userInput = input.nextInt();switch(userInput){case 0: phoneLine = false; continue;default: System.out.println("Invalid directory");break;}}break;
								case 6: while(autoAnswer){System.out.println("Automatic answer");userInput = input.nextInt();switch(userInput){case 0: autoAnswer = false; continue;default: System.out.println("Invalid directory");break;}}break;
								default: System.out.println("Invalid directory");break;
								
}
}
continue;
						case 2: 
while(phoneSet){
phoneSettings = """
1. Language
2. Cell info display
3. Welcome note
4. Network selection
5. Lights
6. Confirm SIM service actions""";
System.out.println(phoneSettings);
userInput = input.nextInt();
Boolean confirmSim = true;
Boolean lights = true;
Boolean networkSelect = true;
Boolean welcomeNote = true;
Boolean cellInfo = true;
Boolean language = true;
							switch(userInput){
								case 0: phoneSet = false; break;
								case 1: while(language){System.out.println("Language");userInput = input.nextInt();switch(userInput){case 0: language = false; continue;default: System.out.println("Invalid directory");break;}}break;
								case 2: while(cellInfo){System.out.println("Cell info display");userInput = input.nextInt();switch(userInput){case 0: cellInfo = false; continue;default: System.out.println("Invalid directory");break;}}break;
								case 3: while(welcomeNote){System.out.println("Welcome note");userInput = input.nextInt();switch(userInput){case 0: welcomeNote = false; continue;default: System.out.println("Invalid directory");break;}}break;
								case 4: while(networkSelect){System.out.println("Network selection");userInput = input.nextInt();switch(userInput){case 0: networkSelect = false; continue;default: System.out.println("Invalid directory");break;}}break;
								case 5: while(lights){System.out.println("Lights");userInput = input.nextInt();switch(userInput){case 0: lights = false; continue;default: System.out.println("Invalid directory");break;}}break;
								case 6: while(confirmSim){System.out.println("Confirm SIM service actions");userInput = input.nextInt();switch(userInput){case 0: confirmSim = false; continue;default: System.out.println("Invalid directory");break;}}break;
								default: System.out.println("Invalid directory");break;
}
}
continue;
						case 3: 
while(securitySet){
securitySettings = """
1. PIN code request
2. Call barring service
3. Fixed dialling
4. Closed user group
5. Phone security
6. Change access codes""";
System.out.println(securitySettings);
userInput = input.nextInt();
Boolean fixedDial = true;
Boolean callBarring = true;
Boolean pinCode = true;
Boolean closedUser = true;
Boolean phoneSec = true;
Boolean changeAccess = true;

							switch(userInput){
								case 0: securitySet = false;break;
								case 1: while(pinCode){System.out.println("PIN code request");userInput = input.nextInt();switch(userInput){case 0: pinCode = false; continue;default: System.out.println("Invalid directory");break;}}break;
								case 2: while(callBarring){System.out.println("Call barring service");userInput = input.nextInt();switch(userInput){case 0: callBarring = false; continue;default: System.out.println("Invalid directory");break;}}break;
								case 3: while(fixedDial){System.out.println("Fixed dialling");userInput = input.nextInt();switch(userInput){case 0: fixedDial = false; continue;default: System.out.println("Invalid directory");break;}}break;
								case 4: while(closedUser){System.out.println("Closed user group");userInput = input.nextInt();switch(userInput){case 0: closedUser = false; continue;default: System.out.println("Invalid directory");break;}}break;
								case 5: while(phoneSec){System.out.println("Phone security");userInput = input.nextInt();switch(userInput){case 0: phoneSec = false; continue;default: System.out.println("Invalid directory");break;}}break;
								case 6: while(changeAccess){System.out.println("Change access codes");userInput = input.nextInt();switch(userInput){case 0: changeAccess = false; continue;default: System.out.println("Invalid directory");break;}}break;
								default: System.out.println("Invalid directory");break;
}
}
continue;
						case 4: while(restoreFactory){System.out.println("Restore factory settings");userInput = input.nextInt();switch(userInput){case 0: restoreFactory = false; continue;default: System.out.println("Invalid directory");break;}}break;
						default: System.out.println("Invalid directory");break;
						
}				

}
continue;
				case 7: while(callDivert){System.out.println("Call Divert");userInput = input.nextInt();switch(userInput){case 0: callDivert = false; continue;default: System.out.println("Invalid directory");break;}}break;
				case 8: while(games){System.out.println("Games");userInput = input.nextInt();switch(userInput){case 0: games = false; continue;default: System.out.println("Invalid directory");break;}}break;
				case 9: while(calculator){System.out.println("Calculator");userInput = input.nextInt();switch(userInput){case 0: calculator = false; continue;default: System.out.println("Invalid directory");break;}}break;
				case 10: while(reminder){System.out.println("Reminder");userInput = input.nextInt();switch(userInput){case 0: reminder = false; continue;default: System.out.println("Invalid directory");break;}}break;
				case 11: 
while(clock){
clockSet = """
1. Alarm clock
2. Clock settings
3. Date settings
4. Stopwatch
5. Countdown timer
6. Auto update of date and time""";
System.out.println(clockSet);
userInput = input.nextInt();
Boolean autoUpdateDateTime = true;
Boolean countTimer = true;
Boolean stopWatch = true;
Boolean dateSet = true;
Boolean clockSettings = true;
Boolean alarmClock = true;
					switch(userInput){
						case 0: clock = false; break;
						case 1: while(alarmClock){System.out.println("Alarm clock");userInput = input.nextInt();switch(userInput){case 0: alarmClock = false; continue;default: System.out.println("Invalid directory");break;}}break;
						case 2: while(clockSettings){System.out.println("Clock settings");userInput = input.nextInt();switch(userInput){case 0: clockSettings = false; continue;default: System.out.println("Invalid directory");break;}}break;
						case 3: while(dateSet){System.out.println("Date settings");userInput = input.nextInt();switch(userInput){case 0: dateSet = false; continue;default: System.out.println("Invalid directory");break;}}break;
						case 4: while(stopWatch){System.out.println("Stopwatch");userInput = input.nextInt();switch(userInput){case 0: stopWatch = false; continue;default: System.out.println("Invalid directory");break;}}break;
						case 5: while(countTimer){System.out.println("Countdown timer");userInput = input.nextInt();switch(userInput){case 0: countTimer = false; continue;default: System.out.println("Invalid directory");break;}}break;
						case 6: while(autoUpdateDateTime){System.out.println("Auto update of date and time");userInput = input.nextInt();switch(userInput){case 0: autoUpdateDateTime = false; continue;default: System.out.println("Invalid directory");break;}}break;
						default: System.out.println("Invalid directory");break;
}
}
continue;
				case 12: while(profile){System.out.println("Profile");userInput = input.nextInt();switch(userInput){case 0: profile = false; continue;default: System.out.println("Invalid directory");break;}}break;
				case 13: while(simServices){System.out.println("SIM services");userInput = input.nextInt();switch(userInput){case 0: simServices = false; continue;default: System.out.println("Invalid directory");break;}}break;
				default: System.out.println("Invalid directory");break;
}
}








}
}

