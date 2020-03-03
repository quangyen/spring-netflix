ID=spring-netflix-zuul
NAME=spring-netflix-zuul

package:
	mvn clean package dependency:go-offline -DskipTests -U

build:
	sudo docker build -t ${ID} .

rm:
	sudo docker stop ${NAME}
	sudo docker rm ${NAME}

run:
	sudo docker run -d --name ${NAME} -p 8080:8080 ${ID}

deploy: rm run