package com.senao.oop.manager;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.senao.oop.bean.Schedule;


public class ScheduleManager extends BaseManager{

	List<Schedule> schedules = new ArrayList<Schedule>();

	
	public void ProcessSchedules(String scheduleFilePath) throws IOException {
		Gson gson = new Gson();
		
		String jsonStr = readTxtFile(scheduleFilePath);
		schedules.addAll(((ScheduleManager)gson.fromJson(jsonStr, new TypeToken<ScheduleManager>(){}.getType())).getSchedules());
	}
	
	
	public List<Schedule> getSchedules() {
		return schedules;
	}
	
	
	public int Count() {
		return schedules.size();
	}
	
}
