package cn.com.citydo.huzhou.nx.dao;

import cn.com.citydo.huzhou.nx.entities.TableList;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao {

    public int create(TableList tableList);

    public TableList getPaymentByCode(@Param("resCode") String resCode);

}
