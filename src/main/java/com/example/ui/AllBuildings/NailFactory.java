package com.example.ui.AllBuildings;

import com.example.ui.AllMethods.Product;
import com.example.ui.Building;
import com.example.ui.Resource;

public class NailFactory extends Building {
    private Resource nails = new Resource("nails", 0);
    private Product product;
    public NailFactory(String name) {
        super(name);
        res.addAll(nails);
        product = new Product(res, "nailFactory");
    }
}
