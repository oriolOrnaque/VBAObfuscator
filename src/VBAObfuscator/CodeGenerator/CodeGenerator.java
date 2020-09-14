package VBAObfuscator.CodeGenerator;

import java.util.Random;

public class CodeGenerator {

    public String generateUselessSub()
    {
        String sub = "\nSub ";
        sub += generateRandomIdentifier() + "()\n";
        String var1 = generateRandomIdentifier();
        sub += "Dim " + var1 + " as Integer\n" + var1 + " = " + generateRandomInteger() + "\n";
        sub += "MsgBox " + var1 + "\n";
        sub += "End Sub\n";
        return sub;
    }

    public String generateRandomIdentifier()
    {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();

        return random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }

    public String generateRandomInteger()
    {
        // https://docs.microsoft.com/en-us/office/vba/Language/Reference/User-Interface-Help/data-type-summary
        int lowerLimit = -32768;
        int upperLimit = 32767;

        Random random = new Random();

        // https://stackoverflow.com/questions/27976857/how-do-i-get-a-random-number-with-a-negative-number-in-range
        return String.valueOf(random.nextInt((upperLimit - lowerLimit) + 1) + lowerLimit);
    }

}
