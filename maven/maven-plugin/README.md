自定义maven插件

需要依赖maven-plugin-api和maven-plugin-annotations
需要配置<packaging>maven-plugin</packaging>

然后在maven-origin-package中使用
执行插件命令：
mvn com.gaochaojin:maven-plugin:1.0:log

关联插件到生命周期执行：
mmvn clean



