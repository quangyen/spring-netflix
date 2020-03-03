ID=spring-netflix-configuration
NAME=spring-netflix-configuration

package:
	mvn clean package dependency:go-offline -DskipTests -U

build:
	sudo docker build -t ${ID} .

rm:
	sudo docker stop ${NAME}
	sudo docker rm ${NAME}

run:
	sudo docker run -d --name ${NAME} -p 8081:8081 ${ID}

deploy: rm run