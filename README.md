# PiracyChecker &nbsp;&nbsp;[![](https://jitpack.io/v/ir.alirezaivaz/PiracyChecker.svg)](https://jitpack.io/#ir.alirezaivaz/PiracyChecker)
An Android library that examines the installation of malware for in-app purchase security
_Owner & Author:  [Alireza Ivaz](https://alirezaivaz.ir/)_
## How to include
Add the repository to your project  **build.gradle**:
```groovy
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```
And add the library to your module  **build.gradle**:
```groovy
dependencies {
	implementation 'ir.alirezaivaz:PiracyChecker:1.0'
}
```
## Usage
### Verify the use of pirate apps

If you want to check if user has pirate apps installed, you can use this code.

It will check for:
* [Lucky Patcher](#lucky-patcher)
* [Apk Editor](#apk-editor)
* Uret Patcher (Soon)
* Freedom (Soon)
* CreeHack (Soon)
* HappyMod (Soon)
* [Check custom apps](#check-custom-apps)
#### Lucky Patcher
```java
isLuckyPatcherInstalled(Context context);
```
##### Sample
```java
isLuckyPatcherInstalled(MainActivity.this);
```
#### Apk Editor
```java
isApkEditorInstalled(Context context);
```
##### Sample
```java
isApkEditorInstalled(MainActivity.this);
```
#### Check custom apps
```java
isPackageInstalled(Context context, String packageName);
```
##### Sample
```java
isPackageInstalled(MainActivity.this, "com.chelpus.lackypatch");
```