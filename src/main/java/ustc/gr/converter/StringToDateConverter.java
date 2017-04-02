package ustc.gr.converter;


import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Black on 2017/4/2.
 */
public class StringToDateConverter implements Converter<String, Date> {

    private String datePattern;


    public void setDatePattern(String datePattern) {
        this.datePattern = datePattern;
    }

    @Override
    public Date convert(String date) {
        try{
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(this.datePattern);
            System.out.println("日期："+simpleDateFormat.parse(date));
            return simpleDateFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
            System.out.println("日期转换失败");
            return null;
        }
    }
}
