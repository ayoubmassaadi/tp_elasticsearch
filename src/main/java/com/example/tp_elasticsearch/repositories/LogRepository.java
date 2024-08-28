package com.example.tp_elasticsearch.repositories;

import com.example.tp_elasticsearch.entities.Log;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface LogRepository extends ElasticsearchRepository<Log,String> {
}
