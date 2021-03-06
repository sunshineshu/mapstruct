/**
 *  Copyright 2012-2017 Gunnar Morling (http://www.gunnarmorling.de/)
 *  and/or other contributors as indicated by the @authors tag. See the
 *  copyright.txt file in the distribution for a full listing of all
 *  contributors.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.mapstruct.ap.test.source.defaultExpressions.java;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.Date;
import java.util.UUID;

/**
 * @author Jeffrey Smyth
 */
@Mapper(imports = { UUID.class, Date.class })
public interface ErroneousDefaultExpressionMapper {

    @Mappings({
        @Mapping(target = "sourceId", source = "id", defaultExpression = "UUID.randomUUID().toString()"),
        @Mapping(target = "sourceDate", source = "date", defaultExpression = "java( new Date())")
    })
    Target sourceToTarget(Source s);
}
