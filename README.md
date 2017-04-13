# scala-python-example
Example to demonstrate using keras library via jep in scala

## Requirement: JEP libraries for your system
(example based on `docker run -ti hseeberger/scala-sbt`)
```
$ apt-get update
$ apt-get install -y python3-pip
$ pip3 install jep

$ pip3 show jep | grep Location
Location: /usr/local/lib/python3.4/dist-packages

$ ls -la /usr/local/lib/python3.4/dist-packages/jep
total 984
drwxr-sr-x 2 root staff   4096 Apr 13 12:23 .
drwxrwsr-x 4 root staff   4096 Apr 13 12:23 ..
-rw-r--r-- 1 root staff    128 Apr 13 12:23 __init__.py
-rw-r--r-- 1 root staff   2856 Apr 13 12:23 console.py
-rw-r--r-- 1 root staff   2857 Apr 13 12:23 java_import_hook.py
-rw-r--r-- 1 root staff   9859 Apr 13 12:23 jdbc.py
-rw-r--r-- 1 root staff 105520 Apr 13 12:23 jep-3.6.3.jar
-rwxr-xr-x 1 root staff 850768 Apr 13 12:23 jep.cpython-34m.so
lrwxrwxrwx 1 root staff     18 Apr 13 12:23 libjep.so -> jep.cpython-34m.so
-rw-r--r-- 1 root staff    890 Apr 13 12:23 redirect_streams.py
-rw-r--r-- 1 root staff   7063 Apr 13 12:23 shared_modules_hook.py
-rw-r--r-- 1 root staff     44 Apr 13 12:23 version.py

# in this case, we are interested in jep-3.6.3.jar and libjep.so.
# It would be different on OSX or MsWindows.
$ mkdir lib
$ cp /usr/local/lib/python3.4/dist-packages/jep/{jep-3.6.3.jar,libjep.so} lib/
```

## Run
```
$ sbt "runMain com.sushant.example.JepAddExample"
5
5

$ com.sushant.example.KerasScala
...
```
