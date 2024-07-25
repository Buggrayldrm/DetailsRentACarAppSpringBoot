package org.example.rentacar.services.concretes.CarsBusiness;

import org.example.rentacar.entites.CarsEntites.HatchbackCar;
import org.example.rentacar.repository.CarsRepositories.HatchbackRepository;
import org.example.rentacar.services.abstracts.CarServices.HatchbackService;

import java.util.List;
import java.util.Optional;

public class HatchbackBusiness implements HatchbackService {
    private HatchbackRepository hatchbackRepository;
    @Override
    public List<HatchbackCar> getAllHatcbackCars() {
        return hatchbackRepository.findAll();
    }

    @Override
    public HatchbackCar getByIdHatcbackCar(Long id) {
        return hatchbackRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteByIdHatcbackCar(Long id) {
        hatchbackRepository.deleteById(id);
    }

    @Override
    public HatchbackCar createHatcbackCar(HatchbackCar newCar) {
        HatchbackCar hatchbackCar=new HatchbackCar();
        hatchbackCar.setCarAge(newCar.getCarAge());
        hatchbackCar.setId(newCar.getId());
        hatchbackCar.setModel(newCar.getModel());
        hatchbackCar.setBrand(newCar.getBrand());
        hatchbackCar.setColor(newCar.getColor());
        hatchbackCar.setRentalDaysNumber(newCar.getRentalDaysNumber());
        hatchbackCar.setCompany(newCar.isCompany());
        hatchbackCar.setOneDayPrice(newCar.getOneDayPrice());
        return hatchbackCar;
    }

    @Override
    public HatchbackCar updateHatcbackCar(Long id, HatchbackCar newCar) {
        Optional<HatchbackCar> hatchbackCar=hatchbackRepository.findById(id);
        if (hatchbackCar.isPresent()){
            HatchbackCar hatchbackCar1=new HatchbackCar();
            hatchbackCar1.setId(newCar.getId());
            hatchbackCar1.setCarAge(newCar.getCarAge());
            hatchbackCar1.setColor(newCar.getColor());
            hatchbackCar1.setBrand(newCar.getBrand());
            hatchbackCar1.setModel(newCar.getModel());
            hatchbackCar1.setOneDayPrice(newCar.getOneDayPrice());
            hatchbackCar1.setRentalDaysNumber(newCar.getRentalDaysNumber());
            return  hatchbackCar1;
        }
        else return null;
    }

    @Override
    public void rentHatcback(Long id, HatchbackCar hatchbackCar) throws Exception {
        HatchbackCar car = hatchbackRepository.findById(id).orElseThrow(() -> new Exception("Araba bulunamadı."));
        if (!(car instanceof HatchbackCar)) {
            throw new Exception("Bu işlemler sadece HatchBack araçlar için geçerlidir.");
        }
        if (hatchbackCar.getRentalDaysNumber() > 30) {
            throw new Exception("Hatchback araç 1 aydan uzun kiralanamaz");
        }

    }
}
