# 🚀 Kubernetes Deployment Manager

<p align="center">
  <img src="https://img.shields.io/badge/Java-17-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" />
  <img src="https://img.shields.io/badge/Spring_Boot-3.x-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white" />
  <img src="https://img.shields.io/badge/Kubernetes-326CE5?style=for-the-badge&logo=kubernetes&logoColor=white" />
  <img src="https://img.shields.io/badge/Angular-DD0031?style=for-the-badge&logo=angular&logoColor=white" />
  <img src="https://img.shields.io/badge/Helm-0F1689?style=for-the-badge&logo=helm&logoColor=white" />
  <img src="https://img.shields.io/badge/Prometheus-E6522C?style=for-the-badge&logo=prometheus&logoColor=white" />
</p>

> A **web-based Kubernetes management dashboard** built with Spring Boot and Angular. Interact with your K8s clusters — manage deployments, services, pods, and ConfigMaps through an intuitive UI without needing kubectl.

---

## ✨ Features

- 🖥️ **Cluster Overview** — Real-time view of nodes, pods, deployments, and services
- 🚀 **Deploy Applications** — Create and update deployments via form-based UI
- 📈 **Scale Workloads** — Adjust replicas with a slider — no YAML needed
- ↩️ **Rollback Deployments** — One-click rollback to any previous revision
- 📊 **Resource Monitoring** — CPU, memory, and network metrics per pod
- 📜 **Log Viewer** — Real-time streaming pod logs in the browser
- 🔔 **Alerts** — Threshold-based alerts for pod crashes and resource spikes
- 🏷️ **Namespace Management** — Switch between namespaces seamlessly
- 🔐 **RBAC** — Role-based access control for cluster operations
- 📦 **Helm Integration** — Deploy and manage Helm chart releases

---

## 🛠️ Tech Stack

| Component | Technology |
|-----------|------------|
| Language | Java 17 |
| Framework | Spring Boot 3.2 |
| K8s Client | Fabric8 Kubernetes Client |
| Frontend | Angular 17 + TypeScript + PrimeNG |
| Charts | Apache ECharts |
| Log Streaming | Server-Sent Events (SSE) |
| Auth | Spring Security + RBAC |
| Monitoring | Prometheus + Grafana |
| Containerization | Docker |

---

## 🚀 Quick Start

```bash
git clone https://github.com/Pcveldi22/k8s-deployment-manager.git
cd k8s-deployment-manager

# Point to your cluster (uses ~/.kube/config by default)
docker-compose up -d

# App: http://localhost:4200
# API: http://localhost:8080
```

---

## 📁 Project Structure

```
k8s-deployment-manager/
├── backend/
│   ├── src/main/java/com/chanduveldi/k8s/
│   │   ├── controller/      # REST API endpoints
│   │   ├── service/         # K8s API integration
│   │   │   ├── DeploymentService.java
│   │   │   ├── PodService.java
│   │   │   └── MetricsService.java
│   │   └── config/          # Fabric8 + Security config
│   └── pom.xml
├── frontend/
│   ├── src/app/
│   │   ├── dashboard/       # Cluster overview
│   │   ├── deployments/     # Deployment management
│   │   ├── pods/            # Pod management + logs
│   │   └── monitoring/      # Metrics charts
│   └── package.json
└── docker-compose.yml
```

---

## 📄 License

MIT License — see [LICENSE](LICENSE) for details.

<p align="center">Made with ❤️ by <a href="https://github.com/Pcveldi22">Pc Veldi</a> | Senior Software Engineer</p>
