# Economyssive - User management service

## Create docker for database
Run the following command-line to create a docker container with mysql:
```bash
docker run --name economyssive-users -p 3306:3306 -e MYSQL_ROOT_PASSWORD=password -e MYSQL_USER=username -e MYSQL_PASSWORD=password -d mysql:latest
```
