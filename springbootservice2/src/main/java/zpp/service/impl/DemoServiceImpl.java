package zpp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zpp.mapper.DemoMapper;
import zpp.service.DemoService;

/**
 * @Author: 张平平
 * @Date: 2020/7/22 15:44
 */
@Service
public class DemoServiceImpl implements DemoService {
    @Autowired
    DemoMapper demoMapper;
    @Override
    public String getString() {
        return demoMapper.getString();
    }
}
