package com.ccbuluo.mediastorageinfs.service;

import com.ccbuluo.http.StatusDto;
import com.ccbuluo.mediastorageinfs.dto.AddMediaStorageDTO;
import io.airlift.drift.annotations.ThriftMethod;
import io.airlift.drift.annotations.ThriftService;

/**
 * 媒体库管理
 * @author zhangkangjian
 * @date 2018-12-11 14:23:27
 */
@ThriftService("MediaStorageRpcService")
public interface MediaStorageRpcService {


    /**
     * 新增媒体库
     * @param addMediaStorageDTO 媒体库DTO
     * @return StatusDto<String>
     * @author zhangkangjian
     * @date 2018-12-11 16:20:29
     */
    @ThriftMethod("MediaStorageRpcServiceaddMediaStorage")
    StatusDto<String> addMediaStorage(AddMediaStorageDTO addMediaStorageDTO);

//    /**
//     * 编辑媒体库
//     * @param mediaStorageName 媒体库名称
//     * @param indexBanner Banner图片URL
//     * @param mediaStorageCode 媒体库code
//     * @param id 媒体库id
//     * @author zhangkangjian
//     * @date 2018-12-11 17:39:21
//     */
//    void editMediaStorage(String mediaStorageName, String indexBanner, String mediaStorageCode, Long id);

}
