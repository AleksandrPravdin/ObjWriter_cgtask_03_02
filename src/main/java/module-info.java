module com.cgvsu.cg_task03_02_objwriter {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.cgvsu.cg_task03_02_objwriter to javafx.fxml;
    exports com.cgvsu.cg_task03_02_objwriter;
}