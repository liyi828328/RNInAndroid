
以下记录都是基于Ubuntu 16.04进行，react native前期环境都已经安装完成

1.创建工程

2.npm初始化

    1）npm init
    
    2）npm install --save react react-native
    
    3）curl -o .flowconfig https://raw.githubusercontent.com/facebook/react-native/master/.flowconfig

3.编写js文件，文件可参考工程目录下index.android.js

4.增加rn依赖

    1）app / build.gradle增加compile
        dependencies {
            ... compile "com.facebook.react:react-native:+" // From node_modules.
        }
    2）project / build.gradle增加rn maven

     注意：此处我犯过一个错误，官网给的“url "$rootDir/../node_modules/react-native/android"”
          相对我这个工程来说是多一个层级目录的，而我这个没有，所以会导致rn jar包加载问题。

     allprojects {
         repositories {
             jcenter()
             maven {  // All of React Native (JS, Android binaries) is installed from npm
                 url "$rootDir/node_modules/react-native/android"
             }
         }
     }

5.编译js生成本地文件，需要放到assets目录下，具体命令如下：

    注意：这个也需要注意目录层级关系，命令在根目录执行即可。

    react-native bundle --platform android --dev false --entry-file index.android.js --bundle-output ./app/src/main/assets/index.android.bundle --assets-dest ./app/src/main/res/

6.以上都做完之后就可以run app 了，具体的代码直接参考项目就可以了。


最后：
    因为node_modules目录过大，所以不做上传，如果使用需要后续自己生成。
    如果存在访问不了的情况，可使用淘宝镜像，具体设置方法如下：

         编辑 ~/.npmrc 加入下面内容
         增加：registry = https://registry.npm.taobao.org

