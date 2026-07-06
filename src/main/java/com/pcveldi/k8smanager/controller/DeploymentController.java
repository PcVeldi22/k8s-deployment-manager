package com.pcveldi.k8smanager.controller;

import com.pcveldi.k8smanager.model.DeploymentInfo;
import com.pcveldi.k8smanager.service.DeploymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/deployments")
@RequiredArgsConstructor
public class DeploymentController {

    private final DeploymentService deploymentService;

    @GetMapping
    public ResponseEntity<List<DeploymentInfo>> listDeployments(
            @RequestParam(defaultValue = "default") String namespace) {
        return ResponseEntity.ok(deploymentService.listDeployments(namespace));
    }

    @PostMapping("/{name}/scale")
    public ResponseEntity<Void> scaleDeployment(
            @PathVariable String name,
            @RequestParam String namespace,
            @RequestParam int replicas) {
        deploymentService.scaleDeployment(namespace, name, replicas);
        return ResponseEntity.accepted().build();
    }

    @PostMapping("/{name}/rollback")
    public ResponseEntity<Void> rollbackDeployment(
            @PathVariable String name,
            @RequestParam String namespace) {
        deploymentService.rollbackDeployment(namespace, name);
        return ResponseEntity.accepted().build();
    }

    @DeleteMapping("/{name}")
    public ResponseEntity<Void> deleteDeployment(
            @PathVariable String name,
            @RequestParam String namespace) {
        deploymentService.deleteDeployment(namespace, name);
        return ResponseEntity.noContent().build();
    }
}
