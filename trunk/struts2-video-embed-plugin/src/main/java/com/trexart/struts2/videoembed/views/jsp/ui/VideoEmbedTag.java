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

package com.trexart.struts2.videoembed.views.jsp.ui;

import com.opensymphony.xwork2.util.ValueStack;
import com.trexart.struts2.videoembed.components.VideoEmbed;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.components.Component;
import org.apache.struts2.views.jsp.ui.AbstractClosingTag;

/**
 * @see VideoEmbed
 */
public class VideoEmbedTag extends AbstractClosingTag {

    private String embedCode;
    private String type;
    private String width;
    private String height;

    @Override
    public Component getBean(ValueStack stack, HttpServletRequest req, HttpServletResponse res) {
        return new VideoEmbed(stack, req, res);
    }

    @Override
    protected void populateParams() {

        super.populateParams();

        VideoEmbed videoEmbed = (VideoEmbed) component;
        videoEmbed.setEmbedCode(embedCode);
        videoEmbed.setType(type);
        videoEmbed.setWidth(width);
        videoEmbed.setHeight(height);
    }

    public void setEmbedCode(String embedCode) {
        this.embedCode = embedCode;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public void setHeight(String height) {
        this.height = height;
    }

}
