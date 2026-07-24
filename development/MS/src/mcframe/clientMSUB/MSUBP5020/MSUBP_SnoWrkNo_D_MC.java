package mcframe.clientMSUB.MSUBP5020;

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

import mcframe.clientMAUB.MAUBP5070.*;

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
//import static mcframe.commonMBUA.MBUAC0010.MBUAC_List.*;
import static mcframe.commonMBUD.MBUDC0120.MBUDC_ListLogicBase.*;
import static mcframe.clientMBUC.MBUCP0010.MBUCP_MCDataUtil.*;
import mcframe.commonMS.constant.*;
import static mcframe.commonMS.notice.MS_Msg.*;
import static mcframe.commonMSUA.MSUAC0010.MSUAC_List.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.clientCore.beans.list.MCListType;
import static mcframe.clientMAUC.MAUCP1050.MAUCP_BeansUtil.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSUBP_SnoWrkNo_D"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSUBP_SnoWrkNo_D_MC extends MSUBP_SnoWrkNo_D_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected MCBeans _itm_cd = null;
	protected MCBeans _itm_sub1 = null;
	protected MCBeans _itm_sub2 = null;
	protected MCBeans _itm_sub3 = null;

	protected MCBeans _sno1_mng_typ = null;
	protected MCBeans _sno2_mng_typ = null;
	protected MCBeans _sno3_mng_typ = null;
	protected MCBeans _sno4_mng_typ = null;

	protected MCBeans _sno1_num_typ = null;
	protected MCBeans _sno2_num_typ = null;
	protected MCBeans _sno3_num_typ = null;
	protected MCBeans _sno4_num_typ = null;

	protected MCBeans _sno1_req_flg = null;
	protected MCBeans _sno2_req_flg = null;
	protected MCBeans _sno3_req_flg = null;
	protected MCBeans _sno4_req_flg = null;

	protected boolean _sno_mode_ctrl_flg = false;
	protected MCMode _sno_mode = null;

	protected MCBeans _mng_typ;
	protected MCBeans _num_typ;
	protected MCBeans _req_flg;

	protected static final int SET_RELATE_ALL = 0;		// 手配ＮＯ１管理区分、手配ＮＯ発番区分、手配ＮＯ必須ＦＬＧを連携
	protected static final int SET_RELATE_MNG_TYP = 1;	// 手配ＮＯ１管理区分を連携
	protected int _set_relate_itm = SET_RELATE_ALL;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSUBP_SnoWrkNo_D_MC() {
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
	public MSUBP_SnoWrkNo_D_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * 手配ＮＯ管理区分を使用する画面で部品を設定する。<br>
	 * setupPartsにて設定することを想定。
	 * 
	 * @param itm_cd 品目
	 * @param itm_sub1 枝番１
	 * @param itm_sub2 枝番２
	 * @param itm_sub3 枝番３
	 * @param sno1_mng_typ 手配ＮＯ１管理区分
	 * @param sno2_mng_typ 手配ＮＯ２管理区分
	 * @param sno3_mng_typ 手配ＮＯ３管理区分
	 * @param sno4_mng_typ 手配ＮＯ４管理区分
	 */
	public void setRelateBeans(
		MCBeans itm_cd,
		MCBeans itm_sub1,
		MCBeans itm_sub2,
		MCBeans itm_sub3, 
		MCBeans sno1_mng_typ,
		MCBeans sno2_mng_typ,
		MCBeans sno3_mng_typ,
		MCBeans sno4_mng_typ
	) {
		_itm_cd = itm_cd;
		_itm_sub1 = itm_sub1;
		_itm_sub2 = itm_sub2;
		_itm_sub3 = itm_sub3;
		_sno1_mng_typ = sno1_mng_typ;
		_sno2_mng_typ = sno2_mng_typ;
		_sno3_mng_typ = sno3_mng_typ;
		_sno4_mng_typ = sno4_mng_typ;

		_set_relate_itm = SET_RELATE_MNG_TYP;
		
		SnoWrkNo_sno_p_PPanel.setRelateBeans(itm_cd, itm_sub1, itm_sub2, itm_sub3, sno1_mng_typ, sno2_mng_typ, sno3_mng_typ, sno4_mng_typ);
	}

	/**
	 * 手配ＮＯ管理区分、手配ＮＯ発番区分、手配ＮＯ必須ＦＬＧを使用する画面で部品を設定する。<br>
	 * setupPartsにて設定することを想定。
	 * 
	 * @param itm_cd 品目
	 * @param itm_sub1 枝番１
	 * @param itm_sub2 枝番２
	 * @param itm_sub3 枝番３
	 * @param sno1_mng_typ 手配ＮＯ１管理区分
	 * @param sno2_mng_typ 手配ＮＯ２管理区分
	 * @param sno3_mng_typ 手配ＮＯ３管理区分
	 * @param sno4_mng_typ 手配ＮＯ４管理区分
	 * @param sno1_num_typ 手配ＮＯ１発番区分
	 * @param sno2_num_typ 手配ＮＯ２発番区分
	 * @param sno3_num_typ 手配ＮＯ３発番区分
	 * @param sno4_num_typ 手配ＮＯ４発番区分
	 * @param sno1_req_flg 手配ＮＯ１必須ＦＬＧ
	 * @param sno2_req_flg 手配ＮＯ２必須ＦＬＧ
	 * @param sno3_req_flg 手配ＮＯ３必須ＦＬＧ
	 * @param sno4_req_flg 手配ＮＯ４必須ＦＬＧ
	 */
	public void setRelateBeans(
		MCBeans itm_cd,
		MCBeans itm_sub1,
		MCBeans itm_sub2,
		MCBeans itm_sub3, 
		MCBeans sno1_mng_typ,
		MCBeans sno2_mng_typ,
		MCBeans sno3_mng_typ,
		MCBeans sno4_mng_typ,
		MCBeans sno1_num_typ,
		MCBeans sno2_num_typ,
		MCBeans sno3_num_typ,
		MCBeans sno4_num_typ,
		MCBeans sno1_req_flg,
		MCBeans sno2_req_flg,
		MCBeans sno3_req_flg,
		MCBeans sno4_req_flg
	) {
		_itm_cd = itm_cd;
		_itm_sub1 = itm_sub1;
		_itm_sub2 = itm_sub2;
		_itm_sub3 = itm_sub3;
		_sno1_mng_typ = sno1_mng_typ;
		_sno2_mng_typ = sno2_mng_typ;
		_sno3_mng_typ = sno3_mng_typ;
		_sno4_mng_typ = sno4_mng_typ;
		_sno1_num_typ = sno1_num_typ;
		_sno2_num_typ = sno2_num_typ;
		_sno3_num_typ = sno3_num_typ;
		_sno4_num_typ = sno4_num_typ;
		_sno1_req_flg = sno1_req_flg;
		_sno2_req_flg = sno2_req_flg;
		_sno3_req_flg = sno3_req_flg;
		_sno4_req_flg = sno4_req_flg;
		SnoWrkNo_sno_p_PPanel.setRelateBeans(itm_cd, itm_sub1, itm_sub2, itm_sub3, sno1_mng_typ, sno2_mng_typ, sno3_mng_typ, sno4_mng_typ, sno1_num_typ, sno2_num_typ, sno3_num_typ, sno4_num_typ, sno1_req_flg, sno2_req_flg, sno3_req_flg, sno4_req_flg);
	}
	
	// (ここから)暫定ソース（自動生成されるべきだが、現状のFrameManagerが対応できていない） 
	@Override
	protected void listInit() {
		super.listInit();
		columnSnoWrkNo_sno1.getListConfig().setPutter(getMySnoWrkNo_sno1_ListPutter());
		columnSnoWrkNo_sno1.setListListener(this);
	}
	private mcframe.clientCore.beans.list.MCListPutter MySnoWrkNo_sno1_p = null;
	protected mcframe.clientCore.beans.list.MCListPutter getMySnoWrkNo_sno1_ListPutter() {
		if (MySnoWrkNo_sno1_p == null) {
			MySnoWrkNo_sno1_p = createMySnoWrkNo_sno1_ListPutter(columnSnoWrkNo_sno1, "sno1", "wrk_no","wrk_nm");

		}
		return MySnoWrkNo_sno1_p;
	}
	protected mcframe.clientCore.beans.list.MCListPutter createMySnoWrkNo_sno1_ListPutter(mcframe.clientCore.beans.list.MCLinkBeans compo, String... columns) {
		mcframe.clientCore.beans.list.MCListPutter lp = new mcframe.clientCore.beans.list.MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0030.Sno1_WrkNo");
		return lp;
	}
	
	@Override
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list =  super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == columnSnoWrkNo_sno1) return getSnoWrkNo_sno1(row, info);
		return null;
	}
	
	/**
	 * コンボ／リストのリスト[columnSnoWrkNo_sno1]の作成メソッド
	 */
	public MCList getSnoWrkNo_sno1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0030.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0030.MSUAP_List", this)).getSno1_WrkNo(row, info);
	}


	// (ここまで)暫定ソース（自動生成されるべきだが、現状のFrameManagerが対応できていない） 


	@Override
	protected void listenerInit() {
		super.listenerInit();

		if (_itm_cd != null) {
			((MCLCBeans)_itm_cd).addLCListener(this);
		}
		if (_itm_sub1 != null) {
			((MCLCBeans)_itm_sub1).addLCListener(this);
		}
		if (_itm_sub2 != null) {
			((MCLCBeans)_itm_sub2).addLCListener(this);
		}
		if (_itm_sub3 != null) {
			((MCLCBeans)_itm_sub3).addLCListener(this);
		}
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);

		if (lc == _itm_cd || lc == _itm_sub1 || lc == _itm_sub2 || lc == _itm_sub3) {
			doBeans_itm_LC(info);
		}
	}
	
	protected void doBeans_itm_LC(MCEventInfo info) {
		clearSno(info.getEventIndex());
		clearWrkno(info.getEventIndex());
	}

	protected void clearSno(int idx) {
		if (idx < 0) {
			for (SnoWrkNoR r : exceptBaseEmpty(SnoWrkNoTable)) {
				setValueEx(columnSnoWrkNo_sno1, r.getGUIIndex(), null);
				setValueEx(columnSnoWrkNo_sno2, r.getGUIIndex(), null);
				setValueEx(columnSnoWrkNo_sno3, r.getGUIIndex(), null);
				setValueEx(columnSnoWrkNo_sno4, r.getGUIIndex(), null);
				setValueEx(columnSnoWrkNo_sno1_null_flg, r.getGUIIndex(), false);
				setValueEx(columnSnoWrkNo_sno2_null_flg, r.getGUIIndex(), false);
				setValueEx(columnSnoWrkNo_sno3_null_flg, r.getGUIIndex(), false);
				setValueEx(columnSnoWrkNo_sno4_null_flg, r.getGUIIndex(), false);
			}
		}
		else {
			setValueEx(columnSnoWrkNo_sno1, idx, null);
			setValueEx(columnSnoWrkNo_sno2, idx, null);
			setValueEx(columnSnoWrkNo_sno3, idx, null);
			setValueEx(columnSnoWrkNo_sno4, idx, null);
			setValueEx(columnSnoWrkNo_sno1_null_flg, idx, false);
			setValueEx(columnSnoWrkNo_sno2_null_flg, idx, false);
			setValueEx(columnSnoWrkNo_sno3_null_flg, idx, false);
			setValueEx(columnSnoWrkNo_sno4_null_flg, idx, false);
		}
	}

	protected void clearWrkno(int idx) {
		if (idx < 0) {
			for (SnoWrkNoR r : exceptBaseEmpty(SnoWrkNoTable)) {
				setValueEx(columnSnoWrkNo_wrk_no, r.getGUIIndex(), null);
				setValueEx(columnSnoWrkNo_wrk_nm, r.getGUIIndex(), null);
			}
		}
		else {
			setValueEx(columnSnoWrkNo_wrk_no, idx, null);
			setValueEx(columnSnoWrkNo_wrk_nm, idx, null);
		}
	}

	/**
	 * 手配ＮＯ管理区分が、管理する（任意：在庫対象外）の場合、<br>
	 * 手配ＮＯのモード制御するかどうかを設定する。
	 * デフォルトではモード制御をしない。
	 * 
	 * @param boo モード制御するかどうか
	 */
	public void setSnoModeCtrl(boolean boo) {
		_sno_mode_ctrl_flg = boo;
	}

	protected boolean getSnoModeCtrl() {
		return _sno_mode_ctrl_flg;
	}

	/**
	 * 手配ＮＯ管理区分が、管理する（任意：在庫対象外）の場合、<br>
	 * 手配ＮＯのモードを入力不可にする場合はMCMode.READ_ONLYを、<br>
	 * 入力可能にする場合はMCMode.ENABLEを設定する。<br>
	 * また、本メソッドを有効にするには、setSnoModeCtrlメソッドで、<br>
	 * あらかじめ、trueを設定しておく必要がある。<br>
	 * 本メソッドが呼ばれない場合は、クライアント実行エラーとなる。
	 * 
	 * @param boo モード制御するかどうか
	 */
	public void setSnoMode(MCMode mode) {
		_sno_mode = mode;
	}

	protected MCMode getSnoMode() {
		return _sno_mode;
	}

	/**
	 * 指定された GUI 部品のモードを取得する。
	 */
	@Override
	protected MCMode getCellMode(int index, MCColumnConfig column) {
		if (!isDefaultModeEditable(column)) {
			return super.getCellMode(index, column);
		}

		if (column == columnSnoWrkNo_sno1 || column == columnSnoWrkNo_sno2 ||
			column == columnSnoWrkNo_sno3 || column == columnSnoWrkNo_sno4) {

			setTypAndFlg(column);

			// 手配ＮＯ管理区分（管理しない）
			if (MAC_SNO_MNG_TYP.isNOT_MNG((String)getValueOf(_mng_typ, index))) {
				return MCMode.READ_ONLY;
			}

			// 手配ＮＯ管理区分、手配ＮＯ発番区分、手配ＮＯ必須ＦＬＧを連携
			if (_set_relate_itm == SET_RELATE_ALL) {
				// 手配ＮＯ管理区分（管理する（必須））
				if (MAC_SNO_MNG_TYP.isMNG_REQ((String)getValueOf(_mng_typ, index))) {
					// 手配ＮＯ発番区分（自動）
					if (MAC_SNO_NO_TYP.isAUTO((String)getValueOf(_num_typ, index))) {
						return MCMode.READ_ONLY;
					}
					return MCMode.REQUIRED;
				}
				// 手配ＮＯ管理区分（管理する（任意））
				else if (MAC_SNO_MNG_TYP.isMNG_ARB((String)getValueOf(_mng_typ, index))) {
					// 手配ＮＯ発番区分（自動）
					if (MAC_SNO_NO_TYP.isAUTO((String)getValueOf(_num_typ, index))) {
						return MCMode.READ_ONLY;
					}
					// 手配ＮＯ発番区分（手動、自動＿手動）
					else {
						// 手配ＮＯ必須ＦＬＧ（オン）
						if ((boolean)getValueOf(_req_flg, index)) {
							return MCMode.REQUIRED;
						}
						return MCMode.ENABLE;
					}
				}
				// 手配ＮＯ管理区分（管理する（任意：在庫対象外））、手配ＮＯのモード制御フラグ（オン）
				else if (MAC_SNO_MNG_TYP.isMNG_NOT_STK((String)getValueOf(_mng_typ, index)) && getSnoModeCtrl()) {
					// 手配ＮＯを入力不可にする
					if (getSnoMode() == null) {
						throw new MCAppException(MSUBP0001);
					}
					else if (getSnoMode() == MCMode.READ_ONLY) {
						return MCMode.READ_ONLY;
					}

					// 手配ＮＯ発番区分（自動）
					if (MAC_SNO_NO_TYP.isAUTO((String)getValueOf(_num_typ, index))) {
						return MCMode.READ_ONLY;
					}
					// 手配ＮＯ発番区分（手動、自動＿手動）
					else {
						// 手配ＮＯ必須ＦＬＧ（オン）
						if ((boolean)getValueOf(_req_flg, index)) {
							return MCMode.REQUIRED;
						}
						return MCMode.ENABLE;
					}
				}
				else {
					return getDefaultMode(column);
				}
			}
			// 手配ＮＯ管理区分を連携
			else if (_set_relate_itm == SET_RELATE_MNG_TYP) {
				// 手配ＮＯ管理区分（管理する（必須））
				if (MAC_SNO_MNG_TYP.isMNG_REQ((String)getValueOf(_mng_typ, index))) {
					return MCMode.REQUIRED;
				}
				// 手配ＮＯ管理区分（管理する（任意））
				else if (MAC_SNO_MNG_TYP.isMNG_ARB((String)getValueOf(_mng_typ, index))) {
					return MCMode.ENABLE;
				}
				// 手配ＮＯ管理区分（管理する（任意：在庫対象外））、手配ＮＯのモード制御フラグ（オン）
				else if (MAC_SNO_MNG_TYP.isMNG_NOT_STK((String)getValueOf(_mng_typ, index)) && getSnoModeCtrl()) {
					// 手配ＮＯを入力不可にする
					if (getSnoMode() == null) {
						throw new MCAppException(MSUBP0001);
					}
					else if (getSnoMode() == MCMode.READ_ONLY) {
						return MCMode.READ_ONLY;
					}
					return MCMode.ENABLE;
				}
				else {
					return getDefaultMode(column);
				}
			}
		}

		return super.getCellMode(index, column);
	}

	protected void setTypAndFlg(MCColumnConfig column) {
		if (column == columnSnoWrkNo_sno1) {
			_mng_typ = _sno1_mng_typ;
			_num_typ = _sno1_num_typ;
			_req_flg = _sno1_req_flg;
		}
		else if (column == columnSnoWrkNo_sno2) {
			_mng_typ = _sno2_mng_typ;
			_num_typ = _sno2_num_typ;
			_req_flg = _sno2_req_flg;
		}
		else if (column == columnSnoWrkNo_sno3) {
			_mng_typ = _sno3_mng_typ;
			_num_typ = _sno3_num_typ;
			_req_flg = _sno3_req_flg;
		}
		else  {
			_mng_typ = _sno4_mng_typ;
			_num_typ = _sno4_num_typ;
			_req_flg = _sno4_req_flg;
		}
	}

}