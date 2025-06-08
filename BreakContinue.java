public class BreakContinue {
    public static void main(String[] args) {
        //continue ==> skip the current Iteration
        // break ==> stop the loop

        for (int i = 0; i < 10+1; i++)
        {
            if (i == 5)
            {
                continue;
            }
            if (i == 9)
            {
                break;
            }
            System.out.println(i);
        }
    }
    
}
