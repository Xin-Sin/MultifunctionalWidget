package top.xinsin.multifunctionalwidget.util;


import parsii.eval.Expression;
import parsii.eval.Parser;
import parsii.tokenizer.ParseException;

/**
 * @Author xinxin
 * @Date 2022/2/2 21:46
 * @Version 1.0
 */
public class calculate {
    public static double calc(String expression) throws ParseException {
        Expression parse = Parser.parse(expression);
        return parse.evaluate();
    }
}
