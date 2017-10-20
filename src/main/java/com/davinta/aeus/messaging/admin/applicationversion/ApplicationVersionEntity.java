/**
 * Copyright (C) Davinta Technologies 2017. All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of Davinta Technologies. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms and conditions
 * entered into with Davinta Technologies.
 */

package com.davinta.aeus.messaging.admin.applicationversion;

import com.davinta.aeus.messaging.base.MessageModel;

/**
 * ApplicationVersionEntity Class.
 * @author Rohan Raju
 *
 */
public class ApplicationVersionEntity extends MessageModel {

	private static final long serialVersionUID = -1839406698287210687L;

	private String deviceType;
	private String deviceVersionNumber;
	private String applicationName;
	private String applicationVersionNumber;
	private String applicationDownloadUrl;
	private String applicationReleaseDetails;
	private boolean isForceUpdate;

	public String getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getDeviceVersionNumber() {
		return deviceVersionNumber;
	}

	public void setDeviceVersionNumber(String deviceVersionNumber) {
		this.deviceVersionNumber = deviceVersionNumber;
	}

	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public String getApplicationVersionNumber() {
		return applicationVersionNumber;
	}

	public void setApplicationVersionNumber(String applicationVersionNumber) {
		this.applicationVersionNumber = applicationVersionNumber;
	}

	public String getApplicationDownloadUrl() {
		return applicationDownloadUrl;
	}

	public void setApplicationDownloadUrl(String applicationDownloadUrl) {
		this.applicationDownloadUrl = applicationDownloadUrl;
	}

	public String getApplicationReleaseDetails() {
		return applicationReleaseDetails;
	}

	public void setApplicationReleaseDetails(String applicationReleaseDetails) {
		this.applicationReleaseDetails = applicationReleaseDetails;
	}

	public boolean isForceUpdate() {
		return isForceUpdate;
	}

	public void setForceUpdate(boolean forceUpdate) {
		isForceUpdate = forceUpdate;
	}
}
