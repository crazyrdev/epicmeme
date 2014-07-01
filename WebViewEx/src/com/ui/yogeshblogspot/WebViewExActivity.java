package com.ui.yogeshblogspot;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View;
import android.webkit.WebSettings.LayoutAlgorithm;
import android.webkit.WebView;
import android.widget.Toast;

public class WebViewExActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        

        String imageUrl = "http://www.avajava.com/images/avajavalogo.jpg";
        
     
        
        
        
        WebView wv=(WebView)findViewById(R.id.webView1);
//    	wv.setHorizontalScrollBarEnabled(false);
//     	wv.getSettings().setUseWideViewPort(false);
//     	wv.getSettings().setLayoutAlgorithm(LayoutAlgorithm.SINGLE_COLUMN);
//        wv.getSettings().setSupportZoom(true);
//        wv.getSettings().setBuiltInZoomControls(true);
//      
//    	wv.loadUrl("file:///android_asset/welcome.html");
        
        // (*) this line make uses of the Zoom control
        wv.getSettings().setBuiltInZoomControls(true);
        // simply, just load an image
        this.registerForContextMenu(wv);
        wv.loadUrl("file:///android_asset/welcome.html");
        
        
        
        
        
        imageUrl =  "file:///android_asset/1395582290546.png";
        try { 
            //KEREN
//       	 Log.v(str_pol, "KAMPER ssc");
//        	 AssetManager am = getAssets();
//        	 Log.v(str_pol, "KAMPER ddddd");
//       
//         	
//    		 InputStream is = (InputStream) am.open("1395582290546.png");
//			 Log.v(str_pol, "jojo c");
//			  String[]  resulta = imageUrl.split("/");
//			  File  file = new File(Environment.getExternalStoragePublicDirectory(
//		    Environment.DIRECTORY_DOWNLOADS),"/"+resulta[resulta.length-1]);
//			  
//			  
//			  file = new File(Environment.getExternalStoragePublicDirectory(
//					    Environment.DIRECTORY_DOWNLOADS),"/avalon.png");
//			  
//			  Log.v(str_pol, "jojod");
//			
//		
//			 
//			 
//			  byte[] buffer = new byte[1024];
//			  int bytesRead;
//	
//			  FileOutputStream  output = new FileOutputStream (file);
//			  Log.v(str_pol, "jojoeeee");
//			  while ((bytesRead = is.read(buffer)) != -1) {
//			    output.write(buffer, 0, bytesRead);
//			  }
//			  Log.v(str_pol, "jojo s");
//			  output.close();
        	//Ini Juga Keren
//        	
//        	Thread myrunnable = new Thread(new cumi()); //Thread created      	
//        	myrunnable.start();


//   		String destinationFile = "image.jpg";

//   		saveImage(imageUrl, Environment.getExternalStoragePublicDirectory(   Environment.DIRECTORY_DOWNLOADS) + "/" +destinationFile);
//   		 Toast.makeText(this, imageUrl+" saver "+  this.getFilesDir(), Toast.LENGTH_LONG).show();
       }catch (Exception a){
//     	  Toast.makeText(this, imageUrl+" TAI", Toast.LENGTH_LONG).show();
     	
     } 
       
    }
	public static String str_pol = "/pol/";
	public static void trip () {

		Log.v( str_pol, " ");
		Log.v( str_pol, " ");
		Log.v( str_pol, " ");
	}
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenuInfo menuInfo) {
        // Confirm the view is a webview
        if (v instanceof WebView) {                
            WebView.HitTestResult result = ((WebView) v).getHitTestResult();

            if (result != null) {
                int type = result.getType();

                // Confirm type is an image
                if (type == WebView.HitTestResult.IMAGE_TYPE || type == WebView.HitTestResult.SRC_IMAGE_ANCHOR_TYPE) {
                    String imageUrl = result.getExtra();
                    
                    
                    
                    
                    
                 
                    try { 
                        cumi ss = new cumi();
                        ss.imageUrl = imageUrl;
                    	Thread myrunnable = new Thread(ss); //Thread created      

                    	
                    	myrunnable.start();


//               		String destinationFile = "image.jpg";

//               		saveImage(imageUrl, Environment.getExternalStoragePublicDirectory(   Environment.DIRECTORY_DOWNLOADS) + "/" +destinationFile);
//               		 Toast.makeText(this, imageUrl+" saver "+  this.getFilesDir(), Toast.LENGTH_LONG).show();
                   }catch (Exception a){
//                 	  Toast.makeText(this, imageUrl+" TAI", Toast.LENGTH_LONG).show();
                 	
                 } 
                    
                    
                    
                    
                    
                    
//                    Toast.makeText(this, imageUrl, Toast.LENGTH_LONG).show();
                   
           
                    try {
                   
                    	
//                    	File myFile = new File(Environment.getExternalStorageDirectory().getAbsolutePath()+"mysdfile.txt");
//            			myFile.createNewFile();
//            			FileOutputStream fOut = new FileOutputStream(myFile);
//            			OutputStreamWriter myOutWriter = 
//            									new OutputStreamWriter(fOut);
//            			myOutWriter.append("txtData.getText()");
//            			myOutWriter.close();
//            			fOut.close();
                    	
                    	
//                    	String baseDir = Environment.getExternalStorageDirectory().getAbsolutePath();
//                    	String fileName = "myFile.txt";
//
//                    	// Not sure if the / is on the path or not
//                    	File file = new File(baseDir + File.separator + fileName);
////                        File file = new File( Environment.getExternalStorageDirectory().getAbsolutePath(), "MyPicture.jpg");
//                           // the Pictures directory exists? 
//                    	file.mkdirs();
//                            InputStream is = getResources().openRawResource(R.drawable.miku);
//                            OutputStream os = new FileOutputStream(file);
//                            byte[] data = new byte[is.available()];
//                            is.read(data);
//                            os.write(data);
//                            is.close();
//                            os.close();
                    	
//                        String test =imageUrl;
//                        String[] resulta = test.split("/");
//                    	trip();
//                        Log.v( str_pol, "resulta "+resulta[resulta.length-1]);
//                        trip();
                    	
                    	
//                    	File myFile = new File(Environment.getExternalStoragePublicDirectory(
//				                Environment.DIRECTORY_DOWNLOADS),"/"+filename);
//						myFile.createNewFile();
//						FileOutputStream fOut = new FileOutputStream(myFile);
//						OutputStreamWriter myOutWriter = 
//												new OutputStreamWriter(fOut);
//						myOutWriter.append(data);
//						myOutWriter.close();
//						fOut.close();
//                    	 URL url = new URL (imageUrl);
//                         InputStream input = url.openStream();
//                         String[] resulta = imageUrl.split("/");
//                        File storagePath  = new File(Environment.getExternalStoragePublicDirectory(
//				                Environment.DIRECTORY_DOWNLOADS),"/"+resulta[resulta.length-1]);
//                        storagePath.createNewFile();
//                        OutputStream output = new FileOutputStream (storagePath);
//                        try {
//                            byte[] buffer = new byte[1024];
//                            int bytesRead = 0;
//                            while ((bytesRead = input.read(buffer, 0, buffer.length)) >= 0) {
//                                output.write(buffer, 0, bytesRead);
//                            }
//                        } finally {
//                            output.close();
//                        }
              
                    	
                    	
                    	
//                    	 imageUrl = "http://www.avajava.com/images/avajavalogo.jpg";
                    	 imageUrl = "http://www.avajava.com/images/avajavalogo.jpg";
                    	URL url = new URL(imageUrl);
                    	
                		InputStream is  = null;
//                		 imageUrl = "http://www.avajava.com/images/avajavalogo.jpg";
                		 is = url.openConnection().getInputStream();
//                		 is = (InputStream) new URL(imageUrl).getContent();
                    	 //bener
//                    	 String[] resulta = imageUrl.split("/");
//                		  File storagePath  = new File(Environment.getExternalStoragePublicDirectory(
//  				                Environment.DIRECTORY_DOWNLOADS),"/"+resulta[resulta.length-1]);
//                		  storagePath.createNewFile();
//                			FileOutputStream fOut = new FileOutputStream(storagePath);
//                		  
//              			OutputStreamWriter myOutWriter = 
//								new OutputStreamWriter(fOut);
//		myOutWriter.write("PANASSS");
//		myOutWriter.close();
//		fOut.close();
                		  
//                		OutputStream os = new FileOutputStream(storagePath);
//
//                		byte[] b = new byte[2048];
//                		int length;
//
//                		while ((length = is.read(b)) != -1) {
//                			os.write(b, 0, length);
//                		}
//
//                		is.close();
//                		os.close();
                    	
                    	
//                        input.close();
//                        Toast.makeText(this, imageUrl+" saver "+  this.getFilesDir(), Toast.LENGTH_LONG).show();
                        
//                        Toast.makeText(this, imageUrl+" saver "+   Environment.getExternalStorageDirectory().getAbsolutePath(), Toast.LENGTH_LONG).show();
                    }catch (Exception a){
//                    	  Toast.makeText(this, imageUrl+" a sad", Toast.LENGTH_LONG).show();
                    	
                    } 
                    
                
                }
            }
        }
    }
    
    
    
	public static void saveImage(String imageUrl, String destinationFile) throws Exception {
//		URL url = new URL(imageUrl);
//		InputStream is = url.openStream();
//		OutputStream os = new FileOutputStream(destinationFile);
//
//		byte[] b = new byte[2048];
//		int length;
//
//		while ((length = is.read(b)) != -1) {
//			os.write(b, 0, length);
//		}
//
//		is.close();
//		os.close();
		
		
	 
//		  URL url = new URL(imageUrl);
//		  HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
//		  urlConnection.setRequestMethod("GET");
//		  urlConnection.setDoOutput(true);                   
//		  urlConnection.connect();                  
//		  File SDCardRoot = Environment.getExternalStorageDirectory().getAbsoluteFile();
//		  
//		  
//		  
//		  
//		  String filename="downloadedFile.png";   
//		  Log.i("Local filename:",""+filename);
//		  File file = new File(SDCardRoot,filename);
//		  
////		  String[]  resulta = imageUrl.split("/");
////		  file = new File(Environment.getExternalStoragePublicDirectory(
////        Environment.DIRECTORY_DOWNLOADS),"/"+resulta[resulta.length-1]);
//		  
//		  if(file.createNewFile())
//		  {
//		    file.createNewFile();
//		  }                 
//		  FileOutputStream fileOutput = new FileOutputStream(file);
//		  InputStream inputStream = urlConnection.getInputStream();
//		  int totalSize = urlConnection.getContentLength();
//		  int downloadedSize = 0;   
//		  byte[] buffer = new byte[1024];
//		  int bufferLength = 0;
//		  while ( (bufferLength = inputStream.read(buffer)) > 0 ) 
//		  {                 
//		    fileOutput.write(buffer, 0, bufferLength);                  
//		    downloadedSize += bufferLength;                 
//		    Log.i("Progress:","downloadedSize:"+downloadedSize+"totalSize:"+ totalSize) ;
//		  }             
//		  fileOutput.close();
		
		  Log.v(str_pol, "jojo");
		 URL url = new URL(imageUrl);

		   //create the new connection

		   HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
		   Log.v(str_pol, "taro");
		   //set up some things on the connection

		   urlConnection.setRequestMethod("GET");
		   Log.v(str_pol, "kam[ret");
		  urlConnection.setDoOutput(true);
		  Log.v(str_pol, "joyline");

		  //and connect!

		  urlConnection.connect();
		  Log.v(str_pol, "konlah");
		  //set the path where we want to save the file

		  //in this case, going to save it on the root directory of the

		  //sd card.

		  File SDCardRoot = new File("/sdcard/"+"result/");
		  Log.v(str_pol, "kujo");

		  //create a new file, specifying the path, and the filename

		  //which we want to save the file as.

		  File file = new File(SDCardRoot,"filename.format");
		  
		  
		  Log.v(str_pol, "o");
		  
	  String[]  resulta = imageUrl.split("/");
	  file = new File(Environment.getExternalStoragePublicDirectory(
    Environment.DIRECTORY_DOWNLOADS),"/"+resulta[resulta.length-1]);
		  
		  

		  //this will be used to write the downloaded data into the file we created

		  FileOutputStream fileOutput = new FileOutputStream(file);

		  //this will be used in reading the data from the internet

		  InputStream inputStream = urlConnection.getInputStream();
		  Log.v(str_pol, "ya");
		  //this is the total size of the file

		  int totalSize = urlConnection.getContentLength();

		  //variable to store total downloaded bytes

		  int downloadedSize = 0;

		  //create a buffer...

		  byte[] buffer = new byte[1024];

		  int bufferLength = 0; //used to store a temporary size of the buffer

		  //now, read through the input buffer and write the contents to the file

		  while ( (bufferLength = inputStream.read(buffer)) > 0 ) 

		  {

		  //add the data in the buffer to the file in the file output stream (the file on the sd card

		  fileOutput.write(buffer, 0, bufferLength);

		  //add up the size so we know how much is downloaded

		  downloadedSize += bufferLength;

		  int progress=(int)(downloadedSize*100/totalSize);

		  //this is where you would do something to report the prgress, like this maybe

		  //updateProgress(downloadedSize, totalSize);

		  }
		  Log.v(str_pol, "haha");
		  //close the output stream when done

		  fileOutput.close();
		
	}
    
    public void showHtmlFromAssets(View v)
    {
    	WebView wv=(WebView)findViewById(R.id.webView1);
    	wv.setHorizontalScrollBarEnabled(false);
     	wv.getSettings().setUseWideViewPort(false);
     	wv.getSettings().setLayoutAlgorithm(LayoutAlgorithm.SINGLE_COLUMN);
    	wv.loadUrl("file:///android_asset/welcome.html");
    	
    }
    public void showDynamicMarkup(View v)
    {
    WebView wv=(WebView)findViewById(R.id.webView1);
    	String data = "<html>"  +  
        "<body><h1><font color=green>Welcome to YogeshBlogSpot.com</font></h1></body>"  +  
        "</html>";
        wv.loadData(data, "text/html", "UTF-8"); 
    }
}





class cumi implements Runnable{
	public static String str_pol = "/pol/";
	public  String imageUrl = "http://www.avajava.com/images/avajavalogo.jpg";
	@Override
	public void run() {
//		xelnaga ();
		cars ();
	}
	
void cars () {
	  imageUrl =  "file:///android_asset/1395582290546.png";
		try { 
			  Log.v(str_pol, "jojo taro");
				 URL url = new URL(imageUrl);
				  Log.v(str_pol, "jojo kenapes");
				  
				  
				  
				  
//				  AssetManager am = getAssets();
			
				  
				  URLConnection connection;
				    connection = url.openConnection();
				    Log.v(str_pol, "jojo TAE WUG");
				    
//				    Object response = connection.getContent();
				    Log.v(str_pol, "jojo LOL " + connection.getContent());
				    
				 InputStream is = (InputStream) connection.getContent();
				 Log.v(str_pol, "jojo c");
				  String[]  resulta = imageUrl.split("/");
//				  File  file = new File(Environment.getExternalStoragePublicDirectory(
//			    Environment.DIRECTORY_DOWNLOADS),"/"+resulta[resulta.length-1]);
				  Log.v(str_pol, "jojod");
				
			
				 
				 
				  byte[] buffer = new byte[8192];
				  int bytesRead;
		
				  ByteArrayOutputStream  output = new ByteArrayOutputStream ();
				  Log.v(str_pol, "jojoeeee");
				  while ((bytesRead = is.read(buffer)) != -1) {
				    output.write(buffer, 0, bytesRead);
				  }
				  Log.v(str_pol, "jojo s");
				  output.close();
			}catch (Exception a){}
		
	}
	
	
	
	
	
	
	
	
	
	
	void xelnaga () {
		
		try { 
			  Log.v(str_pol, "jojo");
				 URL url = new URL(imageUrl);

				   //create the new connection

				   HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
				   Log.v(str_pol, "taro");
				   //set up some things on the connection

				   urlConnection.setRequestMethod("GET");
				   Log.v(str_pol, "kam[ret");
				  urlConnection.setDoOutput(true);
				  Log.v(str_pol, "joyline");

				  //and connect!

				  urlConnection.connect();
				  Log.v(str_pol, "konlah");
				  //set the path where we want to save the file

				  //in this case, going to save it on the root directory of the

				  //sd card.

				  File SDCardRoot = new File("/sdcard/"+"result/");
				  Log.v(str_pol, "kujo");

				  //create a new file, specifying the path, and the filename

				  //which we want to save the file as.

				  File file = new File(SDCardRoot,"filename.format");
				  
				  
				  Log.v(str_pol, "o");
				  
			  String[]  resulta = imageUrl.split("/");
			  file = new File(Environment.getExternalStoragePublicDirectory(
		    Environment.DIRECTORY_DOWNLOADS),"/"+resulta[resulta.length-1]);
				  
				  

				  //this will be used to write the downloaded data into the file we created

				  FileOutputStream fileOutput = new FileOutputStream(file);

				  //this will be used in reading the data from the internet

				  InputStream inputStream = urlConnection.getInputStream();
				  Log.v(str_pol, "ya");
				  //this is the total size of the file

				  int totalSize = urlConnection.getContentLength();

				  //variable to store total downloaded bytes

				  int downloadedSize = 0;

				  //create a buffer...

				  byte[] buffer = new byte[1024];

				  int bufferLength = 0; //used to store a temporary size of the buffer

				  //now, read through the input buffer and write the contents to the file

				  while ( (bufferLength = inputStream.read(buffer)) > 0 ) 

				  {

				  //add the data in the buffer to the file in the file output stream (the file on the sd card

				  fileOutput.write(buffer, 0, bufferLength);

				  //add up the size so we know how much is downloaded

				  downloadedSize += bufferLength;

				  int progress=(int)(downloadedSize*100/totalSize);

				  //this is where you would do something to report the prgress, like this maybe

				  //updateProgress(downloadedSize, totalSize);

				  }
				  Log.v(str_pol, "haha");
				  //close the output stream when done

				  fileOutput.close();
			}catch (Exception a){}
		
	}
	
	
}