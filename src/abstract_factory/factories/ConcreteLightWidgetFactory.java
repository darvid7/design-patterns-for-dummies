package abstract_factory.factories;

import abstract_factory.scrollbar.LightScrollBar;
import abstract_factory.window.LightWindow;

/**
 * @author David Lei (david.anthony.lei@gmail.com)
 * @since 4/06/2017
 */

public class ConcreteLightWidgetFactory extends AbstractWidgetFactory {

    public ConcreteLightWidgetFactory() {}

    public LightWindow createWindow() {
        return new LightWindow();
    }

    public LightScrollBar createScrollBar() {
        return new LightScrollBar();

    }
}
