package com.wusicheng.e27_interpreter_pattern.old;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wsc
 * @date 2018/7/13
 * @description 小成同学
 */

public class Xiaocheng {

    private Map<String, String> questionAnswer = new HashMap<>(3);

    public Xiaocheng() {
        questionAnswer.put("您好", "您好，我是小成同学");
        questionAnswer.put("世界上谁最帅？", "世界上吴彦祖最帅");
        questionAnswer.put("打开飞行模式", "好的，已打开飞行模式");
    }

    public void answer(String question) {
        String answer = questionAnswer.get(question);
        if(answer == null) {
            System.out.println("找不到问题："+question);
            return;
        }
        System.out.println(questionAnswer.get(question));
    }
}
