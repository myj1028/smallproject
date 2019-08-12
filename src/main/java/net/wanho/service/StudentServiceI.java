package net.wanho.service;

import com.github.pagehelper.PageInfo;
import net.wanho.pojo.StuClass;
import net.wanho.pojo.Student;
import net.wanho.pojo.Subject;
import net.wanho.vo.StudentVo;

import java.util.List;

/**
 * Created by Administrator on 2019/7/29.
 */
public interface StudentServiceI {

    /**
     * 查询所有学生
     * @return
     */

//    List<StudentVo> queryAllStus(String select) ;

    /**
     * 根据id删除学生
     * @param id
     */
    void deleteStu(Integer id)  ;

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
     * 根据id查询学生
     * @param id
     * @return
     */
    StudentVo queryById(Integer id);

    /**
     * 查询学生所在班级
     * @return
     */
    List<StuClass> queryStuClass();

    /**
     * 查询所有课程
     * @return
     */
    List<Subject> querySubject();


    PageInfo<StudentVo> queryStuByPage(Integer pageNum,String select);

}
