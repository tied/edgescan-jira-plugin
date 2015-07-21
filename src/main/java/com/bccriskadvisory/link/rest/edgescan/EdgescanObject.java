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
package com.bccriskadvisory.link.rest.edgescan;

import java.time.ZonedDateTime;

import com.bccriskadvisory.link.rest.gson.GsonObject;

public abstract class EdgescanObject extends GsonObject {
	
	private int id;
	private ZonedDateTime created_at;
	private ZonedDateTime updated_at;

	public int getId() {
		return id;
	}

	public ZonedDateTime getCreatedAt() {
		return created_at;
	}

	public ZonedDateTime getUpdatedAt() {
		return updated_at;
	}
}