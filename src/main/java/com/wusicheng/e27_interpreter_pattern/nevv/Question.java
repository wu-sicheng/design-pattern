package com.wusicheng.e27_interpreter_pattern.nevv;

/**
 * @author wsc
 * @date 2018/7/13
 * @description
 */

public class Question implements IXiaocheng {

    private String key;

    public Question(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public String answer(Context context) {
        return key;
    }
}
