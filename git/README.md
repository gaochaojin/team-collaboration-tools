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

