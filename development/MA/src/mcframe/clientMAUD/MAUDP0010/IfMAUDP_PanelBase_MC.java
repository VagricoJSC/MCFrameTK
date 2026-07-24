package mcframe.clientMAUD.MAUDP0010;

import java.util.Set;

import mcframe.clientCore.beans.MCModeBeans;

public interface IfMAUDP_PanelBase_MC {
	
	/**
	 * システムパラメータを取得しキャッシュします。
	 * 
	 * @param parm_key パラメータキー
	 * @return  システムパラメータ
	 */
	public String getSysParm(String parm_key);

	/**
	 * 画面遷移時に値連携の調整対象となる表示制御キーを取得します。<br>
	 * コンテナ拡張項目「DISP_CTL」が未設定の項目が値連携の調整対象である場合、表示制御キーの取得対象です。
	 * @return 表示制御キー、または null
	 */
	public default Set<String> getDispCtl2CompsKeys() {
		return null;
	}
	/**
	 * 表示制御キーに対する項目を取得します。<br>
	 * コンテナ拡張項目「DISP_CTL」未設定の項目が対象です。
	 * @param dispCtlKey 表示制御キー
	 * @return 表示制御キーに対する項目、または null
	 */
	public default Set<MCModeBeans> getDispCtl2CompsValue(String dispCtlKey) {
		return null;
	}
	
}
