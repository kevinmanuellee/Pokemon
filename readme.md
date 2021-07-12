# POKEMON PROJECT BY KEVIN MANUEL

## How to run
```https://www.loom.com/share/48f1b528d9424abca0df8d373d7690d2```

## available endpoints
#### POST /pokemon
headers:
| name  | details |
| ------------- | ------------- |
| content-type  | application/json  |

request body:
| params  | required |
| ------------- | ------------- |
| pokemonNumber  | YES  |
| name  | YES  |
| type1  | YES  |
| type2  | NO  |
| total  | YES  |
| hp  | YES  |
| attack  | YES  |
| defense  | YES  |
| spAtk  | YES  |
| spDef  | YES  |
| speed  | YES  |
| generation  | YES  |
| isLegendary  | YES  |


#### GET /pokemon
request parameters:
| params  | required |
| ------------- | ------------- |
| pokemonNumber  | NO  |
| name  | NO  |
| type1  | NO  |
| type2  | NO  |
| total  | NO  |
| hp  | NO  |
| attack  | NO  |
| defense  | NO  |
| spAtk  | NO  |
| spDef  | NO  |
| speed  | NO  |
| generation  | NO  |
| isLegendary  | NO  |



#### POST /pokemon/upload-csv-file
headers:
| name  | details |
| ------------- | ------------- |
| content-type  | multipart/form-data  |

request parameters:
| params  | description |
| ------------- | ------------- |
| file  | filename  |

