package com.java.product.service;

import com.java.product.dto.ProductDto;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl  implements ProductService{


    @Override
    public boolean saveAndValid(ProductDto dto) {
        boolean valid=true;
        if(dto!=null)

        {
            String name=dto.getName();
            if(name!=null&&name.length()>4)
            {

                System.out.println("valid");
                return true;
            }
            else {
                System.out.println("invalid");
                return false;
            }
        }
        return valid;
    }
}
