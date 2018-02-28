package cc.casually.main.pojo;

import cc.casually.main.util.Common;

import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

/**
 * 支付相关
 *
 * @author
 * @create 2018-02-27 16:18
 **/

public class PayContext {

    private Map<String,String> payInfo = new HashMap<>();

    //添加支付信息
    public void addPayInfo(String key,String value){
        this.payInfo.put(key, value);
    }

    //设置支付信息
    public void setPayInfo(Map<String,String> payInfo){
        this.payInfo = payInfo;
    }

    //获取支付信息
    public Map<String,String> getPayInfo(){
        return this.payInfo;
    }

    //获取sign
    public String getSign(){
        Map<String,String> signM =  Common.sortMapByKey(this.payInfo);
        StringBuffer stringBuffer = new StringBuffer();
        if(signM == null){
            return "";
        }
        for (String str:signM.keySet()) {
            if("appSceret".equals(str)){
                continue;
            }
            if(signM.get(str) != null){
                stringBuffer.append(String.format("%s=%s&",str,signM.get(str)));
            }
        }
        if(signM.get("appSceret") != null){
            stringBuffer.append("appSceret=" + signM.get("appSceret"));
        }
        String sign = stringBuffer != null?stringBuffer.toString():"";
        System.out.println("sign字符串" + sign);
        if(!"".equals(sign)){
            sign = Common.transformMD5(sign).toUpperCase();
        }
        return sign;
    }

    //返回支付信息字符串
    public String getPayInfoStr(){
        return this.payInfo == null?"":this.payInfo.toString();
    }

    //单独设置参数
    public void addAppSceret(String str){
        this.payInfo.put("appSceret",str);
    }
    public void addAppkey(String str){
        this.payInfo.put("appkey",str);
    }
    public void addMethod(String str){
        this.payInfo.put("method",str);
    }
    public void addSign(String str){
        this.payInfo.put("sign",str);
    }
    public void addTimestamp(String str){
        this.payInfo.put("timestamp",str);
    }
    public void addVersion(String str){
        this.payInfo.put("version",str);
    }
    public void addOutTradeNo(String str){
        this.payInfo.put("outTradeNo",str);
    }
    public void addPayType(String str){
        this.payInfo.put("payType",str);
    }
    public void addTradeName(String str){
        this.payInfo.put("tradeName",str);
    }
    public void addAmount(String str){
        this.payInfo.put("amount",str);
    }
    public void addNotifyUrl(String str){
        this.payInfo.put("notifyUrl",str);
    }
    public void addSynNotifyUrl(String str){
        this.payInfo.put("synNotifyUrl",str);
    }
    public void addPayuserid(String str){
        this.payInfo.put("payuserid",str);
    }
    public void addChannel(String str){
        this.payInfo.put("channel",str);
    }
    public void addBackparams(String str){
        this.payInfo.put("backparams",str);
    }
}
