ID=spring-netflix-discovery
NAME=spring-netflix-discovery

package:
	mvn clean package dependency:go-offline -DskipTests -U

build:
	sudo docker build -t ${ID} .

rm:
	sudo docker stop ${NAME}
	sudo docker rm ${NAME}

run:
	sudo docker run -d --name ${NAME} -p 8082:8082 ${ID}

deploy: rm run