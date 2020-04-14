package com.dp.creational.builder;

// immutable class
public class Phone {

    private final String name;
    private final String model;
    private final int ram;
    private final String os;
    private final String processor;

    private Phone(PhoneBuilder builder){
        this.name = builder.name;
        this.model = builder.model;
        this.ram = builder.ram;
        this.os = builder.os;
        this.processor = builder.processor;
    }


    public static class PhoneBuilder{
        private String name;
        private String model;
        private int ram;
        private String os;
        private String processor;

        public PhoneBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PhoneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PhoneBuilder setRam(int ram) {
            this.ram = ram;
            return this;
        }

        public PhoneBuilder setOs(String os) {
            this.os = os;
            return this;
        }

        public PhoneBuilder setProcessor(String processor) {
            this.processor = processor;
            return this;
        }

        public Phone build(){
            return new Phone(this);
        }
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                ", os='" + os + '\'' +
                ", processor='" + processor + '\'' +
                '}';
    }
}
