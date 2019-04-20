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
package org.apache.stanbol.ontologymanager.registry.impl.model;

import org.apache.stanbol.ontologymanager.registry.api.model.Registry;
import org.semanticweb.owlapi.model.IRI;

public class RegistryImpl extends AbstractRegistryItem implements Registry {

    private String message = "";

    public RegistryImpl(IRI iri) {
        super(iri);
    }

    public RegistryImpl(IRI iri, String name) {
        super(iri, name);
    }

    public String getError() {
        return this.message;
    }

    @Override
    public String getName() {
        return super.getName() + getError();
    }

    @Override
    public Type getType() {
        return type;
    }

}
