package net.wanho.pojo;

/**
 * Created by Administrator on 2019/7/25.
 */

public class StuClass {

    private Integer classId;
    private String className;

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public StuClass() {
    }

    public StuClass(Integer classId, String className) {
        this.classId = classId;
        this.className = className;
    }

    @Override
    public String toString() {
        return "StuClass{" +
                "classId=" + classId +
                ", className='" + className + '\'' +
                '}';
    }
}
