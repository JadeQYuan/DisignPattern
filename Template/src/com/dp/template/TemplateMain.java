package com.dp.template;

public class TemplateMain {

    public static void main(String[] args) {
        AbstractTemplate template = new TemplateA();
        template.execute();

        template = new TemplateB();
        template.execute();
    }

}
