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
git branch   #查看分支
git branch dev  #创建一个dev分支（最新提交点）
git branch test 提交点 #创建一个分支（指定提交点）
git checkout dev #切换到分支dev
git branch -d test #删除分支
git merge dev    #合并分支（在master节点上进行操作，进行合并）

```

#### gitk命令展示git界面

```shell
gitk
```

![1554818172348](C:\Users\gaochaojin\AppData\Roaming\Typora\typora-user-images\1554818172348.png)

#### 标签

```shell
git tag -a v1.0 提交点  #在提交点上打标签
```

#### 恢复

```shell
git reset --hard 提交点  #恢复到提交点
git revert HEAD  #撤销前一次的commit，会新创建一个提交点
```

#### 本地与远程仓库通讯

```shell
git remote add origin git地址   #本地新建一个远程连接origin
git remote #查看远程连接
git remote -v  #查看远程连接详情
git push --set-upstream origin master #上传本地项目到远程仓库,也可以使用下面这个 
git push -u origin master
git fetch #提取远程仓库（如果服务器有修改，不会到本地）
git clone git地址  #从远程仓库克隆项目到本地仓库
```

#### master分支

主分支

保持稳定

不允许直接往这个分支提交代码，只允许往这个分支发起merge request

只允许release分支和hotfix分支进行合流 , 所有在Master分支上的Commit应该Tag

#### develop分支

开发分支

相对稳定的分支

用于日常开发，包括代码优化、功能性开发

#### feature分支

特性分支

从develop分支拉取，用于下个迭代版本的功能特性开发

功能开发完毕合并到develop分支, 合并完分支后一般会删点这个Feature分支，但是我们也可以保留。

#### release分支

发布分支

从develop分支拉取

用于回归测试，bug修复

发布完成后打tag并合入master和develop, (记住：一旦打了Release分支之后不要从Develop分支上合并新的改动到Release分支)

#### hotfix分支

热更新分支

从develop分支拉取

用于紧急修复上线版本的问题

修复后打tag并合入master和develop