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

public class DescribeRegionAndPriceResponse  extends AbstractModel{

    /**
    * 源站区域总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 源站区域详情列表
    */
    @SerializedName("DestRegionSet")
    @Expose
    private RegionDetail [] DestRegionSet;

    /**
    * 通道带宽费用梯度价格
    */
    @SerializedName("BandwidthUnitPrice")
    @Expose
    private BandwidthPriceGradient [] BandwidthUnitPrice;

    /**
    * 带宽价格货币类型：
CNY 人民币
USD 美元
    */
    @SerializedName("Currency")
    @Expose
    private String Currency;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取源站区域总数
     * @return TotalCount 源站区域总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * 设置源站区域总数
     * @param TotalCount 源站区域总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * 获取源站区域详情列表
     * @return DestRegionSet 源站区域详情列表
     */
    public RegionDetail [] getDestRegionSet() {
        return this.DestRegionSet;
    }

    /**
     * 设置源站区域详情列表
     * @param DestRegionSet 源站区域详情列表
     */
    public void setDestRegionSet(RegionDetail [] DestRegionSet) {
        this.DestRegionSet = DestRegionSet;
    }

    /**
     * 获取通道带宽费用梯度价格
     * @return BandwidthUnitPrice 通道带宽费用梯度价格
     */
    public BandwidthPriceGradient [] getBandwidthUnitPrice() {
        return this.BandwidthUnitPrice;
    }

    /**
     * 设置通道带宽费用梯度价格
     * @param BandwidthUnitPrice 通道带宽费用梯度价格
     */
    public void setBandwidthUnitPrice(BandwidthPriceGradient [] BandwidthUnitPrice) {
        this.BandwidthUnitPrice = BandwidthUnitPrice;
    }

    /**
     * 获取带宽价格货币类型：
CNY 人民币
USD 美元
     * @return Currency 带宽价格货币类型：
CNY 人民币
USD 美元
     */
    public String getCurrency() {
        return this.Currency;
    }

    /**
     * 设置带宽价格货币类型：
CNY 人民币
USD 美元
     * @param Currency 带宽价格货币类型：
CNY 人民币
USD 美元
     */
    public void setCurrency(String Currency) {
        this.Currency = Currency;
    }

    /**
     * 获取唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "DestRegionSet.", this.DestRegionSet);
        this.setParamArrayObj(map, prefix + "BandwidthUnitPrice.", this.BandwidthUnitPrice);
        this.setParamSimple(map, prefix + "Currency", this.Currency);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

