<%--
    Document   : index
    Created on : 24/05/2010, 6:51:42 PM
    Author     : sherriff
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sve" uri="/struts-video-embed-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Video Embed Showcase</h1>
        <h2>YouTube</h2>
        <p>
            With Tag:<br/>
            <sve:videoembed embedCode="nTasT5h0LEg" type="youtube"></sve:videoembed>
        </p>
        <p>
            Standard YouTube:<br/>
            <object width="480" height="385"><param name="movie" value="http://www.youtube.com/v/nTasT5h0LEg&hl=en_GB&fs=1&"></param><param name="allowFullScreen" value="true"></param><param name="allowscriptaccess" value="always"></param><embed src="http://www.youtube.com/v/nTasT5h0LEg&hl=en_GB&fs=1&" type="application/x-shockwave-flash" allowscriptaccess="always" allowfullscreen="true" width="480" height="385"></embed></object>
        </p>
        <h2>Vimeo</h2>
        <p>
            With Tag:<br/>
            <sve:videoembed embedCode="2482669" type="vimeo" width="400" height="300"></sve:videoembed>
        </p>
        <p>
            Standard Vimeo:<br/>
            <object width="400" height="300"><param name="allowfullscreen" value="true" /><param name="allowscriptaccess" value="always" /><param name="movie" value="http://vimeo.com/moogaloop.swf?clip_id=2482669&amp;server=vimeo.com&amp;show_title=1&amp;show_byline=1&amp;show_portrait=0&amp;color=&amp;fullscreen=1" /><embed src="http://vimeo.com/moogaloop.swf?clip_id=2482669&amp;server=vimeo.com&amp;show_title=1&amp;show_byline=1&amp;show_portrait=0&amp;color=&amp;fullscreen=1" type="application/x-shockwave-flash" allowfullscreen="true" allowscriptaccess="always" width="400" height="300"></embed></object>
        </p>
        <h2>MySpace</h2>
        <p>
            With Tag:<br/>
            <sve:videoembed embedCode="105007503" type="myspace"></sve:videoembed>
        </p>
        <p>
            Standard MySpace:<br/>
            <object width="425px" height="360px" ><param name="allowFullScreen" value="true"/><param name="wmode" value="transparent"/><param name="movie" value="http://mediaservices.myspace.com/services/media/embed.aspx/m=105007503,t=1,mt=video"/><embed src="http://mediaservices.myspace.com/services/media/embed.aspx/m=105007503,t=1,mt=video" width="425" height="360" allowFullScreen="true" type="application/x-shockwave-flash" wmode="transparent"></embed></object>
        </p>
        <h2>Google Video</h2>
        <p>
            With Tag:<br/>
            <sve:videoembed embedCode="-8712434849129856321" type="google"></sve:videoembed>
        </p>
        <p>
            Standard Google:<br/>
            <embed id=VideoPlayback src=http://video.google.com/googleplayer.swf?docid=-8712434849129856321&hl=en&fs=true style=width:400px;height:326px allowFullScreen=true allowScriptAccess=always type=application/x-shockwave-flash> </embed>
        </p>
    </body>
</html>
