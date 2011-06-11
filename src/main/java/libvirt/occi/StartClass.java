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
import occi.http.occiApi;
import occi.infrastructure.injection.Injection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartClass {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"resources/conf/beans.xml");
		BeanFactory factory = context;
		Injection test = (Injection) factory
				.getBean("Injection");
		try {
			occiApi.main(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}