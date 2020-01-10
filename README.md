# Build
mvn clean package && docker build -t com.peopleapps.arquillian/arquillian-test .

# RUN

docker rm -f arquillian-test || true && docker run -d -p 8080:8080 -p 4848:4848 --name arquillian-test com.peopleapps.arquillian/arquillian-test 