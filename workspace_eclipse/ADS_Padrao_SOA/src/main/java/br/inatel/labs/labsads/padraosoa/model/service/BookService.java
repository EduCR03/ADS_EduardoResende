package br.inatel.labs.labsads.padraosoa.model.service;

import java.util.ArrayList;
import java.util.List;

import br.inatel.labs.labsads.padraosoa.model.entity.Book;

public class BookService {
	
	private List<Book> bookList = new ArrayList<>();
	
	public List<Book> searchBook(){
		return bookList;
	}
}
