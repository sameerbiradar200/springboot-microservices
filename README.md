# Spring Boot Microservices – CI/CD Deployment with Render

This monorepo contains multiple Spring Boot services deployed via **Render** using **Docker** and **GitHub Actions**.

---

## 📦 Microservices Render Dashboard Links

- `api-gateway-service` → [https://dashboard.render.com/web/srv-d1ffe56mcj7s739pgqc0](#)
- `discovery-server` → [https://dashboard.render.com/web/srv-d1fftmmr433s73fh563g](#)

---

## 🚀 Deploy Guide (Render CI/CD)

### 🔁 Standard Deployment (Triggers Auto Deploy)
```bash
git add .
git commit -m "feat: add new route to gateway"
git push origin main
```

###Skip CI/CD (When updating docs, README, etc.)
```bash
git commit -m "docs: update readme [skip ci]"
git push origin main
```
Trigger Specific Deployments
Use keywords in commit messages:

"gateway" → triggers deploy of api-gateway-service

"discovery" → triggers deploy of discovery-server

```bash
git commit -m "fix: gateway route issue"
git push origin main
```


