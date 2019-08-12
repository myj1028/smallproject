package net.wanho.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import net.wanho.mapper.ClassMapper;
import net.wanho.mapper.StuVOSubMapper;
import net.wanho.mapper.StudentMapper;
import net.wanho.mapper.SubjectMapper;
import net.wanho.pojo.StuClass;
import net.wanho.pojo.Subject;
import net.wanho.service.StudentServiceI;
import net.wanho.vo.StudentVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Created by Administrator on 2019/7/29.
 */
@Service
public class StudentServiceImpl implements StudentServiceI{

    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private ClassMapper classMapper;
    @Autowired
    private SubjectMapper subjectMapper;
    @Autowired
    private StuVOSubMapper stuVOSubMapper;


    @Override
    public PageInfo<StudentVo> queryStuByPage(Integer pageNum,String select) {
        PageHelper.startPage(pageNum,2);
        List<StudentVo> students=studentMapper.queryAllStus(select);
        PageInfo<StudentVo> pageInfo=new PageInfo<StudentVo>(students);
        return pageInfo;
    }

//    @Override
//    public List<StudentVo> queryAllStus(String select) {
//        return studentMapper.queryAllStus(select);
//    }

    @Override
    public void deleteStu(Integer id) {
        try {
            studentMapper.deleteStu(id);
            studentMapper.delStuSubjectRelation(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void addStu(StudentVo studentVo) {
        try{
            studentMapper.addStu(studentVo);
            stuVOSubMapper.addStuAndSub(studentVo);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public void updateStu(StudentVo studentVo) {

        studentMapper.updateStu(studentVo);
        studentMapper.delStuSubjectRelation(studentVo.getId());
        studentMapper.insertStuSubjectRelation(studentVo.getId(),studentVo.getSubjectId());
    }

    @Override
    public StudentVo queryById(Integer id) {
        return studentMapper.queryById(id);
    }

    @Override
    public List<StuClass> queryStuClass() {
        return classMapper.queryStuClass();
    }

    @Override
    public List<Subject> querySubject() {
        return subjectMapper.querySubject();
    }


}
