package cc.casually.test;

import cc.casually.main.pojo.PayContext;

import java.util.Date;
import java.util.UUID;

/**
 * 测试类
 *
 * @author
 * @create 2018-02-27 16:36
 **/

public class PayTest {

    public static void main(String[] args) {
        PayContext payContext = new PayContext();
        payContext.addAppkey("4e2f21ec10e348a2b20f2a866b9a6e6d");
        payContext.addMethod("trpay.trade.create.wap");
        payContext.addTimestamp(Long.valueOf(System.currentTimeMillis()).toString());
        payContext.addVersion("1.0");
        payContext.addOutTradeNo(UUID.randomUUID().toString().replaceAll("-",""));
        payContext.addPayType("2");
        payContext.addTradeName("月VIP");
        payContext.addAmount("3000");
        payContext.addNotifyUrl("http://www.baidu.com");
        payContext.addSynNotifyUrl("http://www.taobao.com");
        payContext.addPayuserid("登录用户");
        payContext.addAppSceret("017a688a82f44908a51f7ac76bfb237c");
        //System.out.println(payContext.getSign());
        payContext.addSign(payContext.getSign());
    }
}
