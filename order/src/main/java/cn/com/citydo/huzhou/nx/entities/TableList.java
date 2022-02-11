/**
 * @author cuiba
 * @create 2022/1/19
 */
package cn.com.citydo.huzhou.nx.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TableList implements Serializable {

    private String departmentName;
    private String tableCnName;
    private String tableEnName;
    private String resCode;
    private long columnCnt;

}
