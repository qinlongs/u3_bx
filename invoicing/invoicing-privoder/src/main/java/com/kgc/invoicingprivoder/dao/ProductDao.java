package com.kgc.invoicingprivoder.dao;

import com.kgc.invocingcommon.entity.Product;
import com.kgc.invocingcommon.entity.Sale;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ProductDao {

    List<Product> getPro();

    int addSale(Sale sale);

    Product quantity(@Param("id") int id);
}
