// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mgmt.mode.models;

import com.aliyun.tea.*;

/**
 * 
 */
public class GetAppPublicKeyRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    // App ID
    @NameInMap("app_id")
    @Validation(required = true)
    public String appId;

    public static GetAppPublicKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAppPublicKeyRequest self = new GetAppPublicKeyRequest();
        return TeaModel.build(map, self);
    }

    public GetAppPublicKeyRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAppPublicKeyRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
