package com.am.api.endpoints;

import java.util.HashMap;
import java.util.Map;

import com.am.api.utilities.RestUtils;

import io.restassured.response.Response;

public class OrderEndpoints {
    public Response findPurchaseOrderById(int OrderId) {
        String endPoint = "https://petstore.swagger.io/v2/store/order/1";
        return RestUtils.performGet(endPoint, new HashMap<String,String>());
    }
}
