package weather.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import weather.enums.WeatherConditions;
import weather.model.Conditions;
import weather.model.Coordinates;
import weather.model.Temperature;
import weather.model.WeatherResult;
import weather.model.Wind;

@Controller
@RequestMapping("/")
public class WeatherInfoService {
	
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody WeatherResult test(@RequestParam("location") String location) {
		
		if(location == null || location.isEmpty() || location.equals(""))
			return new WeatherResult("I need a Location!");
		
		Coordinates coord = new Coordinates(1.13, 51.51);
		Conditions [] weatherConditions = new Conditions[3];
		
		weatherConditions[0] = new Conditions(WeatherConditions.MIST, "MIST", 123, "mistIcon");
		weatherConditions[1] = new Conditions(WeatherConditions.HAZE, "HAZE", 345, "hazeIcon");
		weatherConditions[2] = new Conditions(WeatherConditions.FOG, "FOG", 456, "fogIcon");
		
		Temperature temperature = new Temperature(78.3, 65.4, 80.0, 1000, 78);
		Wind wind = new Wind(23.3, 30.5);
		
		WeatherResult apiResult = new WeatherResult(location, 
													999, 
													coord, 
													weatherConditions, 
													temperature, 
													wind);
		
		return apiResult;
	}
}
