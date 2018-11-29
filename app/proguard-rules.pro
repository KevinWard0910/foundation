# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# Uncomment this to preserve the line number information for
# debugging stack traces.
#-keepattributes SourceFile,LineNumberTable

# If you keep the line number information, uncomment this to
# hide the original source file name.
#-renamesourcefileattribute SourceFile

 #优化  不优化输入的类文件
-dontoptimize
 #预校验
-dontpreverify
 #混淆时是否记录日志
-verbose
#保护注解
-keepattributes *Annotation*
#-ignorewarnings
#避免混淆Fragment包名
-keep public class * extends com.kevin.foundation.framework.fragment.BaseFragment

#如果引用了v4或者v7包
 -dontwarn android.support.**
 -keep interface android.support.** { *; }
 -keep class android.support.** { *; }

 #不优化泛型和反射
 -keepattributes Signature

#保持 Serializable 不被混淆
 -keepnames class * implements java.io.Serializable
 #保持 Serializable 不被混淆并且enum 类也不被混淆
 -keepclassmembers class * implements java.io.Serializable {
        static final long serialVersionUID;
        private static final java.io.ObjectStreamField[] serialPersistentFields;
        !static !transient <fields>;
        !private <fields>;
        !private <methods>;
        private void writeObject(java.io.ObjectOutputStream);
        private void readObject(java.io.ObjectInputStream);
        java.lang.Object writeReplace();
        java.lang.Object readResolve();
    }

#ok http
#-dontwarn com.squareup.**
-keep class com.squareup.**{*;}
#-dontwarn okio.**
-keep class okio.**{*;}

-dontwarn okhttp3.**
-keep class okhttp3.**{*;}

#自定义widget
#-dontwarn com.mmall.jz.xf.widget.**
-keep class  com.kevin.base.widget.**{*;}
-keep class  com.kevin.foundation.framework.widget.**{*;}

#gson
#如果用用到Gson解析包的，直接添加下面这几行就能成功混淆，不然会报错。
# Gson specific classes
-keep class sun.misc.Unsafe { *; }
# Application classes that will be serialized/deserialized over Gson
-keep class com.google.gson.** { *; }
-keep class com.google.gson.stream.** { *; }

-keep class **.R$* {*;}

#拥有webview的类
#-keep class com.redstar.mainapp.business.webview.** {*;}

#keep 实体类
-keep class com.kevin.repository.business.bean.**{*;}

#-keepnames class * implements java.io.Serializable

-keep public class * implements java.io.Serializable {
    public *;
}

-keepclassmembers class * implements java.io.Serializable {
    static final long serialVersionUID;
    private static final java.io.ObjectStreamField[] serialPersistentFields;
    private void writeObject(java.io.ObjectOutputStream);
    private void readObject(java.io.ObjectInputStream);
    java.lang.Object writeReplace();
    java.lang.Object readResolve();
}

# keep annotated by NotProguard
-keep @com.kevin.base.common.NotProguard class * {*;}
-keep class * {
    @com.kevin.base.common.NotProguard <fields>;
}
-keepclassmembers class * {
    @com.kevin.base.common.NotProguard <methods>;
}

-keep public class * implements com.bumptech.glide.module.GlideModule
-keep public enum com.bumptech.glide.load.resource.bitmap.ImageHeaderParser$** {
  **[] $VALUES;
  public *;
}
#-keepresourcexmlelements manifest/application/meta-data@value=GlideModule






-keepclassmembers enum * {
    public static **[] values();
    public static ** valueOf(java.lang.String);
}


-keepnames class * implements android.os.Parcelable {
    public static final ** CREATOR;
}

# okio
-dontwarn okio.**
-keep class okio.** {*;}
#
#-dontwarn java.nio.file.**
#-keep class java.nio.file.** { *;}

