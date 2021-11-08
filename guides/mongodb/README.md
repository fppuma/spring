# SPRING-BOOT AND MONGO DB
[Getting Started Guides](https://spring.io/guides/gs/accessing-mongodb-data-rest/)

## Starting with Spring Initializr
- Rest Repositories
- Spring Data MongoDB


## Files
- [Person](src/main/java/com/example/mongodb/model/Person.java)


## DOCKER MONGO DB
```bash
> docker run -d --name database -p 27017:27017 mongo
> docker exec -it database bash
# ls
bin  boot  data  dev  ...  opt  proc  root  run  sbin  srv  sys  tmp  usr  var

# mongo
connecting to: mongodb://127.0.0.1:27017/?compressors=disabled&gssapiServiceName=mongodb
Implicit session: session ...
MongoDB server version: 4.4.4
Welcome to the MongoDB shell.
...

> show dbs
admin   0.000GB
config  0.000GB
local   0.000GB
```