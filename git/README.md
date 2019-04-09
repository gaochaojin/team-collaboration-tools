### git使用

#### 配置

```shell
git config -l  #查看配置
git config -global user.name 'xxx' #配置用户
git config -global user.email 'xxx@163.com'  #配置邮件

```

#### 本地提交

```shell
git add filename  #提交到索引
git add .         #新增和修改
git add -A        #新增、修改和删除

git commit -m '版本描述'    #提交到文件库
git commit -am '版本描述'   #一步完成提交
```

#### git中的三类文件

被追踪的（tracked）：已经加入文档库

不被追踪的（untracked）：没有加入文档库

忽略的（ignored）：忽略那些不需要管理的文件夹和文件

#### 状态

```shell
git status
```

#### 忽略和排除

```shell
touch .gitignore  #生成.gitignore文件，然后向里面添加需要忽略的文件和文件夹,提交.gitignore文件未生效
git rm -r --cached . #将本地缓存删除（改变成未被追踪状态），然后再提交，就可以忽略和排除了
```

#### 日志

```shell
git log 
git log --oneline  #日志简化成一行
git log --oneline --graph  #日志简化成一行，同时显示分支
```

#### 分支

```shell
git branch dev  #创建一个dev分支
git checkout dev #切换到分支dev
git branch   #查看分支
```

