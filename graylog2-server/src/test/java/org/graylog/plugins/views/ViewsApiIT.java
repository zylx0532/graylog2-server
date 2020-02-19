/**
 * This file is part of Graylog.
 *
 * Graylog is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Graylog is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Graylog.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.graylog.plugins.views;

import org.graylog.testing.completebackend.ApiIntegrationTest;
import org.graylog.testing.completebackend.GraylogBackend;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static com.jayway.restassured.RestAssured.when;


@Disabled
@ApiIntegrationTest
class ViewsApiIT {

    private final GraylogBackend sut;

    public ViewsApiIT(GraylogBackend sut) {
        this.sut = sut;
    }

    @Test
    void canReachApi() {
        when()
                .get(sut.address)
                .then()
                .statusCode(200);
    }
}