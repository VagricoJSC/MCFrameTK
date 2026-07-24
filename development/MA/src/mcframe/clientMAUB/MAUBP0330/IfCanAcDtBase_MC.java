package mcframe.clientMAUB.MAUBP0330;

import mcframe.clientCore.beans.*;

public interface IfCanAcDtBase_MC {

	/**
	 * 計上日取得
	 * 
	 * @param panel
	 * @return
	 */
	public MCBeans getAcDtBeans(MCRootPanel panel);

	/**
	 * 操作種別取得
	 * 
	 * @param panel
	 * @return
	 */
	public MCBeans getScreenOpeBeans(MCRootPanel panel);

	/**
	 * 初期値設定操作種別判定
	 * 
	 * @param panel
	 * @return
	 */
	public boolean isCanAcDtValueInitOpe(MCRootPanel panel);

	/**
	 * 選択チェック取得
	 * 
	 * @param panel
	 * @return
	 */
	public MCBeans getCheckBeans(MCRootPanel panel);
}
