package net.wanho.vo;

import net.wanho.pojo.Student;

/**
 * Created by Administrator on 2019/7/29.
 */
public class StudentVo extends Student{
    private String className;
    private Integer subjectId;
    private String subjectName;

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public StudentVo() {
    }

    public StudentVo(Integer id, String name, Integer age, String gender, String address, Integer classId, String className, String subjectName) {
        super(id, name, age, gender, address, classId);
        this.className = className;
        this.subjectName = subjectName;
    }

    @Override
    public String toString() {
        return "StudentVo{" +
                "className='" + className + '\'' +
                ", subjectId=" + subjectId +
                ", subjectName='" + subjectName + '\'' +
                "} " + super.toString();
    }

}
