package com.zipcodewilmington.froilansfarm.Storage;

import com.zipcodewilmington.froilansfarm.Animal.Chicken;
import com.zipcodewilmington.froilansfarm.Animal.Horse;
import com.zipcodewilmington.froilansfarm.Animal.Person.Person;
import com.zipcodewilmington.froilansfarm.Crop.Crop;
import com.zipcodewilmington.froilansfarm.Crop.EarCorn;
import com.zipcodewilmington.froilansfarm.Crop.Egg;
import com.zipcodewilmington.froilansfarm.Crop.Tomato;
import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicle.Tractor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Farm {
    private final Tractor tractor;
    private final CropDuster betty;
    private FarmHouse farmHouse;
    private List<Field> fieldList;
    private List<ChickenCoop> chickenCoopList;
    private List<Stable> horseStableList;
    private EggStorage eggStorage;
    private CornStorage cornStorage;
    private TomatoStorage tomatoStorage;


    public Farm(Integer numberFields, Integer numberStables, Integer numberCoops, Integer numberOfChicken, Integer numberOfHorse) {
        this.farmHouse = new FarmHouse();
        this.betty = new CropDuster();
        this.tractor = new Tractor();
        this.eggStorage = new EggStorage();
        this.cornStorage = new CornStorage();
        this.tomatoStorage = new TomatoStorage();

        this.horseStableList = setNumberStables(numberStables);
        this.chickenCoopList = setNumberCoops(numberCoops);
        this.fieldList = setNumberFields(numberFields);

        addManyChicken(numberOfChicken);
        addManyHorse(numberOfHorse);
        farmHouse.getFroilan().setFarm(this);
        farmHouse.getFroilanda().setFarm(this);
    }

    public Farm() {
        this(1,3,4,15,10);
    }

    public FarmHouse getFarmHouse() {
        return this.farmHouse;
    }

    private List<Field> setNumberFields(Integer numberFields) {
        return Stream.generate(Field::new)
                .limit(numberFields)
                .collect(Collectors.toList());
    }

    private List<Stable> setNumberStables(Integer numberStables) {
        return Stream.generate(Stable::new)
                .limit(numberStables)
                .collect(Collectors.toList());
    }

    private List<ChickenCoop> setNumberCoops(Integer numberCoops) {
        return Stream.generate(ChickenCoop::new)
                .limit(numberCoops)
                .collect(Collectors.toList());
    }


    public Integer getNumberOfFields() {
        return fieldList.size();
    }

    public Integer getNumberOfCoops() {
        return chickenCoopList.size();
    }

    public Integer getNumberOfStables() {
        return horseStableList.size();
    }

    public List<Field> getFieldList() {
        return fieldList;
    }

    public List<ChickenCoop> getChickenCoopList() {
        return chickenCoopList;
    }

    public List<Stable> getHorseStableList() {
        return horseStableList;
    }

    public FarmHouse accessFarmhouse(){
        return farmHouse;
    }

    public void addPersonToFarmHouse(Person personToAdd){
        farmHouse.addSingle(personToAdd);
    }

    public ChickenCoop findLeastPopulatedChickenCoop(){
        chickenCoopList.sort(StorageUnit::compareTo);

        return chickenCoopList.get(0);
    }

    public Stable findLeastPopulatedStable(){
        horseStableList.sort(StorageUnit::compareTo);

        return horseStableList.get(0);
    }


    public void addManyChicken(Integer numberOfChicken){//TODO - limit amount to fit max number of chicken allowed in coop

        Stream.generate(Chicken::createChicken).limit(numberOfChicken)
                .forEach(chicken -> findLeastPopulatedChickenCoop().addSingle(chicken));

        }


    public void addManyHorse(Integer numberOfHorse){

        Stream.generate(Horse::createHorse).limit(numberOfHorse)
                .forEach(horse -> findLeastPopulatedStable().addSingle(horse));

    }

    public List<EarCorn> getCorn(Integer numberOfCorn){//TODO - unchecked call
        List<EarCorn> bucketOCorn = new ArrayList<>();
        for (int i = 0; i < numberOfCorn; i++) {
            bucketOCorn.add((EarCorn)cornStorage.get(0));
            cornStorage.removeSingle(cornStorage.get(0));
        }
        return bucketOCorn;
    }

    public List<Tomato> getTomato(Integer numberOfTotmato){
        List<Tomato> bucketOTomato = new ArrayList<>();
        for (int i = 0; i < numberOfTotmato; i++) {
            bucketOTomato.add((Tomato) tomatoStorage.get(0));
            tomatoStorage.removeSingle(tomatoStorage.get(0));
        }
        return bucketOTomato;
    }

    public List<Egg> getEgg(Integer numberOfEggs){
        List<Egg> basketOEggs = new ArrayList<>();
        for (int i = 0; i < numberOfEggs; i++) {
            basketOEggs.add((Egg) eggStorage.get(0));
            eggStorage.removeSingle(eggStorage.get(0));
        }
        return basketOEggs;
    }

    public Stream<Horse> horseStream(){
        return getHorseStableList().stream().flatMap(StorageUnit::getStream);
    }

    public Stream<CropRow> cropRowStream(){
        return getFieldList().stream().flatMap(StorageUnit::getStream);
    }

    public Stream<Chicken> chickenStream(){
        return getChickenCoopList().stream().flatMap(StorageUnit::getStream);
    }

    public Stream<Crop> cropStream() {
            return null;
    }

}





