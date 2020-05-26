package com.example;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class C {
	@Test
	public void t0() {
		doTest(asList("foo", "bar"));
	}

	@Test
	public void t1() {
		doTest(asList("foo", "bar", "optional"));
	}

	private static void doTest(final List<String> items) {
		assertThat(items).as("items").satisfiesAnyOf(
				it -> assertThat(it).as("XXX").containsExactlyInAnyOrder("foo", "bar"),
				it -> assertThat(it).as("YYY").containsExactlyInAnyOrder("foo", "bar", "optional"));
	}
}
