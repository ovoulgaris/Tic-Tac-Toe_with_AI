public class FlourPacker {
    public static boolean canPack (int bigCount, int smallCount, int goal){
        int totalFlourKilos = (bigCount * 5) + smallCount;
        if (goal < 0 || bigCount < 0 || smallCount < 0){
            return false;
        }
        while (bigCount > 0 && goal >= 5) {
            goal -= 5;
            bigCount--;
        }
        if(goal == 0){
            return true;
        }
        else return goal <= smallCount;
    }
}
