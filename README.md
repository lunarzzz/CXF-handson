# User Guide
* step 1 : database prepare. 

import the student.sql to your mysql database.  

change the PASSWORD and NAME of MySQL in application.yml.
* step 2 : run server

```shell
$ mvnw clean install -U
$ mvnw spring-boot:run
```

* step 3 : RESTful API
``$ curl -X POST -H 'Content-Type:application/json' -d '{"id": "pipibing"}' http://localhost:9001/services/student/getStudent``

you can see the result:
```json
{"id":"pipibing","name":"zhaobing","sexy":"male","address":"ustc"}
```
