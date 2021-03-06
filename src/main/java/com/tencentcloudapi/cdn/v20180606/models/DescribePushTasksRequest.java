/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePushTasksRequest  extends AbstractModel{

    /**
    * 开始时间，如2018-08-08 00:00:00。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间，如2018-08-08 23:59:59。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 提交时返回的任务 Id，查询时 TaskId 和起始时间必须指定一项。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 查询关键字，请输入域名或 http(s):// 开头完整 URL。
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * 分页查询偏移量，默认为 0 （第一页）。
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;

    /**
    * 分页查询限制数目，默认为20。
    */
    @SerializedName("Limit")
    @Expose
    private Integer Limit;

    /**
    * 查询刷新记录指定地区。mainland：中国大陆。
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * 查询指定任务状态，fail表示失败，done表示成功，process表示刷新中。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * 获取开始时间，如2018-08-08 00:00:00。
     * @return StartTime 开始时间，如2018-08-08 00:00:00。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * 设置开始时间，如2018-08-08 00:00:00。
     * @param StartTime 开始时间，如2018-08-08 00:00:00。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * 获取结束时间，如2018-08-08 23:59:59。
     * @return EndTime 结束时间，如2018-08-08 23:59:59。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * 设置结束时间，如2018-08-08 23:59:59。
     * @param EndTime 结束时间，如2018-08-08 23:59:59。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * 获取提交时返回的任务 Id，查询时 TaskId 和起始时间必须指定一项。
     * @return TaskId 提交时返回的任务 Id，查询时 TaskId 和起始时间必须指定一项。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * 设置提交时返回的任务 Id，查询时 TaskId 和起始时间必须指定一项。
     * @param TaskId 提交时返回的任务 Id，查询时 TaskId 和起始时间必须指定一项。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * 获取查询关键字，请输入域名或 http(s):// 开头完整 URL。
     * @return Keyword 查询关键字，请输入域名或 http(s):// 开头完整 URL。
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * 设置查询关键字，请输入域名或 http(s):// 开头完整 URL。
     * @param Keyword 查询关键字，请输入域名或 http(s):// 开头完整 URL。
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * 获取分页查询偏移量，默认为 0 （第一页）。
     * @return Offset 分页查询偏移量，默认为 0 （第一页）。
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * 设置分页查询偏移量，默认为 0 （第一页）。
     * @param Offset 分页查询偏移量，默认为 0 （第一页）。
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取分页查询限制数目，默认为20。
     * @return Limit 分页查询限制数目，默认为20。
     */
    public Integer getLimit() {
        return this.Limit;
    }

    /**
     * 设置分页查询限制数目，默认为20。
     * @param Limit 分页查询限制数目，默认为20。
     */
    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    /**
     * 获取查询刷新记录指定地区。mainland：中国大陆。
     * @return Area 查询刷新记录指定地区。mainland：中国大陆。
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * 设置查询刷新记录指定地区。mainland：中国大陆。
     * @param Area 查询刷新记录指定地区。mainland：中国大陆。
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * 获取查询指定任务状态，fail表示失败，done表示成功，process表示刷新中。
     * @return Status 查询指定任务状态，fail表示失败，done表示成功，process表示刷新中。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * 设置查询指定任务状态，fail表示失败，done表示成功，process表示刷新中。
     * @param Status 查询指定任务状态，fail表示失败，done表示成功，process表示刷新中。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

