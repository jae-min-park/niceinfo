json=(`cat token.json`)
token=`echo $json | cut -d'"' -f4`

curl -X GET -H "Content-Type:application/json" -H "Authorization:Bearer ${token}" http://localhost:8080/api/data-set > getResult.json
