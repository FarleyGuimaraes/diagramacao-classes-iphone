package src.iphone.model;

public class VoiceMailMessage {
    

    private String from;
    private AudioMessage AudioMessage;
    
    public VoiceMailMessage(String from, src.iphone.model.AudioMessage audioMessage) {
        this.from = from;
        AudioMessage = audioMessage;
    }

    public String getFrom() {
        return from;
    }

    public AudioMessage getAudioMessage() {
        return AudioMessage;
    }
  

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((from == null) ? 0 : from.hashCode());
        result = prime * result + ((AudioMessage == null) ? 0 : AudioMessage.hashCode());
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
        VoiceMailMessage other = (VoiceMailMessage) obj;
        if (from == null) {
            if (other.from != null)
                return false;
        } else if (!from.equals(other.from))
            return false;
        if (AudioMessage == null) {
            if (other.AudioMessage != null)
                return false;
        } else if (!AudioMessage.equals(other.AudioMessage))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "\nVoiceMessage [from=" + from + ", AudioMessage=" + AudioMessage + "]";
    }
  
}
