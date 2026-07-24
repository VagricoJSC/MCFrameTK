package mcframe.clientMAUB.MAUBP0080;

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
 * 画面"MAUBP_Sno_H"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MAUBP_Sno_H_MC extends MAUBP_Sno_H_MC_A {

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

	protected boolean _sno_mode_ctrl_flg = false;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_Sno_H_MC() {
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
	protected MAUBP_Sno_H_MC(mcframe.clientMAUB.MAUBP0080.SnoR row) {
		super(row);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_ROW_Sno START

		//FMCB CUSTOM_CONSTRUCTOR_ROW_Sno END
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
			setComponentInvisibleAllStatus(Sno_sno1_null_flg);
			setComponentInvisibleAllStatus(Sno_sno2_null_flg);
			setComponentInvisibleAllStatus(Sno_sno3_null_flg);
			setComponentInvisibleAllStatus(Sno_sno4_null_flg);			
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
	 * @param typ1 手配ＮＯ１管理区分
	 * @param typ2 手配ＮＯ２管理区分
	 * @param typ3 手配ＮＯ３管理区分
	 * @param typ4 手配ＮＯ４管理区分
	 */
	public void setRelateBeans(
		MCRowBeans itm_cd,
		MCRowBeans itm_sub1,
		MCRowBeans itm_sub2,
		MCRowBeans itm_sub3, 
		MCRowBeans typ1,
		MCRowBeans typ2,
		MCRowBeans typ3,
		MCRowBeans typ4
	) {
		_itm_cd = itm_cd;
		_itm_sub1 = itm_sub1;
		_itm_sub2 = itm_sub2;
		_itm_sub3 = itm_sub3;
		_sno1_mng_typ = typ1;
		_sno2_mng_typ = typ2;
		_sno3_mng_typ = typ3;
		_sno4_mng_typ = typ4;
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

		if (getSno1MngTyp() != null) {
			((MCLCBeans) getSno1MngTyp()).addLCListener(this);
		}
		if (getSno2MngTyp() != null) {
			((MCLCBeans) getSno2MngTyp()).addLCListener(this);
		}
		if (getSno3MngTyp() != null) {
			((MCLCBeans) getSno3MngTyp()).addLCListener(this);
		}
		if (getSno4MngTyp() != null) {
			((MCLCBeans) getSno4MngTyp()).addLCListener(this);
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

		if (lc == getSno1MngTyp()) {
			doBeans_sno1_mng_typ_LC(info);
		}
		else if (lc == getSno2MngTyp()){
			doBeans_sno2_mng_typ_LC(info);
		}
		else if (lc == getSno3MngTyp()){
			doBeans_sno3_mng_typ_LC(info);
		}
		else if (lc == getSno4MngTyp()){
			doBeans_sno4_mng_typ_LC(info);
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
	
	protected boolean doSno_snox_VC(MCEventInfo info, MCRowBeans snoMngTypBeans) {
		if (snoMngTypBeans != null) {
			String snoMngTyp = getSnoMngTyp(snoMngTypBeans);
			// 管理する（必須）、管理する（任意）、管理する（任意：在庫対象外）
			if (MAC_SNO_MNG_TYP.isMNG_REQ(snoMngTyp) && MAC_STR.isNULL_VAL((String)info.getNewValue())) {
				return false;
			}
		}
		return true;
	}

	protected String getSnoMngTyp(MCRowBeans beans) {
		if (beans == null) {
			return null;
		}
		return (String) beans.getRowValue();
	}

	/**
	 * 品目ＣＤ、枝番１、枝番２、枝番３が変更されたときに実行される。<br>
	 * <br>
	 * 手配ＮＯ、案件ＮＯ、案件名をクリアする。<br>
	 * 
	 * @param info イベント情報
	 */
	protected void doBeans_itm_LC(MCEventInfo info) {
		if (isSame(getStatus(), ENABLE)) {
			setValueEx(Sno_sno1, null);
			setValueEx(Sno_sno2, null);
			setValueEx(Sno_sno3, null);
			setValueEx(Sno_sno4, null);
			setValueEx(Sno_sno1_null_flg, false);
			setValueEx(Sno_sno2_null_flg, false);
			setValueEx(Sno_sno3_null_flg, false);
			setValueEx(Sno_sno4_null_flg, false);
		}
	}

	/**
	 * 手配ＮＯ１管理区分が変更されたときに実行される。<br>
	 * <br>
	 * 手配ＮＯ１のモードを設定する。<br>
	 * 
	 * @param info イベント情報
	 */
	protected void doBeans_sno1_mng_typ_LC(MCEventInfo info) {
		setSnoMode(getSno1MngTyp(), Sno_sno1, Sno_sno1_null_flg);
	}

	/**
	 * 手配ＮＯ２管理区分が変更されたときに実行される。<br>
	 * <br>
	 * 手配ＮＯ２のモードを設定する。<br>
	 * 
	 * @param info イベント情報
	 */
	protected void doBeans_sno2_mng_typ_LC(MCEventInfo info) {
		setSnoMode(getSno2MngTyp(), Sno_sno2, Sno_sno2_null_flg);
	}

	/**
	 * 手配ＮＯ３管理区分が変更されたときに実行される。<br>
	 * <br>
	 * 手配ＮＯ３のモードを設定する。<br>
	 * 
	 * @param info イベント情報
	 */
	protected void doBeans_sno3_mng_typ_LC(MCEventInfo info) {
		setSnoMode(getSno3MngTyp(), Sno_sno3, Sno_sno3_null_flg);
	}

	/**
	 * 手配ＮＯ４管理区分が変更されたときに実行される。<br>
	 * <br>
	 * 手配ＮＯ４のモードを設定する。<br>
	 * 
	 * @param info イベント情報
	 */
	protected void doBeans_sno4_mng_typ_LC(MCEventInfo info) {
		setSnoMode(getSno4MngTyp(), Sno_sno4, Sno_sno4_null_flg);
	}

	@Override
	public void setDISABLEStatus() {
		super.setDISABLEStatus();

		setSnoMode();
	}

	@Override
	public void setENABLE_SRCHStatus() {
		super.setENABLE_SRCHStatus();

		setLstTyp();
	}

	@Override
	public void setENABLEStatus() {
		super.setENABLEStatus();

		setSnoMode();
		setLstTyp();
	}

	@Override
	public void setREAD_ONLYStatus() {
		super.setREAD_ONLYStatus();

		setSnoMode();
	}

	@Override
	public void setREQUIREDStatus() {
		super.setREQUIREDStatus();

		setSnoMode();
	}

	@Override
	public void setINVISIBLEStatus() {
		super.setINVISIBLEStatus();

		setSnoMode();
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

	protected void setSnoMode() {
		setSnoMode(getSno1MngTyp(), Sno_sno1, Sno_sno1_null_flg);
		setSnoMode(getSno2MngTyp(), Sno_sno2, Sno_sno2_null_flg);
		setSnoMode(getSno3MngTyp(), Sno_sno3, Sno_sno3_null_flg);
		setSnoMode(getSno4MngTyp(), Sno_sno4, Sno_sno4_null_flg);
	}

	protected void setSnoMode(MCRowBeans typ, MCModeBeans sno, MCModeBeans sno_null_flg) {
		if (isSame(getStatus(), ENABLE_SRCH)) {
			return;
		}

		if (isDefaultModeEditable(sno)) {
			if (typ == null) {
				return;
			}

			// 管理しない
			if (MAC_SNO_MNG_TYP.isNOT_MNG((String)typ.getRowValue())) {
				sno.setMode(MCMode.READ_ONLY);
				if (isDefaultModeEditable(sno_null_flg)) {
					sno_null_flg.setMode(MCMode.READ_ONLY);
				}
			}
			// 管理する（必須）
			else if (MAC_SNO_MNG_TYP.isMNG_REQ((String)typ.getRowValue())) {
				sno.setMode(MCMode.REQUIRED);
				if (isDefaultModeEditable(sno_null_flg)) {
					sno_null_flg.setMode(MCMode.REQUIRED);
				}
			}
			// 管理する（任意）
			else if (MAC_SNO_MNG_TYP.isMNG_ARB((String)typ.getRowValue())) {
				sno.setMode(MCMode.ENABLE);
				if (isDefaultModeEditable(sno_null_flg)) {
					sno_null_flg.setMode(MCMode.REQUIRED);
				}
			}
			// 管理する（任意：在庫対象外）、手配ＮＯのモード制御フラグがオン
			else if (MAC_SNO_MNG_TYP.isMNG_NOT_STK((String)typ.getRowValue()) &&
				getSnoModeCtrl()) {
				sno.setMode(MCMode.ENABLE);
				if (isDefaultModeEditable(sno_null_flg)) {
					sno_null_flg.setMode(MCMode.REQUIRED);
				}
			}
			else {
				setDefaultMode(sno);
				setDefaultMode(sno_null_flg);
			}
		}
	}

	/**
	 * 手配ＮＯのリストタイプを設定する。
	 *
	 */
	protected void setLstTyp() {
		if (isSame(getStatus(), ENABLE_SRCH)) {
			setPluralValueEnable(Sno_sno1, true);
			setPluralValueEnable(Sno_sno2, true);
			setPluralValueEnable(Sno_sno3, true);
			setPluralValueEnable(Sno_sno4, true);
		}
		else if (isSame(getStatus(), ENABLE)) {
			setPluralValueEnable(Sno_sno1, false);
			setPluralValueEnable(Sno_sno2, false);
			setPluralValueEnable(Sno_sno3, false);
			setPluralValueEnable(Sno_sno4, false);
		}
	}

}