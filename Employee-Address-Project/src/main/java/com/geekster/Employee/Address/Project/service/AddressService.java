package com.geekster.Employee.Address.Project.service;

import com.geekster.Employee.Address.Project.model.Address;
import com.geekster.Employee.Address.Project.repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    IAddressRepo addressRepo;

    public String addAddresses(List<Address> addressList) {
         addressRepo.saveAll(addressList);
         return "addresses saved successfully";
    }

    public List<Address> getAlllAddress() {
        return (List<Address>) addressRepo.findAll();
    }

    public Optional<Address> getAddressById(Long id) {
        return addressRepo.findById(id);
    }

    public String updateAddressById(Long id, String city) {
        Optional<Address> addressOptional = addressRepo.findById(id);
        Address address = addressOptional.get();
        if(address==null){
            return "id not found";
        }
        address.setCity(city);
        addressRepo.save(address);
        return "address updated successfully";
    }

    public String deleteAddressById(Long id) {
        addressRepo.deleteById(id);
        return "address removed successfully";
    }
}
