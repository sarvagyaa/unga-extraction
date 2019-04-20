/*
* Licensed to the Apache Software Foundation (ASF) under one or more
* contributor license agreements.  See the NOTICE file distributed with
* this work for additional information regarding copyright ownership.
* The ASF licenses this file to You under the Apache License, Version 2.0
* (the "License"); you may not use this file except in compliance with
* the License.  You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package org.apache.stanbol.enhancer.engines.lucenefstlinking.impl;

import org.apache.stanbol.commons.solr.managed.standalone.ClassPathDataFileProvider;
import org.apache.stanbol.enhancer.engines.lucenefstlinking.FstLinkingEngineTest;
/**
 * Ensures that the {@link FstLinkingEngineTest#TEST_SOLR_CORE_CONFIGURATION} 
 * is loaded via the classpath
 *
 */
public class DbpediaDefaultDataFileProvider extends ClassPathDataFileProvider {

    private static final String DATA_FILES_DIR = "org/apache/stanbol/data/site/dbpedia/default/index/";
    
    public DbpediaDefaultDataFileProvider() {
        super(null,DATA_FILES_DIR);
    }
}
