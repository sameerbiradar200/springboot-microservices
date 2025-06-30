# ☁️ Spring Boot Microservices – CI/CD Deployment via GCP Cloud Run

This monorepo contains multiple Spring Boot microservices deployed to **Google Cloud Run** using **Docker** and **GitHub Actions CI/CD**. Images are stored in **Artifact Registry**, and builds are optimized to trigger only for relevant services.

---

## 📦 Microservices Overview

| Service            | Folder Name            | Cloud Run Service Name       | Registry Image Path                                                  |
|--------------------|------------------------|-------------------------------|-----------------------------------------------------------------------|
| Discovery Server   | `discovery-server`     | `eureka-service`              | `us-central1-docker.pkg.dev/<project-id>/microservices-repo/eureka-server` |
| API Gateway        | `api-gateway-service`  | `gateway-service`             | `us-central1-docker.pkg.dev/<project-id>/microservices-repo/api-gateway`   |

Replace `<project-id>` with your actual GCP project ID.

---

## 🚀 Deployment Flow (CI/CD)

### ✅ CI/CD Trigger Rules

| Change | Commit Message Keyword   | Deployed Service     |
|--------|--------------------------|-----------------------|
| Only Gateway | `[gateway]`             | `api-gateway-service` |
| Only Discovery | `[eureka]`              | `discovery-server`    |
| Both | `[gateway] [eureka]`      | Both services         |
| Docs/Non-deploy change | `[skip ci]`            | No deployment         |

---

### 🔁 Normal Deployment

```bash
# Example: pushing gateway changes
git add .
git commit -m "feat: update route config [gateway]"
git push origin main
```
⛔ Skip Deployment

```bash
git commit -m "docs: update README [skip ci]"
git push origin main