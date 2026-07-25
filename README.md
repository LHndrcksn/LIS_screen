# Setup Guide
## Starting Spring Project
### Option 1 - Podman / Docker
***Commands are for Podman, but should be compatible with Docker***
1. Navigate to `/backend/screener/` in terminal.
2. Run `podman build -t lis .`. If asked to select an image from a list, docker.io should be fine. 
3. Run `podman run -p 8080:8080 lis`. Spring project should now be running.
### Option 2 - Running from prebuilt .jar
***Project build with JDK 25 and Maven 4***
1. Navigate to `/backend/screener/` in terminal.
2. Run `java -jar ./target/screener-0.0.1-SNAPSHOT.jar`.  Spring project should now be running
### Option 3 - Run from Maven
***Project build with JDK 25 and Maven 4***
1. Navigate to `/backend/screener/` in terminal.
2. Run `./mvnw spring-boot:run --quiet`.  Spring project should now be running

## Viewing HTML
1. Open `/frontend/index.html` in your preferred browser.

