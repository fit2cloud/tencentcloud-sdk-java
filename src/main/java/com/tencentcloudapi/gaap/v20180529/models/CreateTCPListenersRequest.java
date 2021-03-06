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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTCPListenersRequest  extends AbstractModel{

    /**
    * 监听器名称。
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * 监听器端口列表。
    */
    @SerializedName("Ports")
    @Expose
    private Long [] Ports;

    /**
    * 监听器源站调度策略，支持轮询（rr），加权轮询（wrr），最小连接数（lc）。
    */
    @SerializedName("Scheduler")
    @Expose
    private String Scheduler;

    /**
    * 源站是否开启健康检查：1开启，0关闭，UDP监听器不支持健康检查
    */
    @SerializedName("HealthCheck")
    @Expose
    private Long HealthCheck;

    /**
    * 监听器对应源站类型，支持IP或者DOMAIN类型。DOMAIN源站类型不支持wrr的源站调度策略。
    */
    @SerializedName("RealServerType")
    @Expose
    private String RealServerType;

    /**
    * 通道ID，ProxyId和GroupId必须设置一个，但不能同时设置。
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
    * 通道组ID，ProxyId和GroupId必须设置一个，但不能同时设置。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 源站健康检查时间间隔，单位：秒。时间间隔取值在[5，300]之间。
    */
    @SerializedName("DelayLoop")
    @Expose
    private Long DelayLoop;

    /**
    * 源站健康检查响应超时时间，单位：秒。超时时间取值在[2，60]之间。超时时间应小于健康检查时间间隔DelayLoop。
    */
    @SerializedName("ConnectTimeout")
    @Expose
    private Long ConnectTimeout;

    /**
    * 源站端口列表，该参数仅支持v1版本监听器和通道组监听器。
    */
    @SerializedName("RealServerPorts")
    @Expose
    private Long [] RealServerPorts;

    /**
     * 获取监听器名称。
     * @return ListenerName 监听器名称。
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * 设置监听器名称。
     * @param ListenerName 监听器名称。
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    /**
     * 获取监听器端口列表。
     * @return Ports 监听器端口列表。
     */
    public Long [] getPorts() {
        return this.Ports;
    }

    /**
     * 设置监听器端口列表。
     * @param Ports 监听器端口列表。
     */
    public void setPorts(Long [] Ports) {
        this.Ports = Ports;
    }

    /**
     * 获取监听器源站调度策略，支持轮询（rr），加权轮询（wrr），最小连接数（lc）。
     * @return Scheduler 监听器源站调度策略，支持轮询（rr），加权轮询（wrr），最小连接数（lc）。
     */
    public String getScheduler() {
        return this.Scheduler;
    }

    /**
     * 设置监听器源站调度策略，支持轮询（rr），加权轮询（wrr），最小连接数（lc）。
     * @param Scheduler 监听器源站调度策略，支持轮询（rr），加权轮询（wrr），最小连接数（lc）。
     */
    public void setScheduler(String Scheduler) {
        this.Scheduler = Scheduler;
    }

    /**
     * 获取源站是否开启健康检查：1开启，0关闭，UDP监听器不支持健康检查
     * @return HealthCheck 源站是否开启健康检查：1开启，0关闭，UDP监听器不支持健康检查
     */
    public Long getHealthCheck() {
        return this.HealthCheck;
    }

    /**
     * 设置源站是否开启健康检查：1开启，0关闭，UDP监听器不支持健康检查
     * @param HealthCheck 源站是否开启健康检查：1开启，0关闭，UDP监听器不支持健康检查
     */
    public void setHealthCheck(Long HealthCheck) {
        this.HealthCheck = HealthCheck;
    }

    /**
     * 获取监听器对应源站类型，支持IP或者DOMAIN类型。DOMAIN源站类型不支持wrr的源站调度策略。
     * @return RealServerType 监听器对应源站类型，支持IP或者DOMAIN类型。DOMAIN源站类型不支持wrr的源站调度策略。
     */
    public String getRealServerType() {
        return this.RealServerType;
    }

    /**
     * 设置监听器对应源站类型，支持IP或者DOMAIN类型。DOMAIN源站类型不支持wrr的源站调度策略。
     * @param RealServerType 监听器对应源站类型，支持IP或者DOMAIN类型。DOMAIN源站类型不支持wrr的源站调度策略。
     */
    public void setRealServerType(String RealServerType) {
        this.RealServerType = RealServerType;
    }

    /**
     * 获取通道ID，ProxyId和GroupId必须设置一个，但不能同时设置。
     * @return ProxyId 通道ID，ProxyId和GroupId必须设置一个，但不能同时设置。
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * 设置通道ID，ProxyId和GroupId必须设置一个，但不能同时设置。
     * @param ProxyId 通道ID，ProxyId和GroupId必须设置一个，但不能同时设置。
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    /**
     * 获取通道组ID，ProxyId和GroupId必须设置一个，但不能同时设置。
     * @return GroupId 通道组ID，ProxyId和GroupId必须设置一个，但不能同时设置。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * 设置通道组ID，ProxyId和GroupId必须设置一个，但不能同时设置。
     * @param GroupId 通道组ID，ProxyId和GroupId必须设置一个，但不能同时设置。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * 获取源站健康检查时间间隔，单位：秒。时间间隔取值在[5，300]之间。
     * @return DelayLoop 源站健康检查时间间隔，单位：秒。时间间隔取值在[5，300]之间。
     */
    public Long getDelayLoop() {
        return this.DelayLoop;
    }

    /**
     * 设置源站健康检查时间间隔，单位：秒。时间间隔取值在[5，300]之间。
     * @param DelayLoop 源站健康检查时间间隔，单位：秒。时间间隔取值在[5，300]之间。
     */
    public void setDelayLoop(Long DelayLoop) {
        this.DelayLoop = DelayLoop;
    }

    /**
     * 获取源站健康检查响应超时时间，单位：秒。超时时间取值在[2，60]之间。超时时间应小于健康检查时间间隔DelayLoop。
     * @return ConnectTimeout 源站健康检查响应超时时间，单位：秒。超时时间取值在[2，60]之间。超时时间应小于健康检查时间间隔DelayLoop。
     */
    public Long getConnectTimeout() {
        return this.ConnectTimeout;
    }

    /**
     * 设置源站健康检查响应超时时间，单位：秒。超时时间取值在[2，60]之间。超时时间应小于健康检查时间间隔DelayLoop。
     * @param ConnectTimeout 源站健康检查响应超时时间，单位：秒。超时时间取值在[2，60]之间。超时时间应小于健康检查时间间隔DelayLoop。
     */
    public void setConnectTimeout(Long ConnectTimeout) {
        this.ConnectTimeout = ConnectTimeout;
    }

    /**
     * 获取源站端口列表，该参数仅支持v1版本监听器和通道组监听器。
     * @return RealServerPorts 源站端口列表，该参数仅支持v1版本监听器和通道组监听器。
     */
    public Long [] getRealServerPorts() {
        return this.RealServerPorts;
    }

    /**
     * 设置源站端口列表，该参数仅支持v1版本监听器和通道组监听器。
     * @param RealServerPorts 源站端口列表，该参数仅支持v1版本监听器和通道组监听器。
     */
    public void setRealServerPorts(Long [] RealServerPorts) {
        this.RealServerPorts = RealServerPorts;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerName", this.ListenerName);
        this.setParamArraySimple(map, prefix + "Ports.", this.Ports);
        this.setParamSimple(map, prefix + "Scheduler", this.Scheduler);
        this.setParamSimple(map, prefix + "HealthCheck", this.HealthCheck);
        this.setParamSimple(map, prefix + "RealServerType", this.RealServerType);
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "DelayLoop", this.DelayLoop);
        this.setParamSimple(map, prefix + "ConnectTimeout", this.ConnectTimeout);
        this.setParamArraySimple(map, prefix + "RealServerPorts.", this.RealServerPorts);

    }
}

