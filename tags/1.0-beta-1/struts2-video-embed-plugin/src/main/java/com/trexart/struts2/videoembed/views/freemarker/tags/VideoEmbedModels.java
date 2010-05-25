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

package com.trexart.struts2.videoembed.views.freemarker.tags;

import com.opensymphony.xwork2.util.ValueStack;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sherriff
 */
public class VideoEmbedModels {
    protected VideoEmbedModel videoEmbed;

    private ValueStack           stack;
    private HttpServletRequest   req;
    private HttpServletResponse  res;

    public VideoEmbedModels(ValueStack stack, HttpServletRequest req, HttpServletResponse res) {
        this.stack = stack;
        this.req = req;
        this.res = res;
    }

    public VideoEmbedModel getVideoembed() {
        if (videoEmbed == null) {
            videoEmbed = new VideoEmbedModel(stack, req, res);
        }

        return videoEmbed;
    }

}
