FROM airhacks/glassfish
COPY ./target/arquillian-test.war ${DEPLOYMENT_DIR}
