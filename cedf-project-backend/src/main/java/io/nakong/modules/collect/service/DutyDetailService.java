package io.nakong.modules.collect.service;

import java.util.Map;

import com.baomidou.mybatisplus.service.IService;

import io.nakong.common.utils.PageUtils;
import io.nakong.modules.collect.entity.DutyDetailEntity;

/**
 * 
 *
 * @author tom
 * @email zhaoxinsheng@codyy.com
 * @date 2018-06-28 20:20:43
 */
public interface DutyDetailService extends IService<DutyDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

