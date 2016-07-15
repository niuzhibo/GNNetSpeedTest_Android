# 极牛Android测速SDK开发文档



### 主要功能
☑测速

	  
## 内容摘要
---
- [工程环境](#1)
	* [运行环境](#1.1)
	* [添加工程](#1.2)
	* [权限列表](#1.3)
- [SDK使用示例](#2)
    * [初始化](#2.1)
    * [开始测速](#2.2)
    * [下载监听](#2.3)
    * [上传监听](#2.4)

	
    
	



	  
## 工程环境<h2 id="1">
***

### 运行环境<h3 id = "1.1">

- 最低支持版本：Android 3.0

### 添加工程<h3 id = "1.2">
- libs/gnspeed1.0.0.jar


### 权限列表<h3 id = "1.3">
           <!-- 使用权限 -->
    <uses-permission android:name="android.permission.READ_PHONE_STATE" />
    <uses-permission android:name="android.permission.SYSTEM_ALERT_WINDOW" />
    <uses-permission android:name="android.permission.INTERNET" />
    <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
    <uses-permission android:name="android.permission.READ_PHONE_SINTERNETWIFI_STATE" />
    <uses-permission android:name="android.permission.ACCESS_WIFI_STATE" />
    <uses-permission android:name="android.permission.CAMERA" />
    <uses-permission android:name="android.permission.RECORD_AUDIO" />
    <uses-permission android:name="android.permission.FLASHLIGHT" />
    <uses-permission android:name="android.permission.VIBRATE" />
    <!-- 硬件特性 -->
    <uses-feature android:name="android.hardware.camera" />
    <uses-feature android:name="android.hardware.camera.autofocus" />


## SDK使用示例<h2 id="2">
    
    

    
### 初始化<h3 id = "2.1">

``` 
GNSpeed gnSpeed = GNSpeed.getInstance();
gnSpeed.init(this);
```

### 开始测速<h3 id = "2.2">

```
gnSpeed.start();
```


### 下载监听<h3 id = "2.3">

```
   gnSpeed.setDownLoadListener(new downLoadListener() {
            @Override
            public void downLoadSpeed(int progress, String speed) {
            	//progress 当前下载进度
            	//speed 当前下载速度
                //downloadProgressBar.setProgress(progress);
                //speed.setText(speed);
            }

            @Override
            public void downLoadComplete(int progress, String speed) {
                //progress 完成进度
            	//speed 完成下载平均速度
            	//downloadProgressBar.setProgress(progress);
               //speed.setText(speed);
            }
        });
```
### 上传监听<h3 id = "2.4">

```
 gnSpeed.setUpLoadListener(new upLoadListener() {
            @Override
            public void upLoadSpeed(int progress, String speed) {
            	//progress 当前上传进度
            	//speed 当前上传速度
               //uploadProgressBar.setProgress(progress);
               //uploadSpeed.setText(speed);
            }

            @Override
            public void upLoadComplete(int progress, String speed) {
            	//progress 完成进度
            	//speed 完成上传速度
               //uploadProgressBar.setProgress(progress);
               //uploadSpeed.setText(speed);
            }
        });

```

     

