package com.streetflo.miocat.util;

public class File {

	
	@RequestMapping(“/downloadImg”)
	@ResponseBody
	public ResponseEntity<Resource> downloadImg(@RequestParam Map<String, Object> param){
		
		
		
		
	String filePath = "파일 디렉토리 주소.";
	File target = new File(filePath);
	HttpHeaders header = new HttpHeaders();
	Resource rs = null;
	if(target.exists()) {
	try {
	String mimeType = Files.probeContentType(Paths.get(target.getAbsolutePath()));
	if(mimeType == null) {
	mimeType = “octet-stream”;
	}
	rs = new UrlResource(target.toURI());
	header.add(HttpHeaders.CONTENT_DISPOSITION, “attachment; filename=\””+ rs.getFilename() +”\””);
	header.setCacheControl(“no-cache”);
	header.setContentType(MediaType.parseMediaType(mimeType));
	}catch(Exception e) {
	e.printStackTrace();
	}
	}
	return new ResponseEntity<Resource>(rs, header, HttpStatus.OK);
	}
	
	
	
	@RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<?> uploadFile(
	    @RequestParam("uploadfile") MultipartFile uploadfile) {
	  
	  try {
	    // Get the filename and build the local file path (be sure that the 
	    // application have write permissions on such directory)
	    String filename = uploadfile.getOriginalFilename();
	    String directory = "/var/netgloo_blog/uploads";
	    String filepath = Paths.get(directory, filename).toString();
	    
	    // Save the file locally
	    BufferedOutputStream stream =
	        new BufferedOutputStream(new FileOutputStream(new File(filepath)));
	    stream.write(uploadfile.getBytes());
	    stream.close();
	  }
	  catch (Exception e) {
	    System.out.println(e.getMessage());
	    return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	  }
	  
	  return new ResponseEntity<>(HttpStatus.OK);
	} // method uploadFile
	
	
}
