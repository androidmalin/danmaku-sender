# danmaku-sender
A micro service to interactive with bilibili.com.
# Featrues
* login
* send danmaku

# Build and run
```
$ gradle build
$ java -jar build/libs/danmaku-sender-0.0.1-SNAPSHOT.jar
```
# Usage
```
$ curl http://localhost:8080/login/{username}/{password}
$ curl http://localhost:8080/send/{msg}
```
# Read
[b站登陆以及发弹幕](https://winry.me/2016/03/23/b%E7%AB%99%E7%99%BB%E9%99%86%E4%BB%A5%E5%8F%8A%E5%8F%91%E5%BC%B9%E5%B9%95/)
# License
under [MIT license](/License)
