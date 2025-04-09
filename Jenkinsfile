
sudo apt update && sudo apt upgrade -y


sudo apt install -y curl unzip


curl -fsSL -o terraform.zip https://releases.hashicorp.com/terraform/1.6.6/terraform_1.6.6_linux_amd64.zip


unzip terraform.zip
sudo mv terraform /usr/local/bin/

  terraform version

mkdir -p ~/devops-project/terraform-kops
cd ~/devops-project/terraform-kops

vim providers.tf 

## provider "aws" {
  region = var.aws_region
}


vim variables.tf
variable "aws_region" {
  description = "The AWS region to create resources in"
  default     = "us-east-1"
}

variable "kops_bucket_name" {
  description = "Globally unique S3 bucket name for Kops state store"
  type        = string
}


vim main.tf
resource "aws_s3_bucket" "kops_state" {
  bucket = var.kops_bucket_name
  acl    = "private"

  versioning {
    enabled = true
  }

  tags = {
    Name        = "KopsStateStore"
    Environment = "DevOps"
  }
}

vim outputs.tf
output "kops_s3_bucket_name" {
  value = aws_s3_bucket.kops_state.id
}


terraform init
terraform plan -var="kops_bucket_name=my-kops-state-store-unique-2025"
terraform apply -var="kops_bucket_name=my-kops-state-store-unique-2025"


