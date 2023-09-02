package src.iphone.model;

public class AudioMessage {
    ///Classe criada para simular um arquivo de audio do voicemail
    //a ser reproduzido no VisualVoicemail
    private String message;

    public AudioMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((message == null) ? 0 : message.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        AudioMessage other = (AudioMessage) obj;
        if (message == null) {
            if (other.message != null)
                return false;
        } else if (!message.equals(other.message))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "[" + message + "]";
    }

    
}
