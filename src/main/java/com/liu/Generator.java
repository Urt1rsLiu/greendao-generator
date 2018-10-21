package com.liu;

import org.greenrobot.greendao.annotation.Entity;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/**
 * simulate the generation process of GreenDao 3.0 generator plugin
 */
public class Generator {
    //version of database
    private static int version = 1;
    //path of generated entity
    private static String outputEntityPackage = "com.liu.entity";
    //path of generated dao/session
    private static String outputDaoPackage = "com.liu.dao";
    //relative path of java source directory of root project
    private static String outUri = "./app/";


    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
        Class<?> studentClazz = Class.forName("com.liu.entity.Student");
//        Class<?> studentClazz = Student.class;
        Entity tr = (Entity) studentClazz.getAnnotation(Entity.class);


    }

    /**
     * get all classes with @Entity annotation in the package
     */
    public static List<Class<?>> getAllEntityClassByPackage(Package pkg){
        String packageName = pkg.getName();
        //get all classes of current package and subpackage of current package
        List<Class<?>> allClassList = getClasses(packageName,true);
    }

    /**
     * get all classes in the package according to package name string
     *
     * @param recursive  whether to get classes from the subpackage of the package
     * @return
     */
    public static List<Class<?>> getClasses(String packageName,boolean recursive){
        List<Class<?>> returnClasses = new ArrayList<Class<?>>();
        String packageDirPath = packageName.replace('.','/');
        //define a enumeration to deal with all thing of in the directory
        Enumeration<URL> dirs;
        try {
            Thread.currentThread().getContextClassLoader().getResources(packageDirPath);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

//    private
}
