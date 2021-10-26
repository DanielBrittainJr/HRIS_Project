# HRIS_Project
HRIS_Project


add files and folders to intellij project. In order to run you must add the jdbc connector to the intellij project, as well as change the database information to match the database you want to access and the username and password to access it. This can be done currently as of October 25th, by changing the database variable info within the selectBasicInfo function within the DefaultQueries class. 

"sakila" is the name of the database I was using, so change that to the one you want to use.
"root" is the username i had.
"itunes44" is the random password I was using.

change this info to use the project. You also need to change the parameters within the selectBasicInfo function to use a specific database and access specific information.

I will soon update it to use the DB that etka has provided.


Make sure to download and install mysql jdbc connector 
check out this discussion to learn how to add to project 
https://stackoverflow.com/questions/30651830/use-jdbc-mysql-connector-in-intellij-idea
