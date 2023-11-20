package com.example.assignment.DyteAssignment.repository;

import com.example.assignment.DyteAssignment.models.LogIngestor;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface LogIngestorRepository extends MongoRepository<LogIngestor, String> {

        List<LogIngestor> findByLevel(String level);

        List<LogIngestor> findByMessage(String message);

        List<LogIngestor> findByResourceId(String resourceId);

        List<LogIngestor> findByTimestamp(String timestamp);

        List<LogIngestor> findByTraceId(String traceId);

        List<LogIngestor> findBySpanId(String spanId);

        List<LogIngestor> findByCommit(String commit);

        List<LogIngestor> findByMetadata_ParentResourceId(String parentResourceId);

}

