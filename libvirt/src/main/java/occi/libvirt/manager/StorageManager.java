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

import java.io.File;
import java.io.IOException;

import occi.infrastructure.Storage;
import occi.infrastructure.interfaces.StorageInterface;
import occi.libvirt.LibvirtConfig;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Manager class for all operations on storage resources. Necessary interface to
 * connect to the occi implementation.
 * 
 * @author Sebastian Heckmann
 * @author Sebastian Laag
 */
public class StorageManager implements StorageInterface {
	private static final Logger LOGGER = LoggerFactory
	.getLogger(StorageManager.class);
	
	/**
	 * {@inheritDoc}
	 */
	public Storage removeStorage(Storage storage) {
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	public Storage onlineStorage(Storage storage) {
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	public Storage offlineStorage(Storage storage) {
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	public Storage createStorage(Storage storage) {
		String name = "";
		if(storage.getTitle() != null)
			name =  storage.getTitle();
		else
			name = storage.getId().toString();
		Float size = 1F;
		if(storage.getSize() != 0F)
			size = storage.getSize();
		LOGGER.debug("Try to create storage file.");
		new File(LibvirtConfig.getInstance().getProperty("libvirt.storageDirectory")).mkdir();
		try {
			Process process = Runtime.getRuntime().exec("/usr/bin/qemu-img create -f raw " + LibvirtConfig.getInstance().getProperty("libvirt.storageDirectory") + name + ".raw " + size + "G");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return storage;
	}

	/**
	 * {@inheritDoc}
	 */
	public Storage makeSnapshot(Storage storage) {
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	public Storage makeBackup(Storage storage) {
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	public Storage resizeStorage(Storage storage) {
		return null;
	}
}