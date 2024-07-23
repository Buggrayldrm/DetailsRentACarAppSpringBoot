package org.example.rentacar.services.concretes;

import org.example.rentacar.dto.RentalRequestDto;
import org.example.rentacar.entites.CarsEntites.Car;
import org.example.rentacar.entites.CarsEntites.SuvCar;
import org.example.rentacar.repository.CarsRepositories.SuvRepository;
import org.example.rentacar.services.abstracts.SuvService;
import org.springframework.stereotype.Service;

import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Optional;

@Service
public class SuvBusiness implements SuvService {
    SuvRepository suvRepository;

    @Override
    public List<SuvCar> getAllCars() {
        return suvRepository.findAll();
    }

    @Override
    public SuvCar GetByIdCar(String plaka) {
        return suvRepository.findById(plaka).orElse(null);
    }

    @Override
    public void deleteByIdCar(String plaka) {
        suvRepository.deleteById(plaka);
    }

    @Override
    public SuvCar createSuvCar(SuvCar newCar) {
        SuvCar suvCar= new SuvCar();
        suvCar.setCarAge(newCar.getCarAge());
        suvCar.setBrand(newCar.getBrand());
        suvCar.setModel(newCar.getModel());
        suvCar.setColor(newCar.getColor());
        suvCar.setPlaka(newCar.getPlaka());
        suvCar.setFourWheelDrive(newCar.isFourWheelDrive());
        suvCar.setOneDayPrice(newCar.getOneDayPrice());
        suvCar.setRentalDaysNumber(newCar.getRentalDaysNumber());
        return suvCar;
    }

    //createcar kısmında hata alıyoruz bu kısıma bakılması lazım. rentsuv methodu koşullara göre yazılmalı bu servis düzgün yazıldığında diğer servisleri yazmak çok kısa ve kolay olacak.


    @Override
    public SuvCar updateSuvCar(String plaka, Car newCar) {

        Optional<SuvCar> suvCar=suvRepository.findById(plaka);
        if (suvCar.isPresent()){
            SuvCar suvCar1=new SuvCar();
            suvCar1.setCarAge(newCar.getCarAge());
            suvCar1.setBrand(newCar.getBrand());
            suvCar1.setModel(newCar.getModel());
            suvCar1.setColor(newCar.getColor());
            suvCar1.setPlaka(newCar.getPlaka());
            suvCar1.setOneDayPrice(newCar.getOneDayPrice());
            suvCar1.setRentalDaysNumber(newCar.getRentalDaysNumber());
            return suvCar1;

        }
        else {
            return null;
        }
    }

    //todo: rentSuv methodu düzgün çalışmıyor. Bireysel ve kurumsal müşteri kontrolu yapılmalı.
    @Override
    public void rentSuv(String plaka, SuvCar suvCar) throws Exception {
        Car car=suvRepository.findById(plaka).orElseThrow(()-> new Exception("Araba bulunamadı."));
        if (!(car instanceof SuvCar)){
            throw new Exception("Bu işlemler sadece Suv araçlar için geçerlidir.");
        }

        if (suvCar.getRentalDaysNumber()>1){
            throw new Exception("Suv araç 1 günden uzun kiralanamaz");
        }

    }
}
