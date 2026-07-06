package com.pcveldi.k8smanager.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DeploymentInfo {

    private String name;
    private String namespace;
    private String image;
    private int desiredReplicas;
    private int availableReplicas;
    private int readyReplicas;
    private DeploymentStatus status;
    private Map<String, String> labels;
    private LocalDateTime createdAt;
    private LocalDateTime lastUpdated;

    public enum DeploymentStatus {
        PENDING, RUNNING, DEGRADED, FAILED, SCALING
    }
}
