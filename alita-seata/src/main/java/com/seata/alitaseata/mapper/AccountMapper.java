package com.seata.alitaseata.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.seata.alitaseata.model.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * TODO
 *
 * @author wubx
 * @date 2023/5/28 15:33
 **/
@Mapper
public interface AccountMapper extends BaseMapper<Account> {

    Account selectByUserId(@Param("userId") String userId);

}
