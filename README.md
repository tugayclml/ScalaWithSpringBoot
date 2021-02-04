# ScalaWithSpringBoot

Before run this app, you should setup postgresl on localhost and change configs in application.properties file.
<br/>

If you are using docker, you can create postgresql easily with these commands:

    $ docker pull postgres
    $ docker run --name postgres_db -e POSTGRES_PASSWORD=password -d postgres -p 5432:5432

After creating postgresql, you should create a database.

Then you can run app.