package Interface;

public class WhatsApp implements Contacts, media {

    @Override
    public void newContact() {

    }

    @Override
    public void editContact() {

    }

    @Override
    public void saveContact() {
        System.out.println("Contact Saved Successfully");
    }

    @Override
    public void openDocument() {
        System.out.println("Document is opened and shared to WhatsApp");
    }

    @Override
    public void shareImage() {
        System.out.println("Required image is shared to the selected contact in WhatsApp");
    }

    @Override
    public void selectFiles() {
        System.out.println("Files are selected and shared to the contacts");
    }
}
