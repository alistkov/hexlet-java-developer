package hexlet;

import hexlet.classes.CustomerDTO;

public class App {
    public static void main(String[] args) {
        var customerDTO = new CustomerDTO("Anna", "Smith", "anna@gmail.com");
        System.out.println(customerDTO.getFirstName());
        System.out.println(customerDTO.getLastName());
        System.out.println(customerDTO.getEmail());
    }
}
