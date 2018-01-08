# spring-kotlin-graphql
playground spring-boot, kotlin, graphql

## things to read ...
- https://blog.pusher.com/writing-graphql-service-using-kotlin-spring-boot/
- https://github.com/sazzer/pusher-familytree

## browse

- http://localhost:8080/graphiql

## graphql examples: familytree


```
# get api version
{
    version
}

```

```
# getPersonById(id="qeii", fields:[name])

{
  getPersonById(id: "qeii") {
    name
  }
}

```


```
    # get getPersonById(id:"qeii", fields:[name]) with all relationships (from: fields=[name], to: fields=[name])
    {
      getPersonById(id:"qeii") {
        name
        relationships {
          from {
            name
          }
          to {
            name
          }
          relationship
        }
      }
    }
```

```
    # get getPersonById(id:"qeii", fields:[name]) with relationships(of type="SPOUSE") (from: fields=[name], to: fields=[name])
    {
      getPersonById(id:"qeii") {
        name
        relationships(type:"SPOUSE") {
          from {
            name
          }
          to {
            name
          }
          relationship
        }
      }
    }
```


