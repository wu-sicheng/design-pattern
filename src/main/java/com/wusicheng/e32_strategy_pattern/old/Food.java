package com.wusicheng.e32_strategy_pattern.old;

/**
 * @author wsc
 * @date 2018/7/18
 * @description
 */

public class Food {
    public void selectFood(Day day) {
        switch (day) {
            case MON:System.out.println("A");break;
            case TUES:System.out.println("B");break;
            case WED:System.out.println("A");break;
            case THUR:System.out.println("B");break;
            case FRI:System.out.println("A");break;
            case SAT:System.out.println("C");break;
            case SUN:System.out.println("C");break;
            default:System.out.println("A");
        }
    }

    public enum Day{
        MON,TUES, WED, THUR, FRI, SAT, SUN
    }
}
