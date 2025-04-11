
provider "aws" {
  region = "ap-south-1"
}



resource "aws_instance" "this" {
  ami                    = var.ami
  instance_type          = var.instance_type
  subnet_id              = var.subnet_id
  key_name               = var.key_name
  vpc_security_group_ids = [var.security_group_id]

   tags = var.tags

  associate_public_ip_address = true
}
