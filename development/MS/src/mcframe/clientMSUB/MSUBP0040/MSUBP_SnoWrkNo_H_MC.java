package mcframe.clientMSUB.MSUBP0040;

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
//import static mcframe.commonMBUA.MBUAC0010.MBUAC_List.*;
import static mcframe.commonMBUD.MBUDC0120.MBUDC_ListLogicBase.*;
import static mcframe.clientMBUC.MBUCP0010.MBUCP_MCDataUtil.*;
import mcframe.commonMS.constant.*;
import static mcframe.commonMS.notice.MS_Msg.*;
import static mcframe.commonMSUA.MSUAC0010.MSUAC_List.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import static mcframe.clientMAUC.MAUCP1050.MAUCP_BeansUtil.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSUBP_SnoWrkNo_H"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSUBP_SnoWrkNo_H_MC extends MSUBP_SnoWrkNo_H_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected MCRowBeans _itm_cd = null;
	protected MCRowBeans _itm_sub1 = null;
	protected MCRowBeans _itm_sub2 = null;
	protected MCRowBeans _itm_sub3 = null;

	protected MCRowBeans _sno1_mng_typ = null;
	protected MCRowBeans _sno2_mng_typ = null;
	protected MCRowBeans _sno3_mng_typ = null;
	protected MCRowBeans _sno4_mng_typ = null;

	protected MCRowBeans _sno1_num_typ = null;
	protected MCRowBeans _sno2_num_typ = null;
	protected MCRowBeans _sno3_num_typ = null;
	protected MCRowBeans _sno4_num_typ = null;

	protected MCRowBeans _sno1_req_flg = null;
	protected MCRowBeans _sno2_req_flg = null;
	protected MCRowBeans _sno3_req_flg = null;
	protected MCRowBeans _sno4_req_flg = null;

	protected boolean _sno_mode_ctrl_flg = false;
	protected MCMode _sno_mode = null;

	protected static final int SET_RELATE_ALL = 0;		// 手配ＮＯ１管理区分、手配ＮＯ発番区分、手配ＮＯ必須ＦＬＧを連携
	protected static final int SET_RELATE_MNG_TYP = 1;	// 手配ＮＯ１管理区分を連携
	protected int _set_relate_itm = SET_RELATE_ALL;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSUBP_SnoWrkNo_H_MC() {
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
	protected MSUBP_SnoWrkNo_H_MC(mcframe.clientMSUB.MSUBP0040.SnoWrkNoR row) {
		super(row);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_ROW_SnoWrkNo START

		//FMCB CUSTOM_CONSTRUCTOR_ROW_SnoWrkNo END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	protected boolean _enableSnoNullFlg = false;

	/**
	 * 「手配ＮＯ無し可」を使用する場合にtrueを設定する。<br>
	 */
	public void setEnableSnoNullFlg(boolean boo) {
		_enableSnoNullFlg = boo;
	}

	@Override
	public void afterInit() {
		super.afterInit();
		afterInitSub();
	}

	protected void afterInitSub() {
		if (!_enableSnoNullFlg) {
			setComponentInvisibleAllStatus(SnoWrkNo_sno1_null_flg);
			setComponentInvisibleAllStatus(SnoWrkNo_sno2_null_flg);
			setComponentInvisibleAllStatus(SnoWrkNo_sno3_null_flg);
			setComponentInvisibleAllStatus(SnoWrkNo_sno4_null_flg);			
		}
	}
	

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
		MCRowBeans itm_cd,
		MCRowBeans itm_sub1,
		MCRowBeans itm_sub2,
		MCRowBeans itm_sub3, 
		MCRowBeans sno1_mng_typ,
		MCRowBeans sno2_mng_typ,
		MCRowBeans sno3_mng_typ,
		MCRowBeans sno4_mng_typ
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
		MCRowBeans itm_cd,
		MCRowBeans itm_sub1,
		MCRowBeans itm_sub2,
		MCRowBeans itm_sub3, 
		MCRowBeans sno1_mng_typ,
		MCRowBeans sno2_mng_typ,
		MCRowBeans sno3_mng_typ,
		MCRowBeans sno4_mng_typ,
		MCRowBeans sno1_num_typ,
		MCRowBeans sno2_num_typ,
		MCRowBeans sno3_num_typ,
		MCRowBeans sno4_num_typ,
		MCRowBeans sno1_req_flg,
		MCRowBeans sno2_req_flg,
		MCRowBeans sno3_req_flg,
		MCRowBeans sno4_req_flg
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

	protected MCRowBeans getSno1MngTyp() {
		return _sno1_mng_typ;
	}

	protected MCRowBeans getSno2MngTyp() {
		return _sno2_mng_typ;
	}

	protected MCRowBeans getSno3MngTyp() {
		return _sno3_mng_typ;
	}

	protected MCRowBeans getSno4MngTyp() {
		return _sno4_mng_typ;
	}

	protected MCRowBeans getSno1NumTyp() {
		return _sno1_num_typ;
	}

	protected MCRowBeans getSno2NumTyp() {
		return _sno2_num_typ;
	}

	protected MCRowBeans getSno3NumTyp() {
		return _sno3_num_typ;
	}

	protected MCRowBeans getSno4NumTyp() {
		return _sno4_num_typ;
	}
	
	protected MCRowBeans getSno1ReqFlg() {
		return _sno1_req_flg;
	}

	protected MCRowBeans getSno2ReqFlg() {
		return _sno2_req_flg;
	}

	protected MCRowBeans getSno3ReqFlg() {
		return _sno3_req_flg;
	}

	protected MCRowBeans getSno4ReqFlg() {
		return _sno4_req_flg;
	}
	

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

	@Override
	public boolean doSnoWrkNo_sno1_VC(MCEventInfo info) {
		if (!super.doSnoWrkNo_sno1_VC(info)) {
			return false;
		}
		return doSnoWrkNo_snox_VC(info, getSno1MngTyp());
	}

	@Override
	public boolean doSnoWrkNo_sno2_VC(MCEventInfo info) {
		if (!super.doSnoWrkNo_sno2_VC(info)) {
			return false;
		}
		return doSnoWrkNo_snox_VC(info, getSno2MngTyp());
	}

	@Override
	public boolean doSnoWrkNo_sno3_VC(MCEventInfo info) {
		if (!super.doSnoWrkNo_sno3_VC(info)) {
			return false;
		}
		return doSnoWrkNo_snox_VC(info, getSno3MngTyp());
	}

	@Override
	public boolean doSnoWrkNo_sno4_VC(MCEventInfo info) {
		if (!super.doSnoWrkNo_sno4_VC(info)) {
			return false;
		}
		return doSnoWrkNo_snox_VC(info, getSno4MngTyp());
	}
	
	protected boolean doSnoWrkNo_snox_VC(MCEventInfo info, MCRowBeans snoMngTypBeans) {
		if (snoMngTypBeans != null) {
			String snoMngTyp = getSnoMngTyp(snoMngTypBeans);
			// 管理する（必須）、管理する（任意）、管理する（任意：在庫対象外）
			if (MAC_SNO_MNG_TYP.isMNG_REQ(snoMngTyp) && MAC_STR.isNULL_VAL((String)info.getNewValue())) {
				return false;
			}
		}
		return true;
	}

	/**
	 * 品目ＣＤ、枝番１、枝番２、枝番３が変更されたときに実行される。<br>
	 * <br>
	 * 手配ＮＯ、案件ＮＯ、案件名をクリアする。<br>
	 * 
	 * @param info イベント情報
	 */
	protected void doBeans_itm_LC(MCEventInfo info) {
		clearSno();
		clearWrkno();
		setGUIMode();
	}

	protected void clearSno() {
		setValueEx(SnoWrkNo_sno1, null);
		setValueEx(SnoWrkNo_sno2, null);
		setValueEx(SnoWrkNo_sno3, null);
		setValueEx(SnoWrkNo_sno4, null);
		setValueEx(SnoWrkNo_sno1_null_flg, false);
		setValueEx(SnoWrkNo_sno2_null_flg, false);
		setValueEx(SnoWrkNo_sno3_null_flg, false);
		setValueEx(SnoWrkNo_sno4_null_flg, false);
	}

	protected void clearWrkno() {
		setValueEx(SnoWrkNo_wrk_no, null);
		setValueEx(SnoWrkNo_wrk_nm, null);
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
	public MCMode getGUIMode(MCModeBeans compo) {
		if (!isDefaultModeEditable(compo)) {
			return super.getGUIMode(compo);
		}

		final int index = 0;

		if (compo == SnoWrkNo_sno1 || compo == SnoWrkNo_sno2 ||
			compo == SnoWrkNo_sno3 || compo == SnoWrkNo_sno4) {

			MCRowBeans mng_typ;
			MCRowBeans num_typ;
			MCRowBeans req_flg;

			if (compo == SnoWrkNo_sno1) {
				mng_typ = _sno1_mng_typ;
				num_typ = _sno1_num_typ;
				req_flg = _sno1_req_flg;
			}
			else if (compo == SnoWrkNo_sno2) {
				mng_typ = _sno2_mng_typ;
				num_typ = _sno2_num_typ;
				req_flg = _sno2_req_flg;
			}
			else if (compo == SnoWrkNo_sno3) {
				mng_typ = _sno3_mng_typ;
				num_typ = _sno3_num_typ;
				req_flg = _sno3_req_flg;
			}
			else  {
				mng_typ = _sno4_mng_typ;
				num_typ = _sno4_num_typ;
				req_flg = _sno4_req_flg;
			}

			// 手配ＮＯ管理区分（管理しない）
			if (MAC_SNO_MNG_TYP.isNOT_MNG((String)getValueOf(mng_typ, index))) {
				return MCMode.READ_ONLY;
			}

			// 手配ＮＯ管理区分、手配ＮＯ発番区分、手配ＮＯ必須ＦＬＧを連携
			if (_set_relate_itm == SET_RELATE_ALL) {
				// 手配ＮＯ管理区分（管理する（必須））
				if (MAC_SNO_MNG_TYP.isMNG_REQ((String)getValueOf(mng_typ, index))) {
					// 手配ＮＯ発番区分（自動）
					if (MAC_SNO_NO_TYP.isAUTO((String)getValueOf(num_typ, index))) {
						return MCMode.READ_ONLY;
					}
					return MCMode.REQUIRED;
				}
				// 手配ＮＯ管理区分（管理する（任意））
				else if (MAC_SNO_MNG_TYP.isMNG_ARB((String)getValueOf(mng_typ, index))) {
					// 手配ＮＯ発番区分（自動）
					if (MAC_SNO_NO_TYP.isAUTO((String)getValueOf(num_typ, index))) {
						return MCMode.READ_ONLY;
					}
					// 手配ＮＯ発番区分（手動、自動＿手動）
					else {
						// 手配ＮＯ必須ＦＬＧ（オン）
						if ((boolean)getValueOf(req_flg, index)) {
							return MCMode.REQUIRED;
						}
						return MCMode.ENABLE;
					}
				}
				// 手配ＮＯ管理区分（管理する（任意：在庫対象外））、手配ＮＯのモード制御フラグ（オン）
				else if (MAC_SNO_MNG_TYP.isMNG_NOT_STK((String)getValueOf(mng_typ, index)) && getSnoModeCtrl()) {
					// 手配ＮＯを入力不可にする
					if (getSnoMode() == null) {
						throw new MCAppException(MSUBP0001);
					}
					else if (getSnoMode() == MCMode.READ_ONLY) {
						return MCMode.READ_ONLY;
					}

					// 手配ＮＯ発番区分（自動）
					if (MAC_SNO_NO_TYP.isAUTO((String)getValueOf(num_typ, index))) {
						return MCMode.READ_ONLY;
					}
					// 手配ＮＯ発番区分（手動、自動＿手動）
					else {
						// 手配ＮＯ必須ＦＬＧ（オン）
						if ((boolean)getValueOf(req_flg, index)) {
							return MCMode.REQUIRED;
						}
						return MCMode.ENABLE;
					}
				}
				else {
					return getDefaultMode(compo);
				}
			}
			// 手配ＮＯ管理区分を連携
			else if (_set_relate_itm == SET_RELATE_MNG_TYP) {
				// 手配ＮＯ管理区分（管理する（必須））
				if (MAC_SNO_MNG_TYP.isMNG_REQ((String)getValueOf(mng_typ, index))) {
					return MCMode.REQUIRED;
				}
				// 手配ＮＯ管理区分（管理する（任意））
				else if (MAC_SNO_MNG_TYP.isMNG_ARB((String)getValueOf(mng_typ, index))) {
					return MCMode.ENABLE;
				}
				// 手配ＮＯ管理区分（管理する（任意：在庫対象外））、手配ＮＯのモード制御フラグ（オン）
				else if (MAC_SNO_MNG_TYP.isMNG_NOT_STK((String)getValueOf(mng_typ, index)) && getSnoModeCtrl()) {
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
					return getDefaultMode(compo);
				}
			}
		}
		else if (compo == SnoWrkNo_sno1_null_flg) {
			getSnoNullFLgMode(SnoWrkNo_sno1, SnoWrkNo_sno1_null_flg);
		}
		else if (compo == SnoWrkNo_sno2_null_flg) {
			getSnoNullFLgMode(SnoWrkNo_sno2, SnoWrkNo_sno2_null_flg);
		}
		else if (compo == SnoWrkNo_sno3_null_flg) {
			getSnoNullFLgMode(SnoWrkNo_sno3, SnoWrkNo_sno3_null_flg);
		}
		else if (compo == SnoWrkNo_sno4_null_flg) {
			getSnoNullFLgMode(SnoWrkNo_sno4, SnoWrkNo_sno4_null_flg);
		}
		return super.getGUIMode(compo);
	}

	protected String getSnoMngTyp(MCRowBeans beans) {
		if (beans == null) {
			return null;
		}
		return (String) beans.getRowValue();
	}
	
	protected MCMode getSnoNullFLgMode(MCModeBeans sno, MCModeBeans sno_null_flg) {
		MCMode snoMode = getGUIMode(sno);
		if (snoMode == MCMode.REQUIRED || snoMode == MCMode.ENABLE) {
			return MCMode.REQUIRED;
		}
		else {
			return MCMode.READ_ONLY;
		}
	}

	// モード

	@Override
	public void setENABLEStatus() {
		super.setENABLEStatus();

		setGUIMode();
	}

	@Override
	public void setDISABLEStatus() {
		super.setDISABLEStatus();

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

	@Override
	public void setINVISIBLEStatus() {
		super.setINVISIBLEStatus();

		setGUIMode();
	}

}