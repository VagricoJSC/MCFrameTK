package mcframe.clientMAUD.MAUDP1010;

public interface IfRLBase_MC extends mcframe.clientMAUD.MAUDP0030.IfRLBase {

	/**
	 * 画面ステータス
	 */
	public void setUPD_ADMINStatus();
	public void setREFStatus();
	public void setMODStatus();

	public String getUPD_ADMINStatus();
	public String getREFStatus();
	public String getMODStatus();

	/**
	 * 操作種別が「登録（管理者）」
	 */
	public boolean isUpdAdminOpe();
	/**
	 * 操作種別が「参照」
	 */
	public boolean isRefOpe();
	/**
	 * 操作種別が「訂正」
	 */
	public boolean isModOpe();
}
