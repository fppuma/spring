# HATEOAS
[Getting Started](https://spring.io/guides/gs/rest-hateoas/)

## Classes
- [GreetingModel](src/main/java/com/example/resthateoas/GreetingModel.java)
    - RepresentationModel Class.
- [GreetingController](src/main/java/com/example/resthateoas/GreetingController.java)
    - getGreeting() returns a ResponseEntity of GreetingModel
    - getGreeting() includes _links with self
    
    
## Output    
http://localhost:8080/greeting
```yaml
{
    "content": "Hello, World!",
    "_links": {
        "self": {
            "href": "http://localhost:8080/greeting?name=World"
        }
    }
}
```
    