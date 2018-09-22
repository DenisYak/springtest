package com.gb.spring;

//создаём класс который будет бином
public class JavaCodeCreator implements CodeCreator{

    //добавляем зависимость
    private ObjectTypeGenerator classNameGenerator;

    public ObjectTypeGenerator getClassNameGenerator() {
        return classNameGenerator;
    }

    public void setClassNameGenerator(ObjectTypeGenerator classNameGenerator) {
        this.classNameGenerator = classNameGenerator;
    }

    public JavaCodeCreator(){
    }

    public String getClassExample() {
        return "public class " + classNameGenerator.getObjectType() + "{\n   \n}";
    }
}
