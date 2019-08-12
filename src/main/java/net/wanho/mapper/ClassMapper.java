package net.wanho.mapper;

import net.wanho.pojo.StuClass;

import java.util.List;

/**
 * Created by 锦锦小仙女 on 2019/7/28.
 */
public interface ClassMapper {
//    void addClass(StuClass stuClass);
    /**
     * 查询所有班级
     * @return
     */
    List<StuClass> queryStuClass();
}
