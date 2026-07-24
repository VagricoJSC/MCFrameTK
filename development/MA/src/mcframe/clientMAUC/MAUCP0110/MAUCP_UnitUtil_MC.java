package mcframe.clientMAUC.MAUCP0110;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import mcframe.clientCore.beans.action.*;
import mcframe.clientCore.beans.combobox.*;
import mcframe.clientCore.beans.*;
import mcframe.clientCore.event.*;
import mcframe.commonCore.lang.*;
import mcframe.commonCore.notice.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.container.MCRow.Status;
import mcframe.commonCore.container.MCList.SortType;
import mcframe.clientCore.beans.table.*;
import mcframe.clientCore.beans.tree.*;
import mcframe.clientCore.container.MCConstRow;


import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.commonCore.meta.MCMeta;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MAUCP_UnitUtil"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MAUCP_UnitUtil_MC extends MAUCP_UnitUtil_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	/**
	 * static メソッドでのアクセス用フィールド
	 */
	protected static MAUCP_UnitUtil _unit = new MAUCP_UnitUtil();
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUCP_UnitUtil_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START
	/**
	 * MCNumberからint値を取得する<br>
	 * nullの場合はゼロを返す
	 * 
	 * @param num 変換対象のMCNumber値
	 * @return int値
	 */
	public static int nullToZero(MCNumber num) {
		return _unit._nullToZero(num);
	}
	
	/**
	 * MCNumberからint値を取得する<br>
	 * nullの場合はゼロを返す
	 * 
	 * @param num 変換対象のMCNumber値
	 * @return int値
	 */
	protected int _nullToZero(MCNumber num) {
		return (num != null) ? num.intValue() : 0;
	}
	
	/**
	 * 数値フィールドの桁数を取得する。
	 * 
	 * @param meta メタ
	 * @param decPlace 小数部有効桁数
	 * @return 桁数
	 */
	public static int getLength(MCMeta meta, MCNumber decPlace) {
		return _unit._getLength(meta, decPlace);
	}
	
	/**
	 * 単位の小数部有効桁数に応じた数量の桁数を取得する
	 * 
	 * @param decPlace 
	 * @return 数量の桁数（整数部 + マスタの小数部有効桁数）
	 */
	protected int _getLength(MCMeta meta, MCNumber decPlace) {

		if (decPlace == null) {
			return 0;
		}

		return _getLength(meta, decPlace.intValue());

	}

	/**
	 * 数値フィールドの桁数を取得する。
	 * 
	 * @param meta メタ
	 * @param decPlace 小数部有効桁数
	 * @return 桁数
	 */
	public static int getLength(MCMeta meta, int decPlace) {
		return _unit._getLength(meta, decPlace);
	}

	/**
	 * 数量フィールドの桁数取得
	 * 
	 * @param decPlace 小数部有効桁数
	 * @return 数量の桁数（整数部 + マスタの小数部有効桁数）
	 */
	protected int _getLength(MCMeta meta, int decPlace) {
		return meta.length() - meta.scale() + decPlace;
	}
	
	/**
	 * 数値フィールドの桁数を設定する。
	 * 
	 * @param compo 数値フィールド
	 * @param decPlace 小数部有効桁数
	 */
	public static void setLength(MCNumberField compo, MCNumber decPlace) {
		_unit._setLength(compo, decPlace);
	}
	
	/**
	 * 数値フィールドの桁数設定
	 * 
	 * @param compo 数値フィールド
	 * @param decPlace 小数部有効桁数
	 */
	protected void _setLength(MCNumberField compo, MCNumber decPlace) {

		int scale = _nullToZero(decPlace);
		int length = _getLength(compo.getMeta(), decPlace);

		compo.setLength(length);
		compo.setScale(scale);

	}

}