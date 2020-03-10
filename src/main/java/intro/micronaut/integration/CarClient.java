package intro.micronaut.integration;

import intro.micronaut.dto.PlanetDTO;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Header;
import io.micronaut.http.client.annotation.Client;

@Header(name="user-agent", value="${integration.client.user-agent}")
@Client("${integration.client.base-url}")
public interface CarClient {

    @Get("/planets/{id}")
    HttpResponse<PlanetDTO> getPlanets(final Long id);
}