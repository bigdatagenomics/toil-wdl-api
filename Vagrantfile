# -*- mode: ruby -*-
# vi: set ft=ruby :

Vagrant.configure(2) do |config|
  config.vm.box = "ubuntu/trusty64"
  config.vm.network "forwarded_port", guest: 80, host: 8080
  config.vm.network "forwarded_port", guest: 5432, host: 5432
  config.vm.provider "virtualbox" do |vb|
      vb.memory = "6144"
  end
  config.vm.network "private_network", ip: "192.168.50.5"
  
  # View the documentation for the provider you are using for more
  # information on available options.

  # Enable provisioning with a shell script. Additional provisioners such as
  # Puppet, Chef, Ansible, Salt, and Docker are also available. Please see the
  # documentation for more information about their specific syntax and use.
  config.vm.provision "shell", inline: <<-SHELL
    sudo apt-get update
    sudo apt-get install -y docker.io python-pip
    sudo pip install docker-compose
    sudo gpasswd -a vagrant docker
    sudo service docker restart 
  SHELL
end
