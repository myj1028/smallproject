package net.wanho.service.impl;

import net.wanho.mapper.SubjectMapper;
import net.wanho.pojo.Subject;
import net.wanho.service.SubjectServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 锦锦小仙女 on 2019/7/28.
 */
@Service
public class SubjectServiceImpl implements SubjectServiceI {
    @Autowired
    private SubjectMapper subjectMapper;
    @Override
    public List<Subject> querySubject() {
        return subjectMapper.querySubject();
    }
}
