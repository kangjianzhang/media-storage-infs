package com.ccbuluo.mediastorageinfs.dto;

import io.airlift.drift.annotations.ThriftField;
import io.airlift.drift.annotations.ThriftStruct;

import javax.validation.constraints.NotNull;

/**
 * @author zhangkangjian
 * @date 2019-01-07 11:16:42
 */
@ThriftStruct("AddMediaStorageDTO")
public class AddMediaStorageDTO {

    private Long id;
    /**
     * 媒体库名称
     */
    @NotNull(message = "mediaStorageName不能为空")
    private String mediaStorageName;
    /**
     * Banner图片URL
     */
    @NotNull(message = "indexBanner不能为空")
    private String indexBanner;
    /**
     * 小程序扫二维码跳到对应的页面路径
     */
    @NotNull(message = "qrcodePath不能为空")
    private String qrcodePath;
    /**
     * 小程序的appid
     */
    @NotNull(message = "miniAppid不能为空")
    private String miniAppid;
    /**
     * 状态 1 开启 0 关闭
     */
    private Integer mediaStorageStatus = 1;
    /**
     * 创建时间
     */
    private long createTime;
    /**
     * 创建人
     */
    private String creator;
    /**
     * 业务系统的appid
     */
    @NotNull(message = "miniAppid不能为空")
    private String appId;

    @NotNull(message = "endpoint不能为空")
    private String endpoint;

    @NotNull(message = "accessKeyId不能为空")
    private String accessKeyId;

    @NotNull(message = "accessKeySecret不能为空")
    private String accessKeySecret;

    @NotNull(message = "bucketName不能为空")
    private String bucketName;


    @ThriftField(value=1, name="mediaStorageName", requiredness=ThriftField.Requiredness.NONE)
    public String getMediaStorageName() {
        return mediaStorageName;
    }
    @ThriftField(value=2, name="indexBanner", requiredness=ThriftField.Requiredness.NONE)
    public String getIndexBanner() {
        return indexBanner;
    }
    @ThriftField(value=3, name="qrcodePath", requiredness=ThriftField.Requiredness.NONE)
    public String getQrcodePath() {
        return qrcodePath;
    }
    @ThriftField(value=4, name="miniAppid", requiredness=ThriftField.Requiredness.NONE)
    public String getMiniAppid() {
        return miniAppid;
    }
    @ThriftField(value=5, name="mediaStorageStatus", requiredness=ThriftField.Requiredness.NONE)
    public Integer getMediaStorageStatus() {
        return mediaStorageStatus;
    }
    @ThriftField(value=6, name="createTime", requiredness=ThriftField.Requiredness.NONE)
    public long getCreateTime() {
        return createTime;
    }
    @ThriftField(value=7, name="creator", requiredness=ThriftField.Requiredness.NONE)
    public String getCreator() {
        return creator;
    }
    @ThriftField(value=8, name="appId", requiredness=ThriftField.Requiredness.NONE)
    public String getAppId() {
        return appId;
    }

    @ThriftField(value=9, name="endpoint", requiredness=ThriftField.Requiredness.NONE)
    public String getEndpoint() {
        return endpoint;
    }

    @ThriftField(value=10, name="accessKeyId", requiredness=ThriftField.Requiredness.NONE)
    public String getAccessKeyId() {
        return accessKeyId;
    }

    @ThriftField(value=11, name="accessKeySecret", requiredness=ThriftField.Requiredness.NONE)
    public String getAccessKeySecret() {
        return accessKeySecret;
    }

    @ThriftField(value=12, name="bucketName", requiredness=ThriftField.Requiredness.NONE)
    public String getBucketName() {
        return bucketName;
    }
    @ThriftField(value=13, name="id", requiredness=ThriftField.Requiredness.NONE)
    public Long getId() {
        return id;
    }

    @ThriftField
    public void setMediaStorageName(String mediaStorageName) {
        this.mediaStorageName = mediaStorageName;
    }
    @ThriftField
    public void setIndexBanner(String indexBanner) {
        this.indexBanner = indexBanner;
    }
    @ThriftField
    public void setQrcodePath(String qrcodePath) {
        this.qrcodePath = qrcodePath;
    }
    @ThriftField
    public void setMiniAppid(String miniAppid) {
        this.miniAppid = miniAppid;
    }
    @ThriftField
    public void setMediaStorageStatus(Integer mediaStorageStatus) {
        this.mediaStorageStatus = mediaStorageStatus;
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
    public void setAppId(String appId) {
        this.appId = appId;
    }
    @ThriftField
    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }
    @ThriftField
    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }
    @ThriftField
    public void setAccessKeySecret(String accessKeySecret) {
        this.accessKeySecret = accessKeySecret;
    }
    @ThriftField
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }
    @ThriftField
    public void setId(Long id) {
        this.id = id;
    }
}
