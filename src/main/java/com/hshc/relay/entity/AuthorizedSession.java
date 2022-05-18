package com.hshc.relay.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.sql.Timestamp;

/**
 * @author 钟林俊
 * @version V1.0 2017-05-06 16:21
 */
public class AuthorizedSession extends BaseEntity {

    @JSONField(name = "token_type")
    private String tokenType;

    @JSONField(name = "refresh_token")
    private String refreshToken;

    @JSONField(name = "access_token")
    private String accessToken;

    @JSONField(name = "taobao_user_id")
    private String taobaoUserId;

    @JSONField(name = "taobao_user_nick")
    private String taobaoUserNick;

    @JSONField(name = "w1_expires_in")
    private Integer w1ExpiresIn;

    @JSONField(name = "w2_expires_in")
    private Integer w2ExpiresIn;

    @JSONField(name = "r1_expires_in")
    private Integer r1ExpiresIn;

    @JSONField(name = "r2_expires_in")
    private Integer r2ExpiresIn;

    @JSONField(name = "expires_in")
    private Integer expiresIn;

    @JSONField(name = "re_expires_in")
    private Integer reExpiresIn;

    @JSONField(name = "expire_time", format = "yyyy-MM-dd HH:mm:ss")
    private Timestamp expireTime;

    @JSONField(name = "w2_valid", format = "yyyy-MM-dd HH:mm:ss")
    private Timestamp w2Valid;

    @JSONField(name = "r1_valid", format = "yyyy-MM-dd HH:mm:ss")
    private Timestamp r1Valid;

    @JSONField(name = "r2_valid", format = "yyyy-MM-dd HH:mm:ss")
    private Timestamp r2Valid;

    @JSONField(name = "w1_valid", format = "yyyy-MM-dd HH:mm:ss")
    private Timestamp w1Valid;

    @JSONField(name = "refresh_token_valid_time", format = "yyyy-MM-dd HH:mm:ss")
    private Timestamp refreshTokenValidTime;

    @JSONField(name = "sub_taobao_user_id")
    private String subTaobaoUserId;

    @JSONField(name = "sub_taobao_user_nick")
    private String subTaobaoUserNick;

    /**
     * w2级别API或字段的访问过期时间
     *
     * @return
     */
    public Integer getW2ExpiresIn() {
        return w2ExpiresIn;
    }

    /**
     * w2级别API或字段的访问过期时间
     *
     * @param w2ExpiresIn
     */
    public void setW2ExpiresIn(Integer w2ExpiresIn) {
        this.w2ExpiresIn = w2ExpiresIn;
    }

    /**
     * 淘宝账号
     *
     * @return
     */
    public String getTaobaoUserNick() {
        return taobaoUserNick;
    }

    /**
     * 淘宝账号
     *
     * @param taobaoUserNick
     */
    public void setTaobaoUserNick(String taobaoUserNick) {
        this.taobaoUserNick = taobaoUserNick;
    }

    /**
     * w1级别API或字段的访问过期时间
     *
     * @return
     */
    public Integer getW1ExpiresIn() {
        return w1ExpiresIn;
    }

    /**
     * w1级别API或字段的访问过期时间
     *
     * @param w1ExpiresIn
     */
    public void setW1ExpiresIn(Integer w1ExpiresIn) {
        this.w1ExpiresIn = w1ExpiresIn;
    }

    /**
     * r1级别API或字段的访问过期时间
     *
     * @return
     */
    public Integer getR1ExpiresIn() {
        return r1ExpiresIn;
    }

    /**
     * r1级别API或字段的访问过期时间
     *
     * @param r1ExpiresIn
     */
    public void setR1ExpiresIn(Integer r1ExpiresIn) {
        this.r1ExpiresIn = r1ExpiresIn;
    }

    /**
     * r2级别API或字段的访问过期时间
     *
     * @return
     */
    public Integer getR2ExpiresIn() {
        return r2ExpiresIn;
    }

    /**
     * r2级别API或字段的访问过期时间
     *
     * @param r2ExpiresIn
     */
    public void setR2ExpiresIn(Integer r2ExpiresIn) {
        this.r2ExpiresIn = r2ExpiresIn;
    }

    public Integer getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    /**
     * 用来刷新accessToken
     *
     * @return
     */
    public String getRefreshToken() {
        return refreshToken;
    }

    /**
     * 用来刷新accessToken
     *
     * @param refreshToken
     */
    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    /**
     * 获取sessionKey
     *
     * @return sessionKey
     */
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * 设置sessionKey
     *
     * @param accessToken sessionKey
     */
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public Integer getReExpiresIn() {
        return reExpiresIn;
    }

    public void setReExpiresIn(Integer reExpiresIn) {
        this.reExpiresIn = reExpiresIn;
    }

    public String getTaobaoUserId() {
        return taobaoUserId;
    }

    public void setTaobaoUserId(String taobaoUserId) {
        this.taobaoUserId = taobaoUserId;
    }

    public Timestamp getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Timestamp expireTime) {
        this.expireTime = expireTime;
    }

    public Timestamp getW2Valid() {
        return w2Valid;
    }

    public void setW2Valid(Timestamp w2Valid) {
        this.w2Valid = w2Valid;
    }

    public Timestamp getR1Valid() {
        return r1Valid;
    }

    public void setR1Valid(Timestamp r1Valid) {
        this.r1Valid = r1Valid;
    }

    public Timestamp getR2Valid() {
        return r2Valid;
    }

    public void setR2Valid(Timestamp r2Valid) {
        this.r2Valid = r2Valid;
    }

    public Timestamp getW1Valid() {
        return w1Valid;
    }

    public void setW1Valid(Timestamp w1Valid) {
        this.w1Valid = w1Valid;
    }

    public Timestamp getRefreshTokenValidTime() {
        return refreshTokenValidTime;
    }

    public void setRefreshTokenValidTime(Timestamp refreshTokenValidTime) {
        this.refreshTokenValidTime = refreshTokenValidTime;
    }

    public String getSubTaobaoUserId() {
        return subTaobaoUserId;
    }

    public void setSubTaobaoUserId(String subTaobaoUserId) {
        this.subTaobaoUserId = subTaobaoUserId;
    }

    public String getSubTaobaoUserNick() {
        return subTaobaoUserNick;
    }

    public void setSubTaobaoUserNick(String subTaobaoUserNick) {
        this.subTaobaoUserNick = subTaobaoUserNick;
    }
}
