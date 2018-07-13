package com.wusicheng.e27_interpreter_pattern.nevv;

/**
 * @author wsc
 * @date 2018/7/13
 * @description
 */

public class Context {

    public void translator(String expression) {
        String[] question = expression.split("\\|");

        IXiaocheng ques = new Question(question[0]);
        IXiaocheng ans = new Answer(ques,question[1]);
        System.out.println(ans.answer(this));
    }
}
