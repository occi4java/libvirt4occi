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

package occi.libvirt.manager;

import occi.infrastructure.Network;
import occi.infrastructure.interfaces.NetworkInterface;

/**
 * Manager class for all operations on network resources. Necessary interface to
 * connect to the occi implementation.
 * 
 * @author Sebastian Heckmann
 * @author Sebastian Laag
 */
public class NetworkManager implements NetworkInterface {
	/**
	 * {@inheritDoc}
	 */
	public Network upNetwork(Network network) {
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	public Network downNetwork(Network network) {
		return null;
	}
}