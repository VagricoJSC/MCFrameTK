package mcframe.clientMAUA.MAUAP1050;

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

import mcframe.clientFXBA.FXBAP0130.*;
import mcframe.clientMAUB.MAUBP0230.*;

import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.LocCols;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MAUAP_Loc"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MAUAP_Loc_MC extends MAUAP_Loc_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUAP_Loc_MC() {
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
	public MAUAP_Loc_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callListSrch();
	}
	/**
	 * Panel[Cnd]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doCnd_srch(MCEventInfo info) {
		callListSrch();
	}
	/**
	 * Panel[Btn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtn_select_all(MCEventInfo info) {
		for(RsltR row : RsltTable.getViewRows() ){
			setValueEx(columnRslt_check, row.getGUIIndex() , true);
		}
	}
	/**
	 * Panel[Btn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_deselect_all(MCEventInfo info) {
		for(RsltR row : RsltTable.getViewRows() ){
			setValueEx(columnRslt_check, row.getGUIIndex() , false);
		}
	}
	/**
	 * Panel[Btn]のボタン[accept]の押下時の処理
	 */
	@Override
	public void doBtn_accept(MCEventInfo info) {
		doAccept();
	}

	@Override
	protected String[] getInitValueCols() {
		return new String[] {
				LocCols.$i_loc_cd, LocCols.$i_loc_nm, LocCols.$i_rd_flg, LocCols.$i_wr_flg,
				LocCols.$i_site_cd, LocCols.$i_site_nm, LocCols.$i_wg_cd, LocCols.$i_wg_nm,
				LocCols.$i_lg_grp_cd, LocCols.$i_lg_grp_nm, LocCols.$i_alloc_grp_cd, LocCols.$i_alloc_grp_nm,
				LocCols.$i_loc_grp_cd, LocCols.$i_loc_grp_nm, LocCols.$i_loc_mng_typ, LocCols.$i_loc_is_srch_typ,
				LocCols.$i_sppl_cd, LocCols.$i_sppl_nm, LocCols.$i_mode_nullval_flg, LocCols.$i_dt, 
				LocCols.$i_itm_cd, LocCols.$i_itm_sub1, LocCols.$i_itm_sub2, LocCols.$i_itm_sub3
		};
	}

	@Override
	protected String[] getInitModeCols() {
		return new String[] {
				LocCols.$m_rd_flg, LocCols.$m_wr_flg
		};
	}

	@Override
	public void valueInit() {
		super.valueInit();
		setLocValue();
		setLocMode();
	}

	@Override
	public void setCondition(MCRow row , String mode){
		super.setCondition(row, mode);

		if (row != null) {
			if(GET_LIST == mode){
				getCndR().loc_cd_input(row.getString($INPUT_VAL));
			}
			else {
				getCndR().loc_cd(row.getStringNE($INPUT_VAL));
			}
		}
		setLocValue();
		setLocMode();
	}

	@Override
	protected void saveInitValue(MCRow row) {
		if (isNull(row.getStringNE(LocCols.$i_loc_is_srch_typ))) {
			row.setStringNE(LocCols.$i_loc_is_srch_typ , MAC_LOC_IS_SRCH_TYP.COMM.value());
		}
		super.saveInitValue(row);
	}

	/**
	 * 検索区分に応じて、値を設定する
	 */
	protected void setLocValue() {
		clearLocValue();
		setInitValue();
		setSrchTypNm();

		String typ = getCndR().loc_is_srch_typ();
		if (isNull(typ)) {
			return;
		}
		// 区分４：販売資産
		else if (MAC_LOC_IS_SRCH_TYP.isSLS(typ)) {
			setValueEx(Cnd_loc_mng_typ, MAC_LOC_MNG_TYP.SLS.value());
		}
		// 区分５：生産資産
		else if (MAC_LOC_IS_SRCH_TYP.isPRD(typ)) {
			setValueEx(Cnd_loc_mng_typ, MAC_LOC_MNG_TYP.PRD.value());
		}
		// 区分６：社内
		else if (MAC_LOC_IS_SRCH_TYP.isHOUSE(typ)) {
			setValueEx(Cnd_no_sppl_flg, true);
		}
		// 区分７：社外
		else if (MAC_LOC_IS_SRCH_TYP.isOUTSIDE(typ)) {
			setValueEx(Cnd_no_sppl_flg, false);
		}
		// 区分８：生産資産（社内）
		else if (MAC_LOC_IS_SRCH_TYP.isPRD_HOUSE(typ)) {
			setValueEx(Cnd_loc_mng_typ, MAC_LOC_MNG_TYP.PRD.value());
			setValueEx(Cnd_no_sppl_flg, true);
		}
		// 区分１０：社内（同一ＷＧ）
		else if (MAC_LOC_IS_SRCH_TYP.isHOUSE_EQ_WG(typ)) {
			setValueEx(Cnd_no_sppl_flg, true);
		}
		// 区分１７：社内（製造ＷＧ）
		else if (MAC_LOC_IS_SRCH_TYP.isMFG_WG_HOUSE(typ)) {
			setValueEx(Cnd_no_sppl_flg, true);
		}
	}

	/**
	 * 検索区分に応じて、フィールド、フラグのモードを制御する
	 */
	protected void setLocMode() {
		clearLocMode();
		setInitMode();

		String typ = getCndR().loc_is_srch_typ();
		if (isNull(typ)) {
			return;
		}
		// 区分４：販売資産
		else if (MAC_LOC_IS_SRCH_TYP.isSLS(typ)) {
			Cnd_loc_mng_typ.setMode(MCMode.READ_ONLY);
			Cnd_loc_mng_typ_nm.setMode(MCMode.READ_ONLY);
		}
		// 区分５：生産資産
		else if (MAC_LOC_IS_SRCH_TYP.isPRD(typ)) {
			Cnd_loc_mng_typ.setMode(MCMode.READ_ONLY);
			Cnd_loc_mng_typ_nm.setMode(MCMode.READ_ONLY);
		}
		// 区分６：社内
		else if (MAC_LOC_IS_SRCH_TYP.isHOUSE(typ)) {
			Cnd_no_sppl_flg.setMode(MCMode.READ_ONLY);
		}
		// 区分７：社外
		else if (MAC_LOC_IS_SRCH_TYP.isOUTSIDE(typ)) {
			Cnd_no_sppl_flg.setMode(MCMode.READ_ONLY);
		}
		// 区分８：生産資産（社内）
		else if (MAC_LOC_IS_SRCH_TYP.isPRD_HOUSE(typ)) {
			Cnd_loc_mng_typ.setMode(MCMode.READ_ONLY);
			Cnd_loc_mng_typ_nm.setMode(MCMode.READ_ONLY);
			Cnd_no_sppl_flg.setMode(MCMode.READ_ONLY);
		}
		// 区分１０：社内（同一ＷＧ）
		else if (MAC_LOC_IS_SRCH_TYP.isHOUSE_EQ_WG(typ)) {
			Cnd_wg_cd.setMode(MCMode.REQUIRED);
			Cnd_wg_nm.setMode(MCMode.REQUIRED);
			Cnd_no_sppl_flg.setMode(MCMode.READ_ONLY);
		}
		// 区分１１：棚卸対象場所
		else if (MAC_LOC_IS_SRCH_TYP.isSTKTK_TGT(typ)) {
			;
		}
		// 区分１３：ＷＧ対応場所
		else if (MAC_LOC_IS_SRCH_TYP.isWG(typ)) {
			Cnd_wg_cd.setMode(MCMode.REQUIRED);
			Cnd_wg_nm.setMode(MCMode.READ_ONLY);
		}
		// 区分１４：物流グループ対応場所
		else if (MAC_LOC_IS_SRCH_TYP.isLG_GRP(typ)) {
			Cnd_lg_grp_cd.setMode(MCMode.REQUIRED);
			Cnd_lg_grp_nm.setMode(MCMode.READ_ONLY);
		}
		// 区分１５：工場・物流倉庫対応場所
		else if (MAC_LOC_IS_SRCH_TYP.isSITE(typ)) {
			Cnd_site_cd.setMode(MCMode.REQUIRED);
			Cnd_site_nm.setMode(MCMode.READ_ONLY);
		}
		// 区分１６：製造場所グループ対応場所
		else if (MAC_LOC_IS_SRCH_TYP.isLOC_GRP(typ)) {
			Cnd_loc_grp_cd.setMode(MCMode.REQUIRED);
			Cnd_loc_grp_nm.setMode(MCMode.READ_ONLY);
		}
		// 区分１７：社内（製造ＷＧ）
		else if (MAC_LOC_IS_SRCH_TYP.isMFG_WG_HOUSE(typ)) {
			Cnd_no_sppl_flg.setMode(MCMode.READ_ONLY);
			Cnd_wg_cd.setMode(MCMode.READ_ONLY);
			Cnd_wg_nm.setMode(MCMode.READ_ONLY);
		}
	}

	@Override
	public void doCnd_no_sppl_flg_NC(MCEventInfo info) {
		super.doCnd_no_sppl_flg_NC(info);

		if (Cnd_no_sppl_flg.getValue()) {
			Cnd_sppl_cd.setMode(MCMode.READ_ONLY);
			Cnd_sppl_nm.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Cnd_sppl_cd);
			setDefaultMode(Cnd_sppl_nm);
		}
	}

	/**
	 * 検索区分名を設定する
	 */
	protected void setSrchTypNm() {
		MAC_LOC_IS_SRCH_TYP.putNameNE(getCndR(), CndR.$loc_is_srch_typ, CndR.$loc_is_srch_typ_nm);
	}

	/**
	 * 画面に設定されている値をクリアする
	 */
	protected void clearLocValue() {
		clearRowExcept(getCndR(), CndR.$loc_cd);
	}

	/**
	 * 画面に設定されているモードをクリアする
	 */
	protected void clearLocMode() {
		setDefaultMode(Cnd_wg_cd);
		setDefaultMode(Cnd_wg_nm);
		setDefaultMode(Cnd_loc_mng_typ);
		setDefaultMode(Cnd_loc_mng_typ_nm);
		setDefaultMode(Cnd_sppl_cd);
		setDefaultMode(Cnd_sppl_nm);
		setDefaultMode(Cnd_no_sppl_flg);
	}

	@Override
	protected String getISSrchTypCol() {
		return LocCols.$i_loc_is_srch_typ;
	}

	@Override
	protected boolean isEnableSrchTyp(String typ) {
		if (!isNull(typ)){
			return MAC_LOC_IS_SRCH_TYP.is_panel(typ);
		}
		return super.isEnableSrchTyp(typ);
	}
	
	@Override
	protected void setupParts() {
		super.setupParts();
		Cnd_term_p_PPanel.setDefault(false);
	}

	@Override
	public void doCnd_cost_dpt_cd_LC(mcframe.clientCore.event.MCEventInfo info) {
		super.doCnd_cost_dpt_cd_LC(info);
		if (isNull(getCndR().cost_dpt_cd())) {
			Cnd_term.clear();
			Cnd_term.setMode(MCMode.READ_ONLY);
		}
		else {
			if (isNull(getCndR().term())) {
				Cnd_term_p_PPanel.setDefault();
			}
			Cnd_term.setMode(MCMode.REQUIRED);
		}
	}

}