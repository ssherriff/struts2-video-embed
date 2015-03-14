

## Installation ##

### How can I use this plugin? ###

  1. Download the struts2-video-embed-plugin-x.x.x.jar
  1. Put it into your Classpath (WEB-INF/lib)
  1. Add the Tag-Lib to your JSP <%@ taglib prefix="sve" uri="/struts-video-embed-tags"%>

### How can I use this plugin with Maven? ###

I've created a Maven repository in this google code svn temporarily, with view to get the library better available in the future.

Put this in your dependencies:

```
<dependency>
  <groupId>com.trexart.struts2.videoembed</groupId>
  <artifactId>struts2-video-embed-plugin</artifactId>
  <version>...</version>
</dependency>
```

Since this will not be known in Maven, you will have to put the following in your pom.xml:

```
<repositories>
  <repository>
    <id>struts2-video-embed</id>
    <url>http://struts2-video-embed.googlecode.com/svn/trunk/maven/releases</url>
  </repository>
</repositories>
```