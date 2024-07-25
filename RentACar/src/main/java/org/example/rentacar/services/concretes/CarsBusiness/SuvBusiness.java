package org.example.rentacar.services.concretes.CarsBusiness;


import org.example.rentacar.entites.CarsEntites.SuvCar;
import org.example.rentacar.repository.CarsRepositories.SuvRepository;
import org.example.rentacar.services.abstracts.CarServices.SuvService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SuvBusiness implements SuvService {
    private SuvRepository suvRepository;

    @Override
    public List<SuvCar> getAllSuvCars() {
        return suvRepository.findAll();
    }

    @Override
    public SuvCar GetByIdSuvCar(Long id) {
        return suvRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteByIdSuvCar(Long id) {
        suvRepository.deleteById(id);
    }

    @Override
    public SuvCar createSuvCar(SuvCar newCar) {
        SuvCar suvCar = new SuvCar();
        suvCar.setCarAge(newCar.getCarAge());
        suvCar.setBrand(newCar.getBrand());
        suvCar.setModel(newCar.getModel());
        suvCar.setColor(newCar.getColor());
        suvCar.setId(newCar.getId());
        suvCar.setFourWheelDrive(newCar.isFourWheelDrive());
        suvCar.setOneDayPrice(newCar.getOneDayPrice());
        suvCar.setRentalDaysNumber(newCar.getRentalDaysNumber());
        suvCar.setCompany(newCar.isCompany());
        return suvCar;
    }

    @Override
    public SuvCar updateSuvCar(Long id, SuvCar newCar) {

        Optional<SuvCar> suvCar = suvRepository.findById(id);
        if (suvCar.isPresent()) {
            SuvCar suvCar1 = new SuvCar();
            suvCar1.setCarAge(newCar.getCarAge());
            suvCar1.setBrand(newCar.getBrand());
            suvCar1.setModel(newCar.getModel());
            suvCar1.setColor(newCar.getColor());
            suvCar1.setId(newCar.getId());
            suvCar1.setOneDayPrice(newCar.getOneDayPrice());
            suvCar1.setRentalDaysNumber(newCar.getRentalDaysNumber());
            return suvCar1;

        } else {
            return null;
        }
    }


    @Override
    public void rentSuv(Long id, SuvCar suvCar) throws Exception {
        SuvCar car = suvRepository.findById(id).orElseThrow(() -> new Exception("Araba bulunamadı."));
        if (!(car instanceof SuvCar)) {
            throw new Exception("Bu işlemler sadece Suv araçlar için geçerlidir.");
        }

        if (suvCar.getRentalDaysNumber() > 1) {
            throw new Exception("Suv araç 1 günden uzun kiralanamaz");
        }

        if (!(suvCar.isCompany())) {
            throw new Exception("Sadece kurumsal müşteriler kiralayabilir ");
        }

    }
}
//todo:Yapılacaklar:SuvServicenin Apisi yazılıp veritabanına bağlayıp(tablo adları verilmeli ve join columlar) test edilmeli.