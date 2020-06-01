package com.kgc.invoicingconsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.kgc.invocingcommon.entity.Product;
import com.kgc.invocingcommon.entity.ResponseResult;
import com.kgc.invocingcommon.entity.Sale;
import com.kgc.invocingcommon.entity.User;
import com.kgc.invocingcommon.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
public class ProductController {

    @Reference
    private ProductService productService;

    @ResponseBody
    @RequestMapping(value = "/productList",method = RequestMethod.GET)
    public Object getProductList(String token){
        ResponseResult rs = productService.getPro(token);
        return JSON.toJSONString(rs);
    }

    @RequestMapping(value = "/addSale",method = RequestMethod.GET)
    public String addSale(Model model,String token){
        ResponseResult rs = productService.getPro(token);
        List<Product> list = (List<Product>) rs.getData();
        model.addAttribute("list",list);
        return "addSale";
    }

    @ResponseBody
    @RequestMapping(value = "/addSale",method = RequestMethod.POST)
    public Object addSale(Sale sale,@RequestParam(name = "token") String token){
        ResponseResult rs = productService.addSale(sale,token);
        return JSON.toJSONString(rs);
    }
    /*@ResponseBody
    @RequestMapping(value = "/addSale",method = RequestMethod.POST)
    public Object addSale(Sale sale){
        String token = sale.getToken();
        ResponseResult rs = productService.addSale(sale,token);
        return JSON.toJSONString(rs);
    }*/
/*查看库存*/
    @RequestMapping(value = "/product",method = RequestMethod.GET)
    public String produt(String token,Model model){
        ResponseResult rs = productService.getPro(token);
        List<Product> list = (List<Product>) rs.getData();
        model.addAttribute("list",list);
        return "lookProduct";
    }
    @ResponseBody
    @RequestMapping(value = "/chaxun",method = RequestMethod.POST)
    public Object proInfo(Integer id,@RequestParam(name = "token") String token){
        Product product = productService.quantity(id,token);
        return JSON.toJSONString(product);
    }
}
