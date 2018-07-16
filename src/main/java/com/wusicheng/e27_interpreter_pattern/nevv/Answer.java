package com.wusicheng.e27_interpreter_pattern.nevv;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wsc
 * @date 2018/7/13
 * @description
 */

public class Answer implements IXiaocheng {

    private IXiaocheng xiaocheng;
    private static Map<String, String> answer1 = new HashMap<>(4);
    private static Map<String, String> answer2 = new HashMap<>(4);
    private String key2;

    static {
        answer1.put("您好", "您好，我是小成同学");
        answer1.put("世界上谁最帅", "世界上吴彦祖最帅");
        answer1.put("打开飞行模式", "好的，已打开飞行模式");
        answer2.put("世界上谁最帅", "世界上吴思成最帅");
    }

    public Answer(IXiaocheng xiaocheng, String key2) {
        this.xiaocheng = xiaocheng;
        this.key2 = key2;
    }

    public String getKey2() {
        return key2;
    }

    public void setKey2(String key2) {
        this.key2 = key2;
    }

    @Override
    public String answer(Context context) {
        return getAnswer(key2).get(xiaocheng.answer(context));
    }

    private Map<String, String> getAnswer(String key) {
        switch (key){
            case "1":return answer1;
            case "2":return answer2;
            default:return answer1;
        }
    }
}
