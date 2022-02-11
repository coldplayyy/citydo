/**
 * @author cuiba
 * @create 2022/1/19
 */
package cn.com.citydo.huzhou.nx.service.impl;

import cn.com.citydo.huzhou.nx.dao.PaymentDao;
import cn.com.citydo.huzhou.nx.entities.TableList;
import cn.com.citydo.huzhou.nx.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Slf4j
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;


    @Override
    public int create(TableList tableList) {
        return paymentDao.create(tableList);
    }

    @Override
    public TableList getPaymentByCode(String resCode) {
        log.info("*************测试***************");
        return paymentDao.getPaymentByCode(resCode);
    }
}
