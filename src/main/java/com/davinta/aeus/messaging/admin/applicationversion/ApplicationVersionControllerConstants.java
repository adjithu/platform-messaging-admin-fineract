/**
 * Copyright (C) Davinta Technologies 2017. All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of Davinta Technologies. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms and conditions
 * entered into with Davinta Technologies.
 */

package com.davinta.aeus.messaging.admin.applicationversion;

import com.davinta.aeus.messaging.base.ServiceConstants;

/**
 * ApplicationVersionControllerConstants Class.
 * @author Rohan Raju
 *
 */
public final class ApplicationVersionControllerConstants {

	private ApplicationVersionControllerConstants() {
	}

	/**
	 * PATH.
	 */
	public static final String PATH = "/applicationversion";

	/**
	 * CREATE_APPLICATION_VERSION_REQUEST.
	 */
	public static final String CREATE_APPLICATION_VERSION_REQUEST = "/createApplicationVersion";

	/**
	 * CREATE_APPLICATION_VERSION_REQUEST.
	 */
	public static final String ALL_APPLICATION_VERSION_REQUEST = "/allApplicationVersion";

	/**
	 * FIND_BY_GUID_REQUEST.
	 */
	public static final String FIND_BY_GUID_REQUEST = ServiceConstants.PATH_DELIM + "{" + ServiceConstants.ID_VAR + "}";

	/**
	 * FIND_BY_DEVICETYPE_AND_DEVICEVERSION.
	 */
	public static final String FIND_BY_DEVICETYPE_AND_DEVICEVERSION = "/deviceType/{deviceType}/deviceVersionNumber/{deviceVersionNumber}/active";

	/**
	 * UPDATE_APPLICATION_VERSION_REQUEST.
	 */
	public static final String UPDATE_APPLICATION_VERSION_REQUEST = "/updateApplicationVersion";

	/**
	 * DELETE_APPLICATION_VERSION_REQUEST.
	 */
	public static final String DELETE_APPLICATION_VERSION_REQUEST = "/deleteApplicationVersion";

}
