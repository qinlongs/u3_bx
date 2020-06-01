package com.kgc.invoicingprivoder.service.Impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.kgc.invocingcommon.entity.*;
import com.kgc.invocingcommon.service.SaleService;
import com.kgc.invoicingprivoder.dao.SaleDao;
import com.kgc.invoicingprivoder.util.RedisUtil;
import com.kgc.invoicingprivoder.util.TokenExistUtil;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
@Service(interfaceClass = SaleService.class)
public class SaleServiceImpl implements SaleService {

    @Resource
    private SaleDao saleDao;
    @Resource
    private RedisUtil redisUtil;

    @Override
    public ResponseResult saleList(SalePartment partment,String token) {
        ResponseResult rs = TokenExistUtil.existToken(token,redisUtil);
        SalePage salePage = new SalePage();
        if(rs.getResult()){
            User user = (User) rs.getData();
            partment.setPageIndex((partment.getCurPage()-1)*partment.getPageSize());
            List<Sale> list = saleDao.saleList(partment);
            int count = saleDao.count(partment);
            salePage.setCurPage(partment.getCurPage());
            salePage.setPageSize(partment.getPageSize());
            salePage.setTotalCount(count);
            salePage.setTotalPageCount((count/partment.getPageSize())+((count%partment.getPageSize())==0?0:1));
            salePage.setList(list);
            rs.setData(salePage);
            rs.setResult(true);
        }

        return rs;
    }

    @Override
    public ResponseResult deleteSale(int id,String token) {
        ResponseResult rs = TokenExistUtil.existToken(token,redisUtil);
        if(rs.getResult()){
            int flag = saleDao.deleteSale(id);
            if(flag>0){
                rs.setData("删除陈宫");
                rs.setFlag(1);
                rs.setResult(true);
            }else{
                rs.setData("删除失败");
                rs.setFlag(2);
                rs.setResult(false);
            }
        }else{
            rs.setData("账户失效");
            rs.setFlag(3);
            rs.setResult(false);
        }
        return rs;
    }
}
