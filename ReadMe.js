API:
-Tạo đường:

curl --location --request POST 'http://localhost:8223/api/v1/asm/createRoad' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name":"Loc",
    "createAt":"2019-12-20",
    "description":"Duong so 1",
    "countryId":1,
    "status":1
}'

-Tìm đường theo tên và tên quận:
curl --location --request GET 'http://localhost:8223/api/v1/asm/searchByName/c/n'


-Danh sách quận:
curl --location --request GET 'http://localhost:8223/api/v1/asm/findAllCountry'
