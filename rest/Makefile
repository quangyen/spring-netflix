ID=spring-netflix-rest
NAME=spring-netflix-rest

package:
	mvn clean package dependency:go-offline -DskipTests -U

build:
	sudo docker build -t ${ID} .

rm:
	sudo docker stop ${NAME}
	sudo docker rm ${NAME}

run:
	sudo docker run -d --name ${NAME} -p 8083:8083 ${ID}

deploy: rm run