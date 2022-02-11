/**
 * @author cuiba
 * @create 2022/1/19
 */
package cn.com.citydo.huzhou.nx.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentResult<T> {

    private int code;
    private String message;
    private T date;

    public CommentResult(int code,String message){
        this(code,message,null);
    }

}
