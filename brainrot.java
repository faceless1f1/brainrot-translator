import java.util.Scanner;

public class brainrot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your brainrot message:");
        String brainrotString = scanner.nextLine();
        brainrotString = brainrotString.toLowerCase();
        String[] words = brainrotString.split(" ");
        String outputString = "";
        for (int i = 0; i < words.length; i++) {
            String lettersOnly = words[i].replaceAll("[^a-zA-Z]", "");
            String punctuation = words[i].replaceAll("[a-zA-Z]", "") + " ";
            if (lettersOnly.length() == words[i].length()) {
                if (words[i].length() == 1) {
                    switch (words[i]) {
                        case "u":
                            outputString = outputString + "you ";
                            break;
                        case "b":
                            outputString = outputString + "be ";
                            break;
                        case "r":
                            outputString = outputString + "are ";
                            break;
                        case "n":
                            outputString = outputString + "and ";
                            break;
                        case "y":
                            outputString = outputString + "why ";
                            break;
                        case "w":
                            outputString = outputString + "with ";
                            break;
                        case "2":
                            outputString = outputString + "two ";
                            break;
                        default:
                            outputString = outputString + words[i] + " ";
                    }
                } else if (words[i].length() == 2) {
                    switch (words[i]) {
                        case "ts":
                            outputString = outputString + "this shit ";
                            break;
                        case "sm":
                            outputString = outputString + "so much ";
                            break;
                        case "ru":
                            outputString = outputString + "are you ";
                            break;
                        case "fr":
                            outputString = outputString + "for real ";
                            break;
                        case "h8":
                            outputString = outputString + "hate ";
                            break;
                        case "cz":
                            outputString = outputString + "because ";
                            break;
                        case "sb":
                            outputString = outputString + "so bad ";
                            break;
                        case "js":
                            outputString = outputString + "just ";
                            break;
                        case "mn":
                            outputString = outputString + "man ";
                            break;
                        case "qt":
                            outputString = outputString + "quit ";
                            break;
                        case "bt":
                            outputString = outputString + "but ";
                            break;
                        case "wt":
                            outputString = outputString + "what ";
                            break;
                        case "ac":
                            outputString = outputString + "actually ";
                            break;
                        case "nm":
                            outputString = outputString + "no more ";
                            break;
                        case "rn":
                            outputString = outputString + "right now ";
                            break;
                        default:
                            outputString = outputString + words[i] + " ";
                    }
                } else if (words[i].length() == 3) {
                    switch (words[i]) {
                        case "icl":
                            outputString = outputString + "i can't lie ";
                            break;
                        case "pmo":
                            outputString = outputString + "pissing me off ";
                            break;
                        case "ngl":
                            outputString = outputString + "not going to lie ";
                            break;
                        case "rnb":
                            outputString = outputString + "right now bro ";
                            break;
                        case "lol":
                            outputString = outputString + "laughing out loud ";
                            break;
                        case "oms":
                            outputString = outputString + "on my soul ";
                            break;
                        case "srs": 
                            outputString = outputString + "serious ";
                            break;
                        case "vro": 
                            outputString = outputString + "bro ";
                            break;
                        case "atp": 
                            outputString = outputString + "at this point ";
                            break;
                        case "anm":
                            outputString = outputString + "anymore ";
                            break;
                        case "gng":
                            outputString = outputString + "gang ";
                            break;
                        case "brb":
                            outputString = outputString + "be right back ";
                            break;
                        case "gtg": 
                            outputString = outputString + "got to go ";
                            break;
                        case "atm":
                            outputString = outputString + "at the moment ";
                            break;
                        case "lmk":
                            outputString = outputString + "let me know ";
                            break;
                        case "onb": 
                            outputString = outputString + "on bro ";
                            break;
                        case "nvm":
                            outputString = outputString + "never mind ";
                            break;
                        case "idk":
                            outputString = outputString + "i don't know ";
                            break;
                        case "smh":
                            outputString = outputString + "shaking my head ";
                            break;
                        default:
                            outputString = outputString + words[i] + " ";
                    }
                } else if (words[i].length() == 4) {
                    switch (words[i]) {
                        case "istg":
                            outputString = outputString + "i swear to god ";
                            break;
                        case "idek":
                            outputString = outputString + "i don't even know ";
                            break;
                        case "lmao":
                            outputString = outputString + "laughing my ass off ";
                            break;
                        case "diff":
                            outputString = outputString + "different ";
                            break;
                        case "bein":
                            outputString = outputString + "being ";
                            break;
                        default:
                            outputString = outputString + words[i] + " ";
                    }
                } else if (words[i].length() == 5) {
                    switch (words[i]) {
                        case "srsly":
                            outputString = outputString + "seriously ";
                            break;
                        default: 
                            outputString = outputString + words[i] + " ";
                    }
                } else {
                    outputString = outputString + words[i] + " ";
                }
            } else {
                if (lettersOnly.length() == 1) {
                    switch (lettersOnly) {
                        case "u":
                            outputString = outputString + "you" + punctuation;
                            break;
                        case "b":
                            outputString = outputString + "be" + punctuation;
                            break;
                        case "r":
                            outputString = outputString + "are" + punctuation;
                            break;
                        case "n":
                            outputString = outputString + "and" + punctuation;
                            break;
                        case "y":
                            outputString = outputString + "why" + punctuation;
                            break;
                        case "w":
                            outputString = outputString + "with" + punctuation;
                            break;
                        case "2":
                            outputString = outputString + "two" + punctuation;
                            break;
                        default:
                            outputString = outputString + lettersOnly + punctuation;
                    }
                } else if (lettersOnly.length() == 2) {
                    switch (lettersOnly) {
                        case "ts":
                            outputString = outputString + "this shit" + punctuation;
                            break;
                        case "sm":
                            outputString = outputString + "so much" + punctuation;
                            break;
                        case "ru":
                            outputString = outputString + "are you" + punctuation;
                            break;
                        case "fr":
                            outputString = outputString + "for real" + punctuation;
                            break;
                        case "h8":
                            outputString = outputString + "hate" + punctuation;
                            break;
                        case "cz":
                            outputString = outputString + "because" + punctuation;
                            break;
                        case "sb":
                            outputString = outputString + "so bad" + punctuation;
                            break;
                        case "js":
                            outputString = outputString + "just" + punctuation;
                            break;
                        case "mn":
                            outputString = outputString + "man" + punctuation;
                            break;
                        case "qt":
                            outputString = outputString + "quit" + punctuation;
                            break;
                        case "bt":
                            outputString = outputString + "but" + punctuation;
                            break;
                        case "wt":
                            outputString = outputString + "what" + punctuation;
                            break;
                        case "ac":
                            outputString = outputString + "actually" + punctuation;
                            break;
                        case "nm":
                            outputString = outputString + "no more" + punctuation;
                            break;
                        case "rn":
                            outputString = outputString + "right now" + punctuation;
                            break;
                        default:
                            outputString = outputString + lettersOnly + punctuation;
                    }
                } else if (lettersOnly.length() == 3) {
                    switch (lettersOnly) {
                        case "icl":
                            outputString = outputString + "i can't lie" + punctuation;
                            break;
                        case "pmo":
                            outputString = outputString + "pissing me off" + punctuation;
                            break;
                        case "ngl":
                            outputString = outputString + "not going to lie" + punctuation;
                            break;
                        case "rnb":
                            outputString = outputString + "right now bro" + punctuation;
                            break;
                        case "lol":
                            outputString = outputString + "laughing out loud"+ punctuation;
                            break;
                        case "oms":
                            outputString = outputString + "on my soul" + punctuation;
                            break;
                        case "srs": 
                            outputString = outputString + "serious" + punctuation;
                            break;
                        case "vro": 
                            outputString = outputString + "bro" + punctuation;
                            break;
                        case "atp": 
                            outputString = outputString + "at this point" + punctuation;
                            break;
                        case "anm":
                            outputString = outputString + "anymore" + punctuation;
                            break;
                        case "gng":
                            outputString = outputString + "gang" + punctuation;
                            break;
                        case "brb":
                            outputString = outputString + "be right back" + punctuation;
                            break;
                        case "gtg": 
                            outputString = outputString + "got to go" + punctuation;
                            break;
                        case "atm":
                            outputString = outputString + "at the moment" + punctuation;
                            break;
                        case "lmk":
                            outputString = outputString + "let me know" + punctuation;
                            break;
                        case "onb": 
                            outputString = outputString + "on bro" + punctuation;
                            break;
                        case "nvm":
                            outputString = outputString + "never mind" + punctuation;
                            break;
                        case "idk":
                            outputString = outputString + "i don't know" + punctuation;
                            break;
                        case "smh":
                            outputString = outputString + "shaking my head" + punctuation;
                            break;
                        default:
                            outputString = outputString + lettersOnly + punctuation;
                    }
                } else if (lettersOnly.length() == 4) {
                    switch (lettersOnly) {
                        case "istg":
                            outputString = outputString + "i swear to god" + punctuation;
                            break;
                        case "idek":
                            outputString = outputString + "i don't even know" + punctuation;
                            break;
                        case "lmao":
                            outputString = outputString + "laughing my ass off" + punctuation;
                            break;
                        case "diff":
                            outputString = outputString + "different" + punctuation;
                            break;
                        case "bein":
                            outputString = outputString + "being" + punctuation;
                            break;
                        default:
                            outputString = outputString + lettersOnly + punctuation;
                    }
                } else if (lettersOnly.length() == 5) {
                    switch (lettersOnly) {
                        case "srsly":
                            outputString = outputString + "seriously" + punctuation;
                            break;
                        default: 
                            outputString = outputString + lettersOnly + punctuation;
                    }
                } else {
                    outputString = outputString + lettersOnly + punctuation;
                }
            }
        }
        scanner.close();
        System.out.println("\nHere is your translated brainrot message:");
        System.out.println(outputString);
    }
}
