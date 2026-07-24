package mcframe.clientMAUB.MAUBP5210;

import mcframe.clientCore.beans.table.*;




public class HrrchyKeyAction_MC {


	/**
	 * 階層を展開／閉じる。
	 */
	public void doExpand(MCTable<?> tbl) {
		MAUBP_Hrrchy_D p = findMAUBP_Hrrchy_D(tbl);
		if (p == null) {
			return;
		}
		p.doExtChng();
	}

	/**
	 * 階層を全展開。
	 */
	public void doExpandAll(MCTable<?> tbl) {
		MAUBP_Hrrchy_D p = findMAUBP_Hrrchy_D(tbl);
		if (p == null) {
			return;
		}
		p.expandAll();
	}

	/**
	 * 階層を全閉じ。
	 */
	public void doCollapseAll(MCTable<?> tbl) {
		MAUBP_Hrrchy_D p = findMAUBP_Hrrchy_D(tbl);
		if (p == null) {
			return;
		}
		p.collapseAll();
	}
	
	protected MAUBP_Hrrchy_D findMAUBP_Hrrchy_D(MCTable<?> tbl) {
		if (tbl.getRootPanel() instanceof MAUBP_Hrrchy_D) {
			return (MAUBP_Hrrchy_D)tbl.getRootPanel();
		}
		MAUBP_Hrrchy_D tmp = null;
		for (MCTable<?> part :tbl.getPartsTables()) {
			if ((tmp = findMAUBP_Hrrchy_D(part)) != null) {
				return tmp;
			}
		}
		return null;
	}
}
