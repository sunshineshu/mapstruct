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
package org.mapstruct.ap.test.bugs._1460;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author Christian Bandowski
 */
@Mapper
public abstract class Issue1460Mapper {

    public static final Issue1460Mapper INSTANCE = Mappers.getMapper( Issue1460Mapper.class );

    public abstract Target map(Source source);

    public abstract String forceUsageOfIssue1460Enum(Issue1460Enum source);

    public abstract String forceUsageOfLocale(Locale source);

    public abstract String forceUsageOfLocalDate(LocalDate source);

    public abstract String forceUsageOfDateTime(DateTime source);

    public static class Issue1460Enum {
    }

    public static class Locale {
    }

    public static class LocalDate {
    }

    public static class DateTime {
    }
}
