# LoopKitchenAssignment


Building an API for checking for how much time stores were inactive


Tech Stack Used:
      
   1. Java (Spring Framework)
   2. MySQl, Spring Tool Suite, Postman
   3. Hibernate, JPA


Description:
1. In the first API /trigger_report endpoint, a unique report id will be generated when get hit.
2. In the second API /get_report endpoint, status of id will be shown whether Running or Completed.

   API 1 
   Sample Request  :
   `127.0.0.1:1010/trigger_report`
   
   Sample Response :
   
        ```
        {
            "id" : "abcd-123-sde"
        }
        
        ```
                     
   
   API 2 
   Sample Request :
   
   ` 127.0.0.1:1010/get_report/abcd-123-sde`
   
   Sample Response :  

         ```
          {
              "status" : "Running"
          }                
         ``` 
   
3. Inside the src folder made various controller, entity, dao and service classes. Controller classes are used to address the request. Service Classes are used for providing services to Controller classes and Dao classes is used for accessing database and providing data to Service Layer.




 
