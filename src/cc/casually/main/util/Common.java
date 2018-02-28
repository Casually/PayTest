package cc.casually.main.util;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * 常用工具
 *
 * @author
 * @create 2018-02-27 16:33
 **/

public class Common {

    /**
     * 使用 Map按key进行排序
     * @param map
     * @return
     */
    public static Map<String, String> sortMapByKey(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return null;
        }

        Map<String, String> sortMap = new TreeMap<String, String>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // 默认：升序排列
                 return o1.compareTo(o2);
                // 降序排列
                //return o2.compareTo(o1);
                // return 0;    // 只返回存储的第一个key的值，这里是"ccccc"
            }
        });

        sortMap.putAll(map);

        return sortMap;
    }

    /**
     * @param inputStr
     * @return 32位的MD5数
     */
    public static  String transformMD5(String inputStr) {

        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            md5.update(inputStr.getBytes("UTF-8"));
            byte[] encryption = md5.digest();

            StringBuffer strBuf = new StringBuffer();
            for (int i = 0; i < encryption.length; i++) {
                if (Integer.toHexString(0xff & encryption[i]).length() == 1) {
                    strBuf.append("0").append(Integer.toHexString(0xff & encryption[i]));
                } else {
                    strBuf.append(Integer.toHexString(0xff & encryption[i]));
                }
            }

            return strBuf.toString();
        } catch (NoSuchAlgorithmException e) {
            return "";
        } catch (UnsupportedEncodingException e) {
            return "";
        }
    }

    public static String transformMD5T(String prestr) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update((prestr).getBytes());
        String  mySign = new BigInteger(1, md.digest()).toString(16).toUpperCase();
        if(mySign.length()!=32){
            mySign="0"+mySign;
        }
        return mySign;
    }
}
