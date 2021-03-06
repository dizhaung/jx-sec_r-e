package com.fantacg.user.mapper;

import com.fantacg.common.pojo.user.RealNameAuthLog;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 开发公司：深圳市九象数字科技有限公司
 * 版权：深圳市九象数字科技有限公司
 * <P>
 * @author 智慧安全云
 * @Classname RealNameAuthLogMapper
 * @Created by Dupengfei 2019/11/26 9:57
 * @Version 2.0
 */
@Repository
public interface RealNameAuthLogMapper extends Mapper<RealNameAuthLog> {

    /**
     * 分页查询认证记录
     * @param map
     * @return
     */
    List<RealNameAuthLog> queryRealNameApplyPage(Map<String, Object> map);
}
