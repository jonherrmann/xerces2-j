/*
 * Copyright 2004 The Apache Software Foundation.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.xerces.xs.datatypes;

/**
 * <p><b>EXPERIMENTAL: This interface should not be considered stable.
 * It is likely it may be altered or replaced in the future.</b></p>
 * 
 * <p>Interface to expose the values for all date-time related types.</p>
 * 
 * @author Ankit Pasricha, IBM
 * 
 * @version $Id$
 */
public interface XSDateTime {
	
	/**
	 * @return year
	 */
	public int getYear();
	
	/**
	 * @return month
	 */
	public int getMonth();
	
	/**
	 * @return day
	 */
	public int getDay();
	
	/**
	 * @return hour
	 */
	public int getHour();
	
	/**
	 * @return minutes
	 */
	public int getMinutes();
	
	/**
	 * @return seconds
	 */
	public double getSeconds();
	
	/**
	 * @return boolean
	 */
	public boolean hasTimeZone();
}