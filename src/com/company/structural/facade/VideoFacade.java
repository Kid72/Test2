package com.company.structural.facade;

public class VideoFacade {
    public static void convertFile(String fileName, String format){
        if(format.equals("mp4")){
            MPEG4Codec mpeg4Codec = new MPEG4Codec();
            mpeg4Codec.encodeVideo(fileName);
        }else if(format.equals("mpg")){
            VideoCodec videoCodec = new VideoCodec();
            videoCodec.encodeVideo(fileName);
        }



        System.out.println(fileName + " coded in format : " + format);

    }

}
