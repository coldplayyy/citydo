/**
 * @author cuiba
 * @create 2022/1/19
 */
package cn.com.citydo.huzhou.nx.controller;

import cn.com.citydo.huzhou.nx.entities.CommentResult;
import cn.com.citydo.huzhou.nx.entities.TableList;
import cn.com.citydo.huzhou.nx.service.PaymentService;
import cn.com.citydo.huzhou.nx.service.impl.PaymentServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @PostMapping( value = "/payment/create")
    public CommentResult create(@RequestBody TableList tableList){
        int code = paymentService.create(tableList);
        if (code > 0){
            return new CommentResult(200,"写入成功",tableList);
        } else {
            return new CommentResult(444,"写入失败",null);
        }
    }

    @GetMapping(value = "/payment/getPaymentByCode/{resCode}")
    public CommentResult getPaymentByCode(@PathVariable("resCode") String resCode){
        log.info(resCode);
        TableList tableList = paymentService.getPaymentByCode(resCode);
        log.info(tableList.toString());
        if (tableList != null){
            return new CommentResult(200,"查询成功",tableList);
        } else {
            return new CommentResult(444,"查询失败",null);
        }
    }

}
