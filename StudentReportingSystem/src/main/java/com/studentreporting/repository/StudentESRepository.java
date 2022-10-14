package com.studentreporting.repository;

import com.studentreporting.entities.Student;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface StudentESRepository extends ElasticsearchRepository<Student, Integer> {
}
