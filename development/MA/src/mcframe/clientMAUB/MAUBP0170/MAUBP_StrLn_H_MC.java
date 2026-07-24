package mcframe.clientMAUB.MAUBP0170;

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
import mcframe.clientCore.beans.list.MCListType;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MAUBP_StrLn_H"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MAUBP_StrLn_H_MC extends MAUBP_StrLn_H_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_StrLn_H_MC() {
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
	protected MAUBP_StrLn_H_MC(mcframe.clientMAUB.MAUBP0170.StrLnR row) {
		super(row);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_ROW_StrLn START

		//FMCB CUSTOM_CONSTRUCTOR_ROW_StrLn END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	protected MCRowBeans _loc;
	protected MCRowBeans _strLnTgtFlg;

	/**
	 * 連携する部品を設定する。<br>
	 * setupPartsにて設定することを想定。
	 * 
	 * @param loc 場所部品
	 * @param strLnTgtFlg 棚・ライン対象ＦＬＧ部品
	 */
	public void setRelateBeans(MCRowBeans loc, MCRowBeans strLnTgtFlg) {
		_loc = loc;
		_strLnTgtFlg = strLnTgtFlg;
		
		getStrLn_str_ln_cd_ListPutter().putBind(StrLnCols.$i_loc_cd, _loc);
	}
	protected MCRowBeans getLoc() {
		return _loc;
	}
	protected MCRowBeans getStrLnTgtFlg() {
		return _strLnTgtFlg;
	}

	// イベント処理

	@Override
	protected void listenerInit() {
		super.listenerInit();

		if (getLoc() != null) {
			((MCLCBeans) getLoc()).addLCListener(this);
		}
		if (getStrLnTgtFlg() != null) {
			((MCNCBeans) getStrLnTgtFlg()).addNCListener(this);
		}
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);

		if (lc == getLoc()) {
			doBeans_loc_LC(info);
		}
	}

	/**
	 * 場所ＣＤが変更されたときに実行される。<br>
	 * <br>
	 * 場所ＣＤが変更されたときに棚・ラインＣＤをクリアする。<br>
	 * GUI 部品のモードを設定する。
	 * 
	 * @param info イベント情報
	 * @see #setGUIMode()
	 */
	protected void doBeans_loc_LC(MCEventInfo info) {
		if (isNull(info.getNewValue())) {
			setValueEx(StrLn_str_ln_cd, null);
			setValueEx(StrLn_str_ln_cd_none_flg, false);
			setGUIMode();
		}
	}

	@Override
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);

		if (nc == getStrLnTgtFlg()) {
			doBeans_str_ln_tgt_flg_NC(info);
		}
	}

	/**
	 * 棚・ライン対象ＦＬＧが変更されたときに実行される。<br>
	 * <br>
	 * 棚・ラインＣＤをクリアする。<br>
	 * GUI 部品のモードを設定する。
	 * 
	 * @param info イベント情報
	 * @see #setGUIMode()
	 */
	protected void doBeans_str_ln_tgt_flg_NC(MCEventInfo info) {
		setValueEx(StrLn_str_ln_cd, null);
		setValueEx(StrLn_str_ln_cd_none_flg, false);

		setGUIMode();
	}

	@Override
	public void doStrLn_str_ln_cd_LC(MCEventInfo info) {
		super.doStrLn_str_ln_cd_LC(info);

		if (!isNull(getStrLnR().str_ln_cd())) {
			setValueEx(StrLn_str_ln_cd_none_flg, false);
		}
	}

	@Override
	public void doStrLn_str_ln_cd_none_flg_NC(MCEventInfo info) {
		super.doStrLn_str_ln_cd_none_flg_NC(info);
		
		if (getStrLnR().str_ln_cd_none_flg()) {
			setValueEx(StrLn_str_ln_cd, null);
		}
		setGUIMode();
	}

	// モード設定

	@Override
	public void setENABLE_SRCHStatus() {
		super.setENABLE_SRCHStatus();
		setLstTyp();
		setGUIMode();
	}

	@Override
	public void setENABLEStatus() {
		super.setENABLEStatus();
		setLstTyp();
		setGUIMode();
	}

	@Override
	public void setDISABLEStatus() {
		super.setDISABLEStatus();
		setGUIMode();
	}

	@Override
	public void setINVISIBLEStatus() {
		super.setINVISIBLEStatus();
		setGUIMode();
	}

	@Override
	public void setREAD_ONLYStatus() {
		super.setREAD_ONLYStatus();
		setGUIMode();
	}

	@Override
	public void setREQUIREDStatus() {
		super.setREQUIREDStatus();
		setGUIMode();
	}

	/**
	 * 指定された GUI 部品のモードを取得する。<br>
	 * 変更内容：
	 * 棚・ラインＣＤが入力可能なモードでも、連携する棚・ライン対象ＦＬＧがfalseの場合は入力不可にする。
	 * 
	 * @param compo GUI 部品
	 * @return モードまたは null
	 */
	@Override
	public MCMode getGUIMode(MCModeBeans compo) {
		if (getStrLnTgtFlg() != null) {
			if ((compo == StrLn_str_ln_cd || compo == StrLn_str_ln_nm || compo == StrLn_str_ln_cd_none_flg)
					&& isDefaultModeEditable(compo)) {
				if (!(boolean) getStrLnTgtFlg().getRowValue()) {
					return MCMode.READ_ONLY;
				}
			}
			if (compo == StrLn_str_ln_cd) {
				if (getStrLnR().str_ln_cd_none_flg()) {
					return MCMode.READ_ONLY;
				}
			}
		}
		return super.getGUIMode(compo);
	}

	/**
	 * 棚・ラインＣＤのモードを設定する。
	 */
	protected void setLstTyp() {
		if (isSame(getStatus(), ENABLE_SRCH)) {
			StrLn_str_ln_cd.setListType(MCListType.FREE);
			setPluralValueEnable(StrLn_str_ln_cd, true);
		}
		else if (isSame(getStatus(), ENABLE)) {
			StrLn_str_ln_cd.setListType(MCListType.STRICT);
			setPluralValueEnable(StrLn_str_ln_cd, false);
		}
	}

}