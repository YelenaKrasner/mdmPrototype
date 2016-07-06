package com.usfoods.poc.mdm;

import static spark.Spark.staticFiles;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	staticFiles.location("/public");
    	new CustomerController();
    }
}
