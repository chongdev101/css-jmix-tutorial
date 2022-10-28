package com.company.cssjmixtutorial.screen.home;

import io.jmix.ui.component.CssLayout;
import io.jmix.ui.component.LayoutClickNotifier;
import io.jmix.ui.navigation.Route;
import io.jmix.ui.screen.Screen;
import io.jmix.ui.screen.Subscribe;
import io.jmix.ui.screen.UiController;
import io.jmix.ui.screen.UiDescriptor;
import org.springframework.beans.factory.annotation.Autowired;

@UiController("HomeScreen")
@UiDescriptor("home-screen.xml")
@Route("home")
public class HomeScreen extends Screen {

    private boolean showContent = false;
    @Autowired
    private CssLayout cardContent;
    @Autowired
    private CssLayout cardHeader;

    @Subscribe
    public void onInit(InitEvent event) {

    }

    @Subscribe("cardHeader")
    public void onCardHeaderLayoutClick(LayoutClickNotifier.LayoutClickEvent event) {
        showContent = !showContent;

        if(showContent){
            cardHeader.addStyleName("is-active");
        }
        else {
            cardHeader.removeStyleName("is-active");
        }

        cardContent.setVisible(showContent);
    }
}