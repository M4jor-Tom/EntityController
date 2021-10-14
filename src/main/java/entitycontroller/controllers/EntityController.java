package entitycontroller.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;

import jpaentitor.entities.Primed;

public interface EntityController<T extends Primed> {
	public String list(Model model);

	public String show(@PathVariable Integer id, Model model);

	public String edit(@PathVariable Integer id, Model model);

	public String newObject(Model model);

	public String save(T primed);

	public String delete(@PathVariable Integer id);
}