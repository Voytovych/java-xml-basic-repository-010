package com.example.jdom.create;

import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;

import com.example.dataprovider.DataProvider;
import com.example.model.Customer;

public class CreateXMLWithJDOM {

	public static void main(String[] args) {

		List<Customer> data = DataProvider.getData(DataProvider.MEDIUM);

		JDOMCreator creator = new JDOMCreator();
		Document doc = creator.createXMLDocument(data);
		List<Element> list = doc.getRootElement().getChildren();
		System.out.println("retrieved " + list.size());
		
	}

}
