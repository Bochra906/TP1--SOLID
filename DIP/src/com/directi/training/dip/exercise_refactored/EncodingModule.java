package com.directi.training.dip.exercise_refactored;

import java.io.IOException;
import java.util.Base64;

public class EncodingModule
{   
    IReader reader ;
    IWriter writer ; 
    
    public encodingModule(IReader reader , IWriter writer ) {
        this.reader=reader ; 
        this.writer = writer ; 
    }
        
    public void encode() throws IOException
    {
        String aLine = reader.read();
        String encodedLine = Base64.getEncoder().encodeToString(aLine.getBytes());
        writer.write(encodedLine);
    }
}

