public class FlourPackProblem {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        int numberOfKilosPerBigFlourBag = 5;
        int numberOfKilosPerSmallFlourBag = 1;

        int count = bigCount * numberOfKilosPerBigFlourBag;

        if ((bigCount < 0) || (smallCount < 0) || (goal < numberOfKilosPerSmallFlourBag) || (count > goal)) {
            return false;
        } else {
            return true;
        }
    }
}
