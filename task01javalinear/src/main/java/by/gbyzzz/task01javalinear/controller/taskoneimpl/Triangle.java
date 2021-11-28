package by.gbyzzz.task01javalinear.controller.taskoneimpl;

import by.gbyzzz.task01javalinear.dal.FileReader;
import by.gbyzzz.task01javalinear.dal.IOXML;
import by.gbyzzz.task01javalinear.entity.Data;
import by.gbyzzz.task01javalinear.service.GeometryService;
import by.gbyzzz.task01javalinear.view.IOData;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Triangle {
    static Data in = new Data();
    static Data out = new Data();
    IOData io = new IOData();
    GeometryService gs = new GeometryService();
    IOXML XMLIn = new IOXML();
    FileReader FileIn = new FileReader();

    public void input(int i) throws ParserConfigurationException, SAXException, IOException {
        io.output("Enter the side of the triangle:");
        switch (i){
            case 1: in.add(io.input());
                break;
            case 2:
                break;
            case 3: in.add(XMLIn.readXML().get(0));
                break;
            default: break;
        }

    }

    public void calculations (){
        out.add(gs.triangleHeight(in.get(0)));
        out.add(gs.triangleDesR(in.get(0)));
        out.add(gs.triangleInR(in.get(0)));
        out.add(gs.triangleSq(in.get(0)));
        in.clear();
    }
    public void consoleOutput() {
        io.output("Results:");
        io.output("Height = ", out.get(0));
        io.output("R = ", out.get(1));
        io.output("r = ", out.get(2));
        io.output("S = ", out.get(3));
        out.clear();
    }
}
