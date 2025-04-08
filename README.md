# AWS-Devops-CI-CD-pipeline-Integration
to build a complete real-time AWS DevOps pipeline integrating all key tools: EC2, Docker, Kubernetes, Jenkins, Terraform, Ansible, and CI/CD best practices.


**Project Outline: **
Deploy a real-time Java web application in a Kubernetes cluster on AWS using a CI/CD pipeline, with infrastructure as code, automated configuration management, and advanced Kubernetes rollout strategies.

**Tools and their usage**

1.  AWS -  Hosts Kubernetes master and worker nodes, Jenkins, and Ansible controller
2.  Terraform - Provision AWS infrastructure and Kubernetes cluster
3.  Docker - Build and manage container images of Java application
4.  Kubernetes - Deploy and manage Java app pods, enable tainting/rollout strategies
5.  Jenkins - Automate CI/CD pipeline: build → test → Dockerize → deploy to K8s
6.  Ansible - Configure EC2 instances, update applications in clusters


**Flow of the Project**

    A[Terraform Provisioning] --> B[S3 Bucket + EC2 + IAM for Kops]
    B --> C[Kops Creates Kubernetes Cluster]
    C --> D[Jenkins Deployed on EC2]
    D --> E[Code Commit Triggers Jenkins Job]
    E --> F[Build Java App + Docker Image]
    F --> G[Push to Docker Hub]
    G --> H[Deploy via kubectl to Kops Cluster]
    H --> I[Rolling Updates, Taints, Labels]
    H --> J[Ansible Updates or Config Changes]


**Tools and their Jobs  breakdown for completing the project**

*Terraform*

Create:
IAM Role for Kops
S3 Bucket for Kops state store
EC2 instances (or just use Kops-managed nodes)
Route53 DNS (if needed)


*Kubernetes*

Kops Cluster Setup
Deploy Apps to Kops Kubernetes Cluster

*Docker*

Create Dockerfile for Java Web App
Build + Tag + Push to Docker Hub

*Jenkins*

Triggered on Git commits
Build Java code (Maven/Gradle)
Dockerize and push image
Deploy to Kubernetes using kubectl

*Ansible*
Playbooks to update configuration
Setup Docker, Java, Jenkins, or deploy updates on K8s nodes

    
