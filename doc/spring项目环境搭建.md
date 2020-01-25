# spring 项目环境搭建

## 

## 注意事项
- 1.gradle 的版本不能太高，不然会报错 我现在用的gradle是`Gradle 5.6.4` 对应的spring分支是origin/5.1.x

- 2.需要修改 根 buill.gradle 和setting.gradle 的maven仓库地址 不然构建速度可能会很慢
```gradle
maven { url "http://maven.aliyun.com/nexus/content/groups/public" }

```

- 3.idea 的版本最好也是19版本的，或者最新版本的，反正我之前使用18版本的直接报错了