# JavaWeb
recording coding error and Create one great web

## 安装时出现的：

* **FileNotFound：**右键tomcat文件夹, 将users权限设置为完全控制

* **startup时，日志中文字符乱码**：找到tomcat目录下的/conf/logging.properties
  添加语句：java.util.logging.ConsoleHandler.encoding = GBK
  重启tomcat

## 将war文件拷贝于webapps文件夹，启动服务器时，将自动解压