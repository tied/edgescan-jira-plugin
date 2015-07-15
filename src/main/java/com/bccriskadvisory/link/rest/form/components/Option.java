/**
 * Copyright (C) 2015 BCC Risk Advisory (info@bccriskadvisory.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.bccriskadvisory.link.rest.form.components;

import com.bccriskadvisory.link.rest.gson.GsonObject;

@SuppressWarnings("unused")
public class Option extends GsonObject {
	
	private String value;
	private String label;
	
	public Option() { }
	
	public Option(String value, String label) {
		this.value = value;
		this.label = label;
	}
}