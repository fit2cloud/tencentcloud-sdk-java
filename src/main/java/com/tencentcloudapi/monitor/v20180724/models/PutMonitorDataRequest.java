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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PutMonitorDataRequest  extends AbstractModel{

    /**
    * 一组指标和数据
    */
    @SerializedName("Metrics")
    @Expose
    private MetricDatum [] Metrics;

    /**
    * 上报时自行指定的 IP
    */
    @SerializedName("AnnounceIp")
    @Expose
    private String AnnounceIp;

    /**
    * 上报时自行指定的时间戳
    */
    @SerializedName("AnnounceTimestamp")
    @Expose
    private Integer AnnounceTimestamp;

    /**
    * 上报时自行指定的 IP 或 产品实例ID
    */
    @SerializedName("AnnounceInstance")
    @Expose
    private String AnnounceInstance;

    /**
     * 获取一组指标和数据
     * @return Metrics 一组指标和数据
     */
    public MetricDatum [] getMetrics() {
        return this.Metrics;
    }

    /**
     * 设置一组指标和数据
     * @param Metrics 一组指标和数据
     */
    public void setMetrics(MetricDatum [] Metrics) {
        this.Metrics = Metrics;
    }

    /**
     * 获取上报时自行指定的 IP
     * @return AnnounceIp 上报时自行指定的 IP
     */
    public String getAnnounceIp() {
        return this.AnnounceIp;
    }

    /**
     * 设置上报时自行指定的 IP
     * @param AnnounceIp 上报时自行指定的 IP
     */
    public void setAnnounceIp(String AnnounceIp) {
        this.AnnounceIp = AnnounceIp;
    }

    /**
     * 获取上报时自行指定的时间戳
     * @return AnnounceTimestamp 上报时自行指定的时间戳
     */
    public Integer getAnnounceTimestamp() {
        return this.AnnounceTimestamp;
    }

    /**
     * 设置上报时自行指定的时间戳
     * @param AnnounceTimestamp 上报时自行指定的时间戳
     */
    public void setAnnounceTimestamp(Integer AnnounceTimestamp) {
        this.AnnounceTimestamp = AnnounceTimestamp;
    }

    /**
     * 获取上报时自行指定的 IP 或 产品实例ID
     * @return AnnounceInstance 上报时自行指定的 IP 或 产品实例ID
     */
    public String getAnnounceInstance() {
        return this.AnnounceInstance;
    }

    /**
     * 设置上报时自行指定的 IP 或 产品实例ID
     * @param AnnounceInstance 上报时自行指定的 IP 或 产品实例ID
     */
    public void setAnnounceInstance(String AnnounceInstance) {
        this.AnnounceInstance = AnnounceInstance;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Metrics.", this.Metrics);
        this.setParamSimple(map, prefix + "AnnounceIp", this.AnnounceIp);
        this.setParamSimple(map, prefix + "AnnounceTimestamp", this.AnnounceTimestamp);
        this.setParamSimple(map, prefix + "AnnounceInstance", this.AnnounceInstance);

    }
}

