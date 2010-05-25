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
public abstract class Codec {
    
    protected String embedCode;
    protected String locale;

    public Codec(){}

    public Codec(String embedCode, String locale) {
        this.embedCode = embedCode;
        this.locale = locale;
    }

    abstract public String getSrc();

    abstract public Integer getDefaultWidth();

    abstract public Integer getDefaultHeight();

    public boolean useWmodeTransparent() {
        return false;
    }
}
