package com.cg.apps.schoolmswithjpa.studentms.dao;


import com.cg.apps.schoolmswithjpa.studentms.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IStudentRepository extends JpaRepository<Student, Integer> {
    List<Student> findByName(String name);

    List<Student> findByScore(int score);

    /**
     * find students for the provided name where score is greater than provided score
     *
     */
    @Query("from Student where name=:nameArg and score>:scoreArg")
    List<Student>findByNameWhereScoreGreater(@Param("nameArg") String name,@Param("scoreArg") int score);
}
