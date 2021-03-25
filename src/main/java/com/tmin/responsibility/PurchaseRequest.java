package com.tmin.responsibility;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author
 * @date 2021-03-25 23:41
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PurchaseRequest {
    private int tpye = 0; //请求类型
    private float price = 0.0f; //请求金额
    private int id = 0;
}
