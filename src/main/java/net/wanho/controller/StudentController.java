package net.wanho.controller;

import com.github.pagehelper.PageInfo;
import net.wanho.pojo.StuClass;
import net.wanho.pojo.Subject;
import net.wanho.service.StuClassServiceI;
import net.wanho.service.StudentServiceI;
import net.wanho.service.SubjectServiceI;
import net.wanho.vo.StudentVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * Created by 锦锦小仙女 on 2019/7/28.
 */
@Controller
public class StudentController {
    @Autowired
    private StudentServiceI studentServiceI;
    @Autowired
    private StuClassServiceI stuClassServiceI;
    @Autowired
    private SubjectServiceI subjectServiceI;


    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public String main() {
        return "main";
    }




    @RequestMapping(value = "/toAdd")
    public String toAdd(Map map) {
        List<StuClass> classes = stuClassServiceI.queryStuClass();
        List<Subject> subjects = subjectServiceI.querySubject();
        map.put("classes", classes);
        map.put("subjects", subjects);

        return "addUser";
    }

    @RequestMapping(value = "/AddController")
    public String addStu(StudentVo studentVo) {
        studentServiceI.addStu(studentVo);
        return "redirect:MainController";
    }

    @RequestMapping(value = "/DeleteController")
    public String deleteStu(Integer id) {
        studentServiceI.deleteStu(id);
        return "redirect:MainController";
    }

    @RequestMapping(value = "/toUpdate")
    public String updateStu(Map map, Integer id) {
        StudentVo studentVos = studentServiceI.queryById(id);
        List<StuClass> classes = stuClassServiceI.queryStuClass();
        List<Subject> subjects = subjectServiceI.querySubject();
        map.put("classes", classes);
        map.put("subjects", subjects);
        map.put("stu", studentVos);

        return "updateUser";
    }

    @RequestMapping(value = "/UpdateController")
    public String updateStu(StudentVo studentVo) {
        studentServiceI.updateStu(studentVo);
        return "redirect:MainController";
    }


    @RequestMapping(value = "/MainController")
    public String queryStuAll(@RequestParam(defaultValue = "1") Integer pageNum,Map map, String select) {
        PageInfo<StudentVo> studentVoPageInfo = studentServiceI.queryStuByPage(pageNum, select);
        map.put("pageInfo", studentVoPageInfo);
        return "main";
    }



}
