class Language {

    // Declare instance variables to store information about a language.
    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder

    // Constructor to initialize the language's attributes.
    Language(String langName, int speakers, String regions, String wdOrder) {
        this.name = langName;
        this.numSpeakers = speakers;
        this.regionsSpoken = regions;
        this.wordOrder = wdOrder;
    }

    // Method to print information about the language.
    public void getInfo() {
        System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");
        // Call the getInfo() method to print information about the Spanish language.
        System.out.println("The language follows the word order: " + this.wordOrder);
    }

    // Main method
    public static void main(String[] args) {
        // Create an instance of the Language class for Spanish and initialize its attributes.
        Language spanish = new Language("Spanish", 555000000, "Spain, Latin America, and Equatorial Guinea", "subject-verb-object");
        spanish.getInfo();

        // Create an instance of the Mayan class for Ki'che' with a specific number of speakers.
        Mayan kiche = new Mayan("Ki'che'", 2330000);
        kiche.getInfo();

        // Create an instance of the SinoTibetan class for Mandarin Chinese with a specific number of speakers.
        SinoTibetan mandarin = new SinoTibetan("Mandarin Chinese", 1110000000);
        mandarin.getInfo();

        // Create an instance of the SinoTibetan class for Burmese with a specific number of speakers.
        SinoTibetan burmese = new SinoTibetan("Burmese", 43000000);
        burmese.getInfo();
    }
}