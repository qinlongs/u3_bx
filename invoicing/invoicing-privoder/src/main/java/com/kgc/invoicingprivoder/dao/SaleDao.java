package com.kgc.invoicingprivoder.dao;

import com.kgc.invocingcommon.entity.Sale;
import com.kgc.invocingcommon.entity.SalePartment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SaleDao {


    List<Sale> saleList(SalePartment partment);
    int count(SalePartment partment);
    int deleteSale(@Param("id") int id );
}
