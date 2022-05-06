/*
* You are playing an RPG Game. Currently your experience points(XP)
* total is equal to experience. To reach the next level your XP
* should be at least at threshold. If yoy kill the monster in front
* of you, you will gain more experience points in the amount
* of the reward.
*
* Given values experience, threshold and reward, check if you
* reach the next level after killing the monster.
*
* Example:
*
* For experience = 10, threshold = 15, and reward = 5,
* the output should be
* reachNextLevel(experience, threshold, reward) = true;
*
* For experience = 10, threshold = 15, and reward = 4,
* the output should be
* reachNextLevel(experience, threshold, reward) = false;
*
*/

public class REACHNEXTLEVEL {

    static public boolean reachNextLevel(int experience,
                           int threshold, int reward) {

        if(experience + reward >= threshold){
            return true;
        }
        else
        return false;
    }


    public static void main(String[] args) {
        System.out.println(reachNextLevel(10,
                        15,5)); // true
        System.out.println(reachNextLevel(10,
                15,4)); // false
        System.out.println(reachNextLevel(3,
                6,4)); // true
        System.out.println(reachNextLevel(84,
                135,36)); // false
        System.out.println(reachNextLevel(74,
                170,58)); // false
        System.out.println(reachNextLevel(80,
                199,15)); // false
        System.out.println(reachNextLevel(97,
                57,7)); // true
        System.out.println(reachNextLevel(97,
                57,7)); // true
        System.out.println(reachNextLevel(235,
                293,4)); // false
    }
}
