package mcframe.clientMGUB.MGUBP0010;

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
import mcframe.clientMAUD.MAUDP0080.MAUDP_CellConfig;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;
import mcframe.commonMB.constant.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.commonMBUD.MBUDC0120.MBUDC_ListLogicBase.*;
import static mcframe.clientMBUC.MBUCP0010.MBUCP_MCDataUtil.*;
import static mcframe.clientMGUC.MGUCP0020.MGUCP_AppSys.*;
import mcframe.commonMG.constant.*;
import static mcframe.commonMG.notice.MG_Msg.*;
import mcframe.clientMGUD.MGUDP0020.MGUDP_CellConfig;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START

//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGUBP_CalcNo_H"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGUBP_CalcNo_H_MC extends MGUBP_CalcNo_H_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected MCRowBeans _calcGrp;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGUBP_CalcNo_H_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	/**
	 * コンストラクタです。埋込画面として作成するときに使用します。
	 *
	 * @param row 対応するInnerRow
	 */
	protected MGUBP_CalcNo_H_MC(mcframe.clientMGUB.MGUBP0010.CalcNoR row) {
		super(row);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_ROW_CalcNo START

		//FMCB CUSTOM_CONSTRUCTOR_ROW_CalcNo END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * 連携に必須の部品を設定する。<br>
	 * setupPartsにて設定することを想定。
	 * 
	 * @param calcGrp 計算グループＣＤ
	 */
	public void setRelateBeans(MCRowBeans calcGrp) {
		_calcGrp = calcGrp;
	}

	protected MCRowBeans getCalcGrp() {
		return _calcGrp;
	}

	//---------- イベント処理 ----------

	@Override
	protected void listenerInit() {
		super.listenerInit();

		if (getCalcGrp() != null) {
			((MCLCBeans) getCalcGrp()).addLCListener(this);
		}
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);

		if (lc == getCalcGrp()) {
			doBeans_calc_grp_cd_LC(info);
		}
	}

	/**
	 * 計算グループＣＤが変更されたときに実行される。<br>
	 * <br>
	 * 原価計算NOをクリアする。<br>
	 * GUI 部品のモードを設定する。<br>
	 * 
	 * @param info イベント情報
	 * @see #setGUIMode()
	 */
	protected void doBeans_calc_grp_cd_LC(MCEventInfo info) {
		setValueEx(CalcNo_calc_no, null);
		setGUIMode();
	}

	//---------- モード設定 ----------

	@Override
	public void setENABLEStatus() {
		super.setENABLEStatus();

		setGUIMode();
	}

	@Override
	public void setREAD_ONLYStatus() {
		super.setREAD_ONLYStatus();

		setGUIMode();
	}

	@Override
	public void setDISABLEStatus() {
		super.setDISABLEStatus();

		setGUIMode();
	}

	@Override
	public void setREQUIREDStatus() {
		super.setREQUIREDStatus();

		setGUIMode();
	}

	@Override
	public void setINVISIBLEStatus() {
		super.setINVISIBLEStatus();

		setGUIMode();
	}

	@Override
	public MCMode getGUIMode(MCModeBeans compo) {
		if (compo == CalcNo_calc_no && isDefaultModeEditable(compo)) {
			if (getCalcGrp() != null && isNull(getCalcGrp().getRowValue())) {
				return MCMode.READ_ONLY;
			}
		}
		return super.getGUIMode(compo);
	}

	//---------- 入力補助画面制御 ----------

	@Override
	protected void linkBeansToISPanel() {
		super.linkBeansToISPanel();

		if (isStrictPluralValueField()) {
			linkBeansToISPanelCustom(CalcNo_calc_no);
		}
	}

	/**
	 * GUI部品が見出しの入力制限つき複数値入力フィールドかどうかを判定します。
	 */
	protected boolean isStrictPluralValueField() {
		if (CalcNo_calc_no.isPluralValueEnable()) {
			return mcframe.clientCore.beans.list.MCListType.STRICT == CalcNo_calc_no
					.getListType();
		}
		return false;
	}

}