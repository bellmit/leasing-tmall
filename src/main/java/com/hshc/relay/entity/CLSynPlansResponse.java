package com.hshc.relay.entity;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.response.TmallCarLeaseSynchronizeplansResponse;

/**
 * Created by wanghuaying on 2017/5/13.
 */
public class CLSynPlansResponse extends BaseResponse{

    private static final long serialVersionUID = 2557774663954917178L;

    /**
     * 如果success为true,表示成功，如果success为false,需要获取msg_code,msg_info,具体的错误码文档提供
     */
    @ApiField("result")
    private TmallCarLeaseSynchronizeplansResponse.Result result;


    public void setResult(TmallCarLeaseSynchronizeplansResponse.Result result) {
        this.result = result;
    }
    public TmallCarLeaseSynchronizeplansResponse.Result getResult( ) {
        return this.result;
    }

}
