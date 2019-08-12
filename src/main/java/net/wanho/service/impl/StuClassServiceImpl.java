package net.wanho.service.impl;

import net.wanho.mapper.ClassMapper;
import net.wanho.pojo.StuClass;
import net.wanho.service.StuClassServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 锦锦小仙女 on 2019/7/28.
 */
@Service
public class StuClassServiceImpl implements StuClassServiceI {
    @Autowired
    private ClassMapper classMapper;
    @Override
    public List<StuClass> queryStuClass() {
        return classMapper.queryStuClass();
    }
}
