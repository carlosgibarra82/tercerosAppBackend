package com.carlosibarra.services;

public interface ICrudService<T> {

	public T findById(Long id);
}
