package com.example.Course.Registeration.System.Repository;

import com.example.Course.Registeration.System.Model.CourseRegistry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRegistryRepository extends JpaRepository<CourseRegistry,Integer> {
}
