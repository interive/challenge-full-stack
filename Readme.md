

* How to run "java Hello world" using docker

docker build --tag "docker-hello-world:latest" .
docker run docker-hello-world:latest

docker run -d -p 80:80 docker-hello-world:latest
docker run docker-hello-world:latest
