## groovy-verbose-assert-messages

### Description
This module contains Groovy extension method for nice syntax in 'assert' conditions:
```
assert message | condition
assert "Date should change" | dateBefore != dateAfter
```

### Why?
Groovy's power assert is a very useful tool for tests - messages are really detailed:
```
Assertion failed: 

assert someString.toUpperCase().concat("bbb") == "CCCbbb"
       |          |             |             |  
       aaa        AAA           AAAbbb        false
```

But power assert loses this functionality when you specify your custom message:  
```
assert condition : message
```
It will print only message, without detailed explanation of argument values.
 
That's why you can use this library:
```
 Assertion failed: 
 
 assert "My custom message" | someString.toUpperCase().concat("bbb") == "CCCbbb"
                              |          |             |             |  
                              aaa        AAA           AAAbbb        false
```
 
#### Why extension method, not metaClass? 
Since it's extension method, @CompileStatic is supported

### Usage

#### Gradle

Just include the library as `testCompile` dependency:

```
testCompile 'com.github.zhogov:groovy-verbose-assert-messages:1.01'
```
