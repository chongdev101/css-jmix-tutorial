package com.company.cssjmixtutorial.screen.product;

import io.jmix.ui.screen.*;
import com.company.cssjmixtutorial.entity.Product;

@UiController("Product.edit")
@UiDescriptor("product-edit.xml")
@EditedEntityContainer("productDc")
public class ProductEdit extends StandardEditor<Product> {
}