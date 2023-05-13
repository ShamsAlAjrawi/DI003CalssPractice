package com.sg.foundations.flowcontrol.fors;

public class DifferentKettleOfFish {
    public static void main(String[] args) {

        int fish = 1;
        while(fish < 10){
            if(fish == 3){
                System.out.println("RED fish!");
            }else if(fish == 4){
                System.out.println("BLUE fish!");
            } else{
                System.out.println(fish + " fish!");
            }

            fish++;
        }

    }
}

//package com.sg.foundations.flowcontrol.fors;
//
//public class DifferentKettleOfFish {
//    public static void main(String[] args) {
//        for (int fish = 1; fish < 10; fish++) {
//            if (fish == 3) {
//                System.out.println("RED fish!");
//            } else if (fish == 4) {
//                System.out.println("BLUE fish!");
//            } else {
//                System.out.println(fish + " fish!");
//            }
//        }
//    }
//}