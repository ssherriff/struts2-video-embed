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
public abstract class CodecInterface {
    
    static final String CODECTYPE_YOUTUBE = "youtube";
    static final String CODECTYPE_VIMEO = "vimeo";
    static final String CODECTYPE_GOOGLE = "google";
    static final String CODECTYPE_MYSPACE = "myspace";

    public static Codec getCodec(String type, String embedCode, String locale) {
        if(CODECTYPE_VIMEO.equals(type)) {
            return new Vimeo(embedCode, locale);
        } else if(CODECTYPE_GOOGLE.equals(type)) {
            return new Google(embedCode, locale);
        } else if(CODECTYPE_MYSPACE.equals(type)) {
            return new MySpace(embedCode, locale);
        }
        return new YouTube(embedCode, locale);
    }

}
