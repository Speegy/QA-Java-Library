package com.qa.library;

import com.qa.library.contents.Items;

public interface LibraryMethods {
	abstract String addItem(Items item);
	abstract String deleteItem(Items item);
}
