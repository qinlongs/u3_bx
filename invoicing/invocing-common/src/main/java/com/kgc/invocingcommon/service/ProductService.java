package com.kgc.invocingcommon.service;

import com.kgc.invocingcommon.entity.Product;
import com.kgc.invocingcommon.entity.ResponseResult;
import com.kgc.invocingcommon.entity.Sale;


public interface ProductService {
    ResponseResult getPro(String token);

    ResponseResult addSale(Sale sale,String token);
    Product quantity(int id,String token);

}
