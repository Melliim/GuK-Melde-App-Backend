package QuickChange.GuKMelde.App.Service;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.sendgrid.Content;
import com.sendgrid.Email;
import com.sendgrid.Mail;
import com.sendgrid.Method;
import com.sendgrid.Request;
import com.sendgrid.Response;
import com.sendgrid.SendGrid;

@Service
public class MailService {
    private static final Logger logger = LoggerFactory.getLogger(MailService.class);

    public String sendTextEmail() throws IOException {
        // the sender email should be the same as we used to Create a Single Sender Verification

        String message = "Sehr geehrtes Team der Krankenkasse,\n" +
                "\n" +
                "wir sind ein Unternehmen, das im Zusammenhang mit der aktuellen Krankheit eines unserer Mitarbeitenden Informationen zur Lohnfortzahlung im Krankheitsfall benötigt. Gemäß den gesetzlichen Bestimmungen hat unsere Mitarbeiterin/unser Mitarbeiter Anspruch auf Lohnfortzahlung während ihrer/seiner Arbeitsunfähigkeit.\n" +
                "\n" +
                "Wir möchten höflichst um Informationen über den Prozess und die erforderlichen Schritte zur Beantragung der Lohnfortzahlung bitten. Welche Unterlagen sind notwendig und welche Fristen müssen beachtet werden? Gibt es spezifische Formulare, die ausgefüllt werden müssen?\n" +
                "\n" +
                "Des Weiteren würden wir gerne wissen, welche Dokumente von unserer Seite aus benötigt werden, um den Lohnfortzahlungsanspruch zu bestätigen. Bitte teilen Sie uns mit, welche Informationen wir Ihnen zukommen lassen müssen, um den Vorgang ordnungsgemäß abzuschließen.\n" +
                "\n" +
                "Für Rückfragen stehen wir Ihnen gerne zur Verfügung. Sie erreichen uns unter der Telefonnummer [Telefonnummer des Unternehmens] oder per E-Mail unter [E-Mail-Adresse des Unternehmens].\n" +
                "\n" +
                "Wir bedanken uns im Voraus für Ihre Unterstützung und zeitnahe Bearbeitung unseres Anliegens.\n" +
                "\n" +
                "Mit freundlichen Grüßen,\n" +
                "Personalabteilung";
        Email from = new Email("jascha.steudler@student.htw-berlin.de");
        String subject = "Lohnfortzahlung absprechen";
        Email to = new Email("jascha.steudler@student.htw-berlin.de");
        Content content = new Content("text/plain", message);
        Mail mail = new Mail(from, subject, to, content);

        SendGrid sg = new SendGrid(System.getenv("SENDGRID_API_KEY"));
        Request request = new Request();
        try {
            request.setMethod(Method.POST);
            request.setEndpoint("mail/send");
            request.setBody(mail.build());
            Response response = sg.api(request);
            logger.info(response.getBody());
            return response.getBody();
        } catch (IOException ex) {
            throw ex;
        }
    }

    public String sendVor() throws IOException {
        // the sender email should be the same as we used to Create a Single Sender Verification

        String message = "Nachricht an Vorgesetzen";
        Email from = new Email("jascha.steudler@student.htw-berlin.de");
        String subject = "Lohnfortzahlung absprechen";
        Email to = new Email("jascha.steudler@student.htw-berlin.de");
        Content content = new Content("text/plain", message);
        Mail mail = new Mail(from, subject, to, content);

        SendGrid sg = new SendGrid(System.getenv("SENDGRID_API_KEY"));
        Request request = new Request();
        try {
            request.setMethod(Method.POST);
            request.setEndpoint("mail/send");
            request.setBody(mail.build());
            Response response = sg.api(request);
            logger.info(response.getBody());
            return response.getBody();
        } catch (IOException ex) {
            throw ex;
        }
    }
}
