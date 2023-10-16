/**
 * Analyzes a DNA strand to check for the presence of a protein-coding sequence
 * In this class we use different String methods: length(), indexOf(), substring()
 */

public class DNA {

    public static void main(String[] args) {
        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";

        // Main DNA used
        String dna = dna3;
        System.out.println("DNA strand: " + dna);

        // Find the length of DNA strand
        int length = dna.length();
        System.out.println("Length of DNA: " + length);

        // Find codon ATG
        int start = dna.indexOf("ATG");
        System.out.println("The index start of the DNA: " + start);

        // Find codon TGA
        int end = dna.indexOf("TGA");
        System.out.println("The index end of the DNA: " + end);

        // Find if there is protein in strand
        if(start != -1 && end != -1 && (end - start) % 3 == 0) {
            String protein = dna.substring(start, end+3); 
            System.out.println("Protein: " + protein);
            } else {
           System.out.println("Does not contain a protein.");
        }
    }
}

/* Output:
DNA strand: ATTAATATGTACTGA
Length of DNA: 15
The index start of the DNA: 6
The index end of the DNA: 12
Protein: ATGTACTGA
*/