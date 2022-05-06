public class knapsackLight {

    static int knapsackLight(int value1, int weight1, int value2, int weight2, int maxW) {
        if(weight1 + weight2 <= maxW){ return value1 + value2;}
        else{
            if(weight1 < maxW){ if(value1 > value2){return value1;}}
            if(weight2 < maxW){ if(value2 > value1){return value2;}}
        }
        if(weight1 <= weight2 && weight1 <= maxW){ if(value1 <= value2){return value1;}}
        if(weight2 <= weight1 && weight2 <= maxW){
            if(value2 <= value1){return value2;}
            if(value1 <= value2){return value2;}
        }
        return 0;
    }

    public static void main(String[] args) {

        System.out.println(knapsackLight(10,5,6,4,8)); // 10
        System.out.println(knapsackLight(10,5,6,4,9)); // 16
        System.out.println(knapsackLight(5,3,7,4,6)); // 7
        System.out.println(knapsackLight(15,2,20,3,2));//15
        System.out.println(knapsackLight(10,2,11,3,1));// 0
        System.out.println(knapsackLight(3,4,5,3,3));//5
    }
}
