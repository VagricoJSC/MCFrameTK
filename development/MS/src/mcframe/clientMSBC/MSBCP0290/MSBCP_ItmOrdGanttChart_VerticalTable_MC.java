package mcframe.clientMSBC.MSBCP0290;

import java.util.ArrayList;
import java.util.List;

//import javafx.scene.input.ScrollEvent;
import mcframe.clientCore.fxgantt.label.MCXAGDesignVerticalTable;
import mcframe.clientCore.fxgantt.locale.MCXAGUserMessage;

public class MSBCP_ItmOrdGanttChart_VerticalTable_MC extends MCXAGDesignVerticalTable {

	// 親画面
	protected MSBCP_ItmOrdGanttChart panel;

	/**
	 *  コンストラクタ
	 * @param w
	 * @param h
	 */
	public MSBCP_ItmOrdGanttChart_VerticalTable_MC(double w,double h, MSBCP_ItmOrdGanttChart aPanel) {
		super(w,h);
		panel = aPanel;
	}

	/**
	 *  ポップアップメニュー
	 */
	@Override
	public List<ItemLabelMethod> getMenuItemLabels() {
		List<ItemLabelMethod> list = new ArrayList<ItemLabelMethod>();
		list.add(new ItemLabelMethod(panel.getDispString("gantt.VerticalTable_doDetailMenu"),
				"doDetailMenu"));
		return list;
	}

}
