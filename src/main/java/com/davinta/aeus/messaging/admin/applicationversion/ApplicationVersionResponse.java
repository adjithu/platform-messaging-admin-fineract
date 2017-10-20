/**
 * Copyright (C) Davinta Technologies 2017. All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of Davinta Technologies. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms and conditions
 * entered into with Davinta Technologies.
 */

package com.davinta.aeus.messaging.admin.applicationversion;

import com.davinta.aeus.messaging.base.ResponseMessageModel;

/**
 * ApplicationVersionResponse Class.
 * @author Rohan Raju
 *
 */
public class ApplicationVersionResponse extends ResponseMessageModel<ApplicationVersionEntity> {

	private static final long serialVersionUID = 4201216086556158195L;

	private ApplicationVersionEntity message;

	@Override
	public ApplicationVersionEntity getMessage() {
		return message;
	}

	@Override
	public void setMessage(ApplicationVersionEntity message) {
		this.message = message;
	}

}
