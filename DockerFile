FROM openjdk:8
RUN /bin/cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime && echo 'Asia/Shanghai' >/etc/timezone
MAINTAINER cty <735140144@qq.com>
VOLUME /data/share/
ADD /target/*.jar app.jar
EXPOSE 8000
ENV TZ=Asia/Shanghai
ENV LANG=C.UTF-8 LANGUAGE=C.UTF-8 LC_ALL=C.UTF-8
ENTRYPOINT ["java","-jar","app.jar"]
