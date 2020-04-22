/*
 * Copyright 2020 EPAM Systems
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.epam.reportportal.testng.step;

public enum ItemStatus {
	PASSED("PASSED", true),
	FAILED("FAILED", true),
	STOPPED("STOPPED", true),
	SKIPPED("SKIPPED", true),
	RESETED("RESETED", true),
	CANCELLED("CANCELLED", true),

	INFORMATION("INFO", false),
	INFO("INFO", false),
	WARN("WARN", false),
	WARNING("WARN", false);

	private final String value;
	private final boolean item;

	ItemStatus(String value, boolean item) {
		this.value = value;
		this.item = item;
	}

	public String getValue() {
		return value;
	}

	public boolean isItem() {
		return item;
	}
}
