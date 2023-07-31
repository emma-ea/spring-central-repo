package com.emma_ea.dogdata;

import com.emma_ea.dogdata.entity.Dog;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class DogdataApplicationTests {

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	void contextLoads() {
	}

	@Test
	public void getAllDogs() {
		String url = String.format("http://localhost:%d/api/v1/dogs/all", port);
		ResponseEntity<List> response = this.restTemplate.getForEntity(url, List.class);

		assertThat(response.getStatusCode(), equalTo(HttpStatus.OK));

	}

	@Test
	public void retrieveDogById() throws Exception {
		String url = String.format("http://localhost:%d/api/v1/dogs/id?id=%d", port, 1);
		ResponseEntity<Dog> response = restTemplate.getForEntity(url, Dog.class);

		assertThat(response.getStatusCode(), equalTo(HttpStatus.OK));
		assertThat(response.getBody().getId(), equalTo(1L));
	}

}
