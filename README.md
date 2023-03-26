# 项目简介
用于同步tushare的数据
其中初始化和自动同步涵盖大部分数据（非全部），如有需求可提交issues

# 配置
修改resource.application.yml中的
shareDb.db和sping.datasource

同时提供Dockerfile，项目端口8000，可自行映射

本项目端口为8000，接口文档可访问http://ip:8000/doc.html
定时任务在数据库scheduled表中
