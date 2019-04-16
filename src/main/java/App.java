import java.util.HashMap;

import java.util.Map;
import java.util.ArrayList;
import java.util.List;


import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
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

//
//        // get and POST methods for Squad
//        get("/squad/new",(request, response) -> {
//            Map<String,Object> model = new HashMap<String,Object>();
//            model.put("template","templates/squad.vtl");
//            return new ModelAndView(model, layout);
//        }, new VelocityTemplateEngine());


        //Get Method for Squads page
//        get("/squad", (request, response) -> {
//
//            Map<String, Object> model = new HashMap<String, Object>();
//            String name = request.queryParams("name");
//
//            model.put("squad", Squad.all());
//
//            model.put("template", "templates/squad.vtl");
//
//            return new ModelAndView(model, layout);
//
//        }, new VelocityTemplateEngine());


        get("/squads/new", (request, response) -> {

            Map<String, Object> model = new HashMap<String, Object>();
//            String name = request.queryParams("name");

//            model.put("squad", Squad.all());

            model.put("template", "templates/squadform.vtl");

            return new ModelAndView(model, layout);

        }, new VelocityTemplateEngine());


        post("/squads", (request, response) -> {

            Map<String, Object> model = new HashMap<>();

            String name = request.queryParams("squadName");

            String cause = request.queryParams("squadCause");

            int size = Integer.parseInt(request.queryParams("squadSize"));

            Squad mySquad = new Squad(name, size, cause);

            model.put("template", "templates/squadsuccess.vtl");

            return new ModelAndView(model, layout);

        }, new VelocityTemplateEngine());


        get("/squads", (request, response) -> {

            Map<String, Object> model = new HashMap<String, Object>();

            model.put("squads", Squad.all());

            model.put("template", "templates/squads.vtl");

            return new ModelAndView(model, layout);

        }, new VelocityTemplateEngine());

        get("/squads/:id", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            Squad squad = Squad.find(Integer.parseInt(request.params(":id")));
            model.put("squad", squad);
            model.put("template", "templates/squad.vtl");
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());


        get("/squads/:id/heroes/new", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            Squad squad = Squad.find(Integer.parseInt(request.params(":id")));
            model.put("squad", squad);
            model.put("template", "templates/heroform.vtl");
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());





        //Post Method for Heros
        post("/heroes", (request, response) ->{
            Map<String, Object> model = new HashMap<String, Object>();
            String name = request.queryParams("heroName");
            String power = request.queryParams("heroPower");
            String weakness = request.queryParams("heroWeakness");
            int age = Integer.parseInt(request.queryParams("heroAge"));
            Hero myHero = new Hero(name, age, power, weakness);
            Squad squad = Squad.find(Integer.parseInt(request.queryParams("squadId")));
            squad.addHero(myHero);
            model.put("template", "templates/herosuccess.vtl");
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

        get("/heroes", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            Squad squad = Squad.find(Integer.parseInt(request.queryParams("squadId")));
            String name = request.queryParams("heroName");
            String power = request.queryParams("heroPower");
            String weakness = request.queryParams("heroWeakness");
            int age = Integer.parseInt(request.queryParams("heroAge"));
            Hero myHero = new Hero(name,age,power,weakness);

            squad.addHero(myHero);

            model.put("squad", squad);
            model.put("template", "templates/herosuccess.vtl");

            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());


        post("/heroes", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            Squad squad = Squad.find(Integer.parseInt(request.queryParams("squadId")));
            String name = request.queryParams("heroName");
            String power = request.queryParams("heroPower");
            String weakness = request.queryParams("heroWeakness");
            int age = Integer.parseInt(request.queryParams("heroAge"));
            Hero myHero = new Hero(name,age,power,weakness);

            squad.addHero(myHero);

            model.put("squad", squad);
            model.put("template", "templates/herosuccess.vtl");

            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

//        get("/squads/:id", (request, response) -> {
//            Map<String, Object> model = new HashMap<String, Object>();
//            Squad squad = Squad.find(Integer.parseInt(request.params(":id")));
//            model.put("squad", squad);
////            model.put("heroes", hero.getHeroes());
//            model.put("template", "templates/squad.vtl");
//            return new ModelAndView(model, layout);
//        }, new VelocityTemplateEngine());

//        get("/heroes/:id", (request, response) -> {
//            HashMap<String, Object> model = new HashMap<String, Object>();
//            Hero hero = Hero.find(Integer.parseInt(request.params(":id")));
//            model.put("hero", hero);
//            model.put("template", "templates/hero.vtl");
//            return new ModelAndView(model, layout);
//        }, new VelocityTemplateEngine());




    }
}
