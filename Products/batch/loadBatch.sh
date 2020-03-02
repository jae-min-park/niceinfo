json=(`cat token.json`)
token=`echo $json | cut -d'"' -f4`

curl -X POST -H "Content-Type:application/json" -H "Authorization:Bearer ${token}" -d @data.json http://localhost:8080/api/data-set > loadResult.json
