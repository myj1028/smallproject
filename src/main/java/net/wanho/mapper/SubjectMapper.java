package net.wanho.mapper;

import net.wanho.pojo.Subject;

import java.util.List;

/**
 * Created by 锦锦小仙女 on 2019/7/28.
 */

public interface SubjectMapper {
    /**
     * 查询所有课程
     * @return
     */
    List<Subject> querySubject();
}
