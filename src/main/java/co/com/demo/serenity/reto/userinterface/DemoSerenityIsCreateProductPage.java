package co.com.demo.serenity.reto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DemoSerenityIsCreateProductPage {


    // Localizadores Clicks de la home page(pagina principal)

    public static final Target OPTION_NORTWHIND =
            Target.the("where do we write user").
                    located(By.xpath("//a[span[@class='s-sidebar-link-text' and text()='Northwind']]"));

    public static final Target OPTION_PRODUCT =
            Target.the("where do we write user").
                    located(By.xpath("//span[text()='Productos']"));

    public static final Target BUTTON_NEW_PRODUCT =
            Target.the("where do we write user").
                    located(By.xpath("//div[contains(@class, 'tool-button') and contains(@class, 'add-button') and contains(@class, 'icon-tool-button')][@data-action='add']"));

    //Localizadores para el formulario de crear el producto

    public static final Target NAME_PRODUCT =
            Target.the("where do we write user").
                    located(By.id("Serenity_Demo_Northwind_ProductDialog9_ProductName"));

    public static final Target FILE_IMG =
            Target.the("where do we write user").
                    located(By.xpath("//input[@type='file']"));

    public static final Target SELECT_PROVIDER =
            Target.the("where do we write user").
                    located(By.id("s2id_Serenity_Demo_Northwind_ProductDialog9_SupplierID"));

    public static final Target INPUT_TEXT_PROVIDER =
            Target.the("where do we write user").
                    located(By.id("s2id_autogen4_search"));

    public static final Target SELECT_CATEGORY =
            Target.the("where do we write user").
                    located(By.id("s2id_Serenity_Demo_Northwind_ProductDialog9_CategoryID"));

    public static final Target INPUT_TEXT_CATEGORY =
            Target.the("where do we write user").
                    located(By.id("s2id_autogen5_search"));

    public static final Target INPUT_QUANTITY_PER_UNIT
            =
            Target.the("where do we write user").
                    located(By.xpath("//input[@id='Serenity_Demo_Northwind_ProductDialog9_QuantityPerUnit']"));

    public static final Target INPUT_UNIT_PRICE
            =
            Target.the("where do we write user").
                    located(By.xpath("//input[@id='Serenity_Demo_Northwind_ProductDialog9_UnitPrice']"));

    public static final Target INPUT_IN_STOCK
            =
            Target.the("where do we write user").
                    located(By.xpath("//input[@id='Serenity_Demo_Northwind_ProductDialog9_UnitsInStock']"));

    public static final Target INPUT_UNITS_ON_ORDER
            =
            Target.the("where do we write user").
                    located(By.xpath("//input[@id='Serenity_Demo_Northwind_ProductDialog9_UnitsOnOrder']"));

    public static final Target INPUT_REORDER_LEVEL
            =
            Target.the("where do we write user").
                    located(By.xpath("//input[@id='Serenity_Demo_Northwind_ProductDialog9_ReorderLevel']"));

    public static final Target BUTTON_SAVE
            =
            Target.the("where do we write user").
                    located(By.xpath("//span[@class='button-inner'][contains(.,'Guardar')]"));

    public static final Target TEXT_PRODUCT
            =
            Target.the("where do we write user").
                    located(By.xpath("//a[contains(@class, 's-EditLink') and contains(@class, 's-ProductLink') and contains(text(), 'PRODUCTO3')]"));


    public static final Target INPUT_SEARCH
            =
            Target.the("where do we write user").
                    located(By.xpath("//input[contains(@id,'ProductGrid0_QuickSearchInput')]"));

}
