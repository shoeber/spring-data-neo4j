/**
 * Copyright 2011 the original author or authors.
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
package org.springframework.data.neo4j.mapping;

import org.neo4j.graphdb.PropertyContainer;
import org.springframework.core.convert.ConversionService;
import org.springframework.data.mapping.context.MappingContext;

/**
 * @author mh
 * @since 27.09.11
 */
public interface Neo4jEntityConverter<T, S extends PropertyContainer> {
    <R extends T> R read(Class<R> type, S source, MappingPolicy mappingPolicy);
    void write(T source, S sink, MappingPolicy mappingPolicy);
    MappingContext<? extends Neo4jPersistentEntity<?>, Neo4jPersistentProperty> getMappingContext();
   	ConversionService getConversionService();

}
