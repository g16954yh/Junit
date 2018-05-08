package junit.snake;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

import snakecamel.SnakeCamelUtil;

public class SnakeCamelTest {

	
	@Test
	public void snakeToCamelcaseでスネークケースの文字列をキャメルケースに変換できる(){
		SnakeCamelUtil stu = new SnakeCamelUtil();
		String expected = "AbcDefGhi";
		String actual = stu.snakeToCamelcase("abc_def_ghi");
		assertThat(actual, is(expected));
	}

	@Test
	public void camelToSnakecaseでキャメルケースの文字列をスネークケースに変換できる(){
		SnakeCamelUtil stu = new SnakeCamelUtil();
		String expected = "abc_def_ghi";
		String actual = stu.camelToSnakecase("AbcDefGhi");
		assertThat(actual, is(expected));
	}
}
