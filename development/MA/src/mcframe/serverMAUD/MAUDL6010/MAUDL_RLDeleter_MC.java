package mcframe.serverMAUD.MAUDL6010;

import mcframe.commonCore.container.MCRow;

abstract public class MAUDL_RLDeleter_MC extends MAUDL_RLUpdater {
	@Override
	protected void up() {
		setDeleteStatus();

		super.up();
	}
	/**
	 * 上りのコンテナのステータスをDELETEに設定する。
	 */
	protected void setDeleteStatus() {
		up(0).setStatus(MCRow.DELETE);
	}
}
