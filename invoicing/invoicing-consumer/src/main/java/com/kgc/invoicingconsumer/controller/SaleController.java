package com.kgc.invoicingconsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import com.kgc.invocingcommon.entity.ResponseResult;
import com.kgc.invocingcommon.entity.SalePage;
import com.kgc.invocingcommon.entity.SalePartment;
import com.kgc.invocingcommon.service.SaleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class SaleController {

    @Reference
    private SaleService saleService;


    @RequestMapping(value = "/list",method = RequestMethod.POST)
    public String saleList(SalePartment partment, @RequestParam(name = "token") String token, Model model){
        ResponseResult rs  = saleService.saleList(partment,token);
        SalePage salePage = (SalePage) rs.getData();
        model.addAttribute("salePage",salePage);
        return "saleList";
    }

/*删除记录*/
    @ResponseBody
    @RequestMapping(value ="/deleteInfo",method = RequestMethod.POST)
    public Object deleteInfo(Integer id,@RequestParam(name = "token") String token){
        ResponseResult rs = saleService.deleteSale(id,token);

        return JSON.toJSONString(rs);
    }



}
