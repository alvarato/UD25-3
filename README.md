# UD25-3

GET http://localhost:8181/almacenes/findAll

GET http://localhost:8181/cajas/findAll

DELETE http://localhost:8181/almacenes/delete1

DELETE http://localhost:8181/cajas/deletebar01

POST http://localhost:8181/almacenes/create {"lugar":"Tarragona","capacidad":1000}

POST http://localhost:8181/cajas/create {"numReferencia": "bar01","contenido": "Xiaomi 10","valor": 20000,"almacen": {"codigo": 3}

POST http://localhost:8181/almacenes/update {"codigo":3,"lugar":"Tarragona","capacidad":1000}

POST http://localhost:8181/cakas/create {"numReferencia": "bar01","contenido": "Xiaomi 10","valor": 20000,"almacen": {"codigo": 3}
