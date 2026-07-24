package mcframe.clientMSBC.MSBCP0290;

import mcframe.clientCore.fxgantt.design.MCXAGDesignMainControl;
import mcframe.clientCore.fxgantt.design.MCXAGDesignMainTable;
import mcframe.clientCore.fxgantt.design.MCXAGDesignNode;
import mcframe.clientCore.fxgantt.design.MCXAGDesignVector;

public class MSBCP_ItmOrdGanttChart_Vector_MC extends MCXAGDesignVector {

	/**
	 * スキンを初期化（必須）
	 *
	 * @param w
	 * @param h
	 */
	public void initLayer(double w, double h) {
		MCSDGDesignSkinBase skin = new MCSDGDesignSkinBase(this, w, h);
		setSkin(skin);
		pane.setPickOnBounds(true);
	}

	@Override
	public void init(int aVectorIndex, MCXAGDesignNode aFromNode, MCXAGDesignNode aToNode,
			MCXAGDesignMainTable aMainTable, MCXAGDesignMainControl aMainControl) {
		super.init(aVectorIndex, aFromNode, aToNode, aMainTable, aMainControl);
		hiliteLineColor = ((MSBCP_ItmOrdGanttChart_Gantt)_mainControl)._vector_line_color;
		hiliteLineWidthOffset = 0;

		setPickOnBounds(true);
		pane.setPickOnBounds(true);
	}

}
