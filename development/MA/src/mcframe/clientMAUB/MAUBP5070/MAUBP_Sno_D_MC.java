package mcframe.clientMAUB.MAUBP5070;

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
import mcframe.clientMAUD.MAUDP0080.MAUDP_CellConfig;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MAUBP_Sno_D"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MAUBP_Sno_D_MC extends MAUBP_Sno_D_MC_A {

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
	protected boolean _auto_manu_mode_ctrl_flg = false;
	
	protected static final int SET_RELATE_ALL = 0;		// 手配ＮＯ１管理区分、手配ＮＯ発番区分、手配ＮＯ必須ＦＬＧを連携
	protected static final int SET_RELATE_MNG_TYP = 1;	// 手配ＮＯ１管理区分を連携
	protected int _set_relate_itm = SET_RELATE_ALL;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_Sno_D_MC() {
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
	public MAUBP_Sno_D_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * 連携に必須の部品を設定する。<br>
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
	}
	
	protected MCBeans getItmCd() {
		return _itm_cd;
	}

	protected MCBeans getItmSub1() {
		return _itm_sub1;
	}

	protected MCBeans getItmSub2() {
		return _itm_sub2;
	}

	protected MCBeans getItmSub3() {
		return _itm_sub3;
	}

	protected MCBeans getSno1MngTyp() {
		return _sno1_mng_typ;
	}

	protected MCBeans getSno2MngTyp() {
		return _sno2_mng_typ;
	}

	protected MCBeans getSno3MngTyp() {
		return _sno3_mng_typ;
	}

	protected MCBeans getSno4MngTyp() {
		return _sno4_mng_typ;
	}

	protected MCBeans getSno1NumTyp() {
		return _sno1_num_typ;
	}

	protected MCBeans getSno2NumTyp() {
		return _sno2_num_typ;
	}

	protected MCBeans getSno3NumTyp() {
		return _sno3_num_typ;
	}

	protected MCBeans getSno4NumTyp() {
		return _sno4_num_typ;
	}
	
	protected MCBeans getSno1ReqFlg() {
		return _sno1_req_flg;
	}

	protected MCBeans getSno2ReqFlg() {
		return _sno2_req_flg;
	}

	protected MCBeans getSno3ReqFlg() {
		return _sno3_req_flg;
	}

	protected MCBeans getSno4ReqFlg() {
		return _sno4_req_flg;
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
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);

		if (lc == getItmCd() || lc == getItmSub1() || lc == getItmSub2() || lc == getItmSub3()) {
			doBeans_itm_LC(info);
		}
	}

	@Override
	public boolean doSno_sno1_VC(MCEventInfo info) {
		if (!super.doSno_sno1_VC(info)) {
			return false;
		}
		return doSno_snox_VC(info, getSno1MngTyp());
	}

	@Override
	public boolean doSno_sno2_VC(MCEventInfo info) {
		if (!super.doSno_sno2_VC(info)) {
			return false;
		}
		return doSno_snox_VC(info, getSno2MngTyp());
	}

	@Override
	public boolean doSno_sno3_VC(MCEventInfo info) {
		if (!super.doSno_sno3_VC(info)) {
			return false;
		}
		return doSno_snox_VC(info, getSno3MngTyp());
	}

	@Override
	public boolean doSno_sno4_VC(MCEventInfo info) {
		if (!super.doSno_sno4_VC(info)) {
			return false;
		}
		return doSno_snox_VC(info, getSno4MngTyp());
	}
	
	protected boolean doSno_snox_VC(MCEventInfo info, MCBeans snoMngTypBeans) {
		if (snoMngTypBeans != null) {
			String snoMngTyp = getSnoMngTyp(info.getEventIndex(), snoMngTypBeans);
			// 管理する（必須）、管理する（任意）、管理する（任意：在庫対象外）
			if (MAC_SNO_MNG_TYP.isMNG_REQ(snoMngTyp) && MAC_STR.isNULL_VAL((String)info.getNewValue())) {
				return false;
			}
		}
		return true;
	}

	protected void doBeans_itm_LC(MCEventInfo info) {
		clearSno(info.getEventIndex());
	}

	protected void clearSno(int idx) {
		if (idx < 0) {
			for (SnoR r : exceptBaseEmpty(SnoTable)) {
				setValueEx(columnSno_sno1, r.getGUIIndex(), null);
				setValueEx(columnSno_sno2, r.getGUIIndex(), null);
				setValueEx(columnSno_sno3, r.getGUIIndex(), null);
				setValueEx(columnSno_sno4, r.getGUIIndex(), null);
				setValueEx(columnSno_sno1_null_flg, r.getGUIIndex(), false);
				setValueEx(columnSno_sno2_null_flg, r.getGUIIndex(), false);
				setValueEx(columnSno_sno3_null_flg, r.getGUIIndex(), false);
				setValueEx(columnSno_sno4_null_flg, r.getGUIIndex(), false);
			}
		}
		else {
			setValueEx(columnSno_sno1, idx, null);
			setValueEx(columnSno_sno2, idx, null);
			setValueEx(columnSno_sno3, idx, null);
			setValueEx(columnSno_sno4, idx, null);
			setValueEx(columnSno_sno1_null_flg, idx, false);
			setValueEx(columnSno_sno2_null_flg, idx, false);
			setValueEx(columnSno_sno3_null_flg, idx, false);
			setValueEx(columnSno_sno4_null_flg, idx, false);
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
	 * 手配ＮＯ発番区分が「3：手動_未指定:自動」の場合、<br>
	 * 手配ＮＯ必須の場合でもENABLEにするかどうかを設定する。
	 * デフォルトでは既存動作となる。
	 * 
	 * @param boo 手配ＮＯをENABLEとするかどうか
	 */
	public void setAutoManuModeCtrl(boolean boo) {
		_auto_manu_mode_ctrl_flg = boo;
	}

	protected boolean getAutoManuModeCtrl() {
		return _auto_manu_mode_ctrl_flg;
	}


	@Override
	public MCMode getCellMode(int index, MCColumnConfig column) {
		if (isDefaultModeEditable(column)) {
			// 手配ＮＯ管理区分、手配ＮＯ発番区分、手配ＮＯ必須ＦＬＧを連携
			if (_set_relate_itm == SET_RELATE_ALL) {
				if (column == columnSno_sno1 && getSno1MngTyp() != null 
						&& getSno1NumTyp() != null && getSno1ReqFlg() != null) {
					return setSnoMode(index, column, getSno1MngTyp(), getSno1NumTyp(), getSno1ReqFlg());
				}
				else if (column == columnSno_sno2 && getSno2MngTyp() != null 
						&& getSno2NumTyp() != null && getSno2ReqFlg() != null) {
					return setSnoMode(index, column, getSno2MngTyp(), getSno2NumTyp(), getSno2ReqFlg());
				}
				else if (column == columnSno_sno3 && getSno3MngTyp() != null 
						&& getSno3NumTyp() != null && getSno3ReqFlg() != null) {
					return setSnoMode(index, column, getSno3MngTyp(), getSno3NumTyp(), getSno3ReqFlg());
				}
				else if (column == columnSno_sno4 && getSno4MngTyp() != null 
						&& getSno4NumTyp() != null && getSno4ReqFlg() != null) {
					return setSnoMode(index, column, getSno4MngTyp(), getSno4NumTyp(), getSno4ReqFlg());
				}
			}
			// 手配ＮＯ管理区分のみで連携
			else {
				if (column == columnSno_sno1 && getSno1MngTyp() != null) {
					return setSnoMode(index, column, getSno1MngTyp());
				}
				else if (column == columnSno_sno2 && getSno2MngTyp() != null) {
					return setSnoMode(index, column, getSno2MngTyp());
				}
				else if (column == columnSno_sno3 && getSno3MngTyp() != null) {
					return setSnoMode(index, column, getSno3MngTyp());
				}
				else if (column == columnSno_sno4 && getSno4MngTyp() != null) {
					return setSnoMode(index, column, getSno4MngTyp());
				}
			}
			// 手配ＮＯx無し可
			if (column == columnSno_sno1_null_flg) {
				return getSnoNullFLgMode(index, column, getSno1MngTyp());
			}
			else if (column == columnSno_sno2_null_flg) {
				return getSnoNullFLgMode(index, column, getSno2MngTyp());
			}
			else if (column == columnSno_sno3_null_flg) {
				return getSnoNullFLgMode(index, column, getSno3MngTyp());
			}
			else if (column == columnSno_sno4_null_flg) {
				return getSnoNullFLgMode(index, column, getSno4MngTyp());
			}
		}
		return super.getCellMode(index, column);
	}

	protected String getSnoMngTyp(int index, MCBeans mngTyp) {
		String mngVal = null;
		
		// 手配ＮＯ１管理区分～手配ＮＯ４管理区分がヘッダに定義されている場合
		if (mngTyp instanceof MCRowBeans) {
			MCRowBeans beans = (MCRowBeans) mngTyp;
			mngVal = (String) beans.getRowValue();
		}
		// 手配ＮＯ１管理区分～手配ＮＯ４管理区分が明細に定義されている場合
		else if (mngTyp instanceof MCColumnConfig) {
			MCColumnConfig conf = (MCColumnConfig) mngTyp;
			mngVal = (String) conf.getBaseTable().getValue(index, conf);
		}
		return mngVal;
	}

	protected MCMode setSnoMode(int index, MCColumnConfig column, MCBeans mngTyp) {
		String mngVal = getSnoMngTyp(index, mngTyp);

		MCMode mode = null;

		if (isDefaultModeEditable(column)) {
			// 管理しない
			if (MAC_SNO_MNG_TYP.isNOT_MNG(mngVal)) {
				mode = MCMode.READ_ONLY;
			}
			// 管理する（必須）
			else if (MAC_SNO_MNG_TYP.isMNG_REQ(mngVal)) {
				mode = MCMode.REQUIRED;
			}
			// 管理する（任意）
			else if (MAC_SNO_MNG_TYP.isMNG_ARB(mngVal)) {
				mode = MCMode.ENABLE;
			}
			// 管理する（任意：在庫対象外）
			else if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(mngVal) && getSnoModeCtrl()) {
				mode = MCMode.ENABLE;
			}
		}
		return mode;
	}

	protected MCMode setSnoMode(int index, MCColumnConfig column, MCBeans mngTyp, MCBeans numTyp, MCBeans reqFlg) {
		String mngVal = null;
		String numVal = null;
		boolean reqFlgVal = false; 
		
		// 手配ＮＯ１管理区分～手配ＮＯ４管理区分がヘッダに定義されている場合
		if (mngTyp instanceof MCRowBeans) {
			MCRowBeans beans = (MCRowBeans) mngTyp;
			mngVal = (String) beans.getRowValue();
		}
		// 手配ＮＯ１管理区分～手配ＮＯ４管理区分が明細に定義されている場合
		else if (mngTyp instanceof MCColumnConfig) {
			MCColumnConfig conf = (MCColumnConfig) mngTyp;
			mngVal = (String) conf.getBaseTable().getValue(index, conf);
		}

		// 手配ＮＯ１発番区分～手配ＮＯ４発番区分がヘッダに定義されている場合
		if (numTyp instanceof MCRowBeans) {
			MCRowBeans beans = (MCRowBeans) numTyp;
			numVal = (String) beans.getRowValue();
		}
		// 手配ＮＯ１発番区分～手配ＮＯ４発番区分が明細に定義されている場合
		else if (numTyp instanceof MCColumnConfig) {
			MCColumnConfig conf = (MCColumnConfig) numTyp;
			numVal = (String) conf.getBaseTable().getValue(index, conf);
		}
		
		// 手配ＮＯ１必須ＦＬＧ～手配ＮＯ４必須ＦＬＧがヘッダに定義されている場合
		if (reqFlg instanceof MCRowBeans) {
			MCRowBeans beans = (MCRowBeans) reqFlg;
			reqFlgVal = (boolean) beans.getRowValue();
		}
		// 手配ＮＯ１必須ＦＬＧ～手配ＮＯ４必須ＦＬＧが明細に定義されている場合
		else if (reqFlg instanceof MCColumnConfig) {
			MCColumnConfig conf = (MCColumnConfig) reqFlg;
			reqFlgVal = (boolean) conf.getBaseTable().getValue(index, conf);
		}
		
		if (isDefaultModeEditable(column)) {
			// 管理しない
			if (MAC_SNO_MNG_TYP.isNOT_MNG(mngVal)) {
				return MCMode.READ_ONLY;
			}
			// 管理する（必須）
			else if (MAC_SNO_MNG_TYP.isMNG_REQ(mngVal)) {
				// 手配ＮＯ発番区分（自動）
				if (MAC_SNO_NO_TYP.isAUTO(numVal)) {
					return MCMode.READ_ONLY;
				}
				// 手配ＮＯ発番区分（手動_未指定：手動） 受注発番ＦＬＧ（オン）
				else if (MAC_SNO_NO_TYP.isAUTO_MANU(numVal) && getAutoManuModeCtrl()) {
					return MCMode.ENABLE;
				}
				return MCMode.REQUIRED;
			}
			// 管理する（任意）
			else if (MAC_SNO_MNG_TYP.isMNG_ARB(mngVal)) {
				// 手配ＮＯ発番区分（自動）
				if (MAC_SNO_NO_TYP.isAUTO(numVal)) {
					return MCMode.READ_ONLY;
				}
				// 手配ＮＯ発番区分（手動_未指定：手動） 受注発番ＦＬＧ（オン）
				else if (MAC_SNO_NO_TYP.isAUTO_MANU(numVal) && getAutoManuModeCtrl()) {
					return MCMode.ENABLE;
				}
				// 手配ＮＯ発番区分（手動、自動＿手動）
				else {
					// 手配ＮＯ必須ＦＬＧ（オン）
					if (reqFlgVal) {
						return MCMode.REQUIRED;
					}
					return MCMode.ENABLE;
				}
			}
			// 管理する（任意：在庫対象外）
			else if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(mngVal) && getSnoModeCtrl()) {
				// 手配ＮＯ発番区分（自動）
				if (MAC_SNO_NO_TYP.isAUTO(numVal)) {
					return MCMode.READ_ONLY;
				}
				// 手配ＮＯ発番区分（手動_未指定：手動） 受注発番ＦＬＧ（オン）
				else if (MAC_SNO_NO_TYP.isAUTO_MANU(numVal) && getAutoManuModeCtrl()) {
					return MCMode.ENABLE;
				}
				// 手配ＮＯ発番区分（手動、自動＿手動）
				else {
					// 手配ＮＯ必須ＦＬＧ（オン）
					if (reqFlgVal) {
						return MCMode.REQUIRED;
					}
					return MCMode.ENABLE;
				}
			}
		}
		return super.getCellMode(index, column);
	}
	
	protected MCMode getSnoNullFLgMode(int index,  MCColumnConfig column, MCBeans mngTyp) {
		String mngVal = getSnoMngTyp(index, mngTyp);

		MCMode mode = null;

		if (isDefaultModeEditable(column)) {
			// 管理しない
			if (MAC_SNO_MNG_TYP.isNOT_MNG(mngVal)) {
				mode = MCMode.READ_ONLY;
			}
			// 管理する（必須）
			else if (MAC_SNO_MNG_TYP.isMNG_REQ(mngVal)) {
				mode = MCMode.READ_ONLY;
			}
			// 管理する（任意）
			else if (MAC_SNO_MNG_TYP.isMNG_ARB(mngVal)) {
				mode = MCMode.REQUIRED;
			}
			// 管理する（任意：在庫対象外）
			else if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(mngVal)) {
				mode = MCMode.REQUIRED;
			}
		}
		return mode;
	}

}