package com.example.assignment.DyteAssignment.controller;

import com.example.assignment.DyteAssignment.models.LogIngestor;
import com.example.assignment.DyteAssignment.repository.LogIngestorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Controller
@RequestMapping("/")
public class MyController {
    @Autowired
    private LogIngestorRepository logIngestorRepository;

    @PostMapping("/")
    public ResponseEntity<?> addLogs(@RequestBody LogIngestor logIngestor) {
        LogIngestor save = this.logIngestorRepository.save(logIngestor);
        return ResponseEntity.ok(save);
    }

    @GetMapping("/logs")
    public ResponseEntity<?> getAllLogs() {
        return ResponseEntity.ok(this.logIngestorRepository.findAll());

    }


    @GetMapping("/getByMessage")
    public ResponseEntity<List<LogIngestor>> getLogsByMessage(@RequestParam String message) {
        List<LogIngestor> logs = logIngestorRepository.findByMessage(message);
        return ResponseEntity.ok(logs);
    }

    @GetMapping("/getByResourceId")
    public ResponseEntity<List<LogIngestor>> getLogsByResourceId(@RequestParam String resourceId) {
        List<LogIngestor> logs = logIngestorRepository.findByResourceId(resourceId);
        return ResponseEntity.ok(logs);
    }

    @GetMapping("/getByTimestamp")
    public ResponseEntity<List<LogIngestor>> getLogsByTimestamp(@RequestParam String timestamp) {
        List<LogIngestor> logs = logIngestorRepository.findByTimestamp(timestamp);
        return ResponseEntity.ok(logs);
    }

    @GetMapping("/getByTraceId")
    public ResponseEntity<List<LogIngestor>> getLogsByTraceId(@RequestParam String traceId) {
        List<LogIngestor> logs = logIngestorRepository.findByTraceId(traceId);
        return ResponseEntity.ok(logs);
    }

    @GetMapping("/getBySpanId")
    public ResponseEntity<List<LogIngestor>> getLogsBySpanId(@RequestParam String spanId) {
        List<LogIngestor> logs = logIngestorRepository.findBySpanId(spanId);
        return ResponseEntity.ok(logs);
    }

    @GetMapping("/getByCommit")
    public ResponseEntity<List<LogIngestor>> getLogsByCommit(@RequestParam String commit) {
        List<LogIngestor> logs = logIngestorRepository.findByCommit(commit);
        return ResponseEntity.ok(logs);
    }

    @GetMapping("/getByParentResourceId")
    public ResponseEntity<List<LogIngestor>> getLogsByParentResourceId(@RequestParam String parentResourceId) {
        List<LogIngestor> logs = logIngestorRepository.findByMetadata_ParentResourceId(parentResourceId);
        return ResponseEntity.ok(logs);
    }


}





