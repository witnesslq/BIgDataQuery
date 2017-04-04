# SpringMVCDemo

------

**SpringMVCDemo** 是北京邮电大学CAD中心开发Web项目所使用的基本框架；

* 可使用本框架搭建开发高性能、高可拓展性、高可维护性，高安全性的web项目；
* Web前端模块化、组件化开发，与后台最佳的交互；
* 探索使用NoSQL、与SQL等多数据库共存的解决方案；
* 提供大量模块参考，比如：权限管理模块。

你可以基于它，快速搭建项目原型，并进行Web项目开发。

------

## 你可以使用 **SpringMVCDemo**：

* 快速搭建项目原型，基于Spring + Spring MVC + Mybatis，简单轻便、易于扩展的架构，适用于大多数项目
* 封装了常用的CURD，配合mybatis-generator 自动生成dao、model、mapper层，减少重复劳动，提高生产力，实现快速、平稳的开发
* 实现Mybatis的分页查询模块，支持MySQL、PostgreSQL、SQLServer等数据库分页查询
* 通用的权限管理模块，基于Apache Shiro的 用户-角色-权限(RBAC)的细粒度权限控制
* 大量配置示例，根据需求，自由优化、调整，达到最佳性能
* 大量前端模块化开发示例，积极在探索前端最佳的架构，与后台最佳的交互，构建雄心勃勃的Web Application

------

## 如何使用本框架
* git clone git@github.com:FirenzesEagle/SpringMVCDemo.git
* 在MySQL中导入 src/test/resources/springmvc.sql 脚本
* 更新 src/main/resources/application.properties 中 JDBC Global Setting
* cd SpringMVCDemo
* mvn war:war 
* 把 target/SpringMVCDemo.war 发布在App Server(Tomcat、JBOSS) 中

------

## 在IDE 中查看源码并运行
#### 1. 在IntelliJ IDEA
* File -> Import Project -> select quick4j folder -> create project form existing sources -> ...

#### 2. 在Eclipse
* File -> Import -> Existing Maven Projects -> ...
