package cn;

import freemarker.template.TemplateMethodModelEx;
import freemarker.template.TemplateModelException;

import java.util.List;

public class Test2Utils implements TemplateMethodModelEx {
    @Override
    public Object exec(List list) throws TemplateModelException {

        return list.get(0).toString().toUpperCase();
    }
}
