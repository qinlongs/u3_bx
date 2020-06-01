package com.kgc.invocingcommon.service;

import com.kgc.invocingcommon.entity.ResponseResult;
import com.kgc.invocingcommon.entity.SalePage;
import com.kgc.invocingcommon.entity.SalePartment;

public interface SaleService {

    ResponseResult saleList(SalePartment partment, String token);

    ResponseResult deleteSale(int id,String token);



}
