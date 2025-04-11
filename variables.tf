
variable "ami" {
  type        = string
  description = "AMI ID for EC2 instance"
}

variable "key_name" {
  type        = string
  description = "Key pair name for SSH access"
}

variable "security_group_id" {
  type        = string
  description = "Security group ID to associate with instance"
}

variable "tags" {
  type        = map(string)
  description = "Tags to assign to resources"
}


variable "instance_type" {
  type        = string
  description = "EC2 instance type"
}

variable "subnet_id" {
  type        = string
  description = "Subnet ID to launch the EC2 instance into"
}

