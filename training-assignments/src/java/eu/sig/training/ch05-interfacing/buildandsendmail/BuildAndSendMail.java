package eu.sig.training.ch05.buildandsendmail;

public class BuildAndSendMail {
    // tag::buildAndSendMail[]
    public void buildAndSendMail(MailMan man, MailOptions options) {        
        // Format the message given the content type and raw message
        MailMessage message = formatMessage(mail.getFont() + mail.getMessage1() + mail.getMessage2() + mail.getMessage3());
        
        // Send message
        man.send(mail, message);
    }
    // end::buildAndSendMail[]

    @SuppressWarnings("unused")
    private MailMessage formatMessage(MailFont font, String string) {
        return null;
    }

    private class MailMan {

        @SuppressWarnings("unused")
        public void send(Mail mail, MailMessage message) {}

    }

    private class MailFont {

    }

    private class MailMessage {

    }
    
    public class MailOptions {
        private String firstName;
        private String lastName;
        private String division;
        private String subject;
        private MailFont font;
        private String message1;
        private String message2;
        private String message3;
        
        public String getFirstName() {
            return this.firstName;
        }
        
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        } 
        
        public String getLastName() {
            return this.lastName;
        }
        
        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
        
        public String getDivision() {
            return this.division;
        }
        
        public void setDivision(String division) {
            this.division = division;
        }
        
        public String getSubject() {
            return this.subject;
        }
        
        public void setSubject(String subject) {
            this.subject = subject;
        }
        
        public MailFont getFont() {
            return this.font;
        }
        
        public void setFont(MailFont font) {
            this.font = font;
        }
        
        public String getMessage1() {
            return this.message1;
        }
        
        public void setMessage1(String message1) {
            this.message1 = message1;
        }
        
        public String getMessage2() {
            return this.message2;
        }
        
        public void setMessage2(String message2) {
            this.message2 = message2;
        }
        
        public String getMessage3() {
            return this.message3;
        }
        
        public void setMessage3(String message3) {
            this.message3 = message3;
        }
        
        public String getMId() {
            return this.getFirstName().charAt(0) 
                 + "."
                 + this.getLastName().substring(0, 7) 
                 + "@"
                 + this.getDivision().substring(0, 5) 
                 + ".compa.ny";
        }
    }

}
