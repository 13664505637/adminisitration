package tk.mybatis;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @InterfaceName: Mymapper
 * @Description: tk.mybatis接口 不能被扫描到，否则会报错
 * @Author: yuyang
 * @Data: 2020/5/12 7:22
 * @Version: 1.0
 **/
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
