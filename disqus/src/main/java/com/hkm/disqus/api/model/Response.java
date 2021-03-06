/*
 * Copyright 2014 Phil Bayfield
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.hkm.disqus.api.model;

import com.google.gson.annotations.SerializedName;

/**
 * Response
 */
public class Response<T> {

    /**
     * Disqus cursor
     */
    @SerializedName("cursor")
    public Cursor cursor;

    /**
     * Error code
     */
    @SerializedName("code")
    public int code;

    /**
     * Response data
     *
     * Object, array of objects or string for errors
     */
    @SerializedName("response")
    public T data;

}
