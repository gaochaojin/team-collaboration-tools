#### maven工具

##### 使用命令生成maven工程：

普通maven项目：

```shell
mvn archetype:generate -DgroupId=com.gaochaojin -DartifactedId=maven-generate-test1 -DarchetypeArtifactId=maven-archetype-quickstart -Dversion=1.0
```

web-maven项目：

```shell
mvn archetype:generate -DgroupId=com.gaochaojin -DartifactId=maven-generate-web-test1 -DarchetypeArtifactId=maven-archetype-webapp -Dversion=1.0
```

##### 查看maven依赖命令：

```shell
mvn dependency:tree
```

##### 依赖范围scope：

compile：默认范围，用于编译-------------依赖的jar在打包时会包含进去
provided：类似于编译，但支持你期待jdk或者容器提供，类似于classpath---依赖的jar在打包时不会包含进去
runtime:在执行时需要使用----------------依赖的jar在打包时会包含进去
test:在test任务时使用-------------------依赖的jar在打包时不会包含进去

##### 环境依赖---profiles

##### maven依赖搜索顺序：

在本地仓库中搜索，找到则成功；
在远程仓库中搜索，找到则下载；
如果没有设置远程仓库，Maven默认去中央仓库搜索，找到则下载；
在一个或多个远程仓库中搜索依赖的文件，如果找到则下载到本地仓库以备将来引用，否则Maven将停止处理并抛出错误，无法找到依赖的文件。

##### 私服nexus的使用：

nexus仓库类型：
group(仓库组类型-门面)：组合自己的多个库，成为一个路径对外提供服务
hosted(宿主类型):内部项目的发布仓库，内部jar存在这
proxy(代理类型):代理一个远程仓库url，缓存一份打次经过的jar

maven的setting.xml文件需要配置：

```java
<!-- 全局配置方式  定义自定义的私服地址 -->
<mirror>
  <id>gaochaojin</id>
  <name>gaochaojin public</name>
  <url>http://127.0.0.1:8081/repository/maven-public/</url>
  <mirrorOf>*</mirrorOf>        
</mirror>
```

```java
<!-- 配置私服账号密码 -->
<server>
    <id>releases</id>
    <username>admin</username>
    <password>admin123</password>
</server>
<server>
    <id>snapshots</id>
    <username>admin</username>
    <password>admin123</password>
</server>
```

项目中需要配置：

```java
<!--局部配置方式 远程仓库-->
<repositories>
    <repository>
        <id>nexus-gaochaojin</id>
        <name>gaochaojin Public</name>
        <url>http://127.0.0.1:8081/repository/maven-public/</url>
        <releases>
            <enabled>true</enabled>
        </releases>
        <snapshots>
            <enabled>true</enabled>
        </snapshots>
    </repository>
</repositories>
```

```java
<!--配置上传url-->
<distributionManagement>
    <repository>
        <id>releases</id>
        <name>Release Deploy</name>
        <url>http://127.0.0.1:8081/repository/maven-releases/</url>
    </repository>
    <snapshotRepository>
        <id>snapshots</id>
        <name>Snapshot Deploy</name>
        <url>http://127.0.0.1:8081/repository/maven-snapshots/</url>
    </snapshotRepository>
</distributionManagement>
```

然后使用命令将jar包上传到私服：

```shell
mvn deploy
```

##### maven自定义项目骨架：

选用项目maven-web作为示例：
在maven-web根目录下执行命令：mvn archetype:create-from-project 生成archetype项目如下结构：
![1554797442563](C:\Users\gaochaojin\AppData\Roaming\Typora\typora-user-images\1554797442563.png)

archetype项目也是一个maven工程：
![1554797738754](C:\Users\gaochaojin\AppData\Roaming\Typora\typora-user-images\1554797738754.png)

进入项目目录执行命令：mvn clean install 生成如下jar包
![1554797991712](C:\Users\gaochaojin\AppData\Roaming\Typora\typora-user-images\1554797991712.png)

idea中新建一个项目如图：

![1554798146925](C:\Users\gaochaojin\AppData\Roaming\Typora\typora-user-images\1554798146925.png)

生成的项目的结构为：
![1554798304446](C:\Users\gaochaojin\AppData\Roaming\Typora\typora-user-images\1554798304446.png)

