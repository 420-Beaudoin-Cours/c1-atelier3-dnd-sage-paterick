package sample;

/**
 * Créé par Patrick Provost le 4 février 2020
 * Dernières modifications le 4 février 2020
 */

import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.*;

public class Controller {

    public TextField txfSource;
    public ImageView imgTarget;
    public ComboBox<String> cmbTarget;


    /** Exercice 1
    public void txfSourceDragDetected(MouseEvent mouseEvent) {
        if (!txfSource.getText().isBlank()){
            Dragboard db = txfSource.startDragAndDrop(TransferMode.ANY);
            ClipboardContent content = new ClipboardContent();
            content.putString(txfSource.getText());
            db.setContent(content);
        }
    }

    public void imgTargetDragOver(DragEvent dragEvent) {
        dragEvent.acceptTransferModes(TransferMode.ANY);

    }

    public void imgTargetDragDropped(DragEvent dragEvent) {
        txfSource.clear();
    }
    */


    /** Exercice 2
    public void txfSourceDragDetected(MouseEvent mouseEvent) {
        if (!txfSource.getText().isBlank()){
            Dragboard db = txfSource.startDragAndDrop(TransferMode.ANY);
            ClipboardContent content = new ClipboardContent();
            content.putString(txfSource.getText());
            db.setContent(content);
        }
    }

    public void cmbTargetDragOver(DragEvent dragEvent) {
        dragEvent.acceptTransferModes(TransferMode.ANY);
    }

    public void cmbTargetDragDropped(DragEvent dragEvent) {
        Dragboard db = dragEvent.getDragboard();
        cmbTarget.getItems().setAll(db.getString());
        cmbTarget.getSelectionModel().select(0);
    }
    */

    /** Exercice 3
    public void txfDragDetected(MouseEvent mouseEvent) {
        TextField ref = (TextField) mouseEvent.getSource();

        if (!ref.getText().isBlank()) {
            Dragboard db = ref.startDragAndDrop(TransferMode.ANY);
            ClipboardContent content = new ClipboardContent();
            content.putString(ref.getText());
            db.setContent(content);
        }
    }

    public void imgTargetDragOver(DragEvent dragEvent) {
        dragEvent.acceptTransferModes(TransferMode.ANY);
    }

    public void imgTargetDragDropped(DragEvent dragEvent) {
        TextField refSource = (TextField) dragEvent.getGestureSource();
        refSource.clear();
    }
    */

    // Exercice 4
    public void txfDragDetected(MouseEvent mouseEvent) {
        TextField ref = (TextField) mouseEvent.getSource();

        if (!ref.getText().isBlank()) {
            Dragboard db = ref.startDragAndDrop(TransferMode.ANY);
            ClipboardContent content = new ClipboardContent();
            content.putString(ref.getText());
            db.setContent(content);
        }
    }

    public void txfDragOver(DragEvent dragEvent) {
        TextField refSource = (TextField) dragEvent.getGestureSource();
        TextField refTarget = (TextField) dragEvent.getGestureTarget();
        if (!refSource.equals(refTarget))
            dragEvent.acceptTransferModes(TransferMode.ANY);
    }

    public void txfDragDropped(DragEvent dragEvent) {
        TextField refSource = (TextField) dragEvent.getGestureSource();
        TextField refTarget = (TextField) dragEvent.getGestureTarget();
        Dragboard db = dragEvent.getDragboard();
        refTarget.setText(db.getString());
        refSource.clear();

    }
}
