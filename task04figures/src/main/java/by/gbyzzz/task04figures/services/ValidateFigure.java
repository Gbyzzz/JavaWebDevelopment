package by.gbyzzz.task04figures.services;

import by.gbyzzz.task04figures.beans.Figure;

interface ValidateFigure <T extends Figure>{
    boolean validate(T t);
}
