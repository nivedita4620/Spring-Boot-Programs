package com.anudip.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.anudip.entity.Teacher;

// all crud method like insert update delete find
public interface TeacherRepository extends JpaRepository<Teacher, Integer>
{
	
	@Query("Select t from Teacher t where t.tname=?1")
	List<Teacher> findTeacherByName(String tname);
	
	@Query("Select t from Teacher t where t.designation like ?1% order by tname")
	List<Teacher> findTeacherDesignation(String designation);
	
	@Query("Select t from Teacher t where t.tphone=?1")
	Teacher findTeacherByPhone(String tphone);
}
