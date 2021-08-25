import com.android.tms.task.Task0;
import com.android.tms.task.Task1;
import com.android.tms.task.Task2;
import com.android.tms.task.Task3;

public class Main {
    public static void main(String[] args) {

        String documentNumber = "1034-abC-0321-CBa-2x3C";
        System.out.println("---------TASK 0---------");
        Task0.getFirstTwoBlocksOfFourDigits(documentNumber);
        Task0.replaceThreeLettersBlocksToSpace(documentNumber);
        Task0.getOnlyLettersInLowerCase(documentNumber);
        Task0.getOnlyLettersInUpperCaseUsingStringBuilder(documentNumber);
        Task0.checkSequenceContains(documentNumber);
        Task0.checkSequenceStart(documentNumber);
        Task0.checkSequenceEnd(documentNumber);

        System.out.println("---------TASK 1---------");
        Task1.getLongestWord("It takes two to tango");

        System.out.println("---------TASK 2---------");
        Task2.wordWithMinNumOfDistinctChars("It takes two to tango");

        System.out.println("---------TASK 3---------");
        Task3.findPalindrome("Hello Madam I'm Adam", 2);
    }
}
