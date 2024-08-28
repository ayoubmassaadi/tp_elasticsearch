package com.example.tp_elasticsearch.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.Date;

@Document(indexName = "logs")
@AllArgsConstructor @NoArgsConstructor @Data
public class Log {

    @Id
    private String id;
    private Date timeStamps;
    private String logLevel;
    private String message;
}
