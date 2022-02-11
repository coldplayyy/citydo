/**
 * @author cuiba
 * @create 2022/1/20
 */
package cn.com.citydo.huzhou.nx.controller;

import cn.com.citydo.huzhou.nx.entities.CommentResult;
import cn.com.citydo.huzhou.nx.entities.TableList;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@Slf4j
public class OrderController {

    @Resource
    private RestTemplate restTemplate;

    public static final String URL_PREFIX = "http://localhost:8001";

    @GetMapping(value = "/consumer/payment/create")
    public CommentResult create(TableList tableList){

        return restTemplate.postForObject(URL_PREFIX + "/payment/create",tableList,CommentResult.class);

    }

    @GetMapping(value = "/consumer/payment/getPayment/{resCode}")
    public CommentResult getPaymentByCode(@PathVariable("resCode") String resCode){
        log.info(URL_PREFIX + "/payment/getPaymentByCode/" + resCode);
        return restTemplate.getForObject(URL_PREFIX + "/payment/getPaymentByCode/" + resCode,CommentResult.class);
    }

}
