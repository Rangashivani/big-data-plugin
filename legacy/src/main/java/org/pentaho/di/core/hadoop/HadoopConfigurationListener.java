/*******************************************************************************
 *
 * Pentaho Big Data
 *
 * Copyright (C) 2002-2017 by Hitachi Vantara : http://www.pentaho.com
 *
 *******************************************************************************
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ******************************************************************************/

package org.pentaho.di.core.hadoop;

import org.pentaho.hadoop.shim.HadoopConfiguration;

/**
 * Created by bryan on 6/8/15.
 */
public interface HadoopConfigurationListener {
  void onClassLoaderAvailable( ClassLoader classLoader );

  void onConfigurationOpen( HadoopConfiguration hadoopConfiguration, boolean defaultConfiguration );

  void onConfigurationClose( HadoopConfiguration hadoopConfiguration );
}