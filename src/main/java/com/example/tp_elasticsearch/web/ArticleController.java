package com.example.tp_elasticsearch.web;

import com.example.tp_elasticsearch.entities.Log;
import com.example.tp_elasticsearch.services.LogService;
import org.springframework.web.bind.annotation.*;

@RestController
public class ArticleController {

    private LogService logService;

    public ArticleController(LogService logService) {
        this.logService = logService;
    }

    @PostMapping("/addLog")
    public String save(@RequestBody Log log){
        Log savedArticle = logService.saveLog(log);
        if(savedArticle != null)
            return "article ajouter";
        else
            return "article deja existe";
    }

    @GetMapping("/getLogs/{id}")
    public Log findLogById(@PathVariable("id") String id){
        return logService.findLogById(id);
    }

    @GetMapping("/getAllLogs")
    public Iterable<Log> findAllLogs(){
        return logService.findAllLogs();
    }
}
