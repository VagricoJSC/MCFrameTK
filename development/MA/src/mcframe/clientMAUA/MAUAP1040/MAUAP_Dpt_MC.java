package mcframe.clientMAUA.MAUAP1040;

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

import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.clientCore.beans.list.MCLinkBeans;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.DptCols;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MAUAP_Dpt"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MAUAP_Dpt_MC extends MAUAP_Dpt_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUAP_Dpt_MC() {
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
	public MAUAP_Dpt_MC(String name) {
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
	public MCList getAcceptList(MCLinkBeans target, boolean isDCEvent) {
		removeDptNm();
		return super.getAcceptList(target, isDCEvent);
	}

	@Override
	protected String[] getInitValueCols() {
		return new String[] {
				DptCols.$i_dt, DptCols.$i_rd_flg, DptCols.$i_wr_flg,
				DptCols.$i_ar_dpt_flg, DptCols.$i_ap_dpt_flg, DptCols.$i_sls_dpt_flg,
				DptCols.$i_purc_dpt_flg, DptCols.$i_asst_dpt_flg,
				DptCols.$i_ship_dpt_flg, DptCols.$i_arr_dpt_flg, DptCols.$i_mfg_dpt_flg,
				DptCols.$i_insp_dpt_flg, DptCols.$i_bd_dpt_flg, DptCols.$i_sd_dpt_flg,
				DptCols.$i_dpt_is_srch_typ, DptCols.$i_dpt_nm_rem_flg, DptCols.$i_mode_nullval_flg,
				DptCols.$i_wr_wg_flg, DptCols.$i_non_biz_dpt_flg
		};
	}

	@Override
	protected String[] getInitModeCols() {
		return new String[] {
				DptCols.$m_dt, DptCols.$m_rd_flg, DptCols.$m_wr_flg,
				DptCols.$m_ar_dpt_flg, DptCols.$m_ap_dpt_flg, DptCols.$m_sls_dpt_flg,
				DptCols.$m_purc_dpt_flg, DptCols.$m_asst_dpt_flg,
				DptCols.$m_ship_dpt_flg, DptCols.$m_arr_dpt_flg, DptCols.$m_mfg_dpt_flg,
				DptCols.$m_insp_dpt_flg, DptCols.$m_bd_dpt_flg, DptCols.$m_sd_dpt_flg,
				DptCols.$m_non_biz_dpt_flg
		};
	}

	@Override
	public void valueInit() {
		super.valueInit();
		setDptValue();
		setDptMode();
	}

	@Override
	public void setCondition(MCRow row , String mode){
		super.setCondition(row, mode);

		if (row != null) {
			if(GET_LIST == mode){
				getCndR().dpt_cd_input(row.getString($INPUT_VAL));
			}
			else {
				getCndR().dpt_cd(row.getStringNE($INPUT_VAL));
			}
		}
		setDptValue();
		setDptMode();
	}

	@Override
	protected void saveInitValue(MCRow row) {
		if (isNull(row.getStringNE(DptCols.$i_dpt_is_srch_typ))) {
			row.setStringNE(DptCols.$i_dpt_is_srch_typ, MAC_DPT_IS_SRCH_TYP.COMM.value());
		}
		if (isNull(row.getDateNE(DptCols.$i_dt)) && row.getBooleanNE(DptCols.$i_mode_today_flg)) {
			_initVMap.put(DptCols.$i_dt, getToday());
		}
		super.saveInitValue(row);
	}

	/**
	 * 検索区分名を設定する
	 */
	protected void setSrchTypNm() {
		MAC_DPT_IS_SRCH_TYP.putNameNE(getCndR(), CndR.$dpt_is_srch_typ, CndR.$dpt_is_srch_typ_nm);
	}

	/**
	 * 検索区分に応じたフラグをオンにする
	 */
	protected void setDptValue() {
		setSrchTypNm();
		for (String s : getCndR().getConstColumnPathArray()) {
			if (s.contains("_dpt_flg")) {
				getCndR().clear(s);
			}
		}

		String typ = getCndR().dpt_is_srch_typ();
		if(isNull(typ)) {
			return;
		}
		// 区分０：全部門
		if (MAC_DPT_IS_SRCH_TYP.isCOMM(typ)) {
			getCndR().asst_dpt_flg(true);
			getCndR().ar_dpt_flg(true);
			getCndR().ap_dpt_flg(true);
			getCndR().sls_dpt_flg(true);
			getCndR().purc_dpt_flg(true);
			getCndR().ship_dpt_flg(true);
			getCndR().arr_dpt_flg(true);
			getCndR().mfg_dpt_flg(true);
			getCndR().sd_dpt_flg(true);
			getCndR().insp_dpt_flg(true);
			getCndR().bd_dpt_flg(true);
			getCndR().non_biz_dpt_flg(true);
		}
		// 区分１：資産管理部門
		else if (MAC_DPT_IS_SRCH_TYP.isASST(typ)) {
			getCndR().asst_dpt_flg(true);
		}
		// 区分２：債権部門
		else if (MAC_DPT_IS_SRCH_TYP.isAR(typ)) {
			getCndR().ar_dpt_flg(true);
		}
		// 区分３：債務部門
		else if (MAC_DPT_IS_SRCH_TYP.isAP(typ)) {
			getCndR().ap_dpt_flg(true);
		}
		// 区分４：営業部門
		else if (MAC_DPT_IS_SRCH_TYP.isSLS(typ)) {
			getCndR().sls_dpt_flg(true);
		}
		// 区分５：購買部門
		else if (MAC_DPT_IS_SRCH_TYP.isPURC(typ)) {
			getCndR().purc_dpt_flg(true);
		}
		// 区分６：出荷部門
		else if (MAC_DPT_IS_SRCH_TYP.isSHIP(typ)) {
			getCndR().ship_dpt_flg(true);
		}
		// 区分７：入荷部門
		else if (MAC_DPT_IS_SRCH_TYP.isARR(typ)) {
			getCndR().arr_dpt_flg(true);
		}
		// 区分８：製造部門
		else if (MAC_DPT_IS_SRCH_TYP.isMFG(typ)) {
			getCndR().mfg_dpt_flg(true);
		}
		// 区分９：需給部門
		else if (MAC_DPT_IS_SRCH_TYP.isSD(typ)) {
			getCndR().sd_dpt_flg(true);
		}
		// 区分１０：検査部門
		else if (MAC_DPT_IS_SRCH_TYP.isINSP(typ)) {
			getCndR().insp_dpt_flg(true);
		}
		// 区分１１：負担部門
		else if (MAC_DPT_IS_SRCH_TYP.isBD(typ)) {
			getCndR().bd_dpt_flg(true);
		}
		// 区分１２：債権債務負担部門
		else if (MAC_DPT_IS_SRCH_TYP.isARAPBD(typ)) {
			getCndR().ar_dpt_flg(true);
			getCndR().ap_dpt_flg(true);
		}
		// 区分１３：請求部門
		else if (MAC_DPT_IS_SRCH_TYP.isBCST(typ)) {
			getCndR().ar_dpt_flg(true);
		}
		// 区分１４：実行部門
		else if (MAC_DPT_IS_SRCH_TYP.isSCE(typ)) {
			getCndR().sls_dpt_flg(true);
			getCndR().purc_dpt_flg(true);
			getCndR().ship_dpt_flg(true);
			getCndR().arr_dpt_flg(true);
			getCndR().mfg_dpt_flg(true);
			getCndR().sd_dpt_flg(true);
			getCndR().insp_dpt_flg(true);
		}
	}

	@Override
	public void doCnd_dt_LC(mcframe.clientCore.event.MCEventInfo info) {
		super.doCnd_dt_LC(info);
		setDtMode();
	}

	/**
	 * 上位部門、新部門は適用日が入力されたときのみ入力可
	 */
	protected void setDtMode() {
		if (isNull(getCndR().dt())) {
			Cnd_up_lv_dpt_cd.clear();
			Cnd_up_lv_dpt_nm.clear();
			Cnd_new_dpt_cd.clear();
			Cnd_up_lv_dpt_cd.setMode(MCMode.READ_ONLY);
			Cnd_up_lv_dpt_nm.setMode(MCMode.READ_ONLY);
			Cnd_new_dpt_cd.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Cnd_up_lv_dpt_cd);
			setDefaultMode(Cnd_up_lv_dpt_nm);
			setDefaultMode(Cnd_new_dpt_cd);
		}
	}

	/**
	 * 検索区分に応じて、フィールド、フラグのモードを制御する
	 */
	protected void setDptMode() {
		setDtMode();
		String typ = getCndR().dpt_is_srch_typ();
		if(isNull(typ)) {
			return;
		}

		if (MAC_DPT_IS_SRCH_TYP.isCOMM(typ)) {
			setDefaultMode(Cnd_asst_dpt_flg);
			setDefaultMode(Cnd_ar_dpt_flg);
			setDefaultMode(Cnd_ap_dpt_flg);
			setDefaultMode(Cnd_sls_dpt_flg);
			setDefaultMode(Cnd_purc_dpt_flg);
			setDefaultMode(Cnd_ship_dpt_flg);
			setDefaultMode(Cnd_arr_dpt_flg);
			setDefaultMode(Cnd_mfg_dpt_flg);
			setDefaultMode(Cnd_sd_dpt_flg);
			setDefaultMode(Cnd_insp_dpt_flg);
			setDefaultMode(Cnd_bd_dpt_flg);
			setDefaultMode(Cnd_non_biz_dpt_flg);
		}
		else {
			Cnd_asst_dpt_flg.setMode(MCMode.READ_ONLY);
			Cnd_ar_dpt_flg.setMode(MCMode.READ_ONLY);
			Cnd_ap_dpt_flg.setMode(MCMode.READ_ONLY);
			Cnd_sls_dpt_flg.setMode(MCMode.READ_ONLY);
			Cnd_purc_dpt_flg.setMode(MCMode.READ_ONLY);
			Cnd_ship_dpt_flg.setMode(MCMode.READ_ONLY);
			Cnd_arr_dpt_flg.setMode(MCMode.READ_ONLY);
			Cnd_mfg_dpt_flg.setMode(MCMode.READ_ONLY);
			Cnd_sd_dpt_flg.setMode(MCMode.READ_ONLY);
			Cnd_insp_dpt_flg.setMode(MCMode.READ_ONLY);
			Cnd_bd_dpt_flg.setMode(MCMode.READ_ONLY);
			Cnd_non_biz_dpt_flg.setMode(MCMode.READ_ONLY);
		}
	}

	/**
	 * 名称不要フラグに応じて、部門名を削除する
	 */
	protected void removeDptNm() {
// 部門名を設定すると、組織改正で部門名が変わった場合に、部門名の違う過去データが検索できなくなる
// そのため、dpt_nm_rem_flg見て部門名を消す場合は、下記の通り実装する
//		if (getCndR().getBooleanNE(DptCols.$i_dpt_nm_rem_flg)) {
//			getRsltL().setStringNE(DptCols.$o_dpt_nm, null);
//		}
// 標準では検索枠の部門名に値が入らないと動作が他の項目と違い不自然なため、部面名を設定する
	}

	@Override
	protected void listInit() {
		super.listInit();

		getCnd_up_lv_dpt_cd_ListPutter().putBind(DptCols.$i_dt, Cnd_dt);
	}

	@Override
	protected String getISSrchTypCol() {
		return DptCols.$i_dpt_is_srch_typ;
	}

	@Override
	protected boolean isEnableSrchTyp(String typ) {
		if (!isNull(typ)){
			return MAC_DPT_IS_SRCH_TYP.is_panel(typ);
		}
		return super.isEnableSrchTyp(typ);
	}

}