package mcframe.clientMAUD.MAUDP0030;

import mcframe.commonCore.container.MCConstRow;

public interface IfRLBase_MC extends mcframe.clientFXBA.FXBAP0050.IfRLBase {

	/**
	 * 画面ステータス
	 */
	public void setUPDStatus();
	public void setDELStatus();

	public String getUPDStatus();
	public String getDELStatus();

	/**
	 * 検索条件が格納されるRow
	 */
	public MCConstRow getCndR();

	/**
	 * 操作種別が「登録」
	 */
	public boolean isUpdOpe();
	/**
	 * 操作種別が「削除（管理者）」
	 */
	public boolean isDelOpe();

	/**
	 * 「更新カウンタ」のカラム名（デフォルトは"upd_cntr"。）
	 */
	public String getUpdCntrColumn();
}
