package com.cod.mvc.controller;

import com.cod.mvc.Model.Coche;
import com.cod.mvc.Model.Model;

public interface Observer {
    void update(Coche coche, Model model);
}