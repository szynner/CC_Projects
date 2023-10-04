public class Madlibs {
    /* 
    This program generates a mad lidded story
    Author: SJ
    Date: 04/10/23
    */

   public static void main(String[] args) {
    String name1 = "Java";
    String name2 = "Program";
    String adjective1 = "Scalable";
    String adjective2 = "Secure";
    String adjective3 = "Reusable";
    String verb1 = "Debug";
    String noun1 = "Code";
    String noun2 = "Object";
    String noun3 = "Compiler";
    String noun4 = "Bug";
    String noun5 = "Variable";
    String noun6 = "Class";
    String place1 = "Codeoria";
    int number = 6;

    String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

    /*
    Output:
    This morning Java woke up feeling Scalable. 'It is going to be a Secure day!' 
    Outside, a bunch of Codes were protesting to keep Object in stores. 
    They began to Debug to the rhythm of the Compiler, which made all the Bugs very Reusable. 
    Concerned, Java texted Program, who flew Java to Codeoria and dropped Java in a puddle of frozen Variable. 
    Java woke up in the year 6, in a world where Classs ruled the world.
    */
   
   }
}