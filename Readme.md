## Chat fullstack challenge!

This is a simple chat, developed for the fullstack challenge.
It currently supports posting and fetching messages.

## Tech stack

### Backend - Spring Boot
 
The backend is a spring boot app that supports only two operations: 

* GET /chat
* POST /chat

#### Possible improvements

* The app currently uses an inmemory queue to store the messages. 
All messages will be lost once the app is restarted
* The app assumes only one chat is active (no support for multiple chat rooms)
* The app does not know which user posted which message

### Frontend -

The FE is just an html page that continuously polls the BE 
for new messages (currently every 500 ms)

#### Possible improvements

* The FE at the moment supports a single chat and a single user.
* The FE could use WebSockets or Server-Sent Events instead of polling.

### Deploy and run

#### How to run using docker compose

* docker-compose up
* docker-compose down

#### How to build the BE-API

*  mvn package spring-boot:repackage

#### How to build the FE-API

The FE is just a static HTML page. You don't need to build anything.
