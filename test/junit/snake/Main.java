package junit.snake;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import snakecamel.SnakeCamelUtil;

public class Main {
	@Test
	public void capitalizeで先頭の小文字を大文字に変換できる1(){
		SnakeCamelUtil stu = new SnakeCamelUtil();
		String expected = "";
		String actual = stu.capitalize("");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void capitalizeで先頭の小文字を大文字に変換できる2(){
		SnakeCamelUtil stu = new SnakeCamelUtil();
		String expected = "A";
		String actual = stu.capitalize("a");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void capitalizeで先頭の小文字を大文字に変換できる3(){
		SnakeCamelUtil stu = new SnakeCamelUtil();
		String expected = "Xyz";
		String actual = stu.capitalize("xyz");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void uncapitalizeで先頭の大文字を小文字に変換できる1(){
		SnakeCamelUtil stu = new SnakeCamelUtil();
		String expected = "";
		String actual = stu.uncapitalize("");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void uncapitalizeで先頭の大文字を小文字に変換できる2(){
		SnakeCamelUtil stu = new SnakeCamelUtil();
		String expected = "a";
		String actual = stu.uncapitalize("A");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void uncapitalizeで先頭の大文字を小文字に変換できる3(){
		SnakeCamelUtil stu = new SnakeCamelUtil();
		String expected = "xyz";
		String actual = stu.uncapitalize("Xyz");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void snakeToCamelcaseでスネークケースの文字列をキャメルケースに変換できる1(){
		SnakeCamelUtil stu = new SnakeCamelUtil();
		String expected = "Abc";
		String actual = stu.snakeToCamelcase("abc");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void snakeToCamelcaseでスネークケースの文字列をキャメルケースに変換できる2(){
		SnakeCamelUtil stu = new SnakeCamelUtil();
		String expected = "AbcDef";
		String actual = stu.snakeToCamelcase("abc_def");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void snakeToCamelcaseでスネークケースの文字列をキャメルケースに変換できる3(){
		SnakeCamelUtil stu = new SnakeCamelUtil();
		String expected = "AbcDefGh";
		String actual = stu.snakeToCamelcase("abc_def_gh");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void snakeToCamelcaseでスネークケースの文字列をキャメルケースに変換できる4(){
		SnakeCamelUtil stu = new SnakeCamelUtil();
		String expected = "AbcDefGh";
		String actual = stu.snakeToCamelcase("abc__def___gh");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void snakeToCamelcaseでスネークケースの文字列をキャメルケースに変換できる5(){
		SnakeCamelUtil stu = new SnakeCamelUtil();
		String expected = "AbcDef";
		String actual = stu.snakeToCamelcase("_abc_def__");
		assertThat(actual, is(expected));
	}

	@Test
	public void camelToSnakecaseでキャメルケースの文字列をスネークケースに変換できる1(){
		SnakeCamelUtil stu = new SnakeCamelUtil();
		String expected = "abc";
		String actual = stu.camelToSnakecase("Abc");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void camelToSnakecaseでキャメルケースの文字列をスネークケースに変換できる2(){
		SnakeCamelUtil stu = new SnakeCamelUtil();
		String expected = "abc_def";
		String actual = stu.camelToSnakecase("AbcDef");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void camelToSnakecaseでキャメルケースの文字列をスネークケースに変換できる3(){
		SnakeCamelUtil stu = new SnakeCamelUtil();
		String expected = "abc_def_gh";
		String actual = stu.camelToSnakecase("AbcDefGh");
		assertThat(actual, is(expected));
	}
}
