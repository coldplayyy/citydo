/**
 * @author cuiba
 * @create 2022/1/19
 */
package cn.com.citydo.huzhou.nx.service;

import cn.com.citydo.huzhou.nx.entities.TableList;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {

    public int create(TableList tableList);
    public TableList getPaymentByCode(@Param("resCode") String resCode);

}
