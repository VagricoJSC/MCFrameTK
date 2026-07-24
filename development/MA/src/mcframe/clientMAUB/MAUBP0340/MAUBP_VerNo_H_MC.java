package mcframe.clientMAUB.MAUBP0340;

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
 * 画面"MAUBP_VerNo_H"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MAUBP_VerNo_H_MC extends MAUBP_VerNo_H_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected MCRowBeans _itm_cd = null;
	protected MCRowBeans _itm_sub1 = null;
	protected MCRowBeans _itm_sub2 = null;
	protected MCRowBeans _itm_sub3 = null;
	protected MCRowBeans _site_cd = null;
	protected MCRowBeans _def_ver_flg = null;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_VerNo_H_MC() {
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
	protected MAUBP_VerNo_H_MC(mcframe.clientMAUB.MAUBP0340.VerNoR row) {
		super(row);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_ROW_VerNo START

		//FMCB CUSTOM_CONSTRUCTOR_ROW_VerNo END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	@Override
	protected void partsInit() {
		super.partsInit();

		partsInitSub();
	}

	protected void partsInitSub() {
		boolean ver_enable_flg = convStringToBoolean(getSysParm("VER_ENABLE_FLG"));

		if (!ver_enable_flg) {
			setComponentInvisibleAllStatus(VerNo_ver_no);
		}
	}

	protected boolean convStringToBoolean(String s) {
		return s.equals("1") ? true : false;
	}

	@Override
	protected void listInit() {
		super.listInit();
		getVerNo_ver_no_ListPutter().putBind(ItmVerCols.$i_itm_cd, getItmCd());
		getVerNo_ver_no_ListPutter().putBind(ItmVerCols.$i_itm_sub1, getItmSub1());
		getVerNo_ver_no_ListPutter().putBind(ItmVerCols.$i_itm_sub2, getItmSub2());
		getVerNo_ver_no_ListPutter().putBind(ItmVerCols.$i_itm_sub3, getItmSub3());
		if (_site_cd != null) {
			getVerNo_ver_no_ListPutter().putBind(ItmVerCols.$i_site_cd, getSiteCd());
		}
	}

	/**
	 * 連携に必須の部品を設定する。<br>
	 * setupPartsにて設定することを想定。
	 * 
	 * @param itm_cd 品目
	 * @param itm_sub1 枝番１
	 * @param itm_sub2 枝番２
	 * @param itm_sub3 枝番３
	 * @param site_cd 工場・物流倉庫
	 * @param def_ver_flg 版管理対象ＦＬＧ
	 */
	public void setRelateBeans(
		MCRowBeans itm_cd,
		MCRowBeans itm_sub1,
		MCRowBeans itm_sub2,
		MCRowBeans itm_sub3,
		MCRowBeans site_cd,
		MCRowBeans def_ver_flg
	) {
		_itm_cd = itm_cd;
		_itm_sub1 = itm_sub1;
		_itm_sub2 = itm_sub2;
		_itm_sub3 = itm_sub3;
		_site_cd = site_cd;
		_def_ver_flg = def_ver_flg;
		
		getVerNo_ver_no_ListPutter().putBind("itm_cd", itm_cd);
		getVerNo_ver_no_ListPutter().putBind("itm_sub1", itm_sub1);
		getVerNo_ver_no_ListPutter().putBind("itm_sub2", itm_sub2);
		getVerNo_ver_no_ListPutter().putBind("itm_sub3", itm_sub3);
		getVerNo_ver_no_ListPutter().putBind("site_cd", site_cd);
	}

	protected MCRowBeans getItmCd() {
		return _itm_cd;
	}

	protected MCRowBeans getItmSub1() {
		return _itm_sub1;
	}

	protected MCRowBeans getItmSub2() {
		return _itm_sub2;
	}

	protected MCRowBeans getItmSub3() {
		return _itm_sub3;
	}

	protected MCRowBeans getSiteCd() {
		return _site_cd;
	}

	protected MCRowBeans getDefVerFlg() {
		return _def_ver_flg;
	}

	@Override
	protected void listenerInit() {
		super.listenerInit();

		if (getItmCd() != null) {
			((MCLCBeans)getItmCd()).addLCListener(this);
		}
		if (getItmSub1() != null) {
			((MCLCBeans)getItmSub1()).addLCListener(this);
		}
		if (getItmSub2() != null) {
			((MCLCBeans)getItmSub2()).addLCListener(this);
		}
		if (getItmSub3() != null) {
			((MCLCBeans)getItmSub3()).addLCListener(this);
		}
		if (getSiteCd() != null) {
			((MCLCBeans)getSiteCd()).addLCListener(this);
		}
		if (getDefVerFlg() != null) {
			((MCNCBeans) getDefVerFlg()).addNCListener(this);
		}
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);

		if (lc == getItmCd()   ||
			lc == getItmSub1() ||
			lc == getItmSub2() ||
			lc == getItmSub3()) {

			doBeans_itm_LC(info);
		}

		if (lc == getSiteCd()) {
			doBeans_site_cd_LC(info);
		}
	}

	/**
	 * 品目ＣＤ、枝番１、枝番２、枝番３が変更されたときに実行される。<br>
	 * <br>
	 * 版ＮＯをクリアする。<br>
	 * 
	 * @param info イベント情報
	 */
	protected void doBeans_itm_LC(MCEventInfo info) {
		if (isSame(getStatus(), ENABLE)) {
			setValueEx(VerNo_ver_no, null);
		}
	}

	/**
	 * 工場・物流倉庫が変更されたときに実行される。<br>
	 * <br>
	 * 版ＮＯをクリアする。<br>
	 * 
	 * @param info イベント情報
	 */
	protected void doBeans_site_cd_LC(MCEventInfo info) {
		if (isSame(getStatus(), ENABLE)) {
			setValueEx(VerNo_ver_no, null);
		}
	}

	@Override
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);

		if (nc == getDefVerFlg()) {
			doBeans_dev_ver_flg_NC(info);
		}
	}

	/**
	 * 版管理対象ＦＬＧが変更されたときに実行される。<br>
	 * <br>
	 * GUI 版ＮＯのモードを設定する。
	 * 
	 * @param info イベント情報
	 * @see #setItmNmGUIMode()
	 */
	protected void doBeans_dev_ver_flg_NC(MCEventInfo info) {
		if (isSame(getStatus(), ENABLE)) {
			if (!(boolean)getDefVerFlg().getRowValue()) {
				setValueEx(VerNo_ver_no, null);
			}
			setGUIMode();
		}
	}

	@Override
	public void setENABLE_SRCHStatus() {
		super.setENABLE_SRCHStatus();

		setLstTyp();
	}

	@Override
	public void setENABLEStatus() {
		super.setENABLEStatus();

		setLstTyp();
		setGUIMode();
	}

	/**
	 * 版ＮＯのモードを設定する。
	 */
	protected void setLstTyp() {
		if (isSame(getStatus(), ENABLE_SRCH)) {
			VerNo_ver_no.setListType(MCListType.FREE);
			setPluralValueEnable(VerNo_ver_no, true);
		}
		else if (isSame(getStatus(), ENABLE)) {
			VerNo_ver_no.setListType(MCListType.STRICT);
			setPluralValueEnable(VerNo_ver_no, false);
		}
	}

	@Override
	public MCMode getGUIMode(MCModeBeans compo) {
		if (isDefaultModeEditable(compo) && isSame(getStatus(), ENABLE)) {
			if (getDefVerFlg() != null) {
				if ((boolean)getDefVerFlg().getRowValue()) {
					return getDefaultMode(compo);
				}
				else {
					return MCMode.READ_ONLY;
				}
			}
		}
		return super.getGUIMode(compo);
	}

}