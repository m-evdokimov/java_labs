FROM amazoncorretto:21

RUN mkdir -p /app
WORKDIR /app
COPY src ./src
