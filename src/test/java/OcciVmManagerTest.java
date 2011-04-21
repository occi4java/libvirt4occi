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


import java.net.URISyntaxException;

import javax.naming.NamingException;

import occi.infrastructure.Compute;
import occi.infrastructure.Compute.Architecture;
import occi.infrastructure.Compute.State;
import occi.infrastructure.compute.actions.StopAction.Stop;
import occi.libvirt.manager.VmManager;
import occi.libvirt.vm.VirtualMachineMarshaller;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Test class to test all Vm Manager operations.
 * 
 * @author Sebastian Laag
 * @author Sebastian Heckmann
 */
@Ignore
public class OcciVmManagerTest {
	private VmManager vmManager;
	private Compute compute;
	private VirtualMachineMarshaller vmm;

	@Before
	public void setUp() {
		this.vmManager = new VmManager();
		this.vmm = new VirtualMachineMarshaller();
		try {
			this.compute = new Compute(Architecture.x86, 2, "Test", 2F, 2F,
					State.active, null);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testVmManagerCreate() {
		this.vmm.createComputeXmlDescription(this.compute);
		this.vmManager.startCompute(this.compute);
	}

	@After
	public void teardown() {
		this.vmManager.stopCompute(this.compute, Stop.poweroff);
		this.compute = null;
		this.vmm = null;
		this.vmManager = null;
		System.gc();
	}
}