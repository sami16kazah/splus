package Semantics_Check;

import java.util.List;

public class Semantic_Check {

    public boolean project_name(List<String> basic){
        boolean exception = false;

            if(basic.get(1).contains("name")){
                exception = true;
            }

        if(!exception)
        {
            System.out.println("exception the project dosent has a name or it's not the first decleration !");
            return exception;
        }
        //System.out.println("the project has a name");
        return exception;
    }

    public boolean auth_is_acceptable(List<String> basic){
        boolean exception = false;
        for (int i = 0; i < basic.size(); i++) {
            if(basic.get(i)!=null){
                if(basic.get(i).contains("auth")){
                    for (int j = i; j > 0 ; j--) {
                        if (basic.get(j)!=null)
                        if(basic.get(j).contains("login")){
                            //System.out.println("the auth is acceptable");
                            exception = true;
                            break;
                        }
                        if(basic.get(j).contains("signUp")){
                            //System.out.println("the auth is acceptable");
                            exception = true;
                            break;
                        }

                    }
                    if(!exception)
                    {
                        System.out.println("exception auth is not acceptable without login or signUp");
                    }
                    break;
                }
            }
        }

        return exception;
    }

    public boolean inject_user_is_acceptable(List<String> basic) {
        boolean exception = false;
        for (int i = 0; i < basic.size(); i++) {
            if(basic.get(i)!=null){
                if(basic.get(i).contains("injectUser")){
                    for (int j = i; j > 0 ; j--) {
                        if (basic.get(j)!=null)
                            if(basic.get(j).contains("auth")){
                               // System.out.println("the injection is possible");
                                exception = true;
                                break;
                            }


                    }
                    if(!exception)
                    {
                        System.out.println("exception injection is not acceptable without auth!");
                    }
                    break;
                }
            }
        }

        return exception;
    }

    public boolean valid_Controller(List<String> pages , String Name_of_controller){
        boolean exception = false;
        for (int i = 0; i < pages.size(); i++) {
            if(pages.get(i)!=null)
            {

                if(pages.get(i).contains(Name_of_controller.replaceAll(" ","")))
                {
                   // System.out.println("the " + Name_of_controller + "Controller is accepted");
                    return exception =true;
                }
            }
        }
        System.out.println("exception the " + Name_of_controller + "Controller is not accepted must come after declearing a page!");
        return exception;
    }

    public boolean valid_Style(List<String> pages , String Name_of_Page_Style){
        boolean exception = false;

        for (int i = 0; i < pages.size(); i++) {
            if(pages.get(i)!=null)
            {

                if(pages.get(i).contains(Name_of_Page_Style.replaceAll(" ","")))
                {
                    //System.out.println("the " + Name_of_Page_Style + "Style is accepted");
                    return exception =true;
                }
            }
        }
        System.out.println(" exception the " + Name_of_Page_Style + "Style is not accepted must come after declearing a page!");
        return exception;
    }

    public boolean valid_Form(List <String> forms , String Page_Name){
        boolean exception = false;
        for (int i = 0; i < forms.size(); i++) {
            if(forms.get(i)!=null){
                if(forms.get(i).equals(Page_Name)  )
                {
                    //System.out.println("the "+ Page_Name + " table is accepted");
                    return exception = true;
                }
            }
        }
        System.out.println("exception " +Page_Name + "  table dosent exist creat it first !");
        return exception ;
    }

}
