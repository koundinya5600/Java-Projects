
public class Call {
 private int callId;
 private long calledNumber;
 private float duration;
 
 public int getCallId() {
	 return this.callId;
 }
 public long getCalledNumber() {
	 return this.calledNumber;
 }
 public float getDuration() {
	 return this.duration;
 }
 public void setCallId(int id) {
	 this.callId = id;
 }
 public void setCalledNumber(long num) {
	 this.calledNumber = num;
 }
 public void setDuration(float duration) {
	 this.duration = duration;
 }
 
 public void parseData(String callDetails) {
	 String s=callDetails;
	 String[] s1=s.split(":");
	 setCallId(Integer.parseInt(s1[0]));
	 setCalledNumber(Long.parseLong(s1[1]));
	 setDuration(Float.parseFloat(s1[2]));
 }
}
