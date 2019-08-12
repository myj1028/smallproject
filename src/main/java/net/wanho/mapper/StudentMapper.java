package net.wanho.mapper;

import net.wanho.pojo.Student;
import net.wanho.vo.StudentVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2019/7/29.
 */
public interface StudentMapper {
    /**
     * 查询所有学生
     * @return
     */
    List<StudentVo> queryAllStus(@Param("select") String select) ;


    /**
     * 增加学生
     * @param studentVo
     */
    void addStu(StudentVo studentVo) ;

    /**
     * 修改学生
     * @param studentVo
     */
    void updateStu(StudentVo studentVo)  ;

    /**
     * 根据id删除学生与课程关联表里的某条数据
     * @param id
     */
    void delStuSubjectRelation(Integer id);

    /**
     * 先修改，再删除关联表的数据，再新增
     * @param stuId 学生id
     * @param ssId 学生课程关联表的id
     */
    void insertStuSubjectRelation(@Param("stuId") Integer stuId,@Param("ssId") Integer ssId);
//    void insertStuSubjectRelation(Integer param1,@Param("ssId") Integer ssId);


    /**
     * 根据id查询学生
     * @param id
     * @return
     */
    StudentVo queryById(Integer id);

    /**
     * 根据id删除学生
     * @param id
     */
    void deleteStu(Integer id)  ;





}
