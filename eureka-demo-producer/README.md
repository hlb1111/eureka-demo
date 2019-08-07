### 在命令行运行多个实例：

#### 如果只有一个配置文件，可以通过下面的命令行启动来指定不同的端口
```
java -jar eureka-demo-producer-0.1.jar --server.port=9002
```
通过--server.port来指定不同的端口

#### 如果是多个配置文件
```
application.yml, application-dev.yml, application-test.yml

application.yml内容：
spring:
	profiles:
		active: test


application-dev.yml内容：
spring:
   application:
      name: eureka-producer
eureka:
   client:
      service-url:
         defaultZone: http://23.12.42.156:7000/eureka/
server:
   port: 23123

application-test.yml内容：
spring:
   application:
      name: eureka-producer
eureka:
   client:
      service-url:
         defaultZone: http://localhost:7000/eureka/
server:
   port: 8000


通过在命令行启动：
java -jar xxx.jar --spring.profils.active=dev
```





