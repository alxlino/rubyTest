require 'rubygems'  
require 'appium_lib'  

desired_caps = {  
    caps: {  
       platformName: 'iOS',  
       platformVersion: '10.3.2',  
       #deviceName: 'iPhone X',
       devideName: 'Iphone_inmstelo',
       #udid: '26F0DCD3-BEF8-4388-83EC-DECB1FCB6257', #iPhone X
       #udid: 'f2c33d7745857c30d2bbd841725dad921a5ae986' Iphone_inmstelo
       browserName: 'Safari'
    }  
 } 

 @appium_driver = Appium::Driver.new(desired_caps,true)  

 @selenium_driver = @appium_driver.start_driver  

 Appium.promote_appium_methods Object

 @selenium_driver.get("http://www.google.com/")
