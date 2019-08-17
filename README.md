# Quarkus test application

This is just another one of my test applications.

For some time I've been reading about [Micronaut](https://micronaut.io), 
[Quarkus](https://quarkus.io), [Spring Boot](https://spring.io/projects/spring-boot) and 
[Thorntail](https://thorntail.io) and I am curious what the fuzz is all about 
with these frameworks.

## Time registration app

So I've been wanting to write a time registration application for some time and
I've used several methods and frameworks to create (incomplete) implementations
of such an application.

The basic idea is to have a frontend application and a backend application
of sorts with some REST endpoints to manage the time registration data.
I've got another project going somewhere for the frontend stuff, so this 
project will solely focus on the backend portion of the application.

Basically there are 4 entities:

1. Client: contains clients (aka customers) to attach projects to.
2. Project: contains projects linked to clients.
3. Task: contains tasks linked to projects.
4. TaskEntry: contains the work log and the start/end time of an executed task. 

## Incomplete

This app is by far complete and there's not much to see here. What's currently
here is:

* A basic setup for a quarkus application.
* The initial Postgres database schema.
* A (broken) JAX RS endpoint for Client retrieval.
* A very incomplete ClientRepository.
* No tests.      

## TODO

What I'd like to implement is the following:

1. REST endpoints for the forementioned entities for basic CRUD operations.
1. Authentication on those endpoints, possibly with OAuth2 or OpenID connect.
   