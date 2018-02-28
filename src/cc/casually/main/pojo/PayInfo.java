package cc.casually.main.pojo;

/**
 * 支付参数
 *
 * @author
 * @create 2018-02-27 16:15
 **/

public class PayInfo {

    private String appkey;
    private String method;
    private String sign;
    private String timestamp;
    private String version;
    private String outTradeNo;
    private String payType;
    private String tradeName;
    private String amount;
    private String notifyUrl;
    private String synNotifyUrl;
    private String payuserid;
    private String channel;
    private String backparams;

    public String getAppkey() {
        return appkey;
    }

    public void setAppkey(String appkey) {
        this.appkey = appkey;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getTradeName() {
        return tradeName;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getSynNotifyUrl() {
        return synNotifyUrl;
    }

    public void setSynNotifyUrl(String synNotifyUrl) {
        this.synNotifyUrl = synNotifyUrl;
    }

    public String getPayuserid() {
        return payuserid;
    }

    public void setPayuserid(String payuserid) {
        this.payuserid = payuserid;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getBackparams() {
        return backparams;
    }

    public void setBackparams(String backparams) {
        this.backparams = backparams;
    }
}
