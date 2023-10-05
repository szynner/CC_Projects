public class Magic {
    public static void main(String[] args) {
        // Our original number
        int myNumber = 6;
        // Changed number
        myNumber = 9;
        myNumber = 37;

        int stepOne = myNumber * myNumber;
        int stepTwo = stepOne + myNumber;
        int stepthree = stepTwo / myNumber;
        int stepFour = stepthree + 17;
        int stepFive = stepFour - myNumber;
        int stepSix = stepFive / 6;

        System.out.println(stepSix);
    }
}

// Output is always 3

/*
Optional exercice with just 2 variables

public class Magic {
    public static void main(String[] args) {
        // Our original number
        int myNumber = 6;
        // Changed number
        myNumber = 9;
        myNumber = 37;

        int magicNumber = myNumber * myNumber;
        magicNumber += myNumber;
        magicNumber /= myNumber;
        magicNumber += 17;
        magicNumber -= myNumber;
        magicNumber /= 6;

        System.out.println(magicNumber);
    }
}
 */