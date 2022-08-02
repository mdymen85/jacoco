package com.coverage.jacoco;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class JacocoApplicationTests {

	@Autowired
	private MathService mathService;

	@Test
	void mathTestZero() {

		var result = mathService.divide(BigDecimal.ZERO);

		assertEquals(result, BigDecimal.ZERO);

	}

}
