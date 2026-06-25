interface CustomerRepository {
    String findCustomerById(int id);
}

class CustomerRepositoryImpl
        implements CustomerRepository {

    public String findCustomerById(int id) {
        return "Customer " + id;
    }
}

class CustomerService {
    private CustomerRepository repository;

    CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    void showCustomer(int id) {
        System.out.println(repository.findCustomerById(id));
    }
}

public class DependencyInjectionTest {
    public static void main(String[] args) {
        CustomerRepository repo =
                new CustomerRepositoryImpl();

        CustomerService service =
                new CustomerService(repo);

        service.showCustomer(101);
    }
}