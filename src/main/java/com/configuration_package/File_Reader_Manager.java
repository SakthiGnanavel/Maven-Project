package com.configuration_package;

public class File_Reader_Manager {
	
	private File_Reader_Manager(){
		
	}
	
	
	public Configuration_Reader getInstanceCR() throws Throwable {
		
		Configuration_Reader cr = new Configuration_Reader();
		
		return cr;
	}

	public static File_Reader_Manager getInstanceFrm() {
		
		File_Reader_Manager frm = new File_Reader_Manager();
		
		return frm;

	}
	
}
