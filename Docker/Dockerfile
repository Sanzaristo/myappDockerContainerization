# Use the latest image from UBUNTU installed in the machine
FROM ubuntu:latest

MAINTAINER corefinder@docker.com

# Update ubuntu system
RUN apt-get update

# Install java version on ubuntu-selenium image
RUN apt-get install -y default-jdk
RUN apt-get install -y default-jre

# Install phantomjs
RUN apt-get install -y phantomjs

# Install maven on ubuntu-selenium image
RUN apt-get install -y maven

# Install git on ubuntu-selenium image
RUN apt-get install -y git

# Get the repository onto the local system
RUN git clone https://3a3c6e7c2c1351645835e95b6a535f93c8a22dfa@github.com/Sanzaristo/myappDockerContainerization.git


# Run the maven command to execute all the tests
WORKDIR "/DockerSelenium"
RUN mvn clean install test

ENTRYPOINT ["/bin/bash"]