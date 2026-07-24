package mcframe.clientMAUB.MAUBP0410;

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

//FMCB CUSTOM_IMPORT END

/**
 * 画面"MAUBP_Addr_H"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MAUBP_Addr_H_MC extends MAUBP_Addr_H_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected MCRowBeans _some_cd = null;
	protected MCRowBeans _some_nm = null;
	protected MCRowBeans _sundry_flg = null;
	
	protected boolean _set_relate_some_cd_flg = true;	//some_cd 住所に対応するＣＤ を連携
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_Addr_H_MC() {
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
	protected MAUBP_Addr_H_MC(mcframe.clientMAUB.MAUBP0410.AddrR row) {
		super(row);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_ROW_Addr START

		//FMCB CUSTOM_CONSTRUCTOR_ROW_Addr END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * 連携に必要な部品を設定する。<br>
	 * setupPartsにて設定することを想定。
	 * 
	 * @param some_nm 住所に対応する名称
	 */
	public void setRelateBeans(MCRowBeans some_nm) {
		_some_nm = some_nm;
		_set_relate_some_cd_flg = false;
	}
	
	/**
	 * 連携に必要な部品を設定する。<br>
	 * setupPartsにて設定することを想定。
	 * 
	 * @param some_cd 住所に対応するＣＤ
	 * @param some_nm 住所に対応する名称
	 */
	public void setRelateBeans(MCRowBeans some_cd, MCRowBeans some_nm) {
		_some_cd = some_cd;
		_some_nm = some_nm;
	}

	/**
	 * 連携に必要な部品を設定する。<br>
	 * 諸口ＦＬＧで入力制御する場合の初期化処理。
	 * setupPartsにて設定することを想定。
	 * 
	 * @param some_cd 住所に対応するＣＤ
	 * @param some_nm 住所に対応する名称
	 * @param sundry_flg 諸口ＦＬＧ
	 */
	public void setRelateBeans(MCRowBeans some_cd, MCRowBeans some_nm, MCRowBeans sundry_flg) {
		_some_cd = some_cd;
		_some_nm = some_nm;
		_sundry_flg = sundry_flg;
	}

	// イベント処理

	@Override
	protected void listenerInit() {
		super.listenerInit();

		if (_some_cd != null && _sundry_flg != null) {
			((MCLCBeans) _some_cd).addLCListener(this);
		}
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);

		if (lc == _some_cd) {
			doBeans_some_cd_LC(info);
		}
	}

	/**
	 * コードが変更されたときに実行される。<br>
	 * <br>
	 * GUI 部品のモードを設定する。
	 * 
	 * @param info イベント情報
	 * @see #setGUIMode()
	 */
	protected void doBeans_some_cd_LC(MCEventInfo info) {
		setGUIMode();
	}

	// モード設定

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

	/**
	 * Panel[Addr]のボタン[show_dtl]の押下時の処理
	 */
	@Override
	public void doAddr_show_dtl(MCEventInfo info) {
		AddrR tmpR = getAddrR().clone();
		if (_some_cd != null){
			tmpR.setStringNE("some_cd", (String)_some_cd.getRowValue());
		}
		if (_some_nm != null){
			tmpR.setStringNE("some_nm", (String)_some_nm.getRowValue());
		}
		openChildPanel("MA", "MAUBP0430", T1, tmpR, _some_cd, _some_nm);
	}

	/**
	 * 指定された GUI 部品のモードを取得する。<br>
	 * 
	 * @param compo GUI 部品
	 * @return モードまたは null
	 */
	@Override
	public MCMode getGUIMode(MCModeBeans compo) {
		if (isSame(getStatus(), ENABLE)) {
			if (!_set_relate_some_cd_flg){
				if (compo == Addr_zip_cd
						|| compo == Addr_addr1
						|| compo == Addr_addr2
						|| compo == Addr_addr3
						|| compo == Addr_addr4
						|| compo == Addr_cntry_cd
						|| compo == Addr_tel
						|| compo == Addr_fax
						|| compo == Addr_cntct_dpt
						|| compo == Addr_cntct_psn
						) {
					return MCMode.ENABLE;
				}
			}
			if (_sundry_flg == null || !(Boolean)_sundry_flg.getRowValue()) {
				if (compo == Addr_zip_cd
						|| compo == Addr_addr1
						|| compo == Addr_addr2
						|| compo == Addr_addr3
						|| compo == Addr_addr4
						|| compo == Addr_cntry_cd
						|| compo == Addr_tel
						|| compo == Addr_fax
						|| compo == Addr_cntct_dpt
						|| compo == Addr_cntct_psn
						) {
					return MCMode.READ_ONLY;
				}
			}
		}
		return super.getGUIMode(compo);
	}

}