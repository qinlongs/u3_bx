package com.kgc.invoicingprivoder.service.Impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.kgc.invocingcommon.entity.Product;
import com.kgc.invocingcommon.entity.ResponseResult;
import com.kgc.invocingcommon.entity.Sale;
import com.kgc.invocingcommon.entity.User;
import com.kgc.invocingcommon.service.ProductService;
import com.kgc.invoicingprivoder.dao.ProductDao;
import com.kgc.invoicingprivoder.util.RedisUtil;
import com.kgc.invoicingprivoder.util.TokenExistUtil;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
@Component
@Service(interfaceClass = ProductService.class)
public class ProductServiceImpl implements ProductService {

    @Resource
    private ProductDao productDao;
    @Resource
    private RedisUtil redisUtil;

    @Override
    public ResponseResult getPro(String token) {
        ResponseResult rs = TokenExistUtil.existToken(token,redisUtil);
        if(rs.getResult()){
            User user = (User) rs.getData();
            /*验证权限*/
            List<Product> products = productDao.getPro();
            rs.setData(products);
        }
        return rs;
    }

    @Override
    public ResponseResult addSale(Sale sale,String token) {

        ResponseResult rs = TokenExistUtil.existToken(token,redisUtil);
        if(rs.getResult()){
            User user = (User) rs.getData();
            sale.setUserId(user.getId());
            int flag = productDao.addSale(sale);
            if(flag>0){
                rs.setResult(true);
                rs.setFlag(1);
                rs.setData("添加");
            }
        }
        return rs;
    }

    @Override
    public Product quantity(int id, String token) {
        ResponseResult rs = TokenExistUtil.existToken(token,redisUtil);
        Product product = null;
        if(rs.getResult()){
             product = productDao.quantity(id);
        }
        return product;
    }
}
