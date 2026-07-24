package mcframe.clientMAUB.MAUBP5250;

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
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MAUBP_VerNo_D"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MAUBP_VerNo_D_MC extends MAUBP_VerNo_D_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected MCColumnConfig _itm_cd = null;
	protected MCColumnConfig _itm_sub1 = null;
	protected MCColumnConfig _itm_sub2 = null;
	protected MCColumnConfig _itm_sub3 = null;
	protected MCBeans _site_cd = null;
	protected MCColumnConfig _def_ver_flg = null;
	protected MCColumnConfig _crt_lot_flg = null;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_VerNo_D_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MAUBP_VerNo_D_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
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
			setComponentInvisibleAllStatus(columnVerNo_ver_no);
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
		MCColumnConfig itm_cd,
		MCColumnConfig itm_sub1,
		MCColumnConfig itm_sub2,
		MCColumnConfig itm_sub3,
		MCBeans site_cd,
		MCColumnConfig def_ver_flg
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
	 * @param crt_lot_flg ロット作成ＦＬＧ
	 */
	public void setRelateBeans(
		MCColumnConfig itm_cd,
		MCColumnConfig itm_sub1,
		MCColumnConfig itm_sub2,
		MCColumnConfig itm_sub3,
		MCBeans site_cd,
		MCColumnConfig def_ver_flg,
		MCColumnConfig crt_lot_flg
	) {
		_itm_cd = itm_cd;
		_itm_sub1 = itm_sub1;
		_itm_sub2 = itm_sub2;
		_itm_sub3 = itm_sub3;
		_site_cd = site_cd;
		_def_ver_flg = def_ver_flg;
		_crt_lot_flg = crt_lot_flg;

		getVerNo_ver_no_ListPutter().putBind("itm_cd", itm_cd);
		getVerNo_ver_no_ListPutter().putBind("itm_sub1", itm_sub1);
		getVerNo_ver_no_ListPutter().putBind("itm_sub2", itm_sub2);
		getVerNo_ver_no_ListPutter().putBind("itm_sub3", itm_sub3);
		getVerNo_ver_no_ListPutter().putBind("site_cd", site_cd);
	}

	protected MCColumnConfig getItmCd() {
		return _itm_cd;
	}

	protected MCColumnConfig getItmSub1() {
		return _itm_sub1;
	}

	protected MCColumnConfig getItmSub2() {
		return _itm_sub2;
	}

	protected MCColumnConfig getItmSub3() {
		return _itm_sub3;
	}

	protected MCBeans getSiteCd() {
		return _site_cd;
	}

	protected MCColumnConfig getDefVerFlg() {
		return _def_ver_flg;
	}

	protected MCColumnConfig getCrtLotFlg() {
		return _crt_lot_flg;
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
		if (getCrtLotFlg() != null) {
			((MCNCBeans) getCrtLotFlg()).addNCListener(this);
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
		setValueEx(columnVerNo_ver_no, info.getEventIndex(), null);
	}

	/**
	 * 工場・物流倉庫が変更されたときに実行される。<br>
	 * <br>
	 * 版ＮＯをクリアする。<br>
	 * 
	 * @param info イベント情報
	 */
	protected void doBeans_site_cd_LC(MCEventInfo info) {
		int i = info.getEventIndex();
		// 変更対象がヘッダの場合（全て再計算）
		if (i < 0) {
			for (VerNoR r : exceptBaseEmpty(VerNoTable)) {
				setValueEx(columnVerNo_ver_no, r.getGUIIndex(), null);
			}
		}
		// 変更対象が明細の場合（指定された行のみ再計算）
		else {
			setValueEx(columnVerNo_ver_no, i, null);
		}
	}

	@Override
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);

		if (nc == getDefVerFlg()) {
			doBeans_dev_ver_flg_NC(info);
		}
		if (nc == getCrtLotFlg()) {
			doBeans_crt_lot_flg_NC(info);
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
		if (!(boolean)getBeansValue(getDefVerFlg(), info.getEventIndex())) {
			setValueEx(columnVerNo_ver_no, info.getEventIndex(), null);
		}
	}

	/**
	 * ロット作成ＦＬＧが変更されたときに実行される。<br>
	 * <br>
	 * GUI 版ＮＯのモードを設定する。
	 * 
	 * @param info イベント情報
	 */
	protected void doBeans_crt_lot_flg_NC(MCEventInfo info) {
		if (!(boolean) getBeansValue(getCrtLotFlg(), info.getEventIndex())) {
			setValueEx(columnVerNo_ver_no, info.getEventIndex(), null);
		}
	}

	@Override
	public MCMode getCellMode(int index, MCColumnConfig column) {
		if (column != columnVerNo_ver_no) {
			return super.getCellMode(index, column);
		}

		if (getDefVerFlg() == null) {
			return super.getCellMode(index, column);
		}

		if (!(boolean) getBeansValue(getDefVerFlg(), index)) {
			return MCMode.READ_ONLY;
		}

		if (getCrtLotFlg() == null) {
			return super.getCellMode(index, column);
		}

		if (!(boolean) getBeansValue(getCrtLotFlg(), index)) {
			return MCMode.READ_ONLY;
		}

		return getDefaultMode(column);
	}

}