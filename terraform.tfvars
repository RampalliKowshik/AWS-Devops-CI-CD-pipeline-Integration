
ami                  = "ami-0e35ddab05955cf57"
instance_type        = "t3.xlarge"
subnet_id            = "subnet-02ae20c41a48cc0ea"
key_name             = "Devops.pem"
security_group_id    = "sg-044a0caa79d876e25"

tags = {
  Name        = "devops-ec2"
  Environment = "dev"
}

