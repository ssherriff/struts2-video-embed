/*
 *  Copyright 2010 sherriff.
 * 
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *  under the License.
 */

package com.trexart.struts2.videoembed.components;

import com.opensymphony.xwork2.util.ValueStack;
import com.opensymphony.xwork2.util.logging.Logger;
import com.opensymphony.xwork2.util.logging.LoggerFactory;
import com.trexart.struts2.videoembed.Codec;
import com.trexart.struts2.videoembed.CodecInterface;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.components.ClosingUIBean;
import org.apache.struts2.views.annotations.StrutsTag;
import org.apache.struts2.views.annotations.StrutsTagAttribute;
import org.apache.struts2.views.annotations.StrutsTagSkipInheritance;

/**
 * <!-- START SNIPPET: javadoc -->
 * <p>
 * A tag that embeds video.
 * </p>
 * <!-- END SNIPPET: javadoc -->
 * <p>
 * Examples
 * </p>
 *
 * <!-- START SNIPPET: example1 --> &lt;sve:videoembed embedCode="123456"/&gt; <!-- END SNIPPET: example1 -->
 */
@StrutsTag(name = "videoembed", tldTagClass = "com.trexart.struts2.videoembed.views.jsp.ui.VideoEmbedTag", description = "Render an embeded video", allowDynamicAttributes = true)
public class VideoEmbed extends ClosingUIBean {

    public static final String OPEN_TEMPLATE = "videoembed";
    public static final String TEMPLATE = "videoembed-close";

    static final String CODECTYPE_YOUTUBE = "youtube";
    static final String CODECTYPE_VIMEO = "vimeo";
    static final String CODECTYPE_GOOGLE = "google";
    static final String CODECTYPE_MYSPACE = "myspace";

    final protected static Logger log = LoggerFactory.getLogger(VideoEmbed.class);
    //private String parentTheme;
    private String type;
    private String embedCode;
    private String width;
    private String height;

    public VideoEmbed(ValueStack stack, HttpServletRequest request, HttpServletResponse response) {
        super(stack, request, response);
    }

    @Override
    public String getDefaultOpenTemplate() {
        return OPEN_TEMPLATE;
    }

    @Override
    protected String getDefaultTemplate() {
        return TEMPLATE;
    }

    /*@Override
    public void evaluateParams() {
        if (parentTheme != null) {
          addParameter("parentTheme", findString(parentTheme));
        } else {
          addParameter("parentTheme", "simple");
        }
    }*/

    @Override
    public void evaluateExtraParams() {
        super.evaluateExtraParams();

        String locale = request.getLocale().getLanguage();

        String codec = CODECTYPE_YOUTUBE;
        if (type != null &&
                (CODECTYPE_YOUTUBE.equalsIgnoreCase(type) ||
                CODECTYPE_VIMEO.equalsIgnoreCase(type) ||
                CODECTYPE_GOOGLE.equalsIgnoreCase(type) ||
                CODECTYPE_MYSPACE.equalsIgnoreCase(type))) {
            codec = type;
        }

        Codec c = CodecInterface.getCodec(codec, findString(embedCode), locale);
        addParameter("src", c.getSrc());
        addParameter("wmodeTransparent", c.useWmodeTransparent());

        Integer w = c.getDefaultWidth();
        if (width != null) {
            w = (Integer)findValue(width, Integer.class);
        }
        addParameter("width", w);
        Integer h = c.getDefaultHeight();
        if (height != null) {
            h = (Integer)findValue(height, Integer.class);
        }
        addParameter("height", h);
    }

    @Override
    @StrutsTagSkipInheritance
    public void setTheme(String theme) {
        super.setTheme(theme);
    }

    @Override
    public String getTheme() {
        return "videoembed";
    }

    /*@StrutsTagAttribute(description = "The parent theme. Default: value of parent form tag or simple if no parent form tag is available")
    public void setParentTheme(String parentTheme) {
        this.parentTheme = parentTheme;
    }*/

    @StrutsTagAttribute(description = "The video provider. Ex: youtube or vimeo", required = true)
    public void setType(String type) {
        this.type = type;
    }

    @StrutsTagAttribute(description = "The embed code assigned by the video provider.", required = true)
    public void setEmbedCode(String embedCode) {
        this.embedCode = embedCode;
    }

    @StrutsTagAttribute(description = "The width of the video.", type="Integer")
    public void setWidth(String width) {
        this.width = width;
    }

    @StrutsTagAttribute(description = "The height of the video.", type="Integer")
    public void setHeight(String height) {
        this.height = height;
    }
}
