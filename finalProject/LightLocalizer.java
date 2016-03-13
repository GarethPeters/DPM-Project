package finalProject;
import lejos.hardware.sensor.SensorMode;
import lejos.robotics.SampleProvider;
//DPM Group 8
//Gareth Peters
//ID:260678626
//LuoQing(Ryan) Wang
//ID:260524744
public class LightLocalizer {
	private Odometer odo;
	private SampleProvider colorSensor;
	private float[] colorData;	
	private Controller controller;
	
	public LightLocalizer(Odometer odo, SampleProvider colorSensor, float[] colorData) {
		this.odo = odo;
		this.colorSensor = colorSensor;
		this.colorData = colorData;
		controller=new Controller(odo);
	}

	public void doLocalization() {
		
	}

}