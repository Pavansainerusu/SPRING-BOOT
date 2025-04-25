package com.codinghub.Service;



public interface ServiceInterface {

	String insert();

	String delete();

	String update();

	String delete(int id);

	String update(int id, String name, int mobiel, String email);

}
