package roman.lazarchik.crud.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import roman.lazarchik.crud.dao.PersonDAO;
import roman.lazarchik.crud.models.Person;

@Component
public class PersonValidator implements Validator {

    private final PersonDAO personDAO;

    @Autowired
    public PersonValidator(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return Person.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        Person person = (Person) o;
        if (!Character.isUpperCase(person.getName().codePointAt(0))) {
            errors.rejectValue("name", "", "Имя, Фамилия и Отчество должны начинаться с заглавной буквы");
        }
        if (personDAO.getPersonByFullName(person.getName()).isPresent()) {
            errors.rejectValue("name", "", "Человек с таким ФИО уже существует");
        }
    }
}
