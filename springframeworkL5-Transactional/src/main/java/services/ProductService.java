package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import repositories.ProductRepository;

@Service
public class ProductService {


    @Autowired
    private ProductRepository productRepository;

    // Rollsback the RunTimeException but does not rollback the checked exception
    @Transactional(noRollbackFor = RuntimeException.class)
    public void addOneProduct(){
        productRepository.addProduct("Beer");
        throw new RuntimeException(":(");
    }
}
