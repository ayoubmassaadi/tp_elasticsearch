package com.example.tp_elasticsearch.services;

import com.example.tp_elasticsearch.entities.Log;
import com.example.tp_elasticsearch.repositories.LogRepository;
import org.springframework.stereotype.Service;

@Service
public class LogService {
    private LogRepository logRepository;

    public LogService(LogRepository logRepository) {
        this.logRepository = logRepository;
    }

    public Log saveLog(Log article){
        return logRepository.save(article);
    }

    public Log findLogById(String id){
        return logRepository.findById(id).get();
    }

    public Iterable<Log> findAllLogs(){
        return logRepository.findAll();
    }
}
