#### maven-origin-package项目

##### 使用原始的javac和jar命令来进行打包

- maven-origin-package\src\main\java目录下使用命令进行编译

  ```shell
  javac -d . com\gaochaojin\Hello.java  # 在当前目录下进行编译
  ```

- 使用jar命令进行打包

  ```shell
  jar -cvfm hello.jar ..\..\META-INF\MENIFEST.MF com # 在当前目录下进行打包
  # jar命令
  #-c  创建一个jar包
  #-v  生成详细的报造，并输出至标准设备
  #-f 指定jar包的文件名
  #-m 指定manifest.mf文件
  ```

- 使用jar命令运行

  ```shell
  java -jar hello.jar
  ```

##### 使用maven打包

- 在pom.xml文件中添加

  ```java
  <build>
          <finalName>hello</finalName>
          <pluginManagement>
              <plugins>
                  <plugin>
                      <groupId>org.apache.maven.plugins</groupId>
                      <artifactId>maven-jar-plugin</artifactId>
                      <configuration>
                          <archive>
                              <manifest>
                                  <mainClass>com.gaochaojin.Hello</mainClass>
                              </manifest>
                          </archive>
                      </configuration>
                  </plugin>
              </plugins>
          </pluginManagement>
      </build>
  ```

- 在pom.xml所在目录进行mvn命令打包

  ```shell
  mvn package  # 会在当前目录下生成target文件夹，其中含有所打的jar包
  ```

- 使用jar命令运行

  ```shell
  java -jar hello.jar
  ```

  

