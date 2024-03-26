# Get Started

This is a simple backend server project using micronaut and Mongo DB. 

## DB Configuration

Create data in mongo DB and update the property in application.properties files.
You need to create the collections app_user.

## Testing

### APIs

Create user
```shell
curl --location 'localhost:8080/users' \
--header 'Content-Type: application/json' \
--data-raw '{
    "firstName": "Cesar",
    "lastName": "Urrego",
    "email": "cesar@test.com",
    "street": "Street 123",
    "city": "City 123",
    "code": 1
}'
```

Update User
```shell
curl --location --request PUT 'localhost:8080/users/65fc09a42169212980f59816' \
--header 'Content-Type: application/json' \
--data-raw '{
    "firstName": "Cesar",
    "lastName": "Urrego",
    "email": "cesar@test.com",
    "street": "Street 123",
    "city": "City 123",
    "code": 1
}'
```

Get all Users
```shell
curl --location 'localhost:8080/users' \
--header 'Content-Type: application/json' \
--data ''
```

Get user by ID
```shell
curl --location 'localhost:8080/users/65fc09a42169212980f59816' \
--header 'Content-Type: application/json' \
--data ''
```

Delete User
```shell
curl --location --request DELETE 'localhost:8080/users/660214f6c621267ff5677acd' \
--header 'Content-Type: application/json' \
--data ''
```

Search user by name
```shell
curl --location 'localhost:8080/users/search' \
--header 'Content-Type: application/json' \
--data '{
    "name": "Cesar"
}'
```

### Disclaimer:

The base code of this app was extracted from: <img src="https://codersee.com/wp-content/uploads/2022/02/logo_square_500_500-300x300.png" height="12" alt="Codersee Image"/>[ Codersee](https://codersee.com)

