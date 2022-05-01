FROM maven:3.8.4-openjdk-8-slim

WORKDIR ~

ADD ./target/account-0.0.1-SNAPSHOT.jar  ./account.jar
	
ENTRYPOINT ["java", "-jar"]

CMD ["account.jar"]

EXPOSE 8070



