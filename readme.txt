本文件夹存放所有源码以及运行需要的数据库


本地安装流程：
后端正常运行过程：
1.安装redis(已安装可忽略)
2.安装mysql(已安装可忽略)
3.解压后端
4.打开代码编辑器，进入./server/src/main/resources/application.yml
5.将第七行和第八行的数据库账号密码改为自己数据库账号密码
6.运行./server/src/main/java/SpringbootApplication

前端正常运行过程：
1.解压前端用户端/管理端
2.打开代码编辑器，进入主目录
3.在主目录的终端中输入指令npm install加载依赖
4.输入npm run serve运行程序

完成以上操作后，将文件夹中的lost_found.sql文件导入到本地数据库，即可正常运行所有程序