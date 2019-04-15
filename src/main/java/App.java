import java.util.HashMap;

import java.util.Map;


import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import static spark.Spark.*;

public class App {
    public static void main(String[] args){
        staticFileLocation("/public");
        String layout = "templates/layout.vtl";

//        ProcessBuilder process = new ProcessBuilder();
//        Integer port;
//        if (process.environment().get("PORT") != null) {
//            port = Integer.parseInt(process.environment().get("PORT"));
//        } else {
//            port = 4567;
//        }
//
//        setPort(port);

        //get method for homepage
        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("template", "templates/index.vtl");
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());


        // get and POST methods for Squad
        get("/squad/new",(request, response) -> {
            Map<String,Object> model = new HashMap<String,Object>();
            model.put("template","templates/squadForm.vtl");
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());


        //Get Method for Squads page
        get("/squad", (request, response) -> {

            Map<String, Object> model = new HashMap<String, Object>();
            String name = request.queryParams("name");

            model.put("squad", Squad.all());

            model.put("template", "templates/squad.vtl");

            return new ModelAndView(model, layout);

        }, new VelocityTemplateEngine());



    }



}
