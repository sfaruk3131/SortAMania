public class Team13SortCompetition {
    public int challengeOne(int[] arr)
    {
        int x = 0;
        int pos1 = arr[x];
        int pos2 = arr[x + 1];
        int temp = 0;
        int numerr = 0;
        boolean done = false;

        while(done == false)
        {
            for (int i = 0; i < arr.length; i++)
            {
                if (pos1 < pos2)
                {
                    x++;
                }
                else
                    {
                    temp = pos1;
                    pos1 = pos2;
                    pos2 = temp;
                    x++;
                }
            }
        }
    }
}
