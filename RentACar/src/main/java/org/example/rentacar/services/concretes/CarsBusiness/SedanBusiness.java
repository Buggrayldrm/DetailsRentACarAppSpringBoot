package org.example.rentacar.services.concretes.CarsBusiness;

import org.example.rentacar.entites.CarsEntites.SedanCar;
import org.example.rentacar.repository.CarsRepositories.SedanRepository;
import org.example.rentacar.services.abstracts.CarServices.SedanService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SedanBusiness implements SedanService {
    private SedanRepository sedanRepository;
    @Override
    public List<SedanCar> getAllSedanCars() {
        return sedanRepository.findAll();
    }

    @Override
    public SedanCar getByIdSedanCar(Long id) {
        return sedanRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteByIdSedanCar(Long id) {
        sedanRepository.deleteById(id);
    }

    @Override
    public SedanCar createSedanCar(SedanCar newCar) {
        SedanCar sedanCar=new SedanCar();
        sedanCar.setCarAge(newCar.getCarAge());
        sedanCar.setId(newCar.getId());
        sedanCar.setColor(newCar.getColor());
        sedanCar.setBrand(newCar.getBrand());
        sedanCar.setModel(newCar.getModel());
        sedanCar.setNumberOfDoors(newCar.getNumberOfDoors());
        sedanCar.setOneDayPrice(newCar.getOneDayPrice());
        sedanCar.setRentalDaysNumber(newCar.getRentalDaysNumber());
        sedanCar.setCompany(newCar.isCompany());
        return sedanCar;
    }

    @Override
    public SedanCar updateSedanCar(Long id, SedanCar newCar) {
        Optional<SedanCar> sedanCar=sedanRepository.findById(id);
        if (sedanCar.isPresent()){
            SedanCar sedanCar1=new SedanCar();
            sedanCar1.setCarAge(newCar.getCarAge());
            sedanCar1.setId(newCar.getId());
            sedanCar1.setColor(newCar.getColor());
            sedanCar1.setBrand(newCar.getBrand());
            sedanCar1.setModel(newCar.getModel());
            sedanCar1.setNumberOfDoors(newCar.getNumberOfDoors());
            sedanCar1.setOneDayPrice(newCar.getOneDayPrice());
            sedanCar1.setRentalDaysNumber(newCar.getRentalDaysNumber());
            sedanCar1.setCompany(newCar.isCompany());
            return sedanCar1;
        }
        else return null;
    }

    @Override
    public void rentSedan(Long id, SedanCar sedanCar) throws Exception {
        SedanCar car = sedanRepository.findById(id).orElseThrow(() -> new Exception("Araba bulunamadı."));
        if (!(car instanceof SedanCar)) {
            throw new Exception("Bu işlemler sadece Sedan araçlar için geçerlidir.");
        }

        if (sedanCar.getRentalDaysNumber() > 30) {
            throw new Exception("Sedan araç 1 aydan uzun kiralanamaz");
        }

    }
}
