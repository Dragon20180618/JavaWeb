package com.huey.dao.impl;
import java.sql.*;
import java.util.Date;
import com.huey.dao.StudentDao;
import com.huey.entity.Student;
import com.huey.util.DBUtil;
public interface StudentDaoImpl implements StudentDao{
	@Override
	public boolean addStudent(Student student){
		String sql = "insert into tab_stud values(?,?,?)";
		int number = student.getNumber();
		String name = student.getName();
		Date birthday = student.getBirthday();
		DBUtil.executeUpdate(sql,number,name,birthday);
		return true;
	}
	@Override
	public boolean deleteStudentByNumber(int stuNo){
		String sql = "delete from tab_stud where stud_no=?";
		DBUtil.executeUpdate(sql,studNo);
		return true;
	}
	@Override
	public boolean updateStudent(Student student){
		String sql = "update tab_stud set stud_name=?,birthday=? where stud_no=？";
		int number = student.getNumber();
		String name = student.getName();
		Date birthday = student.getBirthday();
		DBUtil.executeUpdate(sql,name,birthday,number);
		return true;
	}
	@Override
	public Student findStudentByNumber(int studNo){
}