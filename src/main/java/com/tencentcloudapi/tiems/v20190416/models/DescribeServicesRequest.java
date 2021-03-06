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
package com.tencentcloudapi.tiems.v20190416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeServicesRequest  extends AbstractModel{

    /**
    * 筛选选项，支持按照name等字段进行筛选
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 偏移量，默认为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量，默认为20，最大值为100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 输出列表的排列顺序。取值范围：ASC：升序排列 DESC：降序排列
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 排序的依据字段， 取值范围 "CREATE_TIME" "UPDATE_TIME"
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
     * 获取筛选选项，支持按照name等字段进行筛选
     * @return Filters 筛选选项，支持按照name等字段进行筛选
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * 设置筛选选项，支持按照name等字段进行筛选
     * @param Filters 筛选选项，支持按照name等字段进行筛选
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * 获取偏移量，默认为0
     * @return Offset 偏移量，默认为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * 设置偏移量，默认为0
     * @param Offset 偏移量，默认为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取返回数量，默认为20，最大值为100
     * @return Limit 返回数量，默认为20，最大值为100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * 设置返回数量，默认为20，最大值为100
     * @param Limit 返回数量，默认为20，最大值为100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * 获取输出列表的排列顺序。取值范围：ASC：升序排列 DESC：降序排列
     * @return Order 输出列表的排列顺序。取值范围：ASC：升序排列 DESC：降序排列
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * 设置输出列表的排列顺序。取值范围：ASC：升序排列 DESC：降序排列
     * @param Order 输出列表的排列顺序。取值范围：ASC：升序排列 DESC：降序排列
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * 获取排序的依据字段， 取值范围 "CREATE_TIME" "UPDATE_TIME"
     * @return OrderField 排序的依据字段， 取值范围 "CREATE_TIME" "UPDATE_TIME"
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * 设置排序的依据字段， 取值范围 "CREATE_TIME" "UPDATE_TIME"
     * @param OrderField 排序的依据字段， 取值范围 "CREATE_TIME" "UPDATE_TIME"
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);

    }
}

