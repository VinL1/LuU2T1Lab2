public class ChatBotRunner {
    public static void main (String [] args) {

        ChatBot debbie = new ChatBot("debbie", 15);

        debbie.greeting ("Vincent");
        System.out.println ("Vincent: Oh hello! How is the weather?");
        debbie.weather ();
        System.out.println ("Vincent: There is going to be 5 feet, or in meters, " + debbie.convertFeetToMeters (5) + "of rain today. ");
        System.out.println ("Vincent: The weather is really bad, however it is very close to my favorite number!");
        debbie.favoriteNumber (1);
        System.out.println ("I really like doing math.");
        System.out.println ("For example, 120938 + 79824 + 38295 = " + debbie.addNumbers (120938, 79824, 38295));
        System.out.println ("I can even add decimals! 637819.47 + 2193759.54 + 9283574.32 = " + debbie.addDoubles (637819.47, 2193759.54, 9283574.32));
        System.out.println ("Vincent: Oop! I gotta go pick up my little brother from school.");
        System.out.print ("Vincent: ");
        debbie.sorry();
        System.out.println ("Vincent: I'm running out of time. Cya!");
        System.out.println (debbie.goodbye());
    }
}
