package com.czxy.shop.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Pupupupupu on 2018/12/12.
 *
 *      数据格式：
         {
             data : {
                 errno : 0,
                 errmsg : "成功提示"，
                 key : value ,
                 ....
             }
         }
 */
@Data
@NoArgsConstructor
public class BaseResult {
    private Map<String,Object> data = new HashMap<>();
    public BaseResult(Integer errno, String errmsg) {
        data.put("errno" , errno);
        data.put("errmsg" , errmsg);
    }

    /**
     * 追加其他参数，支持链式
     * @param key
     * @param msg
     * @return
     */
    public BaseResult append(String key , Object msg){
        data.put(key , msg);
        return this;
    }
}
