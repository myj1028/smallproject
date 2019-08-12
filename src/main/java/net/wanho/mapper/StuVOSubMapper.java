package net.wanho.mapper;

import net.wanho.vo.StudentVo;

/**
 * Created by 锦锦小仙女 on 2019/7/28.
 */
public interface StuVOSubMapper {

    /**
     * 往关联表里新增数据
     * @param studentVo
     */
    void  addStuAndSub(StudentVo studentVo);
}
