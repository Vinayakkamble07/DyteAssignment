package com.example.assignment.DyteAssignment.models;

import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@Document(collection = "Logs")


public class LogIngestor {

    private String level;
    private String message;
    private String resourceId;
    private Instant timestamp;
    private String traceId;
    private String spanId;
    private String commit;

    private Metadata metadata;

    // Constructors, getters, and setters

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }

    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public String getSpanId() {
        return spanId;
    }

    public void setSpanId(String spanId) {
        this.spanId = spanId;
    }

    public String getCommit() {
        return commit;
    }

    public void setCommit(String commit) {
        this.commit = commit;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    // Constructors, if needed

    @Override
    public String toString() {
        return "LogEntry{" +
                "level='" + level + '\'' +
                ", message='" + message + '\'' +
                ", resourceId='" + resourceId + '\'' +
                ", timestamp=" + timestamp +
                ", traceId='" + traceId + '\'' +
                ", spanId='" + spanId + '\'' +
                ", commit='" + commit + '\'' +
                ", metadata=" + metadata +
                '}';
    }
}
