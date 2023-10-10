FROM clojure:lein-2.10.0 as builder
WORKDIR /opt/service
COPY project.clj /opt/service
RUN lein deps

COPY . /opt/service/
RUN lein uberjar
#CMD ["lein", "trampoline", "run"]

FROM openjdk:17 as runtime
COPY --from=builder /opt/service/target/uberjar/web-app-0.1.0-SNAPSHOT-standalone.jar /opt/service/web-app-0.1.0-SNAPSHOT-standalone.jar

CMD ["java", "-jar", "/opt/service/web-app-0.1.0-SNAPSHOT-standalone.jar"]