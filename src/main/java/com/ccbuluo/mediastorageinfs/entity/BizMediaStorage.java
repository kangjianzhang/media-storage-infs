package com.ccbuluo.mediastorageinfs.entity;

import io.airlift.drift.annotations.ThriftField;
import io.airlift.drift.annotations.ThriftStruct;

/**
 * 媒体库实体
 * @author zhangkangjian
 */
@ThriftStruct("BizMediaStorage")
public class BizMediaStorage {
    /**
     * id
     */
    private Long id;
    /**
     * 媒体库编码
     */
    private String mediaStorageCode;
    /**
     * 媒体库名称
     */
    private String mediaStorageName;
    /**
     * 状态 1 开启 0 关闭
     */
    private Integer mediaStorageStatus;
    /**
     * 二维码路径
     */
    private String qrcode;
    /**
     * banner图
     */
    private String indexBanner;
    /**
     * 删除标识，0为未删除，1为已删除，缺省值0
     */
    private Integer deleteFlag = 0;
    /**
     * 创建时间
     */
    private long createTime;
    /**
     * 创建人
     */
    private String creator;
    /**
     * 最后操作时间
     */
    private long operateTime;
    /**
     * 最后操作人
     */
    private String operator;

    @ThriftField(value=1, name="id", requiredness=ThriftField.Requiredness.NONE)
    public Long getId() {
        return id;
    }
    @ThriftField(value=2, name="mediaStorageCode", requiredness=ThriftField.Requiredness.NONE)
    public String getMediaStorageCode() {
        return mediaStorageCode;
    }
    @ThriftField(value=3, name="mediaStorageName", requiredness=ThriftField.Requiredness.NONE)
    public String getMediaStorageName() {
        return mediaStorageName;
    }
    @ThriftField(value=4, name="mediaStorageStatus", requiredness=ThriftField.Requiredness.NONE)
    public Integer getMediaStorageStatus() {
        return mediaStorageStatus;
    }
    @ThriftField(value=5, name="qrcode", requiredness=ThriftField.Requiredness.NONE)
    public String getQrcode() {
        return qrcode;
    }
    @ThriftField(value=6, name="indexBanner", requiredness=ThriftField.Requiredness.NONE)
    public String getIndexBanner() {
        return indexBanner;
    }
    @ThriftField(value=7, name="deleteFlag", requiredness=ThriftField.Requiredness.NONE)
    public Integer getDeleteFlag() {
        return deleteFlag;
    }
    @ThriftField(value=8, name="createTime", requiredness=ThriftField.Requiredness.NONE)
    public long getCreateTime() {
        return createTime;
    }
    @ThriftField(value=9, name="creator", requiredness=ThriftField.Requiredness.NONE)
    public String getCreator() {
        return creator;
    }
    @ThriftField(value=10, name="operateTime", requiredness=ThriftField.Requiredness.NONE)
    public long getOperateTime() {
        return operateTime;
    }
    @ThriftField(value=11, name="operator", requiredness=ThriftField.Requiredness.NONE)
    public String getOperator() {
        return operator;
    }
    @ThriftField
    public void setId(Long id) {
        this.id = id;
    }
    @ThriftField
    public void setMediaStorageCode(String mediaStorageCode) {
        this.mediaStorageCode = mediaStorageCode;
    }
    @ThriftField
    public void setMediaStorageName(String mediaStorageName) {
        this.mediaStorageName = mediaStorageName;
    }
    @ThriftField
    public void setMediaStorageStatus(Integer mediaStorageStatus) {
        this.mediaStorageStatus = mediaStorageStatus;
    }
    @ThriftField
    public void setQrcode(String qrcode) {
        this.qrcode = qrcode;
    }
    @ThriftField
    public void setIndexBanner(String indexBanner) {
        this.indexBanner = indexBanner;
    }
    @ThriftField
    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }
    @ThriftField
    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }
    @ThriftField
    public void setCreator(String creator) {
        this.creator = creator;
    }
    @ThriftField
    public void setOperateTime(long operateTime) {
        this.operateTime = operateTime;
    }
    @ThriftField
    public void setOperator(String operator) {
        this.operator = operator;
    }
}
