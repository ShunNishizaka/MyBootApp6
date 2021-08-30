package jp.te4a.spring.boot.myapp6;

import lombok.AllArgsConstructor;
import lombok.Data;
//test
@Data
@AllArgsConstructor
public class BookBean  {
	Integer id ;
	String title;
	String writter;
	String publisher;
	 Integer price;
	
}
