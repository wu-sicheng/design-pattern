package com.wusicheng.e19_bridge_pattern.nevv;


import com.wusicheng.e19_bridge_pattern.nevv.papper_type.HighPapper;
import com.wusicheng.e19_bridge_pattern.nevv.papper_type.IPapperType;
import com.wusicheng.e19_bridge_pattern.nevv.weight_type.IWeightType;
import com.wusicheng.e19_bridge_pattern.nevv.weight_type.LargeWeight;
import com.wusicheng.e19_bridge_pattern.nevv.food_type.IFoodType;
import com.wusicheng.e19_bridge_pattern.nevv.food_type.Noodles;

/**
 * @author wsc
 * @date 2018/7/5
 * @description
 */

public class Main {
    public static void main(String[] args) {
        IPapperType papperType = new HighPapper();
        IWeightType weightType = new LargeWeight();
        IFoodType foodType = new Noodles(papperType, weightType);
        foodType.want();
    }
}
