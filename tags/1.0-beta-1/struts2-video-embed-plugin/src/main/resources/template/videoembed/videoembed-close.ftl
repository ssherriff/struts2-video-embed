<#--
/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
-->
<object width="${parameters.width?html}" height="${parameters.height?html}">
<param name="movie" value="${parameters.src?html}"></param>
<#if parameters.wmodeTransparent>
<param name="wmode" value="transparent"/>
</#if>
<param name="allowFullScreen" value="true"></param>
<param name="allowscriptaccess" value="always"></param>
    <embed
        src="${parameters.src?html}"
        type="application/x-shockwave-flash"
        allowscriptaccess="always"
        allowfullscreen="true"
        <#if parameters.wmodeTransparent>
        wmode="transparent"
        </#if>
        width="${parameters.width?html}"
        height="${parameters.height?html}">
    </embed>
</object>