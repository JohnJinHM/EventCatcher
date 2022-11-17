module com.example.eventcatcher {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.api.client.auth;
    requires google.api.client;
    requires com.google.api.client.extensions.jetty.auth;
    requires com.google.api.client;
    requires com.google.api.client.extensions.java6.auth;
    requires com.google.api.client.json.gson;
    requires com.google.api.services.calendar;
    requires com.google.api.services.gmail;


    opens com.example.eventcatcher to javafx.fxml;
    exports com.example.eventcatcher;
}