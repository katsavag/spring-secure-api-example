# Spring Secure API #
Example of Spring Secure API using Keycloak as Auth Server

## Prerequisites ##
First things first! To run this example the followings are required:
* Java version 8
* Maven
* Docker
 
## Keycloak Setup ##

* Keycloak Installation  
`docker run -e KEYCLOAK_USER=\<USERNAME> -e KEYCLOAK_PASSWORD=\<PASSWORD> -p 8080:8080 jboss/keycloak`

* Create bear-only client to integrate spring boot api wih keycloak

* Create 3 Confidential Clients (client1, client2, super_client)

* Create Roles bob, alice and super_greetings
## Secure API ##

To integrate keycloak with a Spring Boot API the followings are required:

### Application Properties 
`keycloak.auth-server-url=http://localhost:8080/auth/`   
`keycloak.realm=example`  
`keycloak.ssl-required=NONE`  
`keycloak.resource=secure-api-example`  
`keycloak.credentials.secret=<client_secret>`  
`keycloak.bearer-only=true`  
`keycloak.cors=false`

### Custom Keycloak Spring Resolver 
Due to an issue (https://issues.redhat.com/browse/KEYCLOAK-10334?focusedCommentId=13738518&page=com.atlassian.jira.plugin.system.issuetabpanels%3Acomment-tabpanel&_sscc=t#comment-13738518) may need to create a Custom Keycloak Spring Boot Resolver
