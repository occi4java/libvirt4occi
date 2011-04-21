/**
 * Copyright (C) 2010-2011 Sebastian Heckmann, Sebastian Laag
 *
 * Contact Email: <sebastian.heckmann@udo.edu>, <sebastian.laag@udo.edu>
 *
 * Licensed under the GNU LESSER GENERAL PUBLIC LICENSE, Version 3.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.gnu.org/licenses/lgpl-3.0.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package libvirt.occi;

import java.io.IOException;
import java.util.Properties;

import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.XMLConfiguration;

/**
 * OcciConfig singleton class. It saves all occi properties.
 * 
 * @author Sebastian Laag
 * @author Sebastian Heckmann
 * 
 */
public class LibvirtConfig extends XMLConfiguration {
	private static final long serialVersionUID = 1L;
	/**
	 * Instance of OcciConfig
	 */
	private static LibvirtConfig instance = null;
	/**
	 * Configuration for all occi properties
	 */
	public Configuration config;

	public static LibvirtConfig getInstance() {
		if (instance == null) {
			// create LibvirtConfig instance
			instance = new LibvirtConfig();
		}
		return instance;
	}

	public String getProperty(String key) {
		String value = null;
		Properties prop = new Properties();
		try {
			prop.load(getClass().getResourceAsStream("/conf/libvirt.properties"));
			value = prop.getProperty(key);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("=============== key=" + key + ", value=" + value);
		return value;
	}

	public static void main(String[] args) {
		new LibvirtConfig();
	}
}