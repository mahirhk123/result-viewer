package com.result.view.result_viewer.repository;

import com.result.view.result_viewer.entity.Mark;
import com.result.view.result_viewer.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MarkRepo extends JpaRepository<Mark, Long> {
    List<Mark> findByStudent(Student student);

}
