package org.test;

import io.cucumber.java.en.Given;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;

public class DataTableDemo {
	
	
	@Given("user is passing the data at step level in single column without header")
	public void user_is_passing_the_data_at_step_level_in_single_column_without_header(DataTable dataTable) {
	   
		List<String> asList = dataTable.asList();  //[oranium,priya,swetha]
		System.out.println(asList);
		
		for(String e : asList) {
			System.out.println(e);
		}
	}



	
	@Given("user passing the data using multiple column without header")
	public void user_passing_the_data_using_multiple_column_without_header(DataTable dataTable) {
	   
		List<List<String>> asLists = dataTable.asLists();
	
//		 [ [oraniu,oranim1234], [priya,priya123],[kavi,kavi123]  ]
		
		
		for(List<String> list : asLists) {
			
			for(String data : list) {
				System.out.print(data+" ");
			}
			System.out.println();
			
		}
		
	}
	
	
	@Given("user passing the data as single header with singel value.")
	public void user_passing_the_data_as_single_header_with_singel_value(DataTable dataTable) {
	    
		Map<String, String> asMap = dataTable.asMap();
		
//		[ name=loki,age=23,place=chennai   ]
		
		System.out.println(asMap.get("place"));
		
	
		
	}

	
	@Given("user passing the data as single headers and multiple value")
	public void user_passing_the_data_as_single_headers_and_multiple_value(DataTable dataTable) {
	   
			
		List<Map<String, String>> asMaps = dataTable.asMaps();
		
		
		//[  {name=priya,age=23,pplace=chennai} 
//			,{name=swetha,age=25,place=kerala} 
//			,{name=loki,age=26,place=tirunelveli}     ]
		
		Map<String, String> map = asMaps.get(1);
		System.out.println(map.get("name"));
		
	}







}
