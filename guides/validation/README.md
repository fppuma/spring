# VALIDATION
[Getting Started Guides](https://spring.io/guides/gs/validating-form-input/)

## Starting with Spring Initializr
- Spring Web 
- Thymeleaf 
- Validation 

## Classes
- [PersonForm](src/main/java/com/example/validation/PersonForm.java)
    - Form Class. @NotNull @Size and @Min annotations.
- [WebController](src/main/java/com/example/validation/WebController.java)
    - addViewControllers() binds /results to results.html
    - showForm() display form
    - checkPersonInfo() validate form and shows result page.
    
## Pages
 - [form](src/main/resources/templates/form.html)
 - [results](src/main/resources/templates/results.html)    
    
    