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

package com.trexart.struts2.videoembed.views;

import com.opensymphony.xwork2.util.ValueStack;
import com.trexart.struts2.videoembed.views.freemarker.tags.VideoEmbedModels;
import com.trexart.struts2.videoembed.views.velocity.components.VideoEmbedDirective;
import java.util.Arrays;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.views.TagLibrary;

/**
 *
 * @author sherriff
 */
public class VideoEmbedTagLibrary implements TagLibrary {

    public Object getFreemarkerModels(ValueStack stack, HttpServletRequest req, HttpServletResponse res) {
        return new VideoEmbedModels(stack, req, res);
    }

    @SuppressWarnings("unchecked")
    public List<Class> getVelocityDirectiveClasses() {
        Class[] directives = new Class[]{
            VideoEmbedDirective.class,};
        return Arrays.asList(directives);
    }


}
