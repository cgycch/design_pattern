package com.cch;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws CloneNotSupportedException
    {
        System.out.println( "Hello World!" );
        BaseBean bean = new BaseBean();
        bean.setId("id");
        bean.setName("name");
        bean.setPhone("phone");
        System.out.println(bean);
        BaseBean clone = bean.clone();
        System.out.println(clone);
        BaseBean clone2 = bean.clone();
        System.out.println(clone2);
        BaseBean clone3 = bean.clone();
        System.out.println(clone3);
    }
}
