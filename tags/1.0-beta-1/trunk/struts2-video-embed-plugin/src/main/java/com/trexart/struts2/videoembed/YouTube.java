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

package com.trexart.struts2.videoembed;

/**
 *
 * @author sherriff
 */
public class YouTube extends Codec {

    public YouTube(String embedCode, String locale){
        super(embedCode, locale);
    }

    @Override
    public String getSrc() {
        return "http://www.youtube.com/v/" + embedCode + "&hl=" + locale + "&fs=1";
    }

    @Override
    public Integer getDefaultWidth() {
        return 480;
    }

    @Override
    public Integer getDefaultHeight() {
        return 385;
    }
}
